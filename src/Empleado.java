public class Empleado {
    private String nombre, correo, empresaPerteneciente, rol;

    public Empleado(String nombre, String correo, String empresaPerteneciente, String rol){
        this.nombre = nombre;
        this.correo = correo;
        this.empresaPerteneciente = empresaPerteneciente;
        this.rol = rol;
    }

    //public Empleado() {
    //}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaPerteneciente() {
        return empresaPerteneciente;
    }

    public void setEmpresaPerteneciente(String empresaPerteneciente) {
        this.empresaPerteneciente = empresaPerteneciente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
