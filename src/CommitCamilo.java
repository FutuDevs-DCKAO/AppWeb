public class CommitCamilo {

    private String nombre;
    private int edad;
    private String ocupacion;

    public CommitCamilo(String nombre, int edad, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public String mensajeBienvenida(){

        String mensaje = "Hola mi nombre es " + nombre + " tengo " + edad + " años y soy " + ocupacion;

        return mensaje;

    }
}
