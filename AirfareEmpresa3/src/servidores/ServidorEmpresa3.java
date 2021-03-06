package servidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import interfaces.InterfaceEmpresa3;

public class ServidorEmpresa3 extends UnicastRemoteObject implements InterfaceEmpresa3 {

	private static final long serialVersionUID = 1L;
	
	private List<String> passagensReservadas = new ArrayList<>();

	public ServidorEmpresa3() throws RemoteException {
		super();
	}
	
	/**
	 * Método que realiza a consulta de uma passagem
	 */
	@Override
	public String consultarPassagem(String dadosPassagem) throws RemoteException {
		if ("Origem: João Pessoa\nDestino: São Paulo\nData: 29/10/2020".equals(dadosPassagem)) {
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
		
		return "Sua passagem foi reservada na Empresa 3.\nDados da reserva:\n" + dadosReserva;
	}

}
