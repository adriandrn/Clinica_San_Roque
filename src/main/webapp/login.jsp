<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
   <link rel="stylesheet" href="assets/css/bootstrap.min.css">
   <title>Document</title>
</head>
<body>
    <form action="AutenticationController" method="post" class="row g-3 position-fixed top-50 start-50 translate-middle bg-light shadow" style=" padding: 20px; border-radius: 20px; max-width: 500px">
      <div class="row">
         <h1 class="text-center col-11">Iniciar sesion</h1>
         <a href="HomeController" class="col-1"><i class="fas fa-times-circle fa-3x text-success"></i></a>
      </div>
      <div class="col-12 ">
         <label class="col-form-label-sm" for="email">Email</label>
         <input type="text" class="form-control form-control-sm" name="email" id="email">
      </div>
      
      <div class="col-12">
         <label class="col-form-label-sm" for="contraseÃ±a">Contraseña</label>
         <input type="password" class="form-control form-control-sm" name="password" id="password">
      </div>
      
      <div class="col-12">
         <button type="submit" class="btn btn-success">Ingresar</button>
         <a href="AutenticationController?op=register" class="ms-5 text-success">No tienes una cuenta?</a>
      </div>
   </form>
</body>
</html>