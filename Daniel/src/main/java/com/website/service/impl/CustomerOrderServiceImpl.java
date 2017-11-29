package kh.com.website.service.impl;

import kh.com.website.dao.CustomerOrderDao;
import kh.com.website.model.Cart;
import kh.com.website.model.CartItem;
import kh.com.website.model.CustomerOrder;
import kh.com.website.service.CartService;
import kh.com.website.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    @Override
    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId); // retrieve the cart using cart service
        List<CartItem> cartItems = cart.getCartItems(); // list of cart items

        // Loop through the cart items list
        for (CartItem item : cartItems) {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }
}
