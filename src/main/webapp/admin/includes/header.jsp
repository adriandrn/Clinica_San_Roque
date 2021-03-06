<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.emergentes.models.User"%>
<%
    User user = (User) session.getAttribute("user");
%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Melody Admin</title>
        <link rel="stylesheet" href="../assets/css/all.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" integrity="sha512-Fo3rlrZj/k7ujTnHg4CGR2D7kSs0v4LLanw2qksYuRlEzO+tcaEPQogQ0KaoGN26/zrn20ImR1DfuLWnOo7aBA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="../assets/css/style.css">
        <link rel="shortcut icon" href="../assets/img/icon/netcenter_7.ico" />
    </head>

    <body>
        <div class="container-scroller ">
            <!-- Barra de navegacion -->
            <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row default-layout-navbar">
                <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
                    <a class="navbar-brand brand-logo" href="../HomeController"><i class="fas fa-paw fa-2x"></i> Clinica San Roque</a>
                </div>
                <c:if test="${message!=null}">
                    <div class="position-absolute bg-success rounded p-3" style="color:white;right:100px;">
                        <i class="fas fa-check-circle fs-5"></i>
                        <span>Login exitoso</span>
                    </div>
                </c:if>
                <div class="navbar-menu-wrapper d-flex align-items-stretch">
                    <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
                        <span class="fas fa-bars"></span>
                    </button>
                    <ul class="navbar-nav navbar-nav-right">                    
                        <li class="nav-item">
                            <a class="nav-link" href="/HomeController">
                                Volver  <i class="fas fa-sign-out-alt"></i>
                            </a>
                        </li>
                    </ul>
                    <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
                        <span class="fas fa-bars"></span>
                    </button>
                </div>


            </nav>
            <!-- Selectores de temas-->
            <div class="container-fluid page-body-wrapper">
                <div class="">
                    <div id="settings-trigger"><i class="fas fa-fill-drip"></i></div>
                    <div id="theme-settings" class="settings-panel">
                        <i class="settings-close fa fa-times"></i>
                        <p class="settings-heading">SIDEBAR SKINS</p>
                        <div class="sidebar-bg-options selected" id="sidebar-light-theme"><div class="img-ss rounded-circle bg-light border mr-3"></div>Light</div>
                        <div class="sidebar-bg-options" id="sidebar-dark-theme"><div class="img-ss rounded-circle bg-dark border mr-3"></div>Dark</div>
                        <p class="settings-heading mt-2">HEADER SKINS</p>
                        <div class="color-tiles mx-0 px-4">
                            <div class="tiles primary"></div>
                            <div class="tiles success"></div>
                            <div class="tiles warning"></div>
                            <div class="tiles danger"></div>
                            <div class="tiles info"></div>
                            <div class="tiles dark"></div>
                            <div class="tiles default"></div>
                        </div>
                    </div>
                </div>


                <!-- Barra lateral -->
                <nav class="sidebar sidebar-offcanvas" id="sidebar">
                    <ul class="nav">
                        <li class="nav-item nav-profile">
                            <div class="nav-link">
                                <div class="profile-image">
                                    <!--<i class="fas fa-paw text-dark" style="font-size: 30px !important;"></i>-->
                                    <c:if test="${user.getPath()=='empty'}">
                                        <img src="../../assets/img/default_user.png" alt="mdo" width="32" height="32" class="rounded-circle">
                                    </c:if>
                                    <c:if test="${user.getPath()!='empty'}">
                                        <img src="../../assets/img/<%= user.getPath()%>" alt="mdo" width="32" height="32" class="rounded-circle">
                                    </c:if>                                    
                                </div>
                                <div class="profile-name">
                                    <p class="name">
                                        Bienvenido 
                                    </p>
                                    <p class="name text-uppercase"><%= user.getName()%></p>
                                    <p class="text-capitalize fw-bold">
                                        <%= user.getRole()%>
                                    </p>
                                </div>
                            </div>
                        </li>

                        <c:if test="${user.getRole() == 'admin'}">  
                            <li class="nav-item ">
                                <a class="nav-link" href="../../UserController">
                                    <i class="fas fa-users menu-icon"></i>
                                    <span class="menu-title">Usuarios</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../../PetController">
                                    <i class="fas fa-dog menu-icon"></i>
                                    <span class="menu-title">Mascotas</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../../ServiceController">
                                    <i class="fas fa-clipboard menu-icon"></i>
                                    <span class="menu-title">Servicios</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../../HourController">
                                    <i class="fas fa-clipboard menu-icon"></i>
                                    <span class="menu-title">Horarios</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">
                                    <i class="fas fa-list-alt menu-icon"></i>
                                    <span class="menu-title">Reservas</span>
                                </a>
                            </li>  
                        </c:if>
                        <c:if test="${user.getRole() != 'admin'}">

                            <li class="nav-item">
                                <a class="nav-link" href="../../PetController">
                                    <i class="fas fa-dog menu-icon"></i>
                                    <span class="menu-title">Mis mascotas</span>
                                </a>
                            </li>

                        </c:if>
                    </ul>
                </nav>
                <div class="main-panel">
                    <div class="content-wrapper">