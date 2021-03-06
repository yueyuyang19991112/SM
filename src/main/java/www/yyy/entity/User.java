package www.yyy.entity;

public class User {
    private String username;
    private  String name;
    private  String password;
    private  String sex;

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User(String username, String name, String password, String sex) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    public User() {
    }
}
