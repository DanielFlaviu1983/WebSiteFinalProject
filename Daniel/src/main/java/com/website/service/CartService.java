package kh.com.website.service;

import kh.com.website.model.Cart;


public interface CartService {

    Cart getCartById(int cartId);
    void update(Cart cart);
}
