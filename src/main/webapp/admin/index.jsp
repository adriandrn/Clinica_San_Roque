<%@include file="includes/header.jsp" %> 


<div class="my-3">
    <h2 class="">Usuarios</h2>
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
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${users}" begin="1" end="5" step="1">
                <tr> 
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.ci}</td>
                    <td class="text-truncate" style="max-width: 150px">${item.address}</td>
                    <td>${item.phone}</td>
                    <td>${item.email}</td>
                    <td class="text-truncate" style="max-width: 150px">${item.password}</td>
                    <td class="text-capitalize">${item.role}</td>                    
                </tr>
            </c:forEach>                
            </tbody>
        </table>
    </div>
</div>

<div class="my-3">
    <h2 class="">Mascotas</h2>
    <div class="table-responsive">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Raza</th>
                    <th scope="col">Especie</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Edad</th>
                    <th scope="col">Color</th>
                    <th scope="col">Dueño</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${pets}" begin="1" end="5" step="1">
                    <tr> 
                        <th>${item.id}</th>
                        <td>${item.name}</td>
                        <td>${item.race}</td>
                        <td>${item.specie}</td>
                        <td>${item.state}</td>
                        <td>${item.age}</td>
                        <td>${item.color}</td>
                        <td>${item.user_name}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<div class="my-3">
    <h2 class="">Servicios</h2>
    <div class="table-responsive">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Descripcion</th>
                    <th scope="col">Costo</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${services}" begin="1" end="5" step="1">
                    <tr> 
                        <th>${item.id}</th>
                        <td class="text-truncate" style="max-width: 100px">${item.name}</td>
                        <td class="text-truncate" style="max-width: 100px">${item.description}</td>
                        <td>${item.coste}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<div class="my-3">
    <h2 class="">Horas</h2>
    <div class="table-responsive w-25 ">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Hora</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${hours}" begin="1" end="5" step="1">
                    <tr> 
                        <th>${item.id}</th>
                        <td>${item.hour}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<%@include file="includes/footer.jsp" %> 