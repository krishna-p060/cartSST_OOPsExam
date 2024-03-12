package com.krishna.cartSST.services;

import com.krishna.cartSST.Models.Cart;
import com.krishna.cartSST.dto.HelperCart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class FakeStoreCartService implements CartService{
    //url link 'https://fakestoreapi.com/carts'
    private RestTemplate restTemplate = new RestTemplate();
    private String url = "https://fakestoreapi.com/carts";

    @Override
    public List<Cart> getAllCarts() {
        //get all carts
        Cart[] carts = restTemplate.getForObject(url, Cart[].class);
        if(carts != null){
            return Arrays.asList(carts);
        }
        return null;
    }

    @Override
    public Cart getSingleCart(int id) {
        //get single cart
        Cart cart = restTemplate.getForObject(url + "/" + id, Cart.class);
        return cart;
    }

    @Override
    public List<Cart> getUserCarts(int userId) {
        //get user carts
        Cart[] carts = restTemplate.getForObject(url + "/user/" + userId, Cart[].class);
        if(carts != null){
            return Arrays.asList(carts);
        }
        return null;
    }

    //api for date range
    //'https://fakestoreapi.com/carts?startdate=2019-12-10&enddate=2020-10-10'
    @Override
    public List<Cart> getByDateRange(String start, String end) {
        //get by date range
        Cart[] carts = restTemplate.getForObject(url + "?startdate=" + start + "&enddate=" + end, Cart[].class);
        if(carts != null){
            return Arrays.asList(carts);
        }
        return null;
    }

    @Override
    public Cart addCart(HelperCart helperCart) {
        //add cart
        Cart newCart = restTemplate.postForObject(url, helperCart, Cart.class);
        return newCart;

    }

    @Override
    public void updateCart(int id, HelperCart helperCart) {
        //update cart
        restTemplate.put(url + "/" + id, helperCart);
    }

    @Override
    public void deleteCart(int id) {
        //delete cart
        restTemplate.delete(url + "/" + id);
    }
}
