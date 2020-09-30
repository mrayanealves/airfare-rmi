package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import interfaces.InterfaceServidor;

public class Main {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		InterfaceServidor servidorEmpresa1 = (InterfaceServidor)
				Naming.lookup("rmi://127.0.0.1:1099/ServidorEmpresa1");
		
		InterfaceServidor servidorEmpresa2 = (InterfaceServidor)
				Naming.lookup("rmi://127.0.0.1:1099/ServidorEmpresa2");
		
		InterfaceServidor servidorEmpresa3 = (InterfaceServidor)
				Naming.lookup("rmi://127.0.0.1:1099/ServidorEmpresa3");

		// TODO: Realizar metodo para consultar e reservar passagens
	}

}
