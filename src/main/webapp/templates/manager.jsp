<%@page import="com.toft.core2.UserInfo"%>
<%@page import="com.toft.core2.ToftConst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>

<c:set var="cy" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache"></meta>
<meta http-equiv="cache-control" content="no-cache"></meta>
<title>xfxmcy-<decorator:title default="" /></title>

<!-- <link
	href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700'
	rel='stylesheet' type='text/css'></link>
<link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'
	rel='stylesheet' type='text/css'></link> -->
<!--[if IE]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js">
</script>
<![endif]-->
<!-- js -->
<script type="text/javascript" src="${cy}/ext4/bootstrap.js" charset="utf-8"></script>
<script type="text/javascript" src="${cy}/ext4/locale/ext-lang-zh_CN.js" charset="utf-8"></script>
<script type="text/javascript" src="${cy}/jsLib/manager.js"></script>
<!-- css -->
<link rel="stylesheet" href="${cy}/ext4/resources/ext-theme-gray/ext-theme-gray-all.css" type="text/css"></link>
<script type="text/javascript">

</script>
<decorator:head />
</head>
<body>
	<!-- start [header] top -->
	<section id="top-container"> 
		<header id="top"> <!-- logo -->
			<section id="logo"> 
				<a href="index.html"><img src="${cy}/images/sshe.png" border="0" alt="" /></a> 
			</section>
			<div class="clear"></div>
		</header> 
	<!-- end [header] #top --> </section>
	<!-- end #top-container -->
	<section id="sep-line"></section>
	<div class="clear"></div>

	<!-- START Separator -->
	<!-- end #separator -->

	<!-- Start Paths -->
	<section id="path-block">
	<div class="inside-path">
		<p style="font-size:14px;">
			你的位置：<a href="index.html">xfxmcy</a> /
			<decorator:title />
		</p>
	</div>
	</section>

	<!-- START CONTENT -->
	<section id="content"> <section class="content-block">
	<section class="one_fourth">
	<div id="left">
		<div class="left-sidebar">
			<div id="menu_container" class="left-nav-container" data-spm="2"
				style="position: static; top: 14px; z-index: 2; left: 133px;">
				<!-- menu -->
				<div id="xfxmcy_menu"></div>
			</div>
		</div>
	</div>
	</section> <section class="three_fourth column-last"> <decorator:body />
	</section>
	<div class="clear"></div>
	</section> <!-- end .content-block --> </section>
	<!-- #content -->

	<!-- start footer -->
	<section id="footer-container">
	<div class="line"></div>
	<section class="content-block full-width">
	<div style="text-align:center; color:#BABABA; font-size:12px;">
		copy right <span style="font-family:Arial;">©</span> xfxmcy
	</div>
	<!-- end [footer] #footer -->

	<div class="clear"></div>
	</section> </section>

</body>
</html>