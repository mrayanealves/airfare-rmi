package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import interfaces.InterfaceServidor;
import modelos.Cliente;
import modelos.Passagem;

public class Main {
	
	private static final Calendar myCalendarPassagem1 = new GregorianCalendar(2020, 10, 11);
	
	private static final Calendar myCalendarPassagem2 = new GregorianCalendar(2020, 10, 13);
	
	private static final Calendar myCalendarPassagem3 = new GregorianCalendar(2020, 10, 19);

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		InterfaceServidor servidorEmpresa1 = (InterfaceServidor)
				Naming.lookup("rmi://127.0.0.1:1099/ServidorEmpresa1");
		
		InterfaceServidor servidorEmpresa2 = (InterfaceServidor)
				Naming.lookup("rmi://127.0.0.1:1099/ServidorEmpresa2");
		
		InterfaceServidor servidorEmpresa3 = (InterfaceServidor)
				Naming.lookup("rmi://127.0.0.1:1099/ServidorEmpresa3");
		
		int count = 0;
		while(count < 3) {
			Passagem dadosPassagem = new Passagem();
			
			if (count == 0) {
				dadosPassagem.trechoOrigem = "Natal";
				dadosPassagem.trechoDestino = "João Pessoa";
				dadosPassagem.dataDesejada = myCalendarPassagem1.getTime();
			} 
			
			else if (count == 1) {
				dadosPassagem.trechoOrigem = "São Paulo";
				dadosPassagem.trechoDestino = "Rio de Janeiro";
				dadosPassagem.dataDesejada = myCalendarPassagem2.getTime();
			}
			
			else if (count == 2) {
				dadosPassagem.trechoOrigem = "Recife";
				dadosPassagem.trechoDestino = "Belo Horizonte";
				dadosPassagem.dataDesejada = myCalendarPassagem3.getTime();
			}
			
			String retornoServidor1 = servidorEmpresa1.consultarPassagem(dadosPassagem);
			String retornoServidor2 = servidorEmpresa2.consultarPassagem(dadosPassagem);
			String retornoServidor3 = servidorEmpresa3.consultarPassagem(dadosPassagem);
			
			if (retornoServidor1.equalsIgnoreCase("Passagem disponível")) {
				Cliente cliente = new Cliente("Cliente 1", "685.847.384-98", "clinte1@mail.com");
				String dadosReserva = servidorEmpresa1.reservarPassagem(dadosPassagem, cliente);
				
				System.out.println(dadosReserva);
			}
			
			else if (retornoServidor2.equalsIgnoreCase("Passagem disponível")) {
				Cliente cliente = new Cliente("Cliente 2", "685.847.384-99", "clinte2@mail.com");
				String dadosReserva = servidorEmpresa2.reservarPassagem(dadosPassagem, cliente);
				
				System.out.println(dadosReserva);
			}
			
			else if (retornoServidor3.equalsIgnoreCase("Passagem disponível")) {
				Cliente cliente = new Cliente("Cliente 3", "685.847.384-77", "clinte3@mail.com");
				String dadosReserva = servidorEmpresa3.reservarPassagem(dadosPassagem, cliente);
				
				System.out.println(dadosReserva);
			}
			
			count++;
		}
		
	}
}
