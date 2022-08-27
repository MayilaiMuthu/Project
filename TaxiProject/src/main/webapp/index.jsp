<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Entry Page</title>
<script type="text/javascript">
window.alert("Please Enter Valid Details...")
</script>
</head>
<body>
<form action="/con/welcome" method="post">
<label for="cid">Customer ID*</label>
<input name="cid" type="text" required="required"><br>
<label for="sp">Starting Point*</label><br>
<input name="sp" type="radio" value="A" required="required" checked="checked"><label for="A">A</label>
<input name="sp" type="radio" value="B" required="required"><label for="B">B</label>
<input name="sp" type="radio" value="C" required="required"><label for="C">C</label>
<input name="sp" type="radio" value="D" required="required"><label for="D">D</label>
<input name="sp" type="radio" value="E" required="required"><label for="E">E</label>
<input name="sp" type="radio" value="F" required="required"><label for="F">F</label><br>
<label for="ep">Ending Point*</label><br>
<input name="ep" type="radio" value="A" checked="checked" required="required"><label for="A">A</label>
<input name="ep" type="radio" value="B" required="required"><label for="B">B</label>
<input name="ep" type="radio" value="C" required="required"><label for="C">C</label>
<input name="ep" type="radio" value="D" required="required"><label for="D">D</label>
<input name="ep" type="radio" value="E" required="required"><label for="E">E</label>
<input name="ep" type="radio" value="F" required="required"><label for="F">F</label><br>
<label>Pickup Time*</label><input name="hour" placeholder="hour" type="number" max="23" min="0" required="required">
<input name="min" type="number" max="60" min="0" placeholder="minutes" required="required"><br>
<input type="submit" value="Book Taxi">
</form>
</body>
</html>