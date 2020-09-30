package servidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfaces.InterfaceEmpresa3;
import modelos.Cliente;
import modelos.Passagem;

public class ServidorEmpresa3 extends UnicastRemoteObject implements InterfaceEmpresa3 {

	private static final long serialVersionUID = 1L;

	public ServidorEmpresa3() throws RemoteException {
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
