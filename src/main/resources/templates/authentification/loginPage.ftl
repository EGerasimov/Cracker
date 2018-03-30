<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="authorisation.js" type="text/javascript"></script>
    <link rel="stylesheet" href="css/loginStyle.css">

    <script  src="js/loginScript.js"></script>
</head>
<body class="font_login">

<div class="user">
    <header class="user__header">
        <h1 class="user__title">Пожалуйста, зарегистрируйтесь</h1>
    </header>
    <div class="form__group">
        <form name="Authentificate" action="/login" class="form" method="post">
                <input type="text" placeholder="Username" id="login"  class="form__input" name="login" >
                <input type="password" placeholder="Password" id="password" class="form__input" name="password" >
                <input type="hidden" name = "role" id="role" value="USER">
             <input class="btn" type="submit" value="Войти" id = "auth">
        </form>
    </div>
</div>
</body>
</html>
