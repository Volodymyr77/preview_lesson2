package com.okten.preview_lesson2.controllers;

import com.okten.preview_lesson2.dao.CustomerDao;
import com.okten.preview_lesson2.models.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private CustomerDao customerDao;

    @GetMapping("/")
    public String name() {
        return "you are at home";
    }

    @PostMapping("/save")
    public Customer save (Customer customer) {
//        db.save(customer)

        return customer;
    }
}
