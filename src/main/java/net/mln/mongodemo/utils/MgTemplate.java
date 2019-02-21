package net.mln.mongodemo.utils;

import com.mongodb.DBCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description：工具类
 * @author：GJH
 * @createDate：2019/1/15
 * @company：北京木联能软件股份有限公司
 */
@Component("mgTemplate")
public class MgTemplate {
    @Autowired
    private MongoTemplate mongoTemplate;

    public DBCollection getCollection(String collectionName) {
        return mongoTemplate.getCollection(collectionName);
    }
}
