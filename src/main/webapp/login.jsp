<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <title>Document</title>
    </head>
    <body>
        <c:if test="${message=='success'}">
            <div class="position-absolute bg-success rounded p-3 mt-4" style="color:white;right:100px;">
                <i class="fas fa-check-circle fs-5"></i>
                <span>Registro exitoso</span>
            </div>
        </c:if>
        <form action="AutenticationController?action=login" method="post" class="row g-3 position-fixed top-50 start-50 translate-middle bg-light shadow" style=" padding: 20px; border-radius: 20px; max-width: 500px">
            <div class="row">
                <h1 class="text-center col-11">Iniciar sesion</h1>
                <a href="HomeController" class="col-1"><i class="fas fa-times-circle fa-3x text-success"></i></a>
            </div>
            <div class="col-12 ">
                <label class="col-form-label-sm" for="email">Email</label>
                <input type="email" class="form-control form-control-sm" name="email" id="email" required>
                <c:if test="${errors != null}">
                    <c:if test="${errors.get(0)=='email'}">
                        <span class="text-danger" style="font-size:13px;">Error de email</span>
                    </c:if>
                </c:if>
            </div>

            <div class="col-12">
                <label class="col-form-label-sm" for="contraseÃ±a">Contraseña</label>
                <input type="password" class="form-control form-control-sm" name="password" id="password" required>
                <c:if test="${errors.get(0)=='password'}">
                    <span class="text-danger" style="font-size:13px;">Error de password</span>
                </c:if>
            </div>

            <div class="col-12">
                <button type="submit" class="btn btn-success">Ingresar</button>
                <a href="register.jsp" class="ms-5 text-success">No tienes una cuenta?</a>
            </div>
        </form>
    </body>
</html>