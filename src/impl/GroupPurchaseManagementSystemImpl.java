package impl;


import entity.GroupPurchaseItem;
import service.GroupPurchaseManagementSystem;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class GroupPurchaseManagementSystemImpl extends UnicastRemoteObject implements GroupPurchaseManagementSystem {
    public GroupPurchaseManagementSystemImpl() throws RemoteException {
    }


    @Override
    public List<GroupPurchaseItem> listGroupPurchase() throws RemoteException{
        List<GroupPurchaseItem> groupPurchaseItems = new ArrayList<>();
        for(int i=0;i<5;i++){
            GroupPurchaseItem groupPurchaseItem = new GroupPurchaseItem();
            groupPurchaseItem.setId(i+1+"");
            groupPurchaseItem.setIntroduction("................");
            groupPurchaseItem.setLimit(5);
            groupPurchaseItem.setPrice((i+1)*10);
            groupPurchaseItem.setProductName("商品"+i);
            groupPurchaseItem.setSeller("商家"+i);
            groupPurchaseItems.add(groupPurchaseItem);
        }

        return groupPurchaseItems;
    }

    @Override
    public boolean submitPurchase(String commodityId, String bankAccount, String password, String phoneNumber) throws RemoteException{
        return true;
    }
}
