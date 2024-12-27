import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TablaPeriodica {
    private List<Elemento> elementos;

    public TablaPeriodica() {
        elementos = new ArrayList<>();
        elementos.add(new Elemento(1, "Hidrógeno", "H", 1.008, "No metal"));
        elementos.add(new Elemento(2, "Helio", "He", 4.0026, "Gas noble"));
        elementos.add(new Elemento(3, "Litio", "Li", 6.94, "Metal alcalino"));
        elementos.add(new Elemento(4, "Berilio", "Be", 9.0122, "Metal alcalinotérreo"));
        elementos.add(new Elemento(5, "Boro", "B", 10.81, "Metaloide"));
        elementos.add(new Elemento(6, "Carbono", "C", 12.011, "No metal"));
        elementos.add(new Elemento(7, "Nitrógeno", "N", 14.007, "No metal"));
        elementos.add(new Elemento(8, "Oxígeno", "O", 15.999, "No metal"));
        elementos.add(new Elemento(9, "Flúor", "F", 18.998, "Halógeno"));
        elementos.add(new Elemento(10, "Neón", "Ne", 20.180, "Gas noble"));
        elementos.add(new Elemento(11, "Sodio", "Na", 22.990, "Metal alcalino"));
        elementos.add(new Elemento(12, "Magnesio", "Mg", 24.305, "Metal alcalinotérreo"));
        elementos.add(new Elemento(13, "Aluminio", "Al", 26.982, "Metal de transición"));
        elementos.add(new Elemento(14, "Silicio", "Si", 28.085, "Metaloide"));
        elementos.add(new Elemento(15, "Fósforo", "P", 30.974, "No metal"));
        elementos.add(new Elemento(16, "Azufre", "S", 32.06, "No metal"));
        elementos.add(new Elemento(17, "Cloro", "Cl", 35.45, "Halógeno"));
        elementos.add(new Elemento(18, "Argón", "Ar", 39.948, "Gas noble"));
        elementos.add(new Elemento(19, "Potasio", "K", 39.098, "Metal alcalino"));
        elementos.add(new Elemento(20, "Calcio", "Ca", 40.078, "Metal alcalinotérreo"));
        elementos.add(new Elemento(21, "Escandio", "Sc", 44.956, "Metal de transición"));
        elementos.add(new Elemento(22, "Titanio", "Ti", 47.867, "Metal de transición"));
        elementos.add(new Elemento(23, "Vanadio", "V", 50.942, "Metal de transición"));
        elementos.add(new Elemento(24, "Cromo", "Cr", 51.996, "Metal de transición"));
        elementos.add(new Elemento(25, "Manganeso", "Mn", 54.938, "Metal de transición"));
        elementos.add(new Elemento(26, "Hierro", "Fe", 55.845, "Metal de transición"));
        elementos.add(new Elemento(27, "Cobalto", "Co", 58.933, "Metal de transición"));
        elementos.add(new Elemento(28, "Níquel", "Ni", 58.693, "Metal de transición"));
        elementos.add(new Elemento(29, "Cobre", "Cu", 63.546, "Metal de transición"));
        elementos.add(new Elemento(30, "Zinc", "Zn", 65.38, "Metal de transición"));
        elementos.add(new Elemento(31, "Galio", "Ga", 69.723, "Metal de transición"));
        elementos.add(new Elemento(32, "Germanio", "Ge", 72.63, "Metaloide"));
        elementos.add(new Elemento(33, "Arsénico", "As", 74.922, "Metaloide"));
        elementos.add(new Elemento(34, "Selenio", "Se", 78.96, "No metal"));
        elementos.add(new Elemento(35, "Bromo", "Br", 79.904, "Halógeno"));
        elementos.add(new Elemento(36 , "Kripton", "Kr", 83.798, "Gas noble"));
        elementos.add(new Elemento(37, "Rubidio", "Rb", 85.468, "Metal alcalino"));
        elementos.add(new Elemento(38, "Estroncio", "Sr", 87.620, "Metal alcalinotérreo"));
        elementos.add(new Elemento(39, "Itrio", "Y", 88.906, "Metal de transición"));
        elementos.add(new Elemento(40, "Zirconio", "Zr", 91.224, "Metal de transición"));
        elementos.add(new Elemento(41, "Niobio", "Nb", 92.906, "Metal de transición"));
        elementos.add(new Elemento(42, "Molibdeno", "Mo", 95.950, "Metal de transición"));
        elementos.add(new Elemento(43, "Tecnecio", "Tc", 98.907, "Metal de transición"));
        elementos.add(new Elemento(44, "Rutenio", "Ru", 101.070, "Metal de transición"));
        elementos.add(new Elemento(45, "Rodio", "Rh", 102.910, "Metal de transición"));
        elementos.add(new Elemento(46, "Paladio", "Pd", 106.420, "Metal de transición"));
        elementos.add(new Elemento(47, "Plata", "Ag", 107.870, "Metal de transición"));
        elementos.add(new Elemento(48, "Cadmio", "Cd", 112.411, "Metal de transición"));
        elementos.add(new Elemento(49, "Indio", "In", 114.820, "Metal de transición"));
        elementos.add(new Elemento(50, "Estaño", "Sn", 118.710, "Metal de transición"));
        elementos.add(new Elemento(51, "Antimonio", "Sb", 121.76, "Metal de transición"));
        elementos.add(new Elemento(52, "Telurio", "Te", 127.60, "Metal de transición"));
        elementos.add(new Elemento(53, "Iodo", "I", 126.90, "Metal de transición"));
        elementos.add(new Elemento(54, "Xenon", "Xe", 131.29, "Gas noble"));
        elementos.add(new Elemento(55, "Cesio", "Cs", 132.91, "Metal alcalínoso"));
        elementos.add(new Elemento(56, "Bario", "Ba", 137.33, "Metal alcalínoso"));
        elementos.add(new Elemento(57, "Lantano", "La", 138.91, "Metal alcalínoso"));
        elementos.add(new Elemento(58,"Cerio", "Ce", 140.12, "Metal alcalínoso"));
        elementos.add(new Elemento(59, "Praseodimio", "Pr", 140.91, "Metal alcalínoso"));
        elementos.add(new Elemento(60, "Neodimio", "Nd", 144.24, "Metal alcalínoso"));
        elementos.add(new Elemento(61, "Prometio", "Pm", 145.00, "Metal alcalínoso"));
        elementos.add(new Elemento(62, "Samarino", "Sm", 150.36, "Metal alcalínoso"));
        elementos.add(new Elemento(63, "Europio", "Eu", 151.96, "Metal alcalínoso"));
        elementos.add(new Elemento(64, "Gadolinio", "Gd", 157.25, "Metal alcalínoso"));
        elementos.add(new Elemento(65, "Terbio", "Tb", 158.93, "Metal alcalínoso"));
        elementos.add(new Elemento(66, "Disprosio", "Dy", 162.50, "Metal alcalínoso"));
        elementos.add(new Elemento(67, "Holmio", "Ho", 164.93, "Metal alcalínoso"));
        elementos.add(new Elemento(68, "Erbio", "Er", 167.26, "Metal alcalínoso"));
        elementos.add(new Elemento(69, "Tulio", "Tm", 168.93, "Metal alcalínoso"));
        elementos.add(new Elemento(70, "Iterbio", "Yb", 173.04, "Metal alcalínoso"));
        elementos.add(new Elemento(71, "Lutecio", "Lu", 174.97, "Metal alcalínoso"));
        elementos.add(new Elemento(72, "Hafnio", "Hf", 178.49, "Metal de transición"));
        elementos.add(new Elemento(73, "Tantalo", "Ta", 180.95, "Metal de transición"));
        elementos.add(new Elemento(74, "Wolframio", "W", 183.84, "Metal de transición"));
        elementos.add(new Elemento(75, "Renio", "Re", 186.21, "Metal de transición"));
        elementos.add(new Elemento(76, "Osmio", "Os", 190.23, "Metal de transición"));
        elementos.add(new Elemento(77, "Iridio", "Ir", 192.22, "Metal de transición"));
        elementos.add(new Elemento(78, "Platino", "Pt", 195.08, "Metal de transición"));
        elementos.add(new Elemento(79, "Oro", "Au", 196.97, "Metal de transición"));
        elementos.add(new Elemento(80, "Mercurio", "Hg", 200.59, "Metal de transición"));
        elementos.add(new Elemento(81, "Talio", "Tl", 204.38, "Metal de transición"));
        elementos.add(new Elemento(82, "Plomo", "Pb", 207.20, "Metal de transición"));
        elementos.add(new Elemento(83, "Bismuto", "Bi", 208.98, "Metal de transición"));
        elementos.add(new Elemento(84, "Polonio", "Po", 209.00, "Metal de transición"));
        elementos.add(new Elemento(85, "Astato", "At", 210.00, "Metal de transición"));
        elementos.add(new Elemento(86, "Radon", "Rn", 222.00, "No metal"));
        elementos.add(new Elemento(87, "Francio", "Fr", 223.00, "No metal"));
        elementos.add(new Elemento(88, "Radio", "Ra", 226.00, "No metal"));
        elementos.add(new Elemento(89, "Actinio", "Ac", 227.00, "No metal"));
        elementos.add(new Elemento(90, "Torio", "Th", 232.04, "No metal"));
        elementos.add(new Elemento(91, "Protactinio", "Pa", 231.04, "No metal"));
        elementos.add(new Elemento(92, "Uranio", "U", 238.03, "No metal"));
        elementos.add(new Elemento(93, "Neptunio", "Np", 237.05, "No metal"));
        elementos.add(new Elemento(94, "Plutonio", "Pu", 244.06, "No metal"));
        elementos.add(new Elemento(95, "Americio", "Am", 243.06, "No metal"));
        elementos.add(new Elemento(96, "Curio", "Cm", 247.07, "No metal"));
        elementos.add(new Elemento(97, "Berquelio", "Bk", 247.07, "No metal"));
        elementos.add(new Elemento(98, "Californio", "Cf", 251.08, "No metal"));
        elementos.add(new Elemento(99, "Einstenio", "Es", 252.08, "No metal"));
        elementos.add(new Elemento(100, "Fermio", "Fm", 257.10, "No metal"));
        elementos.add(new Elemento(101, "Mendelevio", "Md", 258.10, "No metal"));
        elementos.add(new Elemento(102, "Nobelio", "No", 259.10, "No metal"));
        elementos.add(new Elemento(103, "Laurencio", "Lr", 262.11, "No metal"));
        elementos.add(new Elemento(104, "Rutherfordio", "Rf", 261.11, "No metal"));
        elementos.add(new Elemento(105, "Dubnio", "Db", 262.11, "No metal"));
        elementos.add(new Elemento(106, "Seaborgio", "Sg", 266.12, "No metal"));
        elementos.add(new Elemento(107, "Bohrio", "Bh", 264.12, "No metal"));
        elementos.add(new Elemento(108, "Hassio", "Hs", 269.13, "No metal"));
        elementos.add(new Elemento(109, "Meitnerio", "Mt", 268.13, "No metal"));
        elementos.add(new Elemento(110, "Darmstadtio", "Ds", 271.13, "No metal"));
        elementos.add(new Elemento(111, "Roentgenio", "Rg", 272.13, "No metal"));
        elementos.add(new Elemento(112, "Copernicio", "Cn", 285.15, "No metal"));
        elementos.add(new Elemento(113, "Nihonio", "Nh", 286.15, "No metal"));
        elementos.add(new Elemento(114, "Flerovio", "Fl", 289.16, "No metal"));
        elementos.add(new Elemento(115, "Moscovio", "Mc", 290.16, "No metal"));
        elementos.add(new Elemento(116, "Livermorio", "Lv", 293.16, "No metal"));
        elementos.add(new Elemento(117, "Tenessine", "Ts", 294.16, "No metal"));
        elementos.add(new Elemento(118, "Oganesson", "Og", 294.16, "No metal"));

        // Añadir más elementos en caso de que la informacion no se encuentre en la tabla
    }

    // Método actualizado para mostrar la tabla periódica de forma más ordenada
    public void mostrarTabla() {
        Collections.sort(elementos, (e1, e2) -> Integer.compare(e1.getNumeroAtomico(), e2.getNumeroAtomico()));

        // Imprimir encabezado
        System.out.println("\n=== TABLA PERIÓDICA DE ELEMENTOS ===");
        System.out.println(String.format("%-4s | %-15s | %-4s | %-12s | %-20s",
                "Nº", "Nombre", "Símbolo", "Peso Atómico", "Tipo"));
        System.out.println("------------------------------------------------------------");

        // Imprimir cada elemento
        for (Elemento elemento : elementos) {
            System.out.println(String.format("%-4d | %-15s | %-4s | %-12.3f | %-20s",
                    elemento.getNumeroAtomico(),
                    elemento.getNombre(),
                    elemento.getSimbolo(),
                    elemento.getPesoAtomico(),
                    elemento.getTipo()));
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Total de elementos: " + elementos.size());
    }

    public List<Elemento> getElementos() {
        return elementos;
    }
}

