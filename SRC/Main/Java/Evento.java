import java.util.ArrayList;
import java.util.Iterator;

public class Evento {
private String id;
private String fecha;
private int duracion;
private String descripcion;
private Organizador organizador;
private Categoria categoria;
private Ubicacion ubicacion;
public Evento(String id, String fecha, int duracion, String descripcion, Organizador organizador, Categoria categoria,
		Ubicacion ubicacion) {
	super();
	this.id = id;
	this.fecha = fecha;
	this.duracion = duracion;
	this.descripcion = descripcion;
	this.organizador = organizador;
	this.categoria = categoria;
	this.ubicacion = ubicacion;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public Organizador getOrganizador() {
	return organizador;
}
public void setOrganizador(Organizador organizador) {
	this.organizador = organizador;
}
public Categoria getCategoria() {
	return categoria;
}
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}
public Ubicacion getUbicacion() {
	return ubicacion;
}
public void setUbicacion(Ubicacion ubicacion) {
	this.ubicacion = ubicacion;
}
public Evento() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Evento [id=" + id + ", fecha=" + fecha + ", duracion=" + duracion + ", descripcion=" + descripcion
			+ ", organizador=" + organizador + ", categoria=" + categoria + ", ubicacion=" + ubicacion + "]";
}

public static void ListarEventos(ArrayList<Evento> e) {
	Iterator<Evento> ite =e.iterator();
	while(ite.hasNext()) {
		Evento it=ite.next();
		System.out.println(it);
	}
}

}
