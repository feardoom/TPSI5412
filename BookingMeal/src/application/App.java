package application;

import controller.*;
import tools.easyIO;

public class App {
	public static easyIO io = new easyIO();
	
	public static void main(String[] args) {
		new App();
	}
	
	public App() {
		new GestaoReservas();
	}
}
