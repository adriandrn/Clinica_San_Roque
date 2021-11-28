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
<body style="min-width: 380px !important;">
   <div class="container-fluid row mx-auto" style="height: 100vh;">
      <div class="col-12 col-sm-9 col-md-8 col-lg-6 col-xl-5 col-xxl-4 mx-auto d-flex align-items-center">

        <form action="" method="" class="bg-light w-100 row shadow" style="padding: 20px 30px;  border-radius: 20px;">
          <div class="row">
            <h1 class="text-center col-11">Registro de usuarios</h1>            
            <a href="index.html" class="col-1"><i class="fas fa-times-circle fa-3x text-success"></i></a>
          </div>
          
          <div class="col-12">
          <label class="col-form-label-sm">Nombres y apellidos</label>
          <input type="text" class="form-control form-control-sm " name="nombres" >
        </div>
        
        <div class="col-12">
          <label class="col-form-label-sm">Dirección</label>
          <input type="text" class="form-control form-control-sm " name="direccion" >
        </div>
        
        <div class="col-md-12 col-lg-6">
          <label  class="col-form-label-sm">CI</label>
          <input type="text" class="form-control form-control-sm" name="ci">
        </div>
        
        <div class="col-md-12 col-lg-6">
          <label class="col-form-label-sm">Telefono</label>
          <input type="text" class="form-control form-control-sm " name="telefono" >
        </div>
        
        <div class="col-12">
          <label class="col-form-label-sm">Email</label>
          <input type="text" class="form-control form-control-sm" name="email" >
        </div>
        
        <div class="col-md-12 col-lg-6">
          <label class="col-form-label-sm">Nueva Contraseña</label>
          <input type="password" class="form-control form-control-sm " name="contraseña" >
        </div>
        
        <div class="col-md-12 col-lg-6">
          <label class="col-form-label-sm">Repetir Contraseña</label>
          <input type="password" class="form-control form-control-sm " name="contraseña" >
        </div>
        
        <div class="col-md-6">
          <label class="col-form-label-sm">Rol</label>
          <select class="form-select form-select-sm" name="rol">
            <option selected>Seleccionar</option>
            <option value="Administrador">Administrador</option>
            <option value="Recepcion">Recepcion</option>
            <option value="Cliente">Cliente</option>
          </select>
        </div>
        
        <div class="col-12">
          <button type="submit" class="btn btn-success my-2 me-5">Registrarse</button>
          <a href="inicio_usu.html" class="text-success">Ya tienes una cuenta</a>
        </div>
      </form>
    </div>
      
    </div>
</body>
</html>