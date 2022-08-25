public class CommitAndres {
    private String nombre;
    private String especie;
    private String sexo;
    private int edad;

    public CommitAndres(String nombre, String especie, String sexo, int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.sexo=sexo;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie(){
        return especie;
    }

    public  void setEspecie(String especie){
        this.especie=especie;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrar(){
        return "El nombre de la mascota es "+nombre+", pertenece a la especie "+especie+", es del sexo "+sexo+" y tiene "+edad+" meses";
    }
}
