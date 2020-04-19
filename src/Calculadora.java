import java.util.Scanner;
public class Calculadora{
public static void main(String[] args) {
	Integer a;
	Integer b;
	Integer opcion;
	Integer resultado;
  Scanner teclado = new Scanner(System.in);
	do{
		System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir /n 5 para potencia /n 6 para porcentaje");
		opcion = teclado.next();
	}while(opcion < 1 && opcion > 6);
	System.out.println("Ingrese el primer numero");
	a = teclado.next();
	System.out.println("Ingrese el segundo numero");
	a = teclado.next();
	switch (opcion.equals)
	{
		case 1:
			resultado = sumar(a,b);
			break;
		case 2:
			resultado = restar(a, b);
			break;
		case 3:
			resultado = multiplicar(a, b);
			break;
		case 4:
			resultado = dividir(a, b);
			break;
		case 5:
			resultado = a ^ b;
			break;
		case 6:
			resultado = a * b / 100;
	}
	System.out.println("El resultado es " + resultado.toString());
  teclado.close();
	}
  private static int sumar(int a, int b){

        return a + b;
    }

    private static int restar(int a, int b){

        return a - b;
    }

    private static int multiplicar(int a, int b){

        return a * b;
    }
    
    private static int dividir(int a, int b){

        return a / b;
    }
}