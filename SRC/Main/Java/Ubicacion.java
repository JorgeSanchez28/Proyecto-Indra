import java.util.ArrayList;
import java.util.Iterator;

public class Ubicacion {
    private String id;
    private String direccion;
    private String ciudad;
    private String pais;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Ubicacion(String id, String direccion, String ciudad, String pais) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Ubicacion [id=" + id + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais=" + pais + "]";
    }

public static void ListarUbicaciones(ArrayList<Ubicacion> lista) {
    Iterator<Ubicacion> it = lista.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }
}
    
}
