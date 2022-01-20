package com.example.controller;

import com.example.pojo.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 根据主键查询商品
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Product selectProductById(@PathVariable("id") Integer id) {
        return productService.selectProductById(id);
    }

    /**
     * 根据多个主键查询商品
     *
     * @param ids
     * @return
     */
    @GetMapping("/listByIds")
    public List<Product> selectProductListByIds(@RequestParam("id") List<Integer> ids) {
        return productService.selectProductListByIds(ids);
    }

}
