import java.util.Scanner;

public class prueba2
{

	public static void main(String[] args)
	{
		String tabla[]= {"Hola", "Hello","Hallo", "Adios", "Ciao"};
		int numero = (int) (Math.random() * 4);
		Scanner teclado = new Scanner(System.in);

		System.out.println(tabla[numero]); //(Para ver la palabra)
		System.out.println("Dime que palabra estoy pensando: Hola, Hello, Hallo, Adios, Ciao");
		 String cadena = teclado.next();

	
		if (tabla[numero].equals(cadena) ) { //Pq si poniamos == no eran el mismo objeto y siempre decia que has fallado

			System.out.println("Has acertado");
		}

		else {

			System.out.println("Has fallado");
		}

		teclado.close();
	}
}