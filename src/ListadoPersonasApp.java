import java.sql.SQLOutput;
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
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch(Exception e) {
                System.out.println("Ocurrio un error" + e.getMessage());
            }
        }
    }
    private static void mostrarMenu(){
        System.out.print("""
                **** Listado de Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporcione la opcion correcta: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //Verificar la opcion proporcionada
        switch (opcion){
            case 1 -> {
                System.out.print("Proporcione el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporcione el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporcione el email: ");
                var email = consola.nextLine();
                //Se crea el objeto de tipo persona con las variables anteriores
                var persona = new Persona(nombre, tel, email);
                //Se agrega a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }
            case 2 -> {
                System.out.println("Listado de personas: ");
                //Mejora utilizando lambda y metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion incorrecta: " + opcion);
        }
        return salir;
    }
}

