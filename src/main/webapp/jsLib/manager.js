// enter
Ext.application({
		//	requires : ['Ext.container.Viewport'],
			name : 'Lol',
			appFolder : 'app',
			controllers: ['Lpl'],
			launch : function() {
				/*Ext.create('Ext.container.Viewport', {
							layout : 'fit',
							items : [
							         {
										xtype : 'panel',
										title : '标题',
										html : '内容'
									}
							         {
							        	 xtype : 'xfxmcy' 
							         }]
				});*/
				Ext.create('Ext.tree.Panel', {
				    title: 'menu',
				    width: 200,
				    height: 150,
				    store: store,
				    rootVisible: false,
				    renderTo: Ext.get("xfxmcy_menu")
				});
			}
		});