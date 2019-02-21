package net.mln.mongodemo;

import com.alibaba.fastjson.JSON;
import net.mln.mongodemo.dao.impl.CustomerDaoImpl;
import net.mln.mongodemo.pojo.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description：TODO
 * @author：GJH
 * @createDate：2019/1/15
 * @company：北京木联能软件股份有限公司
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongodemoApplication.class)
public class CustomerTest {
    @Autowired
    private CustomerDaoImpl customerDao;

    @Test
    public void TestFindOne() {
        String id = "BMS_YC_2_totali";
        Customer customer = customerDao.findCustomerById(id);
        System.out.println(JSON.toJSONString(customer));
    }
}
