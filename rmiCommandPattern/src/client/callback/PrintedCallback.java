package client.callback;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by pkocsis on 23.03.16.
 */
public class PrintedCallback<T> implements Callback<T>, Remote {

    @Override
    public void give(T val) throws RemoteException {
        System.out.println(val);
    }
}
