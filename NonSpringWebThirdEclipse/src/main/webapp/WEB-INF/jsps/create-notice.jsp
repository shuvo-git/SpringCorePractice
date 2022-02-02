<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Notices</title>
        <link href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <div class="container">
        <sf:form class="form-horizontal"
                 action="${pageContext.request.contextPath}/store"
                 method="post"
                 commandName="notice">
            <fieldset>

                <!-- Form Name -->
                <legend>Create Notice </legend>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="name">Name</label>
                    <div class="col-md-5">
                        <sf:input id="name" name="name" path="name" type="text" placeholder="Enter your name" class="form-control input-md"/>

                    </div>
                    <sf:errors path="name" cssClass="alert-danger"></sf:errors>
                </div>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="email">Email</label>
                    <div class="col-md-5">
                        <sf:input id="email" name="email" path="email" type="text" placeholder="Enter Your Email ID" class="form-control input-md"/>

                    </div>
                    <sf:errors path="email" cssClass="alert-danger"></sf:errors>
                </div>

                <!-- Textarea -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="text">Text</label>
                    <div class="col-md-5">
                        <sf:textarea class="form-control" id="text" name="text" path="text" ></sf:textarea>

                    </div>
                    <sf:errors path="text" cssClass="alert-danger"></sf:errors>
                </div>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="submit"></label>
                    <div class="col-md-4">
                        <button id="submit" name="submit" class="btn btn-success">Submit</button>
                    </div>
                </div>

            </fieldset>
        </sf:form>
    </div>


    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>
</html>