public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        saludar("Borja");
        despedir();
        saludar("Laura");
        despedir();

        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(1,2);
        operacionesMatematicas.sumar(4,4);
    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }

    public static void despedir(){
        System.out.println("A cerrar el portatil");
    }
}
