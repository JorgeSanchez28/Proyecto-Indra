import java.util.ArrayList;
import java.util.Iterator;

public class Inscripcion {
private String id;
private String fecha;
private Usuario usuario;
private Evento evento;
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
public Usuario getUsuario() {
    return usuario;
}
public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}
public Evento getEvento() {
    return evento;
}
public void setEvento(Evento evento) {
    this.evento = evento;
}
@Override
public String toString() {
    return "Inscripcion [id=" + id + ", fecha=" + fecha + ", usuario=" + usuario + ", evento=" + evento + "]";
}
public Inscripcion(String id, String fecha, Usuario usuario, Evento evento) {
    this.id = id;
    this.fecha = fecha;
    this.usuario = usuario;
    this.evento = evento;
}

 public static void listarInscripciones(ArrayList<Inscripcion> lista) {
            Iterator<Inscripcion> it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
    }

}
