import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ta05FlujoDeDatosApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6(scanner);
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10(scanner);
        ejercicio11(scanner);
        ejercicio12(scanner);
        ejercicio13(scanner);

        scanner.close();
    }

    //1) Declara 2 variables num�ricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo tambi�n. Ves cambiando los valores para comprobar que funciona.
	public static void ejercicio1() {
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El primer n�mero es mayor.");
        } 
        else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El segundo n�mero es mayor.");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Los n�meros son iguales.");
        }
    }

    //2) Declara un String que contenga tu nombre, despu�s muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco "Fernando", me aparezca "Bienvenido Fernando".
    public static void ejercicio2() {
        String nombre = "Juan";
        System.out.println("Bienvenido " + nombre);
    }

    //3) Modifica la aplicaci�n anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
    public static void ejercicio3() {
        String nombre = JOptionPane.showInputDialog("Como te llamas: ");
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }

    //4) Haz una aplicaci�n que calcule el �rea de un circulo (pi*R2). El radio se pedir� por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante Pl y el m�todo pow de Math.
    public static void ejercicio4() {
        String radioEntrada = JOptionPane.showInputDialog("Radio del circulo: ");
        double radio = Double.parseDouble(radioEntrada);
        double area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "La area del circulo es: " + area);
    }

    //5) Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, tambi�n debemos indicarlo.
    public static void ejercicio5() {
        String numeroStr = JOptionPane.showInputDialog("Introduce un n�mero: ");
        int numero = Integer.parseInt(numeroStr);
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Es divisible por 2.");
        } 
        else {
            JOptionPane.showMessageDialog(null, "No es divisible por 2.");
        }
    }

    //6) Lee un n�mero por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. EI IVA sera una constante que sera del 21%
    public static void ejercicio6(Scanner scanner) {
        System.out.print("Precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());
        final double iva = 0.21;
        double precioFinal = precio + (precio * iva);
        System.out.println("El precio es: " + precioFinal);
    }

    //7) Muestra los n�meros del 1 al 100 (ambos incluidos). Usa un bucle while.
    public static void ejercicio7() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    //8) Haz el mismo ejercicio anterior con un bucle for.
    public static void ejercicio8() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //9) Muestra los n�meros del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
    public static void ejercicio9() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //10) Realiza una aplicaci�n que nos pida un n�mero de ventas a introducir, despu�s nos pedir� tantas ventas por teclado como n�mero de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
    public static void ejercicio10(Scanner scanner) {
        System.out.print("Numero de ventas: ");
        int numVentas = Integer.parseInt(scanner.nextLine());
        double sumaVentas = 0;
        for (int i = 1; i <= numVentas; i++) {
            System.out.print("Valor de la venta " + i + ": ");
            double venta = Double.parseDouble(scanner.nextLine());
            sumaVentas += venta;
        }
        System.out.println("La suma de ventas es: " + sumaVentas);
    }
    //11) Crea una aplicaci�n que nos pida un d�a de la semana y que nos diga si es un d�a laboral o no. Usa un switch para ello.
    public static void ejercicio11(Scanner scanner) {
        System.out.print("Dia de la semana: ");
        String diaSemana = scanner.nextLine().toLowerCase();
        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "mi�rcoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un d�a laboral.");
                break;
            case "s�bado":
            case "domingo":
                System.out.println("No es un d�a laboral.");
                break;
            default:
                System.out.println("D�a no v�lido.");
        }
    }
    //12) Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas la contrase�a y mostrara un mensaje diciendo "Enhorabuena". Piensa bien en la condici�n de salida (3 intentos y si acierta sale, aunque le queden intentos).
    public static void ejercicio12(Scanner scanner) {
        String contrase�a = "P@ssw0rd";
        int intentos = 3;
        while (intentos > 0) {
            System.out.print("Contrase�a: ");
            String entrada = scanner.nextLine();
            if (entrada.equals(contrase�a)) {
                System.out.println("Enhorabuena!");
                break;
            }
            else {
                intentos--;
                System.out.println("Contrase�a incorrecta. Intentos restantes: " + intentos);
            }
        }

        if (intentos == 0) {
            System.out.println("0 intentos. Acceso denegado.");
        }
    }

    /*13) Crea una aplicaci�n llamada Calculadorainversa, nos pedir� 2 operandos (int) y un signo aritm�tico (String), seg�n este �ltimo se realizara la operaci�n correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
    	Los signos aritm�ticos disponibles son:
    	+: suma los dos operandos.
    	-: resta los operandos.
    	*: multiplica los operandos.
    	/: divide los operandos, este debe dar un resultado con decimales (double)
    	A: 1o operando como base y 2o como exponente.
    	%: m�dulo, resto de la divisi�n entre operando1 y operando2.
    */
    public static void ejercicio13(Scanner scanner) {
        System.out.print("Introduce el primer numero: ");
        int operando1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce el segundo numero: ");
        int operando2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce una operaci�n (+, -, *, /, ^, %): ");
        String signo = scanner.nextLine();
        double resultado = 0;
        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = (double) operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                System.out.println("No v�lido.");
                return;
        }
        System.out.println("Resultado: " + resultado);
    }
}