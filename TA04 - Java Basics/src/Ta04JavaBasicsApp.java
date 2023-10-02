
public class Ta04JavaBasicsApp {
	public static void main(String[] args) {
		Ta04JavaBasicsApp programa = new Ta04JavaBasicsApp();

        programa.operacion1();
        programa.operacion2();
        programa.operacion3();
        programa.operacion4();
        programa.operacion5();
    }

    // Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
    public void operacion1() {
        int numero1 = 10;
        int numero2 = 5;
        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);
        System.out.println(numero1 % numero2);
    }

    // Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
    //• El valor de cada variable.
    //• La suma de N + A
    //• La diferencia de A - N
    //• El valor numérico correspondiente al carácter que contiene la variable C.
    public void operacion2() {
        int N = 10;
        double A = 2.89;
        char C = 'm';
        System.out.println("N = " + N);
        System.out.println("A = " + A);
        System.out.println("C = " + C);
        System.out.println(N +" + " + A + " = " + (N + A));
        System.out.println(A +" - " + N + " = " + (A - N));
        System.out.println("Valor numérico del carácter " + C + " = " + (int) C);
    }

    // Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. Apartir de ahora haz diversas operaciones
    /*
     * . El valor de cada variable.
	 * . La suma X + Y
	 * · La diferencia X - Y
	 * . El producto X * Y
	 * . El cociente X/Y
	 * . El resto X % Y
	 * . La suma N + M
	 * · La diferencia N-M
	 * · El producto N * M
	 * · El cociente N/M
	 * · El resto N % M
	 * · La suma X + N
	 * · El cociente Y / M
	 * · El resto Y % M
	 * · El doble de cada variable
	 * · La suma de todas las variables
	 * · El producto de todas las variables
     * */
    public void operacion3() {
        int X = 20;
        int Y = 6;
        double N = 4.5;
        double M = 2.5;
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("N = " + N);
        System.out.println("M = " + M);
        System.out.println("X + Y = " + (X + Y));
        System.out.println("X - Y = " + (X - Y));
        System.out.println("X * Y = " + (X * Y));
        System.out.println("X / Y = " + ((double) X / Y));
        System.out.println("X % Y = " + (X % Y));
        System.out.println("N + M = " + (N + M));
        System.out.println("N - M = " + (N - M));
        System.out.println("N * M = " + (N * M));
        System.out.println("N / M = " + (N / M));
        System.out.println("N % M = " + (N % M));
        System.out.println("X + N = " + (X + N));
        System.out.println("Y / M = " + ((double) Y / M));
        System.out.println("Y % M = " + (Y % M));
        System.out.println("Doble de X = " + (2 * X));
        System.out.println("Doble de Y = " + (2 * Y));
        System.out.println("Doble de N = " + (2 * N));
        System.out.println("Doble de M = " + (2 * M));
        System.out.println("Suma de todas las variables = " + (X + Y + N + M));
        System.out.println("Producto de todas las variables = " + (X * Y * N * M));
    }

    // Escribe un programa Java que declare una variable entera N y asígnale un valor. A continuación escribe las instrucciones que realicen los siguientes:
    //• Incrementar N en 77.
    //• Decrementarla en 3. 
    //• Duplicar su valor.
    public void operacion4() {
        int N = 2;
        System.out.println("N = " + N);
        N += 77;
        System.out.println("N + 77 = " + N);
        N -= 3;
        System.out.println("N - 3 = " + N);
        N *= 2;
        System.out.println("N * 2 = " + N);
    }

    // Programa java que declare cuatro variables enteras A, B, C y Dy asígnale un valor a cada una. A continuación realiza las instrucciones necesarias para que:
	//• B tome el valor de C
	//• C tome el valor de A 
	//• A tome el valor de D 
	//• D tome el valor de B
    public void operacion5() {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        int b = B;
        B = C;
        C = A;
        A = D;
        D = b;
        System.out.println("----------");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
}
