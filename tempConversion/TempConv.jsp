<html>
<head>
<title>Temperature Conversion Chart</title>
</head>
<body><center>
<h2>Temperature Comparision from Celsius to Fahrenheit<hr></h2></center>
<script> function convert() { var c = parseInt(document.getElementById("celsius").value); 
var ans=32+9*c/5;
document.getElementById("fahrenheit").value=ans;
}
</script>
<b>Celsius: </b><input type="text" name="celsius" id="celsius"><b> to
<b>Fahrenheit: </b><input type="text" name="Fahrenheit" id="fahrenheit">
<input type="button" value="Convert" onclick="convert()">
</body>
</html>