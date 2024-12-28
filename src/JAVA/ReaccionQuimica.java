import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReaccionQuimica {
    private TablaPeriodica tablaPeriodica;
    private Map<String, List<Integer>> valencias;

    public ReaccionQuimica(TablaPeriodica tablaPeriodica) {
        this.tablaPeriodica = tablaPeriodica;
        inicializarValencias();
    }

    private void inicializarValencias() {
        valencias = new HashMap<>();
        valencias.put("Metal alcalino", List.of(1));
        valencias.put("Metal alcalinotérreo", List.of(2));
        valencias.put("Metal de transición", List.of(2, 3));
        valencias.put("No metal", List.of(-4, -3, -2, -1, 1, 2, 3, 4, 5));
        valencias.put("Gas noble", List.of(0));
        valencias.put("Halógeno", List.of(-1, 1, 3, 5, 7));
        valencias.put("Metal", List.of(2, 3));
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
            System.out.println("6. Generar reacción aleatoria");
            System.out.println("0. Salir");

            System.out.print("\nSeleccione el tipo de reacción (0-6): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (opcion == 0) break;

            if (opcion == 6) {
                generarReaccionAleatoria();
                continue;
            }

            System.out.print("Ingrese el símbolo del elemento: ");
            String elemento = scanner.nextLine();
            
            System.out.print("Ingrese la valencia del elemento (1-7): ");
            int valencia = scanner.nextInt();

            procesarReaccion(opcion, elemento, valencia);
        }
    }

    private void procesarReaccion(int tipoReaccion, String elemento, int valencia) {
        if (!validarElemento(elemento, tipoReaccion)) {
            System.out.println("Error: El elemento no es válido para este tipo de reacción.");
            return;
        }

        String nombreIUPAC = obtenerNombreIUPAC(elemento, valencia, tipoReaccion);
        String ecuacion = generarEcuacion(tipoReaccion, elemento, valencia);

        System.out.println("\nReacción química:");
        System.out.println(ecuacion);
        System.out.println("Nombre IUPAC: " + nombreIUPAC);
    }

    private boolean validarElemento(String simbolo, int tipoReaccion) {
        Elemento elemento = buscarElemento(simbolo);
        if (elemento == null) return false;

        switch (tipoReaccion) {
            case 1: // Óxido metálico
            case 5: // Hidróxido
                return elemento.getTipo().contains("Metal");
            case 2: // Óxido no metálico
            case 4: // Hidrácido
                return elemento.getTipo().equals("No metal") || elemento.getTipo().equals("Halógeno");
            case 3: // Hidruro metálico
                return elemento.getTipo().contains("Metal") && 
                       (elemento.getTipo().equals("Metal alcalino") || 
                        elemento.getTipo().equals("Metal alcalinotérreo"));
            default:
                return false;
        }
    }

    private String obtenerNombreIUPAC(String simbolo, int valencia, int tipoReaccion) {
        Elemento elemento = buscarElemento(simbolo);
        if (elemento == null) return "";

        switch (tipoReaccion) {
            case 1:
                return "Óxido de " + elemento.getNombre().toLowerCase() + 
                       (valencia > 1 ? " (" + valencia + ")" : "");
            case 2:
                return "Óxido de " + elemento.getNombre().toLowerCase() + 
                       (valencia > 1 ? " (" + valencia + ")" : "");
            case 3:
                return "Hidruro de " + elemento.getNombre().toLowerCase();
            case 4:
                return "Ácido " + elemento.getNombre().toLowerCase() + "hídrico";
            case 5:
                return "Hidróxido de " + elemento.getNombre().toLowerCase();
            default:
                return "";
        }
    }

    private String generarEcuacion(int tipoReaccion, String elemento, int valencia) {
        switch (tipoReaccion) {
            case 1: // Óxido metálico
                return String.format("2%s + O₂ → %s₂O", elemento, elemento);
            case 2: // Óxido no metálico
                return String.format("%s + O₂ → %sO₂", elemento, elemento);
            case 3: // Hidruro metálico
                return String.format("%s + H₂ → %sH₂", elemento, elemento);
            case 4: // Hidrácido
                return String.format("H₂ + %s₂ → 2H%s", elemento, elemento);
            case 5: // Hidróxido
                return String.format("%s + H₂O → %s(OH)%d", elemento, elemento, valencia);
            default:
                return "";
        }
    }

    private void generarReaccionAleatoria() {
        int tipoReaccion = (int)(Math.random() * 5) + 1;
        List<Elemento> elementosValidos = tablaPeriodica.getElementos().stream()
            .filter(e -> validarElemento(e.getSimbolo(), tipoReaccion))
            .toList();

        if (elementosValidos.isEmpty()) {
            System.out.println("No se encontraron elementos válidos para este tipo de reacción.");
            return;
        }

        Elemento elementoAleatorio = elementosValidos.get((int)(Math.random() * elementosValidos.size()));
        List<Integer> valenciasValidas = valencias.getOrDefault(elementoAleatorio.getTipo(), List.of(1));
        int valenciaAleatoria = valenciasValidas.get((int)(Math.random() * valenciasValidas.size()));

        System.out.println("\nGenerando reacción aleatoria:");
        procesarReaccion(tipoReaccion, elementoAleatorio.getSimbolo(), Math.abs(valenciaAleatoria));
    }

    private Elemento buscarElemento(String simbolo) {
        return tablaPeriodica.getElementos().stream()
            .filter(e -> e.getSimbolo().equalsIgnoreCase(simbolo))
            .findFirst()
            .orElse(null);
    }
}