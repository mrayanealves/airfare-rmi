package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote {
	public void search(String origin, String destination) throws RemoteException;
}
