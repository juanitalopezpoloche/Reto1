import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
        String planetaDestinoUsuario = "";
        String naveEspacialUsuario   = "";
        boolean mostrarMenuPrincipal = true;

        // Agregamos información de los planetas (nombre, descripción, distancia)
        Map<String, String[]> planetasDestino = new HashMap<>();        
        planetasDestino.put("Mercurio", new String[]{"Es el planeta más cercano al Sol, con temperaturas extremadamente altas.", "91.7"});
        planetasDestino.put("Venus", new String[]{"Conocido como el gemelo de la Tierra, con una atmósfera densa y cálida.", "41.4"});
        planetasDestino.put("Marte", new String[]{"Conocido como el planeta rojo debido a su superficie oxidada.", "78.3"});
        planetasDestino.put("Júpiter", new String[]{"El planeta más grande del sistema solar, con una atmósfera de gas.", "628.7"});
        planetasDestino.put("Saturno", new String[]{"Famoso por sus impresionantes anillos, es el segundo planeta más grande.", "1200"});
        planetasDestino.put("Urano", new String[]{"Un gigante helado con una atmósfera rica en hidrógeno y helio.", "2660"});
        planetasDestino.put("Neptuno", new String[]{"El planeta más distante del sistema solar, con fuertes vientos.", "4300"});

        // Creamos un mapa para almacenar la información de las naves espaciales
        Map<String, String[]> navesEspaciales = new HashMap<>();
        navesEspaciales.put("Nave Espacial 1", new String[]{"50000", "80", "10000", "5000"});
        navesEspaciales.put("Nave Espacial 2", new String[]{"80000", "50", "12000", "6000"});
        navesEspaciales.put("Mars Rover", new String[]{"50000", "4", "3000", "1500"});
        navesEspaciales.put("Juno", new String[]{"40000", "7", "4000", "2000"});
        navesEspaciales.put("Cassini", new String[]{"30000", "10", "3500", "1500"});
        navesEspaciales.put("Voyager 2", new String[]{"20000", "3", "2000", "1000"});
        
        
        while (mostrarMenuPrincipal) {

            mostrarMenuPrincipal();
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                  
                    break;

                case 2:

                  break;

                case 3:

                    break;

                case 4:

                    System.out.println("\nSaliendo del programa");
                    mostrarMenuPrincipal = false;
                    break;

                default:
                    System.out.println("\nOpción Inválida");
            }

        }

        scanner.close();
    }

    
    public static void mostrarMenuPrincipal() {
        System.out.println("\n------------  MENU  ------------");
        System.out.println(" 1. Seleccionar un planeta destino");
        System.out.println(" 2. Seleccionar una nave espacial");
        System.out.println(" 3. Iniciar una simulación espacial");
        System.out.println(" 4. Salir del programa");
        System.out.println("\nDigite una opción (1-4):");
    }

}
