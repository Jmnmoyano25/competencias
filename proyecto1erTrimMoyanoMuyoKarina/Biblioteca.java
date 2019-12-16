package ejercicio_competencias;

public class Biblioteca {

	//ATRIBUTOS
	 int numeros;
	 int n;
	 
	 
	 //ATRIBUTOS 4
	 
	 
	 //ATRIBUTOS 5
	 long num;
	 static long aux, digito, decimal;
	 static int exponente;
	 static boolean binario;
	 

	 
	 
	 
	//CONSTRUCTORES
	 public Biblioteca() {}
	 
	 public Biblioteca(int numeros) {
		 this.numeros = numeros;
		 
	 }
	 
	 //CLASES
	 
	 public void cuentaNumeros(int numeros) {
		 int longitud = 0;
		 while (numeros != 0) {
			 numeros /= 10;
			 longitud++;
		 }
		 
	 }
	 
	 /*public void hazmeArray() {
		 int n[] = new int[longitud];
	 }*/
	 
	 
	 //PUNTO Nº1
	 public boolean esCapicua(int numeros) {
		if( numeros == voltea(numeros)) {
		  	return true;
		}
		else return false;
	 }
	
	 /*public int dameN() {
		 
		 return 
	 }*/
	 //public int digitoN(int )
	 
	 
	 //PUNTO Nº2
	 public int voltea(int numeros) {
		 int cifra;
		 int inverso = 0;
		 while (numeros != 0) {
			 cifra = numeros % 10;
			 inverso = inverso *10 + cifra;
			 numeros /= 10;
		 }
		 return inverso;
	 }
	 
	 
	 //PUNTO Nº3
	 public int digitoN( int numeros, int n) {
		 numeros = voltea(numeros);
		 int cifra;
		 int contador = 0;
		 while(numeros != 0) {
			cifra = numeros % 10;
			numeros /= 10;
			contador++;
			if(contador == n)
				return cifra;
			
		 }
		 return 0;	 
		 
	 }
	 
	 
	 //PUNTO Nº4
	 public int posicionDeDigito( int numeros, int n) {
		 numeros = voltea(numeros);
		 int cifra;
		 int contador = 0;
		 while(numeros != 0) {
			cifra = numeros % 10;
			numeros /= 10;
			contador++;
			if(cifra == n) {
				return contador;
				
			}
		 }
		 return -1;
		 
	 }
	 
	 
	 
	 
	 //PUNTO Nº5
	 public long binario(long num) {
		 exponente = 0;
		 	decimal = 0;
		 	while (num != 0) {
		 		
		 		digito = num % 10;
		 		
		 		decimal = decimal + digito * (int) Math.pow(2, exponente);
		 		
		 		exponente++;
		 		
		 		num = num / 10;
		 	}
		 return decimal;
	 }
	 
	
	
	 
	 
	
	
}

