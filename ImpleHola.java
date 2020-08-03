import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImpleHola extends UnicastRemoteObject implements Hola{
    ImpleHola() throws RemoteException {
    }

    @Override
    public String saluda() throws RemoteException {
        return "Hola a todos! Soy un objeto remoto!";
    }
}
