package rmi;

import impl.GroupPurchaseManagementSystemImpl;
import service.GroupPurchaseManagementSystem;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIBinding {



    public static void bindService(int port){
        try {

            GroupPurchaseManagementSystem groupPurchaseManagementSystem = new GroupPurchaseManagementSystemImpl();
            LocateRegistry.createRegistry(port);
            Naming.bind("rmi://localhost:1099/GroupPurchaseManagementSystem", groupPurchaseManagementSystem);


        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }


    }


}
