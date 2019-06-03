package service;



import entity.GroupPurchaseItem;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface GroupPurchaseManagementSystem extends Remote{
    List<GroupPurchaseItem> listGroupPurchase() throws RemoteException;

    boolean submitPurchase(String commodityId, String bankAccount, String password, String phoneNumber) throws RemoteException;


}
