package com.krishna.cartSST.Controllers;

import com.krishna.cartSST.Models.Cart;
import com.krishna.cartSST.dto.HelperCart;
import com.krishna.cartSST.services.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CartController {

    private CartService cartService;
    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/carts")
    public List<Cart> getAllCarts(){
        return cartService.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id") int id){
        return cartService.getSingleCart(id);
    }

    @GetMapping("/carts/user/{userId}")
    public List<Cart> getUserCarts(@PathVariable("userId") int userId){
        return cartService.getUserCarts(userId);
    }

    @PostMapping("/carts")
    public Cart addCart(@RequestBody HelperCart helperCart){
        return cartService.addCart(helperCart);

    }

    @DeleteMapping("/carts/{id}")
    public void deleteCart(@PathVariable("id") int id){
        cartService.deleteCart(id);
    }

    @PutMapping("/carts/{id}")
    public void updateCart(@PathVariable("id") int id, @RequestBody HelperCart helperCart){
        cartService.updateCart(id, helperCart);
    }

    @GetMapping("/carts/date")
    public List<Cart> getByDateRange(@RequestParam("start") String start, @RequestParam("end") String end){
        return cartService.getByDateRange(start, end);
    }

}
