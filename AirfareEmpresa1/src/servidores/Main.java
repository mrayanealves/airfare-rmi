package servidores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import interfaces.InterfaceEmpresa1;

public class Main {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		System.setProperty("java.rmi.server.hostname","127.0.0.1");
		
		InterfaceEmpresa1 server = new ServidorEmpresa1();

		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("rmi://127.0.0.1:1099/ServidorEmpresa1", server);
		
		System.out.println("----- Servidor da empresa 1 inicializado ------");
	}

}
