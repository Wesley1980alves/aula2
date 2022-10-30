package aula2;

public class Executavel {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	
	public static void main(String[] args) {
		int [] vetorA= {2,4,6,8,10,12,14,16,18,20};
		int[] vetorB= {1,2,3,4,5,6,7,8,9,10};
		int[]vetorC=new int[10];
		int resultado;
		
		for(int cont=0;cont<vetorC.length;cont++) {
			resultado=vetorA[cont]+vetorB[cont];
			System.out.println("VetorC<> ["+resultado+"]");
			
		}
		System.out.println("<>><><><><><>");
		for(int p: vetorA ) {
			System.out.println(ANSI_RED_BACKGROUND+"VetorA ["+p+"]"+ ANSI_RESET);
			
		}
		System.out.println("<><><><><><><>");
		for(int p:vetorB) {
			System.out.println(ANSI_RED_BACKGROUND+"VetorB  ["+p+"]"+ANSI_RESET);
		}
		

	}

}
