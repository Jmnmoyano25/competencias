package ejercicio_competencias;
import java.util.Scanner;
public class Ejercicios {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner entrada = new Scanner(System.in);
		int entero;
		int n;
		long num, digito, aux;
		boolean binario;
		
		Biblioteca uno = new Biblioteca();
		Biblioteca dos = new Biblioteca();
		Biblioteca tres = new Biblioteca(321);
		Biblioteca cuatro = new Biblioteca();
		Biblioteca cinco = new Biblioteca();
		
		

		System.out.println("Que ejercicio quieres hacer? \n1 esCapipuca \n2 volteo \n3 posicionN \n4 cuatro \n5 binario");
		int opcion = entrada.nextInt();
		switch(opcion){
			case 1:{
			System.out.println("Dame un numero entero: ");
			entero = entrada.nextInt();
			System.out.println(uno.esCapicua(entero));
			break;
			}
			case 2:{
			System.out.println("Dame un numero entero: ");
			entero = entrada.nextInt();
			System.out.println(dos.voltea(entero));
			break;
			}
			case 3:{
			System.out.println("Dame un numero entero: ");
			entero = entrada.nextInt();
			System.out.println("Dame una posicion n: ");
			n = entrada.nextInt();
			//posicion n
			System.out.println(tres.digitoN(entero, n));
			break;
			}
			case 4:{
//				System.out.println("en obras, sentimos las molestias");
//				//break;
//				
//				// Texto
//			    String sTexto = "123456789";
//			    // Texto que vamos a buscar
//			    String sTextoBuscado = "7";
//			    // Contador de ocurrencias 
//			    int contador = 1;
//
//			    for(int i=0; i < sTexto.length(); i++){
//			    	int car = sTexto.charAt(i);
//			    	if(sTextoBuscado.indexOf(car,0) == -1)
//			    		contador++;
//			    	else
//			    		System.out.println(contador);
//			 
//			    }
				System.out.println("Dame un numero entero: ");
				entero = entrada.nextInt();
				System.out.println("Dame el número del cual quieras saber su primera posición: ");
				n = entrada.nextInt();
				System.out.println(cuatro.posicionDeDigito(entero, n));
				break;
			}
			case 5:{
				 do {
			      System.out.print("Introduce un numero binario: ");
			      num = entrada.nextLong();
			            
			            binario = true;
			            aux = num;
			            while (aux != 0) {
			                       digito = aux % 10; 
			                       if (digito != 0 && digito != 1) {
			                            binario = false; 
			                       }
			                      
			                       aux = aux / 10; 
			             }
			            
			        } while (!binario);
				 System.out.println(cinco.binario(num));
				 break;				 
			}
		
		}

		
		
		
		
		
	
		/*
		System.out.print("Introduzca un número entero: ");
	    int numeroIntroducido = memory.nextInt();

	    System.out.print("Introduzca un dígito: ");
	    int digito = memory.nextInt();

	    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
	   
	    int numero = numeroIntroducido;
	    int volteado = 0;
	    int longitud = 0;
	    int posicion = 1; 
	    
	    if (numero == 0) {
	      longitud = 1;
	    }
	    
	    while (numero > 0) {
	      volteado = (volteado * 10) + (numero % 10);
	      numero /= 10;
	      longitud++;
	    }
	    System.out.println(volteado);
	    while (volteado > 0) {
	        if ((volteado % 10) == digito) {
	          System.out.print(posicion + " ");
	        }
	        volteado /= 10;
	        posicion++;
	      } // while

	      System.out.println();
		*/
	}

}
