package servidor;

import java.net.Socket;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class TratamentoClass extends Thread{
	private Socket cliente;
	
	public TratamentoClass(Socket cliente) {
		this.cliente = cliente;
	}

	public void run() {
		// Informa o IP do cliente que se conectou
		System.out.println("IP: " +     
	            cliente.getInetAddress().getHostAddress() +
	            " Conectado"	            
	        );
		InputStream is;
		try {
			//Criando o objeto para receber o Arraylist do cliente
			is = cliente.getInputStream();
			try {
				ObjectInputStream ois = new ObjectInputStream(is);
				while(true) {
						//Fica verificando se há alguma informação mandada pelo cliente
						ArrayList<String> al = (ArrayList)ois.readObject();
						System.out.println(al.get(0)+' '+al.get(1)+' '+al.get(2));
				}
			} catch (IOException e1) {
				// Caso o cliente se desconecte ele informa
				System.out.println("IP: " +     
	    	            cliente.getInetAddress().getHostAddress() +
	    	            " Desconectado"	            
	    	        );
				//Fecha o Socket Aberto
				this.cliente.close();
				//Encerra a Thread
				Thread.currentThread().interrupt();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
