package client.callback;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by pkocsis on 23.03.16.
 */
public interface Callback<T> extends Remote{
    void give(T val) throws RemoteException;
}
