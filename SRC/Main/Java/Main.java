
import java.util.ArrayList;
import java.util.Iterator;
public class Main {

public static void main(String[] args) {
       // Listas para almacenar los objetos
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Organizador> organizadores = new ArrayList<>();
        ArrayList<Categoria> categorias = new ArrayList<>();
        ArrayList<Ubicacion> ubicaciones = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        // Crear usuarios
        Usuario u1 = new Usuario("U001", "Carlos Pérez", "carlos@mail.com", "1234");
        Usuario u2 = new Usuario("U002", "Lucía García", "lucia@mail.com", "abcd");
        registrarUsuario(usuarios, u1);
        registrarUsuario(usuarios, u2);

        // Crear organizadores
        Organizador o1 = new Organizador("O001", "Ana López", "ana@mail.com", 123456789);
        registrarOrganizador(organizadores, o1);

        // Crear categorías
        Categoria c1 = new Categoria("C001", "Conferencia");
        Categoria c2 = new Categoria("C002", "Taller");
        registrarCategoria(categorias, c1);
        registrarCategoria(categorias, c2);

        // Crear ubicaciones
        Ubicacion ub1 = new Ubicacion("L001", "Calle Mayor 5", "Madrid", "España");
        registrarUbicacion(ubicaciones, ub1);

        // Crear eventos
        Evento e1 = new Evento("E001", "2025-06-10", 2, "Charla sobre IA", o1, c1, ub1);
        Evento e2 = new Evento("E002", "2025-06-12", 3, "Taller de programación", o1, c2, ub1);
        registrarEvento(eventos, e1);
        registrarEvento(eventos, e2);

        // Crear inscripciones
        Inscripcion i1 = new Inscripcion("I001", "2025-06-01", u1, e1);
        Inscripcion i2 = new Inscripcion("I002", "2025-06-02", u2, e2);
        inscribirUsuario(inscripciones, i1);
        inscribirUsuario(inscripciones, i2);

        System.out.println(" Usuarios ");
        Usuario.ListarUsuario(usuarios);

        System.out.println(" Organizadores ");
        Organizador.ListarOrganizadores(organizadores);

        System.out.println(" Categorías ");
        Categoria.ListarCategorias(categorias);

        System.out.println(" Ubicaciones ");
        Ubicacion.ListarUbicaciones(ubicaciones);

        System.out.println(" Eventos ");
        Evento.ListarEventos(eventos);

        System.out.println(" Inscripciones ");
        Inscripcion.listarInscripciones(inscripciones);
    }

       
        public static void registrarUsuario(ArrayList<Usuario> usuarios, Usuario nuevo) {
            Iterator<Usuario> it = usuarios.iterator();
            while (it.hasNext()) {
                if (it.next().getId().equals(nuevo.getId())) {
                    System.out.println("Usuario ya registrado: " + nuevo.getId());
                    return;
                }
            }
            usuarios.add(nuevo);
    }

    public static void registrarOrganizador(ArrayList<Organizador> organizadores, Organizador nuevo) {
        Iterator<Organizador> it = organizadores.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(nuevo.getId())) {
                System.out.println("Organizador ya registrado: " + nuevo.getId());
                return;
            }
        }
        organizadores.add(nuevo);
    }

    public static void registrarCategoria(ArrayList<Categoria> categorias, Categoria nueva) {
        Iterator<Categoria> it = categorias.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(nueva.getId())) {
                System.out.println("Categoría ya registrada: " + nueva.getId());
                return;
            }
        }
        categorias.add(nueva);
    }

    public static void registrarUbicacion(ArrayList<Ubicacion> ubicaciones, Ubicacion nueva) {
        Iterator<Ubicacion> it = ubicaciones.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(nueva.getId())) {
                System.out.println("Ubicación ya registrada: " + nueva.getId());
                return;
            }
        }
        ubicaciones.add(nueva);
    }

    public static void registrarEvento(ArrayList<Evento> eventos, Evento nuevo) {
        Iterator<Evento> it = eventos.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(nuevo.getId())) {
                System.out.println("Evento ya registrado: " + nuevo.getId());
                return;
            }
        }
        eventos.add(nuevo);
    }

    public static void inscribirUsuario(ArrayList<Inscripcion> inscripciones, Inscripcion nueva) {
        Iterator<Inscripcion> it = inscripciones.iterator();
        while (it.hasNext()) {
            Inscripcion ins = it.next();
            if (ins.getUsuario().getId().equals(nueva.getUsuario().getId()) &&
                ins.getEvento().getId().equals(nueva.getEvento().getId())) {
                System.out.println("El usuario ya está inscrito en este evento: " + nueva.getUsuario().getId());
                return;
            }
        }
        inscripciones.add(nueva);
    }
}

