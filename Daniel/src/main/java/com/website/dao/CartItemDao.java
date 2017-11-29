package kh.com.website.dao;

import kh.com.website.model.Cart;
import kh.com.website.model.CartItem;


public interface CartItemDao {

    void addCartItem(CartItem cartItem);
    void removeCartItem(CartItem cartItem);
    void removeAllCartItems(Cart cart);
    CartItem getCartItemByProductId(int productId);

}
