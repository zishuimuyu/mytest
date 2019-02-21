package net.mln.mongodemo.dao;

import net.mln.mongodemo.pojo.Customer;

import java.util.List;

/**
 * @Description：TODO
 * @author：GJH
 * @createDate：2019/1/15
 * @company：北京木联能软件股份有限公司
 */

public interface CustomerDao  {
    /**
     * 根据id查找Customer
     * @param id
     * @return
     */
    Customer findCustomerById(String id);

    /**
     * 根据Psid查找Psid相同的Customer
     * @param psid
     * @return
     */
    List<Customer> findCustomersBySamePsid(String psid);

    /**
     * 查询所有
     * @return
     */
    List<Customer> findAll();
}
