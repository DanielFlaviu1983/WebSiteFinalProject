package kh.com.website.service.impl;

import kh.com.website.dao.ProductDao;
import kh.com.website.model.Product;
import kh.com.website.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProductList(Integer offset, Integer maxResults) {
        return productDao.getProductList(offset, maxResults) ;
    }

    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void editProduct(Product product) {
        productDao.editProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productDao.deleteProduct(product);
    }

    @Override
    public Long countProducts() {
        return productDao.countProducts();
    }
}
