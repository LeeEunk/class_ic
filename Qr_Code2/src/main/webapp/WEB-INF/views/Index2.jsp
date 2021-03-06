<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Text 2 QR Code</title>
    <script type="text/javascript">
        var generateQRCode = function() {
            var url = "/controller/text2qrcode.do";
            
            var text = document.getElementById("text").value;
            var size = document.getElementById("size").value;
            
            var imgObj = document.getElementById("qrcode_img");
            
            if (text) {
                text = encodeURIComponent(text);
                
                if (size > 0 && size < 500) {
                    url += "?width=" + size + "&height=" + size + "&text=" + text;
                    
                    imgObj.src = url;
                }
            }
        }
    </script>
</head>
<body>
    Text: <input type="text" id="text" value="Welcome to the CTB Research Group" class="input-xxlarge"><br>
    Size: <input type="text" id="size" value="200"><br>
    <button type="button" onclick="generateQRCode();">Generate QR Code!</button>
    <img id="qrcode_img" style="display:none" onload="this.style.display='block'">
</body>
</html>
