<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>regist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
      $(function (){
          $("#btn").click(function (){
              $.ajax({
                  type:"POST",
                  url:"${pageContext.request.contextPath}/userinsert",
                  data:"username="+$("#username").val()+"&"+"password="+$("#password").val()+"&"+"name="+$("#name").val()+"&"+"sex="+$(".sex").val(),
                  dataType:"json",
                  success:function (res){
                      if(res.success){
                          location.href="${pageContext.request.contextPath}/login.jsp";
                      }else{
                          $("#sp").html(res.ms);
                      }
                  }
              });
          });
      });

    </script>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                注册
            </h1>
            <form>
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            用户名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" id="username" name="user.username" class="inputgri" name="username" /><span id="sp"></span>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            真实姓名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" id="name"  name="user.name" class="inputgri" name="name" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            密码:
                        </td>
                        <td valign="middle" align="left">
                            <input type="password" id="password" name="user.password" class="inputgri" name="pwd" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            性别:
                        </td>
                        <td valign="middle" align="left">
                            男
                            <input type="radio" class="sex" name="sex" value="男"  />
                            女
                            <input type="radio" class="sex" name="sex"  value="女" />
                        </td>
                    </tr>


                  <%-- <tr>
                       <td valign="middle" align="right">
                           验证码:
                           <img id="yzm" src="${pageContext.request.contextPath }/code"  onclick="huan()"style="float: right;height: 45px;width: 60%;"/>
                       </td>
                       <td valign="middle" align="left">
                          &lt;%&ndash; <input type="text"  class="form-control" style="width: 65%;height:40px;float: left">&ndash;%&gt;
                           <input type="text" name="code" class="inputgri"  />
                       </td>
                    </tr>--%>
                </table>
                <p>
                    <input type="button" class="button" id="btn" value="Submit &raquo;" />
                </p>
            </form>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
<script type="text/javascript">
    function huan(){
        var tag=document.getElementById("yzm");
        tag.src="${pageContext.request.contextPath }/code?"+Math.random();
    }
</script>