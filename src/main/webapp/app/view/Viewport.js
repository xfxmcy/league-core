Ext.define('SMS.view.Viewport',{ 
    extend: 'Ext.Viewport', 
    layout: 'fit', 
    hideBorders: true, 
    requires : [ 
        'SMS.view.Header', 
        'SMS.view.Menu', 
        'SMS.view.TabPanel', 
        'SMS.view.South' 
    ], 
    initComponent : function(){ 
        var me = this; 
        Ext.apply(me, { 
            items: [{ 
                id:'desk', 
                layout: 'border', 
                items: [ 
                    Ext.create('SMS.view.Header'), 
                    Ext.create('SMS.view.Menu'), 
                    Ext.create('SMS.view.TabPanel'), 
                    Ext.create('SMS.view.South') 
                ] 
            }] 
        }); 
        me.callParent(arguments); 
    } 
});