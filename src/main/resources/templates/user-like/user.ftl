<!DOCTYPE html>
<html lang="rus">
<head>

</head>
<body>
<h1>Информация по пользователю</h1>
<table>
    <tr>
        <th>Логин</th>
        <td>${userData.login}</td>
    </tr>
    <tr>
        <th>Пароль</th>
        <td>${userData.password}</td>
    </tr>
    <tr>
        <th>Роль</th>
        <td>${userData.role}</td>
    </tr>
</table>
<form id="deleteUser" action="/admin/users/${userData.login}" method="post">
    <input id="dlt" type="submit" value="Удалить" />
</form>
</body>
</html>