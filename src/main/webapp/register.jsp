<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <body style="min-width: 380px !important;">
        <c:if test="${message=='reject'}">
            <div class="position-absolute bg-danger rounded p-3 mt-4" style="color:white;right:100px;">
                <i class="fas fa-check-circle fs-5"></i>
                <span>Error en el registro</span>
            </div>
        </c:if>
        <div class="container-fluid row mx-auto" style="height: 100vh;">
            <div class="col-12 col-sm-9 col-md-8 col-lg-6 col-xl-5 col-xxl-4 mx-auto d-flex align-items-center">

                <form action="AutenticationController?action=register" method="post" class="bg-light w-100 row shadow" style="padding: 20px 30px;  border-radius: 20px;">
                    <div class="row">
                        <h1 class="text-center col-11">Registro de usuario</h1>
                        <a href="HomeController" class="col-1"><i class="fas fa-times-circle fa-3x text-success"></i></a>
                    </div>
                    <div class="col-12">
                        <label class="col-form-label-sm">Nombres y apellidos</label>
                        <input minlength=8" type="text" class="form-control form-control-sm " name="name" required>
                    </div>

                    <div class="col-12">
                        <label class="col-form-label-sm">Dirección</label>
                        <input minlength="10" type="text" class="form-control form-control-sm " name="address" required>
                    </div>

                    <div class="col-md-12 col-lg-6">
                        <label  class="col-form-label-sm">CI</label>
                        <input minlength="7" type="text" class="form-control form-control-sm" name="ci" required>
                    </div>

                    <div class="col-md-12 col-lg-6">
                        <label class="col-form-label-sm">Teléfono</label>
                        <input type="text" class="form-control form-control-sm " name="phone" required>
                    </div>

                    <div class="col-12">
                        <label class="col-form-label-sm">Email</label>
                        <input type="email" class="form-control form-control-sm" name="email" required>
                    </div>

                    <div class="col-md-12 col-lg-6">
                        <label class="col-form-label-sm">Contraseña</label>
                        <input type="password" class="form-control form-control-sm " name="password" required>
                    </div>

                    <%--<div class="col-md-6">
                        <label class="col-form-label-sm">Rol</label>
                        <select class="form-select form-select-sm" name="role">
                            <option selected>Seleccionar</option>
                            <option value="admin"
                                    <c:if test="${user.role == 'admin'}" var="res" scope="request">
                                        selected
                                    </c:if>
                                    >Administrador</option>
                            <option value="user"
                                    <c:if test="${user.role == 'user'}" var="res" scope="request">
                                        selected
                                    </c:if>
                                    >Usuario</option>
                            <option value="doctor"
                                    <c:if test="${user.role == 'doctor'}" var="res" scope="request">
                                        selected
                                    </c:if>
                                    >Doctor</option>
                            <option value="auxiliary"
                                    <c:if test="${user.role == 'auxiliary'}" var="res" scope="request">
                                        selected
                                    </c:if>
                                    >Auxiliar</option>
                        </select>
                    </div>--%>

                    <div class="col-12">
                        <button type="submit" class="btn btn-success my-2 me-5">
                                Registrarse
                        </button>
                        <a href="login.jsp" class="text-success">Ya tienes una cuenta?</a>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>