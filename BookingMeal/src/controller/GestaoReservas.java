package controller;

import java.util.ArrayList;
import tools.easyIO;
import model.*;

public class GestaoReservas {
	public ArrayList<Reserva> reservas;
	public static easyIO io = new easyIO();
	
	public GestaoReservas() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Reservar");
			io.writeL("2. Listar Reservas");
			io.writeL("0. Sair");
			op = io.readN();
			
			switch (op) {
				case 1:
					inserirReserva();
					break;
				case 2:
					//listarReservas();
					break;
			}
		}while(op!=0);
	}
	
	/*public void inserirReserva() {
		Reserva re = new Reserva(reservas.size());
		
		io.writeL("Introduza o id do cliente"); 
		re.setNome(io.readS());
		
		io.writeL("Introduza a morada");
		re.setMorada(io.readS());
		
		io.writeL("Introduza o email");
		re.setEmail(io.readS());
		
		io.writeL("Introduza o telefone");
		cli.setTelefone(io.readN());
				
		addCliente(cli);

	}
	
	public void listarReservas() {
		io.writeL("Restaurantes/Pratos");
		for(Cliente cli:clientes) {
			io.writeL("id: " + cli.getId());
			io.writeL("nome: " + cli.getNome());
			io.writeL("morada: " + cli.getMorada());
			io.writeL("email: " + cli.getEmail());
			io.writeL("telefone: " + cli.getTelefone());

		}
	}*/
	
	public Reserva getById(int id) {
		for (Reserva r:reservas) {
			if (r.getId() == id) {
				return r;
			}
		}
		return null;
	}
	
	public ArrayList<Reserva> getReservas() {
		return this.reservas;
	}
	
	public void addReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
}
