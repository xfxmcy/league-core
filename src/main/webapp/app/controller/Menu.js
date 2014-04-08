Ext.define('SMS.controller.Menu',{ 
    extend: 'Ext.app.Controller', 
    refs:[ 
        {ref: 'smsmenu',selector: 'smstablepanel'}, 
        {ref: 'tabPanel',selector:'smstablepanel'} 
    ], 
    init:function(){ 
        this.control({ 
            'smsmenu': { 
                itemmousedown: this.loadMenu 
            } 
        }) 
    }, 
    loadMenu:function(selModel, record){ 
        if (record.get('leaf')) {  
            var panel = Ext.getCmp(record.get('id'));  
            if(!panel){  
                panel ={  
                    title: 'New Tab ' + record.get('id'),  
                    iconCls: 'tabs',  
                    html: "<iframe src='/league-core"+ record.raw.url+"' width='100%' height='100%' />",  
                    closable: true  
                } 
                this.openTab(panel,record.get('id')); 
            }else{ 
                var main = Ext.getCmp("content-panel"); 
                main.setActiveTab(panel);  
            } 
        }  

    }, 
    openTab : function (panel,id){  
        var o = (typeof panel == "string" ? panel : id || panel.id); 
        var main = Ext.getCmp("content-panel"); 
        var tab = main.getComponent(o);       
        if (tab) { 
            main.setActiveTab(tab);  
        } else if(typeof panel!="string"){  
            panel.id = o;  
            var p = main.add(panel);  
            main.setActiveTab(p);  
        }  
    } 

}); 
