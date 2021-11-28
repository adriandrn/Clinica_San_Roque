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
        <!--<meta charset="UTF-8">-->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Fjalla+One&family=Open+Sans:wght@300&family=Roboto:wght@100;300&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="https://fonts.googleapis.com/css2?family=Fjalla+One&family=Open+Sans:wght@300&family=Roboto:wght@100&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="../../assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="../../assets/css/styles.css">
        <link rel="shortcut icon" href="../../assets/img/icon/netcenter_7.ico" type="image/x-icon">
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
                            <a class="nav-link active" href="HomeController">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="PatientController">Pacientes</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="queries.jsp">Consultas</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contact.jsp">Contactos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="reservas.jsp">Reservas</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="../../admin/index.html">Administrador</a>
                        </li>
                    </ul>

                    <a href="inicio_usu.html" class="btn btn-outline-light me-2 ">Ingresar</a>           
                    <a href="registro_usu.html" class="btn btn-outline-light me-5 ">Registro</a>

                </div>
            </div>
        </nav>