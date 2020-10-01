package servidores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import interfaces.InterfaceEmpresa3;

public class Main {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		System.setProperty("java.rmi.server.hostname","127.0.0.1");
		
		InterfaceEmpresa3 server = new ServidorEmpresa3();

		LocateRegistry.createRegistry(1101);
		
		Naming.rebind("rmi://127.0.0.1:5002/ServidorEmpresa3", server);
		
		System.out.println("----- Servidor empresa 3 inicializado ------");
		
	}

}
