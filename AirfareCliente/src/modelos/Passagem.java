package modelos;

import java.util.Date;

public class Passagem {
	public String trechoOrigem;
	public String trechoDestino;
	public Date dataDesejada;
	public VooDireto vooDireto;
	public Cliente cliente;
	
	public Passagem() {
	}
	
	public Passagem(String trechoOrigem, String trechoDestino, Date dataDesejada) {
		this.trechoOrigem = trechoOrigem;
		this.trechoDestino = trechoDestino;
		this.dataDesejada = dataDesejada;
		this.vooDireto = VooDireto.SIM;
	}
}
