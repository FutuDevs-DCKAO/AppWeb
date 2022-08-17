public class Main {
    public static void main(String[] args) {

        CommitCamilo camilo = new CommitCamilo("Juan Camilo Silva Zabala", 20, "Estudiante MINTIC 2022");
        System.out.println(camilo.mensajeBienvenida());

        Carro Diana = new Carro("Pichirilo", "ABC123", "Kia");
        System.out.println(Diana.mensajeBievenida());

        CommitOscar oscarAlvarez = new CommitOscar("",0,"",0);
        oscarAlvarez.setDireccion("avenida siempre viva 742");
        oscarAlvarez.setMetros(89);
        oscarAlvarez.setHabitaciones(4);
        oscarAlvarez.setPropietario("homero simpson");
        System.out.println(oscarAlvarez.mensajeCommitOscar());

        Mascota Nieves = new Mascota("Nieves", "Gato", "Femenino", 10);
        System.out.println(Nieves.mostrar());
    }
}