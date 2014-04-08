// Panel
Ext.define('SMS.view.XM', {
	extend : 'Ext.grid.Panel',
	alias : 'widget.xfxmcy', // refer the XM
	title : 'jing system',
	store : 'Menu',
	/*
	 * bbar: [ { xtype: 'button', text: 'delete' } ], rbar: [ { xtype: 'button',
	 * text: 'update' } ],
	 */
	tbar : [ {
		xtype : 'button',
		text : 'add',
		icon : 'icon-save',
		handler : function() {
			alert('需要自己实现');
		}
	},{
		xtype : 'button',
		text : 'delete',
		icon : 'icon-add',
		handler : function() {
			alert('需要自己实现');
		}
	} ],
	initComponent : function() {
		/*
		 * this.store = { fields:['id','name','age'], data:[
		 * {id:1,name:'zhangsan',age:15}, {id:2,name:'climate',age:15} ] };
		 */

		// init sheet
		this.columns = [ {
			header : '编号',
			dataIndex : 'id',
			flex : 1
		},
		// flex 灵活的 宽度 1/3
		{
			header : '姓名',
			dataIndex : 'name',
			flex : 1
		}, {
			header : '年龄',
			dataIndex : 'age',
			flex : 1
		} ];
		// apply argument to 渲染
		this.callParent(arguments);
	}// ,
// init: function() {
// console.log('初始化用户，在application启动前触发该事件!');
// console.log("controller init trigger!");
// }
});