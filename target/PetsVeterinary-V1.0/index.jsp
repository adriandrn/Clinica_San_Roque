<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : inde
    Created on : 23 nov. 2021, 21:14:42
    Author     : DRN-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Fjalla+One&family=Open+Sans:wght@300&family=Roboto:wght@100;300&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="https://fonts.googleapis.com/css2?family=Fjalla+One&family=Open+Sans:wght@300&family=Roboto:wght@100&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="shortcut icon" href="assets/img/icon/netcenter_7.ico" type="image/x-icon">
        <title>Document</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-success" id="menu">
            <div class="container">
                <a class="navbar-brand " href="index.html"><i class="fas fa-paw"></i> VETERINARIA SAN ROQUE</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
                        <li class="nav-item">
                            <a class="nav-link active" href="index.html">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="pacientes.html">Pacientes</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="consultas.html">Consultas</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contacto.html">Contactos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="reservas.html">Reservas</a>
                        </li>
                    </ul>

                    <a href="inicio_usu.html" class="btn btn-outline-light me-2 ">Ingresar</a>           
                    <a href="registro_usu.html" class="btn btn-outline-light me-5 ">Registro</a>

                    <form class="d-flex mt-2 ">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-light" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
        <section id="hero"> 
            <!-- parte de caruesel -->
            <div id="carousel" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-indicators" id="prueba">
                    <button type="button" data-bs-target="#carousel" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
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
                        <div class="col">
                            <div class="card shadow mb-4" style="font-family: 'Open Sans' !important;">
                                <div class="card-img">
                                    <img src="assets/img/pet-card-1.jpg" class="w-100 img-fluid" alt="">
                                </div>
                                <div class="card-body">
                                    <h3 class="py-1 text-muted fw-bold text-truncate" style="height: 40px">${item.name}</h3>
                                    <p class="py-0 my-0 fs-6" > <span class="fw-bold">Especie: </span> ${item.specie}</p>
                                    <p class="py-0 my-0"><span class="fw-bold">Raza: </span> ${item.race}</p>
                                    <p class="py-0 my-0 mb-2"><span class="fw-bold">Dueño: </span> ${item.user_name}</p>
                                    <p class="my-0 py-0">
                                        <a href="#" class="btn btn-outline-success d-block mx-auto py-2">Ver mascota</a>
                                    </p>
                                </div>
                            </div>
                        </div>

                    </c:forEach>



                    <!--      <div class="col">
                            <div class="card shadow">
                              <div class="card-header">
                                <h2>Lion</h2>
                              </div>
                              <div class="card-body">
                                <div class="card-img">
                                  <img src="assets/img/pet-card-1.jpg" class="w-100" alt="">
                                </div>
                                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ab, rem.</p>
                              </div>
                            </div>
                          </div>
                  
                          <div class="col">
                            <div class="card shadow">
                              <div class="card-header">
                                <h2>Pinta</h2>
                              </div>
                              <div class="card-body">
                                <div class="card-img">
                                  <img src="assets/img/pet-card-1.jpg" class="w-100" alt="">
                                </div>
                                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ab, rem.</p>
                              </div>
                            </div>
                          </div>
                  
                          <div class="col">
                            <div class="card shadow">
                              <div class="card-header">
                                <h2>Ben</h2>
                              </div>
                              <div class="card-body">
                                <div class="card-img">
                                  <img src="assets/img/pet-card-1.jpg" class="w-100" alt="">
                                </div>
                                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ab, rem.</p>
                              </div>
                            </div>
                          </div>
                  
                          <div class="col">
                            <div class="card shadow">
                              <div class="card-header">
                                <h2>Bigi</h2>
                              </div>
                              <div class="card-body">
                                <div class="card-img">
                                  <img src="assets/img/pet-card-1.jpg" class="w-100" alt="">
                                </div>
                                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ab, rem.</p>
                              </div>
                            </div>
                          </div>-->
                </div>      
            </div>

        </section>

        <footer class="bg-success">
            <div class="row w-75 mx-auto pt-2">

                <div class="col-md-6 text-dark">
                    <h6 class="text-light lead">CONTACTO:</h6>
                    <p class="text-light">
                        Av. Montes No. 1664 Local 5<br>
                        La Paz<br>
                    </p>
                </div>
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

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
        <script>
            let alto = window.innerHeight;
            let altoNav = document.getElementById("menu").clientHeight;
            document.querySelectorAll(".element").forEach(function (elemento) {
                elemento.style.height = (alto - altoNav) + "px";
            });
        </script>

    </body>
</html>