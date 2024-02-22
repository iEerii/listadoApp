import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Se define la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Menu de opciones
        var salir = false;
        while(!salir){
            mostrarMenu();
            System.out.println();
        }
    }
    private static void mostrarMenu(){
        System.out.print("""
                **** Listado de Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion correcta");
    }
}

