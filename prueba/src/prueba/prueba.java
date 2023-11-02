package prueba;


public class prueba{

	public static void main(String[] args) {
		
		String palabra = "hola cocacola";
		System.out.println(palabra.charAt(0));
		
		/*int matriz[][] = {{30, 50, 70, 20} , {-49, 1, 1357, 8}, {33, -5, 37, 22}};
		System.out.println("El tamaño de la matriz es de  " + matriz.length + "x"+ matriz[0].length);
		
		for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
		
	}		
		/*
		int[] vector= {30, 50, 70, -49, 1, 1357, 8};
		System.out.println("la longitud del  vector es " + vector.length);
		System.out.println("Los elementos son: ");
		for (int contador = 0; contador <=vector.length-1; contador++)
		{
			System.out.println(vector[contador]);
		}
		
	}		
		
		
		
		
		/*float suma = 0;

		for ( int i=1; i<=5; i++ )
		   {
			 suma = 10 * suma  + i; 
		   System.out.println( suma );
		  
		   }
		
		// como cadena
		/*String suma = "";

		for ( int i=1; i<=5; i++ )
		   {
			 suma = suma  + i; 
		   System.out.println( suma );
		  
		   }*/
		/*suma =  (suma /33);
		System.out.println( (int) suma);*/
		String texto1 = "Programación Fácil";
		String mayusculas = texto1.toUpperCase();

		System.out.println(mayusculas);
		int longitud = texto1.length();

		System.out.println(longitud);
		
		String caracter = texto1.substring(13);
        
		System.out.println(caracter);
		char caracter2 = texto1.charAt(10);
        
		System.out.print(caracter2);
		
		String texto11 = "hola, este String tiene más de un hola. Está hecho para buscar la última ocurrencia de la palabra hola. Por lo tanto, encontrará la posición de este hola.";
		String nuevoTexto = texto11.replace("hola", "adiós");

		System.out.println(nuevoTexto);
		int valorIndice = texto1.indexOf("Fácil");
        
		System.out.print(valorIndice);
	}

}
