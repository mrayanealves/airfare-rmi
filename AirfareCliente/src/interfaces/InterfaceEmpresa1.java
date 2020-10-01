package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceEmpresa1 extends Remote {
	public String consultarPassagem(String passagem) throws RemoteException;
	public String reservarPassagem(String dadosReserva, String dadosCliente) throws RemoteException;
}
