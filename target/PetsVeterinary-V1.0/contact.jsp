<%@include file="./WEB-INF/includes/header.jsp" %> 
    
    
    <section id="hero">
        <div class="container">
            <div class="row g-0" style="">
                <div class="col-12 col-lg-6">
                    <!-- <figure class="d-flex justify-content-center align-items-center"> -->
                        <img class="d-block mx-auto mt-4" src="assets/img/mascotas1.png" width="94%" alt="imagen-mascotas">
                    <!-- </figure> -->
                </div>
                <div class="col-12 col-lg-6 ps-3">
                    <div class="mt-3 mt-md-0 h-100 d-flex flex-column justify-content-center align-items-start ps-2" style="font-family: 'Open Sans';">
                        <h3 class="display-6 fw-bold">Contamos con servicios del primer nivel en todas sus categorias</h3>
                        <p class="fs-5 my-0 py-0">Además de una veterinaria, somos sinónimo de compromiso. En nuestras manos la salud y bienestar de tus mascotas estan garantizadas.</p>
                        <a href="" class="btn btn-lg mt-2 text-light mb-1 mb-lg-0" style="background:linear-gradient(to top, #0BA360, #3CBA92);">Contactar</a>
                        <!-- <a href="" class="btn btn-lg mt-2" style="background:linear-gradient(to top, #1E3C72,#1E3C72 1%,#2A5298 100%);">Contactar</a>
                        <a href="" class="btn btn-lg mt-2" style="background:linear-gradient(45deg, #93A5CF, #EAEFE9);">Contactar</a> -->
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section id="contacts" class="mt-4" style="font-family: 'Open Sans';">
        <div class="container" style="font-family: Roboto;">
            <div class="row px-3 px-md-0">
                <h2 class="fs-1 fw-bold mb-1" >Contactos</h2>
                <p class="fs-5 my-0 py-0">Envianos un mensaje para estar en contacto directo con nosotros o también puedes 
                    publicar tu consulta en nuestro <a href="#" class="fs-5 text-decoration-none">foro de consultas.</a>
                </p>
                <div class="col-12 col-lg-6">
                    <div class="border border-secondary px-3 py-2 rounded mt-4">
                        <p class="fs-5 mb-2 pb-0" style="">Recibirás una respuesta siempre que tu mensaje forme parte de alguno de los siguientes contextos</p>
                        <ul class="list-unstyled my-0 py-0" style="max-width: max-content;">
                            <li style="line-height: 1.8rem;"><i class="fas fa-check-circle me-2" style="color:#0BA360"></i> Mas información sobre un servicio especí­fico</li>
                            <li style="line-height: 1.8rem;"><i class="fas fa-check-circle me-2" style="color:#0BA360"></i> Contrataciones o asuntos relacionados</li>
                            <li style="line-height: 1.8rem;"><i class="fas fa-check-circle me-2" style="color:#0BA360"></i> Mas información sobre la veterinaria</li>
                            <li style="line-height: 1.8rem;"><i class="fas fa-check-circle me-2" style="color:#0BA360"></i> Anular registro de nuestro sistema</li>
                        </ul>
                    </div>
                </div>
                <div class="col-12 col-lg-6">
                    <form action="" class="mx-auto mt-4 mt-lg-0 mb-4" style="width: 85%;">
                        <h4 class="fw-bold mt-3">Rellena los campos requeridos</h4>
                        <div class="mb-3">
                            <div class="form-label">Correo Electrónico</div>
                            <div class="border d-flex align-items-center gap-2 p-2 rounded px-3" style="border-color: #BFBFBF !important;">
                                <i class="fas fa-envelope" style="color:#BFBFBF;"></i>
                                <input type="text" class="w-100 " name="email" style="border:none;outline:none !important;font-size: 16px;background-color: transparent;"/>
                            </div>
                        </div>
                        <div class="mb-2">
                            <div class="form-label">Mensaje</div>
                            <textarea name="" class="w-100 p-3" style="resize: none;outline:none;border:1px solid #BFBFBF;"></textarea>
                        </div>
                        <div>
                            <input type="submit" class="btn btn-success text-light" style="" value="Enviar">
                        </div>
                    </form>
                </div>
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
    <!-- Scripts -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>