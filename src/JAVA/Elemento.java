class Elemento {
    private String nombre;
    private String simbolo;
    private double pesoAtomico;
    private String tipo;
    private int numeroAtomico;

    // Constructor
    public Elemento(int numeroAtomico, String nombre, String simbolo, double pesoAtomico, String tipo) {
        this.numeroAtomico = numeroAtomico;
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.pesoAtomico = pesoAtomico;
        this.tipo = tipo;
    }

    // Getters y otros métodos
    public String getNombre() { return nombre; }
    public String getSimbolo() { return simbolo; }
    public double getPesoAtomico() { return pesoAtomico; }
    public String getTipo() { return tipo; }
    public int getNumeroAtomico() { return numeroAtomico; }

    @Override
    public String toString() {
        return numeroAtomico + ": " + nombre + " (" + simbolo + "), Peso atómico: " + pesoAtomico + ", Tipo: " + tipo;
    }
}
