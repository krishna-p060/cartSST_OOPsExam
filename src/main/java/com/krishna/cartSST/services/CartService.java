package com.krishna.cartSST.services;

import com.krishna.cartSST.Models.Cart;
import com.krishna.cartSST.dto.HelperCart;

import java.util.*;

public interface CartService {
    List<Cart> getAllCarts();
    Cart getSingleCart(int id);

    List<Cart> getUserCarts(int userId);

    List<Cart> getByDateRange(String start, String end);

    Cart addCart(HelperCart helperCart);

    void updateCart(int id, HelperCart helperCart);

    //delete cart
    void deleteCart(int id);
}
