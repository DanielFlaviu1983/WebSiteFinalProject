package kh.com.website.service;

import kh.com.website.model.CustomerOrder;


public interface CustomerOrderService {
    void addCustomerOrder(CustomerOrder customerOrder);
    double getCustomerOrderGrandTotal(int cartId);
}
