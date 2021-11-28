<%@include file="./WEB-INF/includes/header.jsp" %> 

    
    <div>
      <button type="button" class="btn btn-success position-absolute" style="margin-top: 450px; padding: 10px; margin-left: 50px;">Realizar Consulta</button>
      <img src="assets/img/image-doc.jpg" class="d-block w-100" alt="..." style="object-fit: cover;">
    </div>
    
    <div class="d-grid gap-2">
      <button class="btn btn-success" type="button">Consultas Frecuentes</button>
    </div>
    <div class="container-fluid row mx-auto w-75" >
      <form class="w-100 row">
        <div class="form-check col-md-2">
          <img src="images/imagen2.png " class="img-thumbnail" alt="" style="width: 50px;"><i class="">Juan Perez Gomez</i>
        </div>
        <div class="col-md-10">
            <input type="text" class="form-control form-control-sm mt-3 " id="consulta" disabled value="">
        </div>
        <div class="form-check col-md-2">
          <img src="images/imagen2.png " class="img-thumbnail" alt="" style="width: 50px;"><i class="">Admin</i>
        </div>
        <div class="col-md-10">
            <input type="text" class="form-control form-control-sm mt-3 " id="consulta" disabled value="">
        </div>
        
      </form>
      <form class="w-100 row">
        <div class="form-check col-md-2">
          <img src="images/imagen2.png " class="img-thumbnail" alt="" style="width: 50px;"><i class="">Miguel Candia Flores</i>
        </div>
        <div class="col-md-10">
            <input type="text" class="form-control form-control-sm mt-3 " id="consulta" disabled value="">
        </div>
        <div class="form-check col-md-2">
          <img src="images/imagen2.png " class="img-thumbnail" alt="" style="width: 50px;"><i class="">Admin</i>
        </div>
        <div class="col-md-10">
            <input type="text" class="form-control form-control-sm mt-3 " id="consulta" disabled value="">
        </div>
        <div class="col-md-6">
            <input type="text" class="form-control form-control-sm mt-3" id="consulta" placeholder="Realizar consulta">
        </div>
        <div class="col-12 mr-auto mt-2">
          <button type="submit" class="btn btn-outline-success">Enviar</button>
        </div>
      </form>
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
   <!-- <div class="row w-75 d-flex mx-auto mt-5">
    <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d30172.927342492836!2d-65.2592666!3d-19.036639!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x93fbc8cef38e6c77%3A0xb405926e8bb6321a!2sMercado%20Campesino%20Sucre!5e0!3m2!1ses!2sbo!4v1637693177808!5m2!1ses!2sbo" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>

   </div> -->

   
  
</body>
</html>