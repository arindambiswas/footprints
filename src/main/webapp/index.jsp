<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<script type="text/javascript" src="<s:url value='/lib/js/mixercast/server_properties.jsp'/>"></script>
		<s:head />
	</head>	
<body>
	<h1>Hello World!</h1>
	<h2><s:property value="message" /></h2>
	
	<s:form action="Logon"> 
	  	<s:textfield label="User Name" name="username"/>
	  	<s:password label="Password" name="password" />
		<s:submit/>
	</s:form>
	
</body>
</html>
