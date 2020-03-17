package server;

import java.rmi.RemoteException;

import client.Client;
import model.Airfare;

public interface ServerAirline1 {
	public String connect(Client client) throws RemoteException;
	public String disconnect(Client client) throws RemoteException;
	public Airfare search(String origin, String destination) throws RemoteException;
}
