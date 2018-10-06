<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<title>Flight Booking</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<style>
body {
	background-image:
		url("http://mapiraj.me/wp-content/uploads/2018/04/website-background-images-1.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	background-position: center;
	background-attachment: fixed;
	height: 100%;
}
</style>

</head>
<body>
 <div class="container row">
            <div class="col-sm-8"></div>
            <div class="col-sm-4 h-100 d-flex">
                  <div class="align-self-center">
                        <h3 class="text-info font-weight-light mb-4">PhotoBucket</h3>
     	
   <form:form class="form-group" method="post" action="save">    
          <form:input class="form-control" path="username" required="true"/><br>  
          <form:input class="form-control" path="password" required="true"/><br>  
          <input class="btn btn-info" type="submit" value="Login" />    
       </form:form>
        <hr/>
                        <a href="signUp.jsp">Create a new account.</a>
                  </div>
            </div>
      </div>
</body>
</html>