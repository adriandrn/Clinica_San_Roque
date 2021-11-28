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