Ext.define('SMS.view.South',{ 
    extend: 'Ext.Toolbar', 
    initComponent : function(){ 
        Ext.apply(this,{ 
            id:"bottom", 
            //frame:true, 
            region:"south", 
            height:23, 
            items:["当前用户：Jing",'->',"source:<a href='http://www.xfxmcy.com' target='_blank' style='text-decoration:none;'><font color='#0000FF'>http://www.xfxmcy.com</font></a>&nbsp;&nbsp;"] 
        }); 
        this.callParent(arguments); 
    } 
}); 