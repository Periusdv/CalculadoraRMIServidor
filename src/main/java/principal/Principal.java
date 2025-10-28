package principal;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Principal {

    public static void main(String[] args) {
        try {
            String nomeServico = "mensagens";
            RemoteCalculadora hello = new ImplementaCalculadora();
            RemoteCalculadora stub = (RemoteCalculadora) UnicastRemoteObject.exportObject(hello, 0);
            Registry registro = LocateRegistry.createRegistry(1099);
            registro.bind(nomeServico, stub);
            System.out.println("Servidor no Ar. Nome do objeto Servidor: \' mensagem\'");
        } catch (Exception e) {
            System.out.println("Exceção: " + e);
        }
    }
}
