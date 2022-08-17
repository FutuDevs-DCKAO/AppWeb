public class CommitEnrique {

    private String NombreEquipo;
    private int AñoFundacion;
    private String Pais;

    public CommitEnrique(String NombreEquipo, int AñoFundacion, String Pais) {
        this.NombreEquipo = NombreEquipo;
        this.AñoFundacion = AñoFundacion;
        this.Pais = Pais;
    }

    public String mensajeBienvenida(){

        String mensaje = "Hola el nombre del equipo es " + NombreEquipo + "el año de fundacion fue en " + AñoFundacion + "el equipo es de " +Pais;

        return mensaje;

    }
}
