public class Main {
    public static void main(String[] args) {
        // Cambia Triangulo_Equilatero por TrianguloEquilatero
        TrianguloEquilatero tre1 = new TrianguloEquilatero(9);
        Triangulo tri1 = new Triangulo(6, 7);
        Triangulo_Isoceles tr1 = new Triangulo_Isoceles(3, 4.5);
        TrianguloEscaleno tr2 = new TrianguloEscaleno(8, 9, 10, 5);
        tr2.calcularArea();
        tr1.calcularArea();
        tr1.calcularPerimetro();
        tre1.calcularArea();
        tre1.calcularPerimetro();
        System.out.println("Área del triángulo equilátero: " + tre1.obtenerArea());
        System.out.println("Perímetro del triángulo equilátero: " + tre1.obtenerPerimetro());
        System.out.println("Triangulo Isoceles: ");
        System.out.println("Lado desigual: " + tr1.getLado_desigual() +
                           "\nÁrea: " + tr1.obtenerArea() +
                           "\nPerímetro: " + tr1.obtenerPerimetro());
        System.out.println("Altura: " + tr2.getAltura() +
         "\nÁrea: " + tr2.obtenerArea());
    } 
}
