import java.util.ArrayList;
import java.util.Iterator;

public class Organizador {
private String id;
private String nombre;
private String correo;
private int telefono;
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
public String getCorreo() {
    return correo;
}
public void setCorreo(String correo) {
    this.correo = correo;
}
public int getTelefono() {
    return telefono;
}
public void setTelefono(int telefono) {
    this.telefono = telefono;
}
@Override
public String toString() {
    return "Organizador [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + "]";
}
public Organizador(String id, String nombre, String correo, int telefono) {
    this.id = id;
    this.nombre = nombre;
    this.correo = correo;
    this.telefono = telefono;
}

public static void ListarOrganizadores(ArrayList<Organizador> lista) {
    Iterator<Organizador> it = lista.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }
}


}
