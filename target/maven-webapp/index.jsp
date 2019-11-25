<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulaire</title>
</head>
<body>
<h2>Hello World!</h2>
<br>
<form action="Helloname">
    <label for="login">Login(3 to 20 characters):</label>

    <input type="text" id="login" name="login" required
           minlength="3" maxlength="20" size="50">

    <input type=submit value=Envoyer></form>
</body>
</html>