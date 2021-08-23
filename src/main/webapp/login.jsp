<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
  <title>login</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" type="text/css"
        href="css/style.css" />
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
  <script type="text/javascript">
    $(function (){
      $("#btn").click(function (){
        $.ajax({
          type:"POST",
          url:"${pageContext.request.contextPath}/queryByName",
          data:"username="+$("#username").val()+"&"+"password="+$("#password").val(),
          dataType:"json",
          success:function (res){
           if(res.success){
             location.href="${pageContext.request.contextPath}/queryall";
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
        login
      </h1>
      <form >
        <table cellpadding="0" cellspacing="0" border="0"
               class="form_table">
          <tr>
            <td valign="middle" align="right">
              username:
            </td>
            <td valign="middle" align="left">
              <input type="text" id="username" class="inputgri" name="name" />
            </td>
          </tr>
          <tr>
            <td valign="middle"  align="right">
              password:
            </td>
            <td valign="middle" align="left">
              <input type="password" id="password" class="inputgri" name="pwd"/>
            </td>
            <span id="sp"></span>
          </tr>
        </table>
        <p>
          <input type="button" id="btn" value="Submit &raquo;"/>
          <input type="button" class="button" onclick="location.href='./regist.jsp'" value="Regist &raquo;" />
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

