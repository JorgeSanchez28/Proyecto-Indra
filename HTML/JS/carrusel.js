let indice = 0;

function mover(direccion) {
  const total = 5;
  indice = (indice + direccion + total) % total;
  document.getElementById("imagenes").style.transform = `translateX(-${indice * 100}%)`;
}

setInterval(() => mover(1), 5000);