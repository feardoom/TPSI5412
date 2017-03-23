package application;

import controller.*;
import tools.easyIO;

public class App {
	public static easyIO io = new easyIO();
	
	public static void main(String[] args) {
		new App();
	}
	
	public App() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Gestao Restaurantes");
			io.writeL("2. Gestao Clientes");
			io.writeL("3. Gestao Reservas");
			io.writeL("0. Sair");
			op = io.readN();
			
			switch (op) {
				case 1:
					new GestaoRestaurantes();
					break;
				case 2:
					//new GestaoClientes();
					break;
				case 3:
					new GestaoReservas();
					break;
			}
		}while(op!=0);
	}
}
