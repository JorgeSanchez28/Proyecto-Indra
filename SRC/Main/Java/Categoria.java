import java.util.ArrayList;
import java.util.Iterator;

public class Categoria {
private String id;
private String nombre;
public Categoria(String id, String nombre) {
	super();
	this.id = id;
	this.nombre = nombre;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Categoria [id=" + id + ", nombre=" + nombre + "]";
}
public Categoria() {
	super();
	// TODO Auto-generated constructor stub
}
public static void ListarCategorias(ArrayList<Categoria> lista) {
    Iterator<Categoria> it = lista.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }
}
}
