<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#execute").click(function() {
			url = "/controller/createCode.htm";
			var content = $("#content").val();
			$("#img").attr("src", url + "?content=" + content);
		});
	});
	
</script>
<title>QR Code Sample</title>
</head>
<body>
	<h1>QR Code Sample</h1>
	<div>
		<input id="content" type="text" name="content" />
		<input type="button" id="execute" value="QR코드생성" />
		<img id="img" style="display: none" onload="this.style.display='block'" />
	</div>
</body>
</html>

