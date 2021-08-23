package www.yyy.action;

import com.alibaba.fastjson.JSONObject;
import org.apache.struts2.ServletActionContext;
import www.yyy.entity.User;
import www.yyy.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class UserAction {
        private String code;
        private  String username;
        private  String password;
        private  String name;
        private  String sex;
        private UserService userService;
        private User user;

    public String queryByName(){
        PrintWriter writer=null;
        try {
            User u = userService.queryByName(username);
            HttpServletResponse response = ServletActionContext.getResponse();
            response.setCharacterEncoding("utf-8");
            writer = response.getWriter();
            Map<String,Object> map=new HashMap<>();
            if(u==null){
               map.put("success", false);
               map.put("ms", "用户名不存在");
           }else {
               if (password.equals(u.getPassword())){
                   map.put("success", true);
               }else {
                   map.put("success", false);
                   map.put("ms", "密码不正确");
               }
           }
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("yyy", username);
            String s = JSONObject.toJSONString(map);
            writer.print(s);
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }finally {
            if(writer!=null){
                writer.close();
            }
        }
    }
    public String insert(){
        PrintWriter writer=null;
        try {
            HttpServletRequest request=ServletActionContext.getRequest();
            HttpSession session=request.getSession(true);
            User u = userService.queryByName(username);
            HttpServletResponse response = ServletActionContext.getResponse();
            response.setCharacterEncoding("utf-8");
            writer = response.getWriter();

            User u2=new User(username,name,password,sex);
            Map<String,Object> map=new HashMap<>();

          /*  if(code.equals(session.getAttribute("cod"))){

            }else {
                map.put("success", false);
                map.put("ms", "验证码错误");
            }*/
            if(u!=null){
                map.put("success", false);
                map.put("ms", "用户名存在");
            }else {
                map.put("success", true);
                userService.insertUser(u2);
            }

            String s = JSONObject.toJSONString(map);
            writer.print(s);
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }



    public void setUserService(UserService userService) {
        this.userService = userService;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
