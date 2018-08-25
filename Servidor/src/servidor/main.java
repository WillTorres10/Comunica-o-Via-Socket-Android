package servidor;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class main {
	public static void main(String[] args) throws IOException {
		try {
			//Criando o servidor Socket
			ServerSocket servidor = new ServerSocket(8000);
			System.out.println("Servidor ouvindo a porta 8000");
			while(true) {
				//Fica aguardando novas requisições de conexão
				//Quando chega uma nova requisição ele aceita e cria uma thread
				Socket cliente = servidor.accept();
				TratamentoClass novo = new TratamentoClass(cliente);
				Thread c1 = new Thread(novo);
				c1.start();
			}
    	}   
	    catch(Exception e) {
	       System.out.println("Erro: " + e.getMessage());
	    }
    }
}
