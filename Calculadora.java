public class Calculadora {

public int adicionar(int a, int b) {

return a + b;

}

public int adicionar(int a, int b, int c) {

return a + b + c;

}

public double adicionar(double a, double b) {

return a + b;

}

public static void main(String[] args) {

Calculadora calc = new Calculadora();

System.out.println("Soma de 2 e 3 (int): " + calc.adicionar(2, 3));

System.out.println("Soma de 1, 2 e 3 (int): " + calc.adicionar(1, 2, 3));

System.out.println("Soma de 2.5 e 3.5 (double): " + calc.adicionar(2.5, 3.5));

}
}
