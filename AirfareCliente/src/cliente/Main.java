package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import interfaces.InterfaceEmpresa1;
import interfaces.InterfaceEmpresa2;
import interfaces.InterfaceEmpresa3;

public class Main {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		InterfaceEmpresa1 servidorEmpresa1 = (InterfaceEmpresa1)
				Naming.lookup("rmi://127.0.0.1:5000/ServidorEmpresa1");
		
		InterfaceEmpresa2 servidorEmpresa2 = (InterfaceEmpresa2)
				Naming.lookup("rmi://127.0.0.1:5001/ServidorEmpresa2");
		
		InterfaceEmpresa3 servidorEmpresa3 = (InterfaceEmpresa3)
				Naming.lookup("rmi://127.0.0.1:5002/ServidorEmpresa3");
		
		int count = 0;
		while(count < 3) {
			String dadosPassagem = "";
			
			if (count == 0) {
				dadosPassagem = "Origem: Natal\nDestino: João Pessoa\nData: 26/10/2020";
			} 
			
			else if (count == 1) {
				dadosPassagem = "Origem: São Paulo\nDestino: Rio de Janeiro\nData: 28/10/2020";
			}
			
			else if (count == 2) {
				dadosPassagem = "Origem: João Pessoa\nDestino: São Paulo\nData: 29/10/2020";
			}
			
			String retornoServidor1 = servidorEmpresa1.consultarPassagem(dadosPassagem);
			String retornoServidor2 = servidorEmpresa2.consultarPassagem(dadosPassagem);
			String retornoServidor3 = servidorEmpresa3.consultarPassagem(dadosPassagem);
			
			if ("Passagem disponível".equalsIgnoreCase(retornoServidor1)) {
				String dadosCliente = "\nDados do cliente:\nNome: Cliente 1\nCPF: 685.847.384-98\nEmail: clinte1@mail.com\n";
				String dadosReserva = servidorEmpresa1.reservarPassagem(dadosPassagem, dadosCliente);
				
				System.out.println(dadosReserva);
			}
			
			else if ("Passagem disponível".equalsIgnoreCase(retornoServidor2)) {
				String dadosCliente = "\nDados do cliente:\nNome: Cliente 1\nCPF: 685.847.384-98\nEmail: clinte1@mail.com\n";
				String dadosReserva = servidorEmpresa2.reservarPassagem(dadosPassagem, dadosCliente);
				
				System.out.println(dadosReserva);
			}
			
			else if (retornoServidor3.equalsIgnoreCase("Passagem disponível")) {
				String dadosCliente = "\nDados do cliente:\nNome: Cliente 1\nCPF: 685.847.384-98\nEmail: clinte1@mail.com\n";
				String dadosReserva = servidorEmpresa3.reservarPassagem(dadosPassagem, dadosCliente);
				
				System.out.println(dadosReserva);
			}
			
			count++;
		}
		
	}
}
