import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TablaPeriodica tablaPeriodica = new TablaPeriodica();
        ReaccionQuimica reaccionQuimica = new ReaccionQuimica(tablaPeriodica);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Mostrar Tabla Periódica");
            System.out.println("2. Trabajar con Reacciones Químicas");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("¡Gracias por usar el programa!");
                    return;
                case 1:
                    tablaPeriodica.mostrarTabla();
                    break;
                case 2:
                    reaccionQuimica.mostrarMenuReacciones();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}