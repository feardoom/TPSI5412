package model;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
	private int id_reserva;
	private Cliente emNomeDe;
	private Restaurante onde;
	private ArrayList<Prato> pratos;
	private Date quando;
	
	public Reserva(int id) {
		this.id_reserva = id;
	}

	public Reserva(int id_reserva, Cliente emNomeDe, Restaurante onde, ArrayList<Prato> pratos, Date quando) {
		this.emNomeDe = emNomeDe;
		this.onde = onde;
		this.pratos = pratos;
		this.quando = quando;
	}
	
	public int getId() {
		return this.id_reserva;
	}

	public Cliente getEmNomeDe() {
		return emNomeDe;
	}

	public void setEmNomeDe(Cliente emNomeDe) {
		this.emNomeDe = emNomeDe;
	}

	public Restaurante getOnde() {
		return onde;
	}

	public void setOnde(Restaurante onde) {
		this.onde = onde;
	}

	public ArrayList<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}

	public Date getQuando() {
		return quando;
	}

	public void setQuando(Date quando) {
		this.quando = quando;
	}
	
	
	
	
}
