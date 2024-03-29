<%@page pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>werewolf Menu</title>
</head>
<body>
  <p>ようこそ ${sessionScope.user.screenName}</p>
  <img src="${sessionScope.user.profileImageURL}">

  <form action="test">
    <input type="submit" value="test" />
  </form>
  <table>
    <c:forEach var="status" items="${requestScope.statusList}">
      <tr>
        <td><fmt:formatDate value="${status.createdAt}"
            pattern="yyyy/MM/dd HH:mm:ss" />
        </td>
        <td><c:out value="${status.text}" />
        </td>
      </tr>
    </c:forEach>
  </table>
  <form action="logout">
    <input type="submit" value="logout" />
  </form>
</body>
</html>
