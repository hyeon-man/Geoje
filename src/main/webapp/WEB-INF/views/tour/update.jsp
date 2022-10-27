<%--
  Created by IntelliJ IDEA.
  User: annoeul
  Date: 2022/10/22
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <div>
    <form method="post" action="update">
      <div>
        <label>관광지명:</label> <input name="tourTitle" type="text">
          value="${item.tourTitle}">
      </div>

      <div>
        <label>관광지소개:</label> <input name="tourDetail" type="text">
        value="${item.tourDetail}">
      </div>
      <div>
        <input type="submit" value="변경">
      </div>
    </form>
  </div>
</body>
</html>
