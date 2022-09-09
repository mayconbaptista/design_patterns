public class Main {

    public static void main(String[] args) {
    	
    	// Cria as pilhas de dinheiro
        Dinheiro nota200 = new ConcreteDinheiro(200),
        nota100 = new ConcreteDinheiro(100),
        nota50 = new ConcreteDinheiro(50),
        nota20 = new ConcreteDinheiro(20),
        nota10 = new ConcreteDinheiro(10),
        nota5 = new ConcreteDinheiro(5),
        nota2 = new ConcreteDinheiro(2),
        nota1 = new ConcreteDinheiro(1);
        
        // Define a hierarquia das pilhas
        nota200.setNext(nota100);
        nota100.setNext(nota50);
        nota50.setNext(nota20);
        nota20.setNext(nota10);
        nota10.setNext(nota5);
        nota5.setNext(nota2);
        nota2.setNext(nota1);

        // Valor que deseja sacar
        nota200.sacar(475);
    }
}