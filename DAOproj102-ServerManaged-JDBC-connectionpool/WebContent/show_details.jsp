<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:choose>
    <c:when test="${!empty BookList}">
           <h1 style="color:green;text-align:center">The following books are found</h1>
         <table border="1" style="color:red">
            <tr> <th>Book Name</th><th>Auther</th><th>Catagory</th></tr>
              <c:forEach var="map"  items="${BookList}">
                   <tr>
                     <td>${map.BOOKNAME}</td>
                     <td>${map.AUTHOR}</td>
                     <td>${map.CATAGORY}</td>
                   </tr>
              </c:forEach>            
         </table>
    </c:when>
    <c:otherwise>
            <h1 style="color:red;text-align:center">No books are found !!!! Sorry</h1>
    </c:otherwise>
</c:choose>
 
 <br><br>
 <br><br>
 <a href="search.html">home</a>

