public class Main {
    public static void main(String[] args) {
        Estudiante E1 = new Estudiante("carlos",23,"ing sistemas" );
        Estudiante E2 = new Estudiante("Pedro",30,"Admin" );
        Estudiante E3 = new Estudiante("Juan",18,"ing Mecanica" );


        Estudiante E4 = new Estudiante( );
        E4.setNombre("Miguel");
        E4.setEdad(76);
        E4.setCarrera("Ing industrial");

        System.out.println(E1);
        System.out.println(E2);
        System.out.println(E3);
        System.out.println(E4);


        int suma = (E1.getEdad() + E2.getEdad() + E3.getEdad() + E4.getEdad());
        System.out.println(" La Suma de las edades es de: "+ suma);
    }
}
