package net.mln.mongodemo.controller;

import net.mln.mongodemo.pojo.Customer;
import net.mln.mongodemo.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description：TODO
 * @author：GJH
 * @createDate：2019/1/15
 * @company：北京木联能软件股份有限公司
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @RequestMapping("/findAll")
    public Object findAll(){
        System.out.println("执行了findall");
        List<Customer> customers = customerService.findAll();
        return customers;
    }
    @RequestMapping("/findOne")
    public Object findOne(@RequestParam(value = "id") String id){

        Customer customer = customerService.findByid(id);

        return customer;
    }

}
