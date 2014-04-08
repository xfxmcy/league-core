<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
 	<jsp:include page="/initialExtJs.jsp"></jsp:include>
 </head>
  <body>
    	 <img alt="梦话西游交流网站" height="70" src="${pageContext.request.contextPath}/images/aa.png">
    	 <span style="margin-left: 10%;margin-bottom: 2px;" class="cy_font">
    	 		本网站纯为交流性网站,专属我们的--梦幻!  本站不会索要您的真实游戏账号,密码等...
    	 </span>
    	 <span id="north_login" class="x-hide-display"></span>
    
    	 <span id="north_logout" ></span>
    	 <!-- 登录,注销 -->
    	 <script type="text/javascript">
    	 
    	 	Ext.create('Ext.Button', {
    		    renderTo: document.body,
    		    text    : ' 登  录 ',
    		    height : 20,
    		    contentEl: 'north_login',
    		    style: {
    		    	marginLeft: '5%',
    		    	marginBottom: '1%'
    	        }

    		});
    	 	Ext.create('Ext.Button', {
    		    renderTo: document.body,
    		    text    : ' 注   销 ',
    		    height : 20,
    		    contentEl: 'north_logout',
    		    style: {
    		    	marginLeft: '1%',
    		    	marginBottom: '1%'
    	        }
    		});
    	 </script>
  </body>
</html>
