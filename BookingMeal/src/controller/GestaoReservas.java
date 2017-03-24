package controller;

import java.util.ArrayList;
import tools.easyIO;
import model.*;

public class GestaoReservas {
	public ArrayList<Reserva> reservas;
	public GestaoRestaurantes GestaoRest = new GestaoRestaurantes();
	public GestaoClientes GestaoClientes = new GestaoClientes();
	private static easyIO io = new easyIO();
	
	public GestaoReservas() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Reservar");
			io.writeL("2. Listar Reservas");
			io.writeL("3. Gestao Restaurantes");
			io.writeL("4. Gestao Clientes");
			io.writeL("0. Sair");
			op = io.readN();
			
			switch (op) {
				case 1:
					inserirReserva();
					break;
				case 2:
					//listarReservas();
					break;
				case 3:
					GestaoRest.MenuRestaurantes();
					break;
				case 4:
					GestaoClientes.MenuClientes();
					break;
			}
		}while(op!=0);
	}
	
	public void inserirReserva() {
		Reserva re = new Reserva(reservas.size());
		int rest = 0;
		io.writeL("Introduza o id do cliente");
		re.setEmNomeDe(GestaoClientes.getById(io.readN()));
		
		io.writeL("Introduza o id do restaurante");
		rest = io.readN();
		re.setOnde(GestaoRest.getById(rest));
		
		String nome_prato;
		Prato prato;
		
		do {
			io.writeL("Introduza o nome do prato ou introduza '0' para continurar");
			nome_prato = io.readS();
			prato = GestaoRest.getPratoByName(rest, nome_prato);
			if (prato!=null) {
				//ficou por aqui
			}
		}while(nome_prato!="0");
		
		
				
		addCliente(cli);

	}
	/*
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
