package controller;

import java.util.ArrayList;

import model.Cliente;
import tools.easyIO;

public class GestaoClientes {
	
	private ArrayList<Cliente> clientes;
	public static easyIO io = new easyIO();
	
	public GestaoClientes() {
		clientes =new ArrayList<Cliente>(); 
	}
	
	public void MenuClientes() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Inserir Cliente");
			io.writeL("2. Listar Clientes");
			io.writeL("0. Sair");
			op = io.readN();
			
			switch (op) {
				case 1:
					inserirCliente();
					break;
				case 2:
					listarClientes();
					break;
			}
		}while(op!=0);
	}
	
	public void inserirCliente() {
		Cliente cli = new Cliente(clientes.size());
		io.writeL("Introduza o nome"); 
		cli.setNome(io.readS());
		
		io.writeL("Introduza a morada");
		cli.setMorada(io.readS());
		
		io.writeL("Introduza o email");
		cli.setEmail(io.readS());
		
		io.writeL("Introduza o telefone");
		cli.setTelefone(io.readN());
				
		addCliente(cli);

	}
	
	public void listarClientes() {
		io.writeL("Restaurantes/Pratos");
		for(Cliente cli:clientes) {
			io.writeL("id: " + cli.getId());
			io.writeL("nome: " + cli.getNome());
			io.writeL("morada: " + cli.getMorada());
			io.writeL("email: " + cli.getEmail());
			io.writeL("telefone: " + cli.getTelefone() + "\n");

		}
	}
	
	public Cliente getById(int id) {
		for (Cliente cli:clientes) {
			if (cli.getId() == id) {
				return cli;
			}
		}
		return null;
	}
	
	public ArrayList<Cliente> getAll() {
		return this.clientes;
	}
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
}
