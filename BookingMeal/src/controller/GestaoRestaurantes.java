package controller;

import java.util.ArrayList;

import model.*;
import tools.easyIO;

public class GestaoRestaurantes {
	private ArrayList<Restaurante> restaurantes;
	public static easyIO io = new easyIO();
	
	public GestaoRestaurantes() {
		restaurantes = new ArrayList<Restaurante>();
	}
	
	public void MenuRestaurantes() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Inserir Restaurante");
			io.writeL("2. Listar Restaurantes");
			io.writeL("0. Sair");
			op = io.readN();
			
			switch (op) {
				case 1:
					inserirRestaurante();
					break;
				case 2:
					listarRestaurantes();
					break;
			}
		}while(op!=0);
	}
	
	public void inserirRestaurante() {
		Restaurante res = new Restaurante(restaurantes.size());
		io.writeL("Introduza o nome"); 
		res.setNome(io.readS());
		
		io.writeL("Introduza a morada");
		res.setMorada(io.readS());
		
		io.writeL("Introduza o contacto");
		res.setContacto(io.readS());
		
		io.writeL("Introduza a especialidade da casa");
		res.setEspecialidade(io.readS());
		
		//para efeitos de simplificação e como os pratos vêm dos restaurantes por email ou por um webservice, vou colocar uns ao calhas
		ArrayList<Prato> pratos = new ArrayList<Prato>();
		
		pratos.add(new Prato("prato" + res.getId()*29 + 5, (res.getId()*9  + 1) / (res.getId()*2 + 1)));
		pratos.add(new Prato("prato" + res.getId()*12 + 3, (res.getId()*4  + 1) / (res.getId()*2 + 1)));
		pratos.add(new Prato("prato" + res.getId()*21 + 7, (res.getId()*12 + 1) / (res.getId()*3 + 1)));
		
		res.setPratos(pratos);
		
		addRestaurante(res);

	}
	
	public void listarRestaurantes() {
		io.writeL("Restaurantes/Pratos");
		for(Restaurante r:restaurantes) {
			io.writeL("id: " + r.getId());
			io.writeL("nome: " + r.getNome());
			io.writeL("especialidade: " + r.getEspecialidade());
			if (r.getPratos().size()>0) {
				io.writeL("pratos:");
				for(Prato p:r.getPratos()) {
					io.writeL("  prato: " + p.getDescricao());
					io.writeL("  preço: " + p.getPreco());
				}
				
			}
		}
	}
	
	public Prato getPratoByName(int res, String prato) {
		Restaurante rest = this.getById(res);
		for(Prato p:rest.getPratos()) {
			if (p.getDescricao()==prato) {
				return p;
			}
		}
		return null;
	}
	
	public Restaurante getById(int id) {
		for (Restaurante r:restaurantes) {
			if (r.getId() == id) {
				return r;
			}
		}
		return null;
	}
	
	public ArrayList<Restaurante> getAll() {
		return this.restaurantes;
	}
	
	public void addRestaurante(Restaurante restaurante) {
		this.restaurantes.add(restaurante);
	}
	
}
