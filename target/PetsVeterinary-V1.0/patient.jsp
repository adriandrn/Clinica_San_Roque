<%@include file="./WEB-INF/includes/header.jsp" %> 


<section id="hero"> 
    <!-- parte de caruesel -->
    <div id="carousel" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-indicators" id="prueba">
            <button type="button" data-bs-target="#carousel" data-bs-slide-to="0" class="active" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active element">
                <img src="assets/img/pet-car1.jpg"  style="object-fit: cover;" class="d-block w-100" />
                <div class="carousel-caption d-none d-md-block">
                    <h5>TWICE</h5>
                    <p>Mono and Dahyun</p>
                </div>
            </div>
            <div class="carousel-item element">
                <img src="assets/img/pet-car2.jpg" style="object-fit: cover;" class="d-block w-100" />
                <div class="carousel-caption d-none d-md-block">
                    <h5>TEWCE</h5>
                    <p>All</p>
                </div>
            </div>
            <div class="carousel-item element">
                <img src="assets/img/pet-3.jpg" style="object-fit: cover;" class="d-block w-100" />
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
    <div class="container">
        <div class="mt-5">
            <a class="btn btn-outline-success" href="PatientController?action=ajax&specie=Felinos">Felinos</a>
            <a class="btn btn-outline-success" href="PatientController?action=ajax&specie=Canes">Canes  </a>
            <a class="btn btn-outline-success" href="PatientController?action=ajax&specie=Aves">Aves   </a>
            <a class="btn btn-outline-success" href="PatientController?action=ajax&specie=Bovinos">Bovinos</a>
            <a class="btn btn-outline-success" href="PatientController?action=ajax&specie=Roedores">Roedores</a>
            <a class="btn btn-outline-success" href="PatientController?action=ajax&specie=Acuaticos">Acuaticos</a>

        </div>

        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-2 row-cols-lg-3  row-cols-xl-4  row-cols-xxl-5 mt-3">
            <c:forEach var="item" items="${pets}">
                <%@include file="./WEB-INF/components/card-pet.jsp" %> 
            </c:forEach>
        </div>

        <%
            int total = (int) request.getAttribute("total");
            if (total != 0) {
        %>
        <nav aria-label="Page navigation example" class="text-success" >
            <ul class="pagination">
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Previous">
                        <span aria-hidden="true"  style="color: #198754 !important" >&laquo;</span>
                    </a>
                </li>

                <%
                    for (int i = 0; i < total; i++) {
                %>

                <%
                    int b = (int) request.getAttribute("b");
                    if (b != -1) {
                %>
                <li class="page-item" ><a class="page-link" style="color: #198754 !important" href="PatientController?a=<%= i%>"><%= i + 1%></a></li>

                <%
                    }else{

                %>
                 <li class="page-item" ><a class="page-link" style="color: #198754 !important" href="PatientController?action=ajax&a=<%= i%>&specie=${specie}"><%= i + 1%></a></li>
                <%
                    }
                %>
                
               
                <%
                    }
                %>

                
                <li class="page-item">
                    <a class="page-link" href="PatientController?" aria-label="Next">
                        <span aria-hidden="true" style="color: #198754 !important" >&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
        <%
            }
        %>
    </div>

</section>
<script>
    let xml = new XMLHttpRequest();
    xml.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(this.resposeText);
        }
    };
    xml.open("get", "", true);
    xml.send();
</script>       

<%@include file="./WEB-INF/includes/footer.jsp" %>