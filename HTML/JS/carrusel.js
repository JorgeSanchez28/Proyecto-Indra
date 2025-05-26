let indice = 0;

function mover(direccion) {
  const total = 3;
  indice = (indice + direccion + total) % total;
  document.getElementById("imagenes").style.transform = `translateX(-${indice * 100}%)`;
}

setInterval(function() {
  cambiarImagen(1);
}, 20000);