package net.mln.mongodemo.service.impl;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import net.mln.mongodemo.dao.impl.CustomerDaoImpl;
import net.mln.mongodemo.pojo.Customer;
import net.mln.mongodemo.service.CustomerService;
import net.mln.mongodemo.utils.MgTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description：TODO
 * @author：GJH
 * @createDate：2019/1/15
 * @company：北京木联能软件股份有限公司
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDaoImpl customerDao;

    /**
     * 根据id查找一个消费者
     *
     * @param id
     * @return
     */
    @Override
    public Customer findByid(String id) {
        Customer customer = customerDao.findCustomerById(id);
        return customer;
    }

    /**
     * 根据psid查找消费者,并根据value值来排序
     *
     * @param psid
     * @return
     */
    @Override
    public List findByPsidOrderByValue(String psid) {
        List<Customer> customers = customerDao.findCustomersBySamePsid(psid);
        return customers;
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Customer> findAll() {
        System.out.println("执行了service的finall");
        return customerDao.findAll();
    }
}
