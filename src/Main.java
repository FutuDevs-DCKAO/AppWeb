public class Main {
    public static void main(String[] args) {

        CommitCamilo camilo = new CommitCamilo("Juan Camilo Silva Zabala", 20, "Estudiante MINTIC 2022");
        System.out.println(camilo.mensajeBienvenida());

        CommitEnrique Enrique = new CommitEnrique("Manchester United",1886,"Inglaterra");

        CommitDiana Diana = new CommitDiana("Pichirilo", "ABC123", "Kia");
        System.out.println(Diana.mensajeBievenida());

        /*CommitOscar oscarAlvarez = new CommitOscar("",0,"",0);
        oscarAlvarez.setDireccion("avenida siempre viva 742");
        oscarAlvarez.setMetros(89);
        oscarAlvarez.setHabitaciones(4);
        oscarAlvarez.setPropietario("homero simpson");
        System.out.println(oscarAlvarez.mensajeCommitOscar());*/

        CommitAndres Nieves = new CommitAndres("Nieves", "Gato", "Femenino", 10);
        System.out.println(Nieves.mostrar());

        //Instancia clase empresa constructor vacío
        Empresa empresa1= new Empresa();
    }
}