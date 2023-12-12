class FiguraGeometrica {
    public int numeroLados;
    public double area;
    public double perimetro;

    public FiguraGeometrica(int numeroLados) {
        this.numeroLados = numeroLados;
        this.area = 0.0;
        this.perimetro = 0.0;
    }
    public void calcularArea() {
    }
    public void calcularPerimetro() {
    }
    public int obtenerNumeroLados() {
        return numeroLados;
    }
    public double obtenerArea() {
        return area;
    }
    public double obtenerPerimetro() {
        return perimetro;
    }
}
class Poligono extends FiguraGeometrica {
    private double longitudLado;
    public Poligono(int numeroLados, double longitudLado) {
        super(numeroLados);
        this.longitudLado = longitudLado;
    }
    public double obtenerLongitudLado() {
        return longitudLado;
    }
    @Override
    public void calcularArea() {
        this.obtenerNumeroLados(); 
        this.area = 0.25 * obtenerNumeroLados() * Math.pow(longitudLado, 2) / Math.tan(Math.PI / obtenerNumeroLados());
    }
    @Override
    public void calcularPerimetro() {
        this.perimetro = obtenerNumeroLados() * longitudLado;
    }
}