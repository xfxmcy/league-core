<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
 	<jsp:include page="/initialExtJs.jsp"></jsp:include>
 	<script type="text/javascript">

    function renderTitle(value, p, record) {
        return value ? Ext.String.format(
            '<a href="http://sencha.com/forum/showthread.php?t={1}" target="_blank">{0}</a>',
            value,
            record.data.threadid
        ) : '';
    }
 	var store = Ext.create('Ext.data.TreeStore', {
        model: 'Post',
        proxy: {
            type: 'ajax',
            reader: 'json',
            url: 'forum-data.json'
        },
        lazyFill: true
    });
 	Ext.onReady(function(){
	 	 Ext.create('Ext.tree.Panel', {
	         title: 'Forum Folder Summary',
	         width: 600,
	         height: 400,
	         renderTo: Ext.getBody(),
	         collapsible: true,
	         loadMask: true,
	         useArrows: true,
	         rootVisible: false,
	         store: store,
	         animate: false,
	         plugins: [{
	             ptype: 'bufferedrenderer'
	         }],
	         columns: [{
	             xtype: 'treecolumn', //this is so we know which column will show the tree
	             text: 'Forum',
	             flex: 2.5,
	             sortable: true,
	             dataIndex: 'forumtitle'
	         },{
	             text: 'User',
	             flex: 1,
	             dataIndex: 'username',
	             sortable: true
	         }, {
	             text: 'Title',
	             flex: 2,
	             dataIndex: 'title',
	             renderer: renderTitle
	         }]
	     });
 	});
 	
 	</script>
 </head>
  <body>
    
  </body>
</html>
