<?xml version="1.0" encoding="UTF-8"?>
<helpset version="1.0"> 
	<title>Manual de Ayuda de la app Gestión de Informes</title> 
    <maps> 
        <homeID>target_inicio</homeID>  
        <mapref location="map_file.jhm"/> 
    </maps>   
     
    <view> 
        <name>Tabla Contenidos</name> 
        <label>Tabla de Contenidos</label> 
        <type>javax.help.TOCView</type> 
        <data>toc.xml</data> 
    </view>   
    
    <view> 
        <name>Indice</name> 
        <label>Indice</label> 
        <type>javax.help.IndexView</type> 
        <data>index.xml</data> 
    </view>   
    
    <view> 
        <name>Buscar</name> 
        <label>Buscar</label> 
        <type>javax.help.SearchView</type> 
        <data engine="com.sun.java.help.search.DefaultSearchEngine"> JavaHelpSearch </data> 
    </view>   
</helpset>

