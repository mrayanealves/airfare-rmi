package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import modelos.Cliente;
import modelos.Passagem;

public interface InterfaceEmpresa3 extends Remote {
	public String consultarPassagem(Passagem dadosPassagem) throws RemoteException;
	public String reservarPassagem(Passagem dadosPassagem, Cliente cliente) throws RemoteException;
	
}
