<%@page pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ameba Menu</title>
</head>
<body>
  <p>ようこそ ${sessionScope.profile.nickname}</p>
  <img src="${sessionScope.profile.mainPictureUrl}">

  <form action="logout">
    <input type="submit" value="logout" />
  </form>
</body>
</html>
