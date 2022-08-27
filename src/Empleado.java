public class Empleado {
    private String nombre, correo, rol;
    private Empresa empresaPerteneciente;

    public Empleado(String nombre, String correo, String rol, Empresa empresaPerteneciente) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.empresaPerteneciente = empresaPerteneciente;
    }

    public Empleado() {

    }

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

    public Empresa getEmpresaPerteneciente() {
        return empresaPerteneciente;
    }

    public void setEmpresaPerteneciente(Empresa empresaPerteneciente) {
        this.empresaPerteneciente = empresaPerteneciente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
