package servidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import interfaces.InterfaceEmpresa1;

public class ServidorEmpresa1 extends UnicastRemoteObject implements InterfaceEmpresa1 {

	private static final long serialVersionUID = 1L;
		
	private List<String> passagensReservadas = new ArrayList<>();

	public ServidorEmpresa1() throws RemoteException {
		super();
	}
	
	/**
	 * Método que realiza a consulta de uma passagem
	 */
	@Override
	public String consultarPassagem(String dadosPassagem) throws RemoteException {	
		if ("Origem: Natal\nDestino: João Pessoa\nData: 26/10/2020".equals(dadosPassagem)) {
			return "Passagem disponível";
		}
		return null;
	}

	/**
	 * Método que realiza a reserva de passagem para um cliente
	 */
	@Override
	public String reservarPassagem(String dadosReserva, String dadosCliente) throws RemoteException {
		dadosReserva = dadosReserva + "\nVoo direto: Sim" + dadosCliente;
		passagensReservadas.add(dadosReserva);
		
		return "Sua passagem foi reservada na Empresa 1.\nDados da reserva:\n" + dadosReserva;
	}

}
