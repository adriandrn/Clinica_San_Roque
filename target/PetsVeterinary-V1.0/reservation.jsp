<%@include file="./WEB-INF/includes/header.jsp" %> 


      <div class="row">
         <div class="col-md-6 d-flex align-items-center">
            <img src="assets/img/test.jpg" class="w-50  rounded-pill d-flex mx-auto mt-3 shadow" alt="">
         </div>
         <div class="col-md-6 d-flex align-items-center">
            <img src="assets/img/pet_1.jpg" class="w-75  rounded-3 d-flex mx-auto mt-3 shadow" alt="">
         </div>
      </div>

      <div class="row w-75 d-flex mx-auto mt-3">
         <h2 class="col-9 fs-1">Reservas</h2>
         <a href="das" class="col btn btn-success fs-4 align-self-end">Comprobante de reserva</a>
         <!-- <a href="">dsadsa</a> -->
         <p class="text-opacity-50">
            Puedes realizar Reservas en los horarios disponibles y podras resivir la mejos atencion para tus mascotas.
         </p>
      </div>

      <div class="row w-75 mx-auto table-responsive">
         <table class="table caption-top">
            <caption class="fs-3">Horarios</caption>
            <thead>
              <tr>
                <th scope="col">Dí­a\Hora</th>
                <th scope="col">08:00 - 10:00</th>
                <th scope="col">10:00 - 12:00</th>
                <th scope="col">14:00 - 16:00</th>
                <th scope="col">16:00 - 18:00</th>
                <th scope="col">18:00 - 20:00</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">Lunes</th>
                <td class="text-danger">Ocupado</td>
                <td class="text-success">Disponible</td>
                <td class="text-danger">Ocupado</td>
                <td class="text-danger">Ocupado</td>
                <td class="text-success">Disponible</td>
              </tr>
              <tr>
                <th scope="row">Martes</th>
                <td class="text-danger">Ocupado</td>
                <td class="text-success">Disponible</td>
                <td class="text-success">Disponible</td>
                <td class="text-danger">Ocupado</td>
                <td class="text-success">Disponible</td>
              </tr>
              <tr>
                <th scope="row">Miercoles</th>
                <td class="text-success">Disponible</td>
                <td class="text-success">Disponible</td>
                <td class="text-success">Opciones</td>
                <td class="text-success">Disponible</td>
                <td class="text-success">Disponible</td>
              </tr>
              <tr>
                <th scope="row">Jueves</th>
                <td class="text-success">Disponible</td>
                <td class="text-success">Disponible</td>
                <td class="text-success">Disponible</td>
                <td class="text-danger">Ocupado</td>
                <td class="text-success">Disponible</td>
              </tr>
              <tr>
                <th scope="row">Viernes</th>
                <td class="text-success">Disponible</td>
                <td class="text-success">Disponible</td>
                <td class="text-danger">Ocupado</td>
                <td class="text-success">Disponible</td>
                <td class="text-success">Disponible</td>
              </tr>
            </tbody>
          </table>
      </div>

      <div class="row col-sm-10 col-md-8 col-lg-6 mx-auto bg-primar card mb-5">
         <form action="" class="row  mb-3 mt-3">
            
            <div class=" col-12 col-md-6 col-xxl-4">
               <label for="dia" class="col-form-label">Ingerese el Dia <i class="" style="font-size: .5rem;">(solo atendemos de lunes a viernes)</i></label>
               <input type="date" class="form-control form-control">
            </div>
            <div class=" col-12 col-md-6 col-xxl-4">
               <label class="col-form-label">Hora</label>
               <select class="form-select form-select" name="hora">
                 <option selected>Seleccionar</option>
                 <option value="08:00 - 10:00">08:00 - 10:00</option>
                 <option value="10:00 - 12:00">10:00 - 12:00</option>
                 <option value="14:00 - 16:00">14:00 - 16:00</option>
                 <option value="16:00 - 18:00">16:00 - 18:00</option>
                 <option value="18:00 - 20:00">18:00 - 20:00</option>
               </select>
             </div>
             <%
                 
             %>

             <div class=" col-12 col-md-6 col-xxl-4 ">
                <label class="col-form-label">Servicio</label>
                <select class="form-select form-select" name="especialidad">
                   <option selected>Seleccionar</option>
                   <option value="General">General</option>
                   <option value="Corte">Corte de pelaje</option>
                </select>
             </div>

             <div class="col-md-12 d-flex justify-content-end">
               <button type="submit" class="btn btn-success mt-3">Reservar</button>
             </div>
         </form>
      </div>

      <div class="row w-75 d-flex mx-auto mb-5 ">
         <h2 class="sf-1">Nuestra ubicación</h2>
         <p class="fs-4"> Puedes encontrarnos donde señala el mapa</p>
         <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3216.9086308602427!2d-68.13645710778816!3d-16.497264957878112!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x915f20769f245e65%3A0x6577b82373449d0!2sCafe%20del%20Mundo!5e0!3m2!1ses!2sbo!4v1637625720386!5m2!1ses!2sbo" 
         width="600" 
         height="450" 
         style="border:0;" 
         allowfullscreen="" 
         loading="lazy"></iframe>
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

   </div>

   <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
   <script>
       let alto = window.innerHeight;
       let altoNav = document.getElementById("menu").clientHeight;
       document.querySelectorAll(".element").forEach(function(elemento){
           elemento.style.height=(alto-altoNav)+"px";
       });
   </script>
   
</body>
</html>