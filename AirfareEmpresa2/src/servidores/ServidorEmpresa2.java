package servidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfaces.InterfaceEmpresa2;
import modelos.Cliente;
import modelos.Passagem;

public class ServidorEmpresa2 extends UnicastRemoteObject implements InterfaceEmpresa2 {

	private static final long serialVersionUID = 1L;

	public ServidorEmpresa2() throws RemoteException {
		super();
	}
	
	/**
	 * Método que realiza a consulta de uma passagem
	 */
	@Override
	public String consultarPassagem(Passagem dadosPassagem) throws RemoteException {
		// TODO Implementar metodo para verificar as passagens disponiveis
		return null;
	}

	/**
	 * Método que realiza a reserva de passagem para um cliente
	 */
	@Override
	public String reservarPassagem(Passagem dadosPassagem, Cliente cliente) throws RemoteException {
		// TODO Implementar metodo para reservar a passagem
		return null;
	}

}
