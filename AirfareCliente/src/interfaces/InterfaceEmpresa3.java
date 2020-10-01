package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceEmpresa3 extends Remote {
	public String consultarPassagem(String passagem) throws RemoteException;
	public String reservarPassagem(String dadosReserva, String dadosCliente) throws RemoteException;
}
