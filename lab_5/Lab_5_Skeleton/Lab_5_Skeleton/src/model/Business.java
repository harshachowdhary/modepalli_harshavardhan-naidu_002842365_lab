/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author harsh
 */
public class Business {
    MasterOrderList masterOrderList;
    SupplierDirectory supplierdirectory;

    public Business() {
        masterOrderList = new MasterOrderList();
        supplierdirectory = new SupplierDirectory();
        
        
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public SupplierDirectory getSupplierdirectory() {
        return supplierdirectory;
    }

    public void setSupplierdirectory(SupplierDirectory supplierdirectory) {
        this.supplierdirectory = supplierdirectory;
    }
    
}
