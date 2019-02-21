package net.mln.mongodemo.service;

import com.mongodb.DBObject;
import net.mln.mongodemo.pojo.Customer;

import java.util.List;

/**
 * @Description：TODO
 * @author：GJH
 * @createDate：2019/1/15
 * @company：北京木联能软件股份有限公司
 */

public interface CustomerService  {
    /**
     * 根据ID查找一个消费者
     * @param id
     * @return
     */
    Customer findByid(String id);

    /**
     * 根据psid查找消费者,并根据value值来排序
     * @param psid
     * @return
     */
    List<DBObject> findByPsidOrderByValue(String psid);

    /**
     * 查询所有
     * @return
     */
    List<Customer> findAll();
}
