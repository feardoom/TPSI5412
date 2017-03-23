package model;

import java.util.ArrayList;

public class Restaurante {
	private int id_restaurante;
	private String nome;
	private String morada;
	private String contacto;
	private String especialidade;
	private ArrayList<Prato> pratos;
	
	public Restaurante(int id) {
		this.id_restaurante = id;
	}

	public Restaurante(int id, String nome, String morada, String contacto, String especialidade, ArrayList<Prato> pratos) {
		this.id_restaurante = id;
		this.nome = nome;
		this.morada = morada;
		this.contacto = contacto;
		this.especialidade = especialidade;
		this.pratos = pratos;
	}

	public int getId() {
		return this.id_restaurante;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public ArrayList<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}	
	
}
