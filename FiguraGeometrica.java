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
    private double perimetro;

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
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void calcularArea() {
        this.area = (base * altura) / 2.0;
    }

    @Override
    public void calcularPerimetro() {
        // En un triángulo, el perímetro es la suma de los lados
        this.perimetro = base + (2 * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2)));
    }
}

class TrianguloEquilatero extends FiguraGeometrica {
    private double lado;

    public TrianguloEquilatero(double lado) {
        super(3);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void calcularArea() {
        // En un triángulo equilátero, la fórmula del área es (sqrt(3) / 4) * lado^2
        this.area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    @Override
    public void calcularPerimetro() {
        // En un triángulo equilátero, el perímetro es simplemente 3 * lado
        this.perimetro = 3 * lado;
    }
}