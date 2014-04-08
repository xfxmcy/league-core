// 专门把数据提出来   将view 与 dataSource 分离   实现重用
Ext.define('SMS.store.Menu', {
    extend: 'Ext.data.Store',
    model:'SMS.model.Jing',
    
	data:[
	      {id:1,name:'zhangsan',age:15},
	      {id:2,name:'climate',age:15}
	      ]
   //autoLoad : true, //ajax 自动 让 proxy load
   /* proxy :{		 //store与服务器操作 交给proxy
    	type : 'ajax',
    	url  : webRoot+'/menu/constructed.ajax',
    	api :{
    		read :'url',
    		update :'url',
    		create:'url',
    		destory :'url'
    	},
    	reader:{  // 解析
    		type : 'json',
    		root : 'data',			 // must be []
    		successProperty : 'success'  // flag 用于 launch 对应的 event
    	}
    }*/
});