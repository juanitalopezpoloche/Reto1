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
                  
                    if (!planetaDestinoUsuario.isEmpty()) {
                        System.out.println("\nHas seleccionado un planeta destino. Si eliges otro, el actual(" + planetaDestinoUsuario + ") será reemplazado.");
                    }

                    planetaDestinoUsuario = obtenerPlanetaDestinoUsuario(scanner, planetasDestino);
                    break;

                case 2:

                    if (planetaDestinoUsuario.isEmpty()) {
                        System.out.println("\nNo has seleccionado el planeta destino. Selecciona uno: ");
                        planetaDestinoUsuario = obtenerPlanetaDestinoUsuario(scanner, planetasDestino);  
                    } else {
                        naveEspacialUsuario = obtenerNaveEspacialUsuario(scanner, navesEspaciales);    
                    }
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

    public static String obtenerPlanetaDestinoUsuario(Scanner scanner, Map<String, String[]> planetasDestino) {
        int index = 1;
        
        // Mostramos la lista de planetas
        System.out.println("\n------------  PLANETAS  ------------");
        for (String planeta : planetasDestino.keySet()) {
            System.out.println(index + ". " + planeta);
            index++;
        }

        System.out.println("\nSeleccione un planeta:");
        int planetaSeleccionado = scanner.nextInt();

        // Si el usuario selecciona un planeta qeu no es valido le mostramos un mensaje y se le da la opción de elegir nuevamente
        while (planetaSeleccionado < 1 || planetaSeleccionado > planetasDestino.size()) {
            System.out.println("\nOpción no válida, elija un destino válido (1 a " + planetasDestino.size() + "): ");
            planetaSeleccionado = scanner.nextInt();
        }

        // Mostramos al usuario el planeta seleccionado, descripción y la distancia
        String planeta = (String) planetasDestino.keySet().toArray()[planetaSeleccionado - 1];
        System.out.println("\nHas seleccionado: " + planeta);
        System.out.println("Descripción: " + planetasDestino.get(planeta)[0]);
        System.out.println("Distancia desde la Tierra: " + planetasDestino.get(planeta)[1] + " millones de Km");

        return planeta;
    }

    public static String obtenerNaveEspacialUsuario(Scanner scanner, Map<String, String[]> navesEspaciales) {
        int index = 1;

        // Mostramos la lista de naves espaciales con su velocidad y cantidad de pasajeros
        System.out.println("\n------------  NAVES ESPACIALES  ------------");
        for (String nave : navesEspaciales.keySet()) {
            String[] infoNave = navesEspaciales.get(nave);
            System.out.println(index + ". " + nave + " - Velocidad: " + infoNave[0] + " km/h, Pasajeros: " + infoNave[1] + "-" + " Combustible: " + infoNave[2] + " - Oxigeno: " + infoNave[3]);
            index++;
        }

        System.out.println("\nSeleccione una nave espacial:");
        int naveSeleccionada = scanner.nextInt();

        // Si el ususario digita una opción no valida de nave espacial, se le indica y se da la opción para que vuelva a escribir
        while (naveSeleccionada < 1 || naveSeleccionada > navesEspaciales.size()) {
            System.out.println("\nOpción no válida, elija una nave válida (1 a " + navesEspaciales.size() + "): ");
            naveSeleccionada = scanner.nextInt();
        }

        String nave = (String) navesEspaciales.keySet().toArray()[naveSeleccionada - 1];
        String[] infoNave = navesEspaciales.get(nave);

        // Se muestra la info de la nave seleccionada
        System.out.println("\nHas seleccionado: " + nave);
        System.out.println("Velocidad máxima: " + infoNave[0] + " km/h");
        System.out.println("Capacidad de pasajeros: " + infoNave[1]);
        System.out.println("Combustible disponible: " + infoNave[2]);
        System.out.println("Oxigeno disponible: " + infoNave[3]);
        return nave;
    }

}
