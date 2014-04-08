Ext.define('SMS.controller.Grid',{ 
    extend: 'Ext.app.Controller', 
    views: ['XM'],
    stores :['Menu'],
    models :['Jing'],
    init:function(){ 
    	Ext.create('SMS.view.XM', {  
	            layout: 'fit',  
	            //height: 300,  
	            //width: 500,  
	   
//	            items: {  
//	                xtype: 'userlist'  
//	            },  
//	   
	            renderTo: document.body  
	        });  
    		   
    		      //  Ext.create('SMS.view.Grid').show();  

    }

}); 
