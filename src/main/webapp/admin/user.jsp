<%@include file="includes/header.jsp" %> 

<div class="">
    <h2 class="">Usuarios</h2>
    <a href=" " class="btn btn-success btn-sm my-2"><i class="far fa-plus-square"></i>  Agregar usuario</a> 
    <div class="table-responsive">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombres</th>
                    <th scope="col">CI</th>
                    <th scope="col">Direccion</th>
                    <th scope="col">Celular</th>
                    <th scope="col">Email</th>
                    <th scope="col">Contraseña</th>
                    <th scope="col">Rol</th>
                    <th scope="col">Editar</th>
                    <th scope="col">Eliminar</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${users}">
                <tr> 
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.ci}</td>
                    <td class="text-truncate" style="max-width: 150px">${item.address}</td>
                    <td>${item.phone}</td>
                    <td>${item.email}</td>
                    <td class="text-truncate" style="max-width: 150px">${item.password}</td>
                    <td class="text-capitalize">${item.role}</td>
                    <td><a class="btn btn-warning btn-sm" href="UserController?op=edit&id=${item.id}"><i class="far fa-edit "></i></a></td>
                    <td><a class="btn btn-danger btn-sm" href="UserController?op=delete&id=${item.id}"
                           onclick="return confirm('Esta seguro de eliminar a el usuario     ${item.name}?');"><i class="far fa-trash-alt"></i></a></td>
                </tr>
            </c:forEach>                
            </tbody>
        </table>
    </div>
</div>

<%@include file="includes/footer.jsp" %> 