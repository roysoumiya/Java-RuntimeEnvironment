/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

/**
 *
 * @author Skull
 */
public abstract class Organization {
    
    private int id;
    private static int count = 0;
    
    public Organization(){
        id = count;
        count++;
    }
    
}
