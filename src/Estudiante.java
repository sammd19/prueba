public class Estudiante {
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String carrera;

    //CONSTRUCTOR VACIO
    public Estudiante() {

    }
    //CONSTRUCTOR CON PARAMETROS
    public Estudiante(String nombre, int edad,String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;

    }

    //METODOS GETTER Y SETTER

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //METODO TOSTRING


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
