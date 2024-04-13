import java.util.Scanner;

public class Solicitud {

    private String nombreCliente;
    private String correo;
    private String telefono;
    private String tipoMascotaPreferida;
    private boolean solicitudAprobada;


    public Solicitud(String nombreCliente, String correo, String telefono, String tipoMascotaPreferida) {
        this.nombreCliente = nombreCliente;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoMascotaPreferida = tipoMascotaPreferida;
        this.solicitudAprobada = false;
    }

    // Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoMascotaPreferida() {
        return tipoMascotaPreferida;
    }

    public void setTipoMascotaPreferida(String tipoMascotaPreferida) {
        this.tipoMascotaPreferida = tipoMascotaPreferida;
    }

    public boolean isSolicitudAprobada() {
        return solicitudAprobada;
    }

    public void setSolicitudAprobada(boolean solicitudAprobada) {
        this.solicitudAprobada = solicitudAprobada;
    }


    public void imprimirSolicitud() {
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Tipo de mascota preferida: " + tipoMascotaPreferida);
        System.out.println("Estado de la solicitud: " + (solicitudAprobada ? "Aprobada" : "Pendiente"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su correo:");
        String correo = scanner.nextLine();

        System.out.println("Ingrese su telefono:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese el tipo de mascota que prefiere:");
        String tipoMascota = scanner.nextLine();

        Solicitud solicitud = new Solicitud(nombre, correo, telefono, tipoMascota);

        System.out.println("\nInformacion de la solicitud:");
        solicitud.imprimirSolicitud();

        scanner.close();
    }
}
