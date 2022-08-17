public class CommitOscar {
    private String direccion;
    private int metros;
    private String propietario;
    private int habitaciones;

    public CommitOscar(String direccion, int metros, String propietario, int habitaciones) {
        this.direccion = direccion;
        this.metros = metros;
        this.propietario = propietario;
        this.habitaciones = habitaciones;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }


    public String mensajeCommitOscar(){

        return "La caracteristicas del apartamento son: "+direccion+" ,metros cuadrados: "+metros+" ,con un numero de habitaciones: "+habitaciones+" ,propietario :"+propietario;

    }
}

