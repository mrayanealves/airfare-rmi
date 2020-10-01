package servidores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import interfaces.InterfaceEmpresa2;

public class Main {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		System.setProperty("java.rmi.server.hostname","127.0.0.1");
		
		InterfaceEmpresa2 server = new ServidorEmpresa2();

		LocateRegistry.createRegistry(1100);
		
		Naming.rebind("rmi://127.0.0.1:5001/ServidorEmpresa2", server);
		
		System.out.println("----- Servidor da empresa 2 inicializado ------");
		
	}

}
