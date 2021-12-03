<%@include file="./WEB-INF/includes/header.jsp" %> 
<section id="hero"> 
    <!-- parte de caruesel -->
    <div id="carousel" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-indicators" id="prueba">
            <button type="button" data-bs-target="#carousel" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <c:if test="${message == 'success'}">
                <div class="position-absolute bg-info rounded py-2 px-3 text-light" style="z-index:10;right:25px;top:15px;">
                    Registro exitoso
                </div>
            </c:if>
            <c:if test="${message == 'exit-success'}">
                <div class="position-absolute bg-info rounded py-2 px-3 text-light" style="z-index:10;right:25px;top:15px;">
                    Te extrañaremos
                </div>
            </c:if>
            <%--<c:if test="${message == 'reject'}">
                <div class="position-absolute bg-danger rounded py-2 px-3 text-light" style="z-index:10;right:25px;top:15px;">
                    Registro fallido
                </div>
            </c:if>--%>
            <div class="carousel-item active element">
                <img src="assets/img/pet-1.jpg" height="100%" style="object-fit: cover;" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>TWICE</h5>
                    <p>Mono and Dahyun</p>
                </div>
            </div>
            <div class="carousel-item element">
                <img src="assets/img/pet-2.jpg" height="100%" style="object-fit: cover;" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>TEWCE</h5>
                    <p>All</p>
                </div>
            </div>
            <div class="carousel-item element">
                <img src="assets/img/pet-3.jpg" height="100%" style="object-fit: cover;" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>TWICE</h5>
                    <p>Dahyun</p>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carousel " data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carousel " data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
    <!-- Parte de targetas -->
    <div class="container my-5" style="font-family: 'Roboto';">
        <div class="my-5 mb-0 " >
            <h2 class="fs-1 fw-bold">A diario atendemos a mascotas</h2>
            <p class="fs-4">Ademas de veterinaria somos sinonimo de compromiso, en nuestrs manos tus mascotas estan seguras.</p>
        </div>
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-2 row-cols-lg-3  row-cols-xl-4  row-cols-xxl-4">

            <c:forEach var="item" items="${pets}">
                <%@include file="./WEB-INF/components/card-pet.jsp" %> 
            </c:forEach>
        </div>

    </div>

</section>
<%@include file="./WEB-INF/includes/footer.jsp" %> 
