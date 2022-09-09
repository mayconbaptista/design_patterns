package p1exe3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forma quadrado = new Quadrado();
		quadrado = new Sombreamento(quadrado);
		quadrado = new Wiframe(quadrado);
		quadrado = new TrezDimensoes(quadrado);
		System.out.println(quadrado.desenhar());
		
		Forma circulo = new Circulo();
		circulo = new Relevo(circulo);
		circulo = new Textura(circulo);
		System.out.println(circulo.desenhar());
		
		Forma triangulo = new Triangulo();
		triangulo = new TrezDimensoes(triangulo);
		triangulo = new Luz(triangulo);
		System.out.println(triangulo.desenhar());
		
		Forma retangulo = new  Retangulo();
		retangulo = new Sombreamento(retangulo);
		retangulo = new Relevo(retangulo);
		retangulo = new Wiframe(retangulo);
		retangulo = new TrezDimensoes(retangulo);
		retangulo = new Luz(retangulo);
		retangulo = new Textura(retangulo);
		System.out.println(retangulo.desenhar());
	}
}
