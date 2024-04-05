package githubEj1;

public class github {
	public static void main(String[] args) {
		//raiz cuadrada (es necesario una variable double/float por ser una decimal)
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
		
		//redondear una cifra decimal (depende de que tipo variable le des al numero usas)
		float num1 = 5.85F; //usas float porque el .round te exige ese tipo de variable
		int redondeado1 = Math.round(num1);
		System.out.println(redondeado1);
		
		double num2 = 5.85; //para realizarlo con el double es necesario indicar (int) delante del math.round)
		int redondeado2 = (int)Math.round(num2);
		System.out.println(redondeado2)
		
		
		//exponente de una cifra elevada a otra
		double base = 5; 
		double exponente = 3;
		double resultado = Math.pow(base, exponente);
		System.out.println(resultado);

		system.out.println("hola")
	}
}
