import java.util.ArrayList;
import java.util.Iterator;

public class Usuario implements Comparable<Usuario> {
private String id;
private String nombre;
private String correo;
private String Contraseña;
public Usuario(String id, String nombre, String correo, String contraseña) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.correo = correo;
	Contraseña = contraseña;
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
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getContraseña() {
	return Contraseña;
}
public void setContraseña(String contraseña) {
	Contraseña = contraseña;
}
@Override
public String toString() {
	return "Usuario [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", Contraseña=" + Contraseña + "]";
}
public Usuario() {
	super();
	// TODO Auto-generated constructor stub
}

public static void ListarUsuario(ArrayList<Usuario> li) {
	Iterator<Usuario> it=li.iterator();
	while(it.hasNext()) {
		Usuario ite =it.next();
		System.out.println(ite);
	}
}
@Override
public int compareTo(Usuario o) {
	// TODO Auto-generated method stub
	return this.id.compareTo(o.getId());
}

}
