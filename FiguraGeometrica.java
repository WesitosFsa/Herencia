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
class Triangulo_Isoceles extends FiguraGeometrica {
    private double lado_desigual;

    public Triangulo_Isoceles(int numeroLados, double lado_desigual) {
        super(numeroLados);
        this.lado_desigual = lado_desigual;
    }

    public double getLado_desigual() {
        return lado_desigual;
    }

    @Override
    public void calcularArea() {
        this.area = 0.25 * obtenerNumeroLados() * Math.pow(lado_desigual, 2) / Math.tan(Math.PI / obtenerNumeroLados());
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = obtenerNumeroLados() * lado_desigual;
    }
}
class TrianguloEscaleno extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;

    public TrianguloEscaleno(double lado1, double lado2, double lado3, double altura) {
        super(3); 
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public void calcularArea() {
        this.area = (lado1 * altura) / 2.0;
    }
}