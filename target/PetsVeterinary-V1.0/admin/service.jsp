<%@include file="includes/header.jsp" %>

<div class="">
    <h2 class="">Servicios</h2>
    <a href=" " class="btn btn-success btn-sm my-2"><i class="far fa-plus-square"></i> Nuevo servicio</a> 
    <div class="table-responsive">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Descripcion</th>
                    <th scope="col">Costo</th>
                    <th scope="col">Editar</th>
                    <th scope="col">Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${services}">
                    <tr> 
                        <th>${item.id}</th>
                        <td class="text-truncate" style="max-width: 100px">${item.name}</td>
                        <td class="text-truncate" style="max-width: 300px">${item.description}</td>
                        <td>${item.coste}</td>
                        <td><a class="btn btn-warning btn-sm" href="HourController?op=edit&id=${item.id}"><i class="far fa-edit "></i></a></td>
                        <td><a class="btn btn-danger btn-sm" href="HourController?op=delete&id=${item.id}"
                               onclick="return confirm('Esta seguro de eliminar a   ${item.name}?');"><i class="far fa-trash-alt"></i></a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<%@include file="includes/footer.jsp" %>