package net.mln.mongodemo.dao.impl;

import net.mln.mongodemo.dao.CustomerDao;
import net.mln.mongodemo.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description：dao实现
 * @author：GJH
 * @createDate：2019/1/15
 * @company：北京木联能软件股份有限公司
 */
@Component
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 根据id查找Customer
     *
     * @param id
     * @return
     */
    @Override
    public Customer findCustomerById(String id) {
        Query query = new Query(Criteria.where("id").in(id));
        Customer customer = mongoTemplate.findOne(query, Customer.class, "mln_nowrealtimedata");
        return customer;
    }

    /**
     * 根据Psid查找Psid相同的Customer
     *
     * @param psid
     * @return
     */
    @Override
    public List<Customer> findCustomersBySamePsid(String psid) {
        Query query = new Query(Criteria.where("psid").in(psid));
        List<Customer> customerList = mongoTemplate.find(query, Customer.class, "mln_nowrealtimedata");
        return customerList;
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Customer> findAll() {
        System.out.println("执行了dao的finall");
        List<Customer> customerList =mongoTemplate.findAll(Customer.class,"mln_nowrealtimedata");
        System.out.println(customerList.size());
        return customerList;
    }
}
