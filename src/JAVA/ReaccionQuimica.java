import java.util.Scanner;

public class ReaccionQuimica {
    private TablaPeriodica tablaPeriodica;

    public ReaccionQuimica(TablaPeriodica tablaPeriodica) {
        this.tablaPeriodica = tablaPeriodica;
    }

    public void mostrarMenuReacciones() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nTipos de reacciones disponibles:");
            System.out.println("1. Óxidos metálicos (Metal + O₂)");
            System.out.println("2. Óxidos no metálicos (No metal + O₂)");
            System.out.println("3. Hidruros metálicos (Metal + H₂)");
            System.out.println("4. Hidrácidos (No metal + H₂)");
            System.out.println("5. Hidróxidos (Óxido metálico + H₂O)");
            System.out.println("0. Salir");

            System.out.print("\nSeleccione el tipo de reacción (0-5): ");
            int opcion = scanner.nextInt();

            if (opcion == 0) break;

            switch (opcion) {
                case 1:
                    generarOxidoMetalico();
                    break;
                case 2:
                    generarOxidoNoMetalico();
                    break;
                case 3:
                    generarHidruroMetalico();
                    break;
                case 4:
                    generarHidracido();
                    break;
                case 5:
                    generarHidroxido();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private void generarOxidoMetalico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el símbolo del metal: ");
        String metal = scanner.nextLine();

        // Verificar si el elemento existe y es un metal
        Elemento elemento = buscarElemento(metal);
        if (elemento != null && elemento.getTipo().contains("Metal")) {
            System.out.println("\nReacción de óxido metálico:");
            System.out.println("4" + metal + " + 3O₂ → 2" + metal + "₂O₃");
            System.out.println("Se forma el óxido: " + metal + "₂O₃");
        } else {
            System.out.println("Error: El elemento ingresado no es un metal válido.");
        }
    }

    private void generarOxidoNoMetalico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el símbolo del no metal: ");
        String noMetal = scanner.nextLine();

        // Verificar si el elemento existe y es un no metal
        Elemento elemento = buscarElemento(noMetal);
        if (elemento != null && elemento.getTipo().equals("No metal")) {
            System.out.println("\nReacción de óxido no metálico:");
            System.out.println(noMetal + "₂ + 2O₂ → 2" + noMetal + "O₂");
            System.out.println("Se forma el óxido: " + noMetal + "O₂");
        } else {
            System.out.println("Error: El elemento ingresado no es un no metal válido.");
        }
    }

    private void generarHidruroMetalico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el símbolo del metal: ");
        String metal = scanner.nextLine();

        // Verificar si el elemento existe y es un metal
        Elemento elemento = buscarElemento(metal);
        if (elemento != null && elemento.getTipo().contains("Metal")) {
            System.out.println("\nReacción de hidruro metálico:");
            System.out.println("2" + metal + " + H₂ → 2" + metal + "H");
            System.out.println("Se forma el hidruro: " + metal + "H");
        } else {
            System.out.println("Error: El elemento ingresado no es un metal válido.");
        }
    }

    private void generarHidracido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el símbolo del no metal: ");
        String noMetal = scanner.nextLine();

        // Verificar si el elemento existe y es un no metal
        Elemento elemento = buscarElemento(noMetal);
        if (elemento != null && elemento.getTipo().equals("No metal")) {
            System.out.println("\nReacción de hidrácido:");
            System.out.println("H₂ + " + noMetal + "₂ → 2H" + noMetal);
            System.out.println("Se forma el hidrácido: H" + noMetal);
        } else {
            System.out.println("Error: El elemento ingresado no es un no metal válido.");
        }
    }

    private void generarHidroxido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el símbolo del metal: ");
        String metal = scanner.nextLine();

        // Verificar si el elemento existe y es un metal
        Elemento elemento = buscarElemento(metal);
        if (elemento != null && elemento.getTipo().contains("Metal")) {
            System.out.println("\nReacción de hidróxido:");
            System.out.println(metal + "₂O + H₂O → 2" + metal + "OH");
            System.out.println("Se forma el hidróxido: " + metal + "OH");
        } else {
            System.out.println("Error: El elemento ingresado no es un metal válido.");
        }
    }

    private Elemento buscarElemento(String simbolo) {
        for (Elemento elemento : tablaPeriodica.getElementos()) {
            if (elemento.getSimbolo().equalsIgnoreCase(simbolo)) {
                return elemento;
            }
        }
        return null;
    }
}
