<div class="col">
    <div class="card shadow mb-4" style="font-family: 'Open Sans' !important;">
        <div class="card-img">
            <img src="assets/img/pet-card-1.jpg" class="w-100 img-fluid" alt="">
        </div>
        <div class="card-body">
            <h3 class="py-1 text-muted fw-bold text-truncate" style="height: 40px">${item.name}</h3>
            <p class="py-0 my-0 fs-6" > <span class="fw-bold">Especie: </span> ${item.specie} ${item.id}</p>
            <p class="py-0 my-0"><span class="fw-bold">Raza: </span> ${item.race}</p>
            <p class="py-0 my-0 mb-2"><span class="fw-bold">Dueño: </span> ${item.user_name}</p>
            <p class="my-0 py-0">
                <a href="#" class="btn btn-outline-success d-block mx-auto py-2">Ver mascota</a>
            </p>
        </div>
    </div>
</div>