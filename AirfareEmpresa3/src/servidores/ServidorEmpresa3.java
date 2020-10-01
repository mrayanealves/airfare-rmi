package servidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import interfaces.InterfaceEmpresa3;
import modelos.Cliente;
import modelos.Passagem;

public class ServidorEmpresa3 extends UnicastRemoteObject implements InterfaceEmpresa3 {

	private static final long serialVersionUID = 1L;
	
	private static final Calendar myCalendar = new GregorianCalendar(2020, 10, 19);
	
	private List<Passagem> passagensReservadas = new ArrayList<Passagem>();

	public ServidorEmpresa3() throws RemoteException {
		super();
	}
	
	/**
	 * Método que realiza a consulta de uma passagem
	 */
	@Override
	public String consultarPassagem(Passagem dadosPassagem) throws RemoteException {
		if (dadosPassagem.trechoOrigem.equalsIgnoreCase("Recife") &&
				dadosPassagem.trechoDestino.equalsIgnoreCase("Belo Horizonte") &&
				dadosPassagem.dataDesejada.equals(myCalendar.getTime())) {
				return "Passagem disponível";
		}
		return null;
	}

	/**
	 * Método que realiza a reserva de passagem para um cliente
	 */
	@Override
	public String reservarPassagem(Passagem dadosPassagem, Cliente cliente) throws RemoteException {
		dadosPassagem.cliente = cliente;
		passagensReservadas.add(dadosPassagem);
		
		return "Sua passagem foi reservada.\nDados da reserva:\nOrigem: " + dadosPassagem.trechoOrigem + 
				"\nDestino: " + dadosPassagem.trechoDestino + 
				"\nData: " + new SimpleDateFormat("dd-mm-yyyy").format(dadosPassagem.dataDesejada) + 
				"\nVoo direto: " + dadosPassagem.vooDireto.toString();
	}

}
