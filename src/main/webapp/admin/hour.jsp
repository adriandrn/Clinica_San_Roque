<%@include file="includes/header.jsp" %>

<div class="">
    <h2 class="">Horas</h2>
    <a href=" " class="btn btn-success btn-sm my-2"><i class="far fa-plus-square"></i> Nuevo Seminario</a> 
    <div class="table-responsive w-25 ">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Hora</th>
                    <th scope="col">Editar</th>
                    <th scope="col">Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${hours}">
                    <tr> 
                        <th>${item.id}</th>
                        <td>${item.hour}</td>
                        <td><a class="btn btn-warning btn-sm" href="HourController?op=edit&id=${item.id}"><i class="far fa-edit "></i></a></td>
                        <td><a class="btn btn-danger btn-sm" href="HourController?op=delete&id=${item.id}"
                               onclick="return confirm('Esta seguro de eliminar a   ${item.hour}?');"><i class="far fa-trash-alt"></i></a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<%@include file="includes/footer.jsp" %>