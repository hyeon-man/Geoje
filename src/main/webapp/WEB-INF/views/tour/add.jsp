<%--
  Created by IntelliJ IDEA.
  User: annoeul
  Date: 2022/10/22
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <div>
    <form method="post" action="add">
      <div>
        <label>관광지명:</label> <input name="tourTitle" type="text">
      </div>

      <div>
        <label>관광지소개:</label> <input name="tourDetail" type="text">
      </div>

      <div>
        <input type="submit" value="등록">
      </div>

    </form>
  </div>
</body>
</html>
