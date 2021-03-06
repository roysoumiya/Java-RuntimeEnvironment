/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.organization.Organization;
import business.parentnetwork.ParentNetworkDirectory;

/**
 *
 * @author Skull
 */
public class Business extends Organization {
    
    private static Business business;
    private ParentNetworkDirectory parentNetworkDirectory;
    
    private Business(){
        super(organizationType.Business);
    }
    
    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    public void setParentNetworkDirectory(ParentNetworkDirectory parentNetworkDirectory) {
        this.parentNetworkDirectory = parentNetworkDirectory;
    }

    public ParentNetworkDirectory getParentNetworkDirectory() {
        return parentNetworkDirectory;
    }
    
}
