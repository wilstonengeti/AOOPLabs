/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

//Implementing the remote interface

import java.rmi.RemoteException;


/**
 *
 * @author HP
 */
public class ImplExample implements Hello {

	//Implementing the interface method
	public void printMsg() {
	  System.out.println ("This is an example RMI program");//body
	}

    @Override
    public void animation() throws RemoteException {
        
    }
}