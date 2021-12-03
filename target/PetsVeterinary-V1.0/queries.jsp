<%@include file="./WEB-INF/includes/header.jsp" %> 


<div>
    <img src="assets/img/image-doc.jpg" class="d-block w-100" alt="..." style="object-fit: cover;">
</div>

<div class="d-grid gap-2">
    <h1 class="btn btn-success fs-1">Reseñas de Clientes</h1>
    <p class="mx-5 fs-5 my-0">Te pedimos que nos compartas tus anecdotas con nuestros servicios para que podamos seguir creciendo como veterinaria y como institución</p>
</div>
<div class="container" style="font-family: 'Open Sans'">
    <a onclick="document.getElementById('consulta').focus();" class="btn btn-info text-light my-2" 
       href="<%=session.getAttribute("user") != null ? "#query-form" : "login.jsp"%>"
       >
        Realizar reseña
    </a>
    <hr>
    <c:if test="${user==null}">
        <h4 class="fs-5 fw-bold">Para realizar una reseña debes registrarte en nuestro sitio web</h4>
    </c:if>
    <c:if test="${user!=null}">
        <h4 class="fs-5 fw-bold">Estas son nuestras ultimas reseñas</h4>
    </c:if>
</div>

<div class="container-fluid row mx-auto w-75 mt-3 mb-4" style="font-family: 'Open Sans'">
    <c:forEach var="query" items="${queries}">
        <div class="d-flex gap-4 mb-1">
            <div>
                <img src="assets/img/default_user.png" style="object-fit: cover;" class="rounded-circle" width="40px" height="40px"/>
            </div>
            <div>
                <h5 class="my-0 fw-bold" style="font-size: 16px;">${query.user_name} <span class="text-muted fw-normal">(${query.query_date})</span></h5>
                <p class="my-0 fs-6">${query.description}</p>
            </div>
        </div>
        <hr>
    </c:forEach>

    <c:if test="${user!=null}">
        <form class="w-100 row" id="query-form" action="QueryController?action=store" method="POST">
            <input type="hidden" name="user_id" value="${user.id}"/>
            <div class="d-flex gap-4">
                <div>
                    <img src="assets/img/default_user.png" style="object-fit: cover;" class="rounded-circle" width="40px" height="40px"/>
                </div>
                <div>
                    <a class="my-0 fw-bold text-decoration-none" style="font-size: 16px;">${user.name}</a>
                    <p>${user.role}</p>
                </div>
            </div>
            <div class="col-md-6">
                <input name="description" type="text" class="form-control form-control-sm" id="consulta" placeholder="Realizar consulta">
            </div>
            <div class="col-12 mr-auto mt-2">
                <button type="submit" class="btn btn-outline-success">Enviar</button>
            </div>
        </form>
    </c:if>
</div>
<footer class="bg-success">
    <div class="row w-75 mx-auto pt-2">

        <div class="col-md-6 text-dark">
            <h6 class="text-light lead">CONTACTO:</h6>
            <p class="text-light">
                Av. Montes No. 1664 Local 5<br>
                La Paz<br>
            </p>
        </div>
        <br>
        <div class="col-md-6 text-md-end">
            <h6 class="text-light lead">ENCUENTRANOS EN LAS REDES</h6>
            <a href="https://www.facebook.com/"><i class="fab fa-facebook-square fa-2x" style="color: white;"></i></a>
            <a href="https://www.twitter.com/"><i class="fab fa-twitter-square fa-2x" style="color: white;"></i></a>
            <a href="https://www.youtube.com/"><i class="fab fa-youtube-square fa-2x" style="color: white"></i></a>
            <p class="text-light small text-right">
                Todos los derechos reservados.
            </p>
        </div> 
    </div>
</footer>
</body>
</html>