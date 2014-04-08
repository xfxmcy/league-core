Ext.define('SMS.view.Header', { 
    extend: 'Ext.Component', 
    initComponent: function() { 
        Ext.applyIf(this, { 
            xtype: 'box', 
            cls: 'header', 
            region: 'north', 
            html: '<h1>员工管理系统</h1>', 
            height: 100 
        }); 
        this.callParent(arguments); 
    } 
}); 