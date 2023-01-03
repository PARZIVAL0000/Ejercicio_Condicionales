public class Ejercicio{
	public static void main(String[] args){
// 		Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
		int numeroIf;
		int numerosEjemplo[] = {-3, 0, 3};
		
		for(int i = 0; i < numerosEjemplo.length; i++){
			numeroIf = numerosEjemplo[i];
		
			if(numeroIf > 0){
				System.out.println("Es un numero positivo: " + numeroIf);
			}else if(numeroIf < 0){
				System.out.println("Es un numero negativo: " + numeroIf);
			}else{
				System.out.println("Es un numero " + numeroIf);
			}

		}
		

		/*
		 Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, 
		 el bloque de código que tendrá el bucle deberá:

			-Incrementar el valor de la variable en uno cada vez que se ejecute.
			-Mostrarlo por pantalla cada vez que se ejecute.
		 */
		System.out.println("\n");

		int numeroWhile = 1;
		while(numeroWhile < 3){
			System.out.println(numeroWhile);
			numeroWhile += 1;
		}

		System.out.println("\n");
		//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
		int numeroWhile2 = 1;
		do{
			System.out.println(numeroWhile2);
			numeroWhile2 += 2;
		}while(numeroWhile2 < 3);

		System.out.println("\n");

		/*
		 Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
		 */
		for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
			System.out.println(numeroFor);
		}


		System.out.println("\n");

		/* 
		 Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
		 */

		String estacion = "VERANO";

		switch(estacion){
			case "PRIMAVERA":
				System.out.println("Nos encontramos en Primavera");
				break;
			case "INVIERNO":
				System.out.println("Nos encontramos en Invierno");
				break;
			case "OTOÑO":
				System.out.println("Nos encontramos en Otoño");
				break;
			case "VERANO":
				System.out.println("Nos encontramos en Verano");
				break;
			default:
				System.out.println("Estación no identificada :(");

		}

	}
}





