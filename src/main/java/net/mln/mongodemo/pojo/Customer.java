package net.mln.mongodemo.pojo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @Description：实体类customer
 * @author：GJH
 * @createDate：2019/1/15
 * @company：北京木联能软件股份有限公司
 */
@Document(collection = "mln_nowrealtimedata")
public class Customer implements Serializable {
    @Id
    private String _id;
    @Field
    private String psid;
    @Field
    private String id;
    @Field
    private String value;

    public Customer() {
    }

    public Customer(String _id, String psid, String id, String value) {
        this._id = _id;
        this.psid = psid;
        this.id = id;
        this.value = value;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPsid() {
        return psid;
    }

    public void setPsid(String psid) {
        this.psid = psid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "_id='" + _id + '\'' +
                ", psid='" + psid + '\'' +
                ", id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
