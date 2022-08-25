public class CommitDiana {
    private String nombre;
    private String placa;
    private String marca;

    public CommitDiana(String nombre, String placa, String marca) {
        this.nombre = nombre;
        this.placa = placa;
        this.marca = marca;
    }

    public String mensajeBievenida(){

        String mensaje = "Hola el nombre de mi carro es " + nombre +" mi placa es " + placa + " y soy " + marca;

        return mensaje;
    }
}
