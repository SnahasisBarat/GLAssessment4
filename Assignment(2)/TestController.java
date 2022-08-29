package com.example.demo;

import com.example.demo.Customer;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {

 @RequestMapping(value = "/customer", method = RequestMethod.GET)

 public Customer index() {

 Customer cus=new Customer();
 
 cus.setId(1);
 cus.setName("Snehasis");
 cus.setPhone("123456789");
 cus.setEmail("123@gmail.com");
 return cus;

}
 
}