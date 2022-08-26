public class Main {
    public static void main(String[] args) {

        /*CommitCamilo camilo = new CommitCamilo("Juan Camilo Silva Zabala", 20, "Estudiante MINTIC 2022");
        System.out.println(camilo.mensajeBienvenida());*/

        /*CommitEnrique Enrique = new CommitEnrique("Manchester United",1886,"Inglaterra");*/

        /*CommitDiana Diana = new CommitDiana("Pichirilo", "ABC123", "Kia");
        System.out.println(Diana.mensajeBievenida());*/

        /*CommitOscar oscarAlvarez = new CommitOscar("",0,"",0);
        oscarAlvarez.setDireccion("avenida siempre viva 742");
        oscarAlvarez.setMetros(89);
        oscarAlvarez.setHabitaciones(4);
        oscarAlvarez.setPropietario("homero simpson");
        System.out.println(oscarAlvarez.mensajeCommitOscar());*/

        /*CommitAndres Nieves = new CommitAndres("Nieves", "Gato", "Femenino", 10);
        System.out.println(Nieves.mostrar());*/

        //Instancia clase Empleado usando método constructor con parámetros
        Empleado empleado1 = new Empleado("Carolina Ruiz", "caroruiz@gmail.com",
                "Futudevs", "Gerente");

        //Instancia clase Empleado usando método constructor vacío
        Empleado empleado2 = new Empleado();

        empleado2.setNombre("Laura Camila");
        empleado2.setCorreo("lauCamila1@gmail.com");
        empleado2.setEmpresaPerteneciente("FutuDevs");
        empleado2.setNombre("Asistente comercial");

        System.out.println(empleado2.getNombre());
        System.out.println(empleado2.getCorreo());
        System.out.println(empleado2.getEmpresaPerteneciente());
        System.out.println(empleado2.getRol());

        //Empresa usando constructor con parametros
        Empresa empresa1 = new Empresa("Camara de Comercio Bogota", "Avenida El Dorado nro. 68D - 35", "6015941000", "8600073229");

        //Empresa constructor vacio
        Empresa empresa2 = new Empresa();

        empresa2.setNombreEmpresa("pollito");
        empresa2.setDireccionEmpresa("Avenida Boyaca nro. 27A-70");
        empresa2.setTelefonoEmpresa("601549283");
        empresa2.setNitEmpresa("5216348214524");

        System.out.println("Empresa 1:\n    Nombre de la empresa: " + empresa1.getNombreEmpresa());
        System.out.println("    Direccion de la empresa: " + empresa1.getDireccionEmpresa());
        System.out.println("    Telefono de la empresa: " + empresa1.getTelefonoEmpresa());
        System.out.println("    NIT de la empresa: " + empresa1.getNitEmpresa());

        System.out.println("Empresa 2:\n    Nombre de la empresa: " + empresa2.getNombreEmpresa());
        System.out.println("    Direccion de la empresa: " + empresa2.getDireccionEmpresa());
        System.out.println("    Telefono de la empresa: " + empresa2.getTelefonoEmpresa());
        System.out.println("    NIT de la empresa: " + empresa2.getNitEmpresa());


    }
}