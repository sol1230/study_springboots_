<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">
  <head>
      <meta charset="UTF-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <title>Document</title>
        <link
         href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
         rel="stylesheet"
         integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
         crossorigin="anonymous"
        />
  </head>
  <body>
    <div class="container mt-3">
    <div class="container text-center mt-5 fs-3">List</div>
      <table border="1" class="table table-striped">
    <thead>
            <tr>
                <th scope=>#</th>
                <th scope= class="col-9">Title</th>
                <th scope=>user name</th>
                <th scope=>date</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${result}" var="list" varStatus="status">
            <tr>
                <th scope=>${status.count}</th>
                <td>${list.COMMON_CODE_ID}</td>
                <td>${list.NAME}</td>
                <td>${list.ORDER_NUMBER}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <div>
      <form action="/board/form">
        <button class="btn btn-success mt-2">form</button>
      </form>
    </div>
    </div>

      <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

