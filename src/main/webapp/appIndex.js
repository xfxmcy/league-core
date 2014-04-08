Ext.Loader.setConfig({enabled: true}); 
Ext.application({ 
    name: 'SMS', 
    appFolder: 'app', 
autoCreateViewport:false, 
    view : 'xfxmcy',
    controllers: [ 
        'Grid' 
    ] 
}); 
/**
	autoCreateViewport ，这个属性是Boolean类型，如果值为true,那么Extjs4会自动加载view/Viewport.js文件，如果值为flase，那么必须要自己去创建一个View
*/