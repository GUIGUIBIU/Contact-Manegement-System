<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>draft content</title>
<style>
#header {
    background-color:DarkTurquoise;
    color:black;
    text-align:left;
    padding:5px;
}

#section {
	height:20px;
    text-align:center;
    padding:20px;	 	 
}
#footer {
    background-color:DarkTurquoise;
    color:black;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}

</style>

</head>
<body>
<div id="header">
<h1>查看合同</h1>
</div>
<div id="section">
<input type="text" id="state" style="border:0px;color:black;font-size:18px;"value=""onfocus=this.blur()>
</div>
<hr/>
<form action="" method="Post">
<p>合同名称：  
<input type="text"id="name1"name="name1"value="" size="40"style="border:0px;color:black;font-size:14px;"value=""onfocus=this.blur()/>
</p>
<hr/>
<p>客户名称：  
<input type="text"id="customer"name="customer"value=""size="40" style="border:0px;color:black;font-size:14px;"value=""onfocus=this.blur()/>
</p>
<hr/>
<p>开始时间：
<input type="text"id="beginTime"name="beginTime"value=""size="40"style="border:0px;color:black;font-size:14px;"value=""onfocus=this.blur() />
</p>
<hr/>
<p>结束时间：
<input type="text"id="endTime"name="endTime"value=""size="40"style="border:0px;color:black;font-size:14px;"value=""onfocus=this.blur() />
</p>
<hr/>

<p>合同内容：</p>
<textarea id="content"name="content"style="width:800px;height:200px;font-size:14px;"onfocus=this.blur()></textarea>
<hr/>
<input type="submit" value="确认" />
</form>
</body>
</html>