package kh.com.website.service.impl;

import kh.com.website.dao.CustomerDao;
import kh.com.website.model.Customer;
import kh.com.website.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao customerDao;

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return customerDao.getCustomerById(customerId);
    }

    @Override
    public List<Customer> getAllCustomers(Integer offset, Integer maxResults) {
        return customerDao.getAllCustomers(offset, maxResults);
    }

    @Override
    public Long countCustomers() {
        return customerDao.countCustomers();
    }

    @Override
    public Customer getCustomerByUsername(String username) {
        return customerDao.getCustomerByUsername(username);
    }
}
