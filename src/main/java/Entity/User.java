package Entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/11 0011.
 */
public class User {
    private String id;
    private String password;
    private String name;
    private Date dob;
    private String phone;
    // setters and getters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "User{"+
                "id="+id+
                ",password="+password+
                ",name="+name+
                ",dob="+dob+
                ",phone="+phone;
    }
}
