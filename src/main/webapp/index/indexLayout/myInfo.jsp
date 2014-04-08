<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
 	<style type="text/css">
 	
 	
 	</style>
 	<jsp:include page="/initialExtJs.jsp"></jsp:include>
 	<script type="text/javascript">

    function renderTitle(value, p, record) {
        return value ? Ext.String.format(
            '<a href="http://sencha.com/forum/showthread.php?t={1}" target="_blank">{0}</a>',
            value,
            record.data.threadid
        ) : '';
    }
 		
    Ext.define('Item', {
        extend: 'Ext.data.Model',
        fields: ['text', 'canDropOnFirst', 'canDropOnSecond']
    })
 	
 	 var storeFirst = new Ext.data.TreeStore({
         model: 'Item',
         root: {
             expanded: true,
             children: [{
                 text: '我的信息',
                 canDropOnFirst: true,
                 canDropOnSecond: true,
                 leaf: true
             }, {
                 text: '我的角色',
                 canDropOnFirst: true,
                 canDropOnSecond: false,
                 leaf: true
             }, {
                 text: '我的组队',
                 canDropOnFirst: false,
                 canDropOnSecond: true,
                 leaf: true
             }, {
                 text: '我的商品',
                 canDropOnFirst: false,
                 canDropOnSecond: false,
                 leaf: true
             }]
         }
     });
 	/*建树*/
 	Ext.onReady(function(){
 		 new Ext.panel.Panel({
 	        renderTo: 'myInfo_tree',
 	        width: 300,
 	        height: 200,
 	        layout: {
 	            type: 'hbox',
 	            align: 'stretch'
 	        },
 	        defaultType: 'treepanel',
 	        defaults: {
 	            rootVisible: false,
 	            flex: 1
 	        },
 	        items: [{
 	            title: 'My',
 	            store: storeFirst,
 	            viewConfig: {
 	                plugins: {
 	                   ptype: 'treeviewdragdrop',
 	                   enableDrag: true,
 	                   enableDrop: false
 	                }
 	            }
 	       
 	        }]
 	    });
 	});
 	
 	</script>
 </head>
  <body style="width: 50px">
    <div style="width: 50px" id="myInfo_tree"></div>
  </body>
</html>
