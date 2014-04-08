<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="cy" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head>
  <jsp:include page="/initialExtJs.jsp"></jsp:include>
  	
	<script type="text/javascript">
	 Ext.require(['*']);

	    Ext.onReady(function() {
	    	/*中间面板*/
			cyTabPanel = Ext.create('Ext.tab.Panel', {
                region: 'center', // a center region is ALWAYS required for border layout
                deferredRender: false,
                activeTab: 0,     // first tab initially active
                items: [{
                    contentEl: 'centerFirst',
                    title: '精彩图集',
                    closable : true,
                    autoScroll: true
                }, {
                    contentEl: 'centerSecond',
                    title: '随机截图',
                    closable : true,
                    autoScroll: true
                }]
            });
			
	        Ext.QuickTips.init();
	        /* Ext.state.Manager.setProvider(Ext.create('Ext.state.CookieProvider')); */
			/*viewport*/
	        var viewport = Ext.create('Ext.Viewport', {
	            id: 'border-example',
	            layout: 'border',
	            items: [
	            /*north*/
	            // create instance immediately
	            Ext.create('Ext.Component', {
	                region: 'north',
	                height: 80, // give north and south regions a height
	                autoEl: {
	                    tag: 'div',
	                    html : "<iframe  width='100%' src='${pageContext.request.contextPath}/index/indexLayout/north.jsp' frameborder='0' ></iframe>"
	                }
	            }), {
	           /*south*/   
	                region: 'south',
	                contentEl: 'south',
	                split: true,
	                height: 100,
	                minSize: 100,
	                maxSize: 200,
	                collapsible: true,
	                collapsed: true,
	                title: 'South',
	                margins: '0 0 0 0'
	            }, {
	            /*east*/ 	
	                xtype: 'tabpanel',
	                region: 'east',
	                title: '新闻&公告',
/* 	                dockedItems: [{
	                    dock: 'top',
	                    xtype: 'toolbar',
	                    items: [ '->', {
	                       xtype: 'button',
	                       text: 'test',
	                       tooltip: 'Test Button'
	                    }]
	                }], */
	                animCollapse: true,
	                collapsible: true,
	                split: true,
	                width: 225, // give east and west regions a width
	                minSize: 175,
	                maxSize: 400,
	                margins: '0 5 0 0',
	                activeTab: 0,
	                tabPosition: 'bottom',
	                items: [{
	                    html: "<p>小三与小六将于今天12点结婚 !<span class='cy_font'>月老</span>,囍糖先到先得!</p>",
	                    title: '新闻',
	                    autoScroll: true
	                }, Ext.create('Ext.grid.PropertyGrid', {
	                        title: '公告',
	                        //closable: true,
	                        source: {
	                            "(name)": "Properties Grid",
	                            "grouping": false,
	                            "autoFitColumns": true,
	                            "productionQuality": false,
	                            "created": Ext.Date.parse('10/15/2006', 'm/d/Y'),
	                            "tested": false,
	                            "version": 0.01,
	                            "borderWidth": 1
	                        }
	                    })]
	            }, {
	            /*east*/
	                region: 'west',
	                stateId: 'navigation-panel',
	                id: 'west-panel', // see Ext.getCmp() below
	                title: '我的梦幻',
	                split: true,
	                width: 200,
	                minWidth: 175,
	                maxWidth: 400,
	                collapsible: true,
	                animCollapse: true,
	                margins: '0 0 0 5',
	                layout: 'accordion',
	                items: [{
	                    contentEl: 'west',
	                    title: '我的信息',
	                    iconCls: 'nav' // see the HEAD section for style used
	                }, {
	                    title: '相约组队',
	                    html: '<p>Some settings in here.</p>',
	                    iconCls: 'settings'
	                }, {
	                    title: 'xfxmcy商城',
	                    html: '<p>Some info in here.</p>',
	                    iconCls: 'info'
	                }]
	            },
	            // in this instance the TabPanel is not wrapped by another panel
	            // since no title is needed, this Panel is added directly
	            // as a Container
	            cyTabPanel]
	        });
	        // get a reference to the HTML element with id "hideit" and add a click listener to it
	      //  Ext.get("hideit").on('click', function(){
	            // get a reference to the Panel that was created with id = 'west-panel'
	        //    var w = Ext.getCmp('west-panel');
	            // expand or collapse that Panel based on its collapsed property state
	          //  w.collapsed ? w.expand() : w.collapse();
	       // });
	        
	    });
	    </script>
	</head>
	<body>
	    <!-- use class="x-hide-display" to prevent a brief flicker of the content -->
	    <div id="west" class="x-hide-display" style="width: 200px;">
	        <iframe width="260px;" src='${pageContext.request.contextPath}/index/indexLayout/myInfo.jsp' frameborder="0" ></iframe>
	    </div>
	    <div id="centerSecond" class="x-hide-display">
	        <a id="hideit" href="#">Toggle the west region</a>
	        <p>My closable attribute is set to false so you can't close me. The other center panels can be closed.</p>
	     
	    </div>
	    
	    <div id="centerFirst" class="x-hide-display">
	        <p><b>Done reading me? Close me by clicking the X in the top right corner.</b></p>
	     </div>
	     
	    <div id="props-panel" class="x-hide-display" style="width:200px;height:200px;overflow:hidden;">
	    </div>
	    
	    <!-- bottom -->
	    <div id="south" class="x-hide-display">
	     	<iframe src='${pageContext.request.contextPath}/index/indexLayout/south.jsp' frameborder="0" ></iframe>
	    </div>
	    
	</body>
</html>