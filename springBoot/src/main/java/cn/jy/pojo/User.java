package cn.jy.pojo;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Table(name="t_user")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)//设置为自增长
    private  Long id;
   private  String username;
    private  String password;
    private  String name;
    private  Integer age;
    private  Integer sex;

    private Data birthday;
    private Data created;
    private Data updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Data getBirthday() {
        return birthday;
    }

    public void setBirthday(Data birthday) {
        this.birthday = birthday;
    }

    public Data getCreated() {
        return created;
    }

    public void setCreated(Data created) {
        this.created = created;
    }

    public Data getUpdated() {
        return updated;
    }

    public void setUpdated(Data updated) {
        this.updated = updated;
    }
}
