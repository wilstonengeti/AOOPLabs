/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
  private Client() {}
  public static void main(String[] args) {
	try {
	   //Getting the registry
	   Registry registry = LocateRegistry.getRegistry(null);

	   //Looking up the registry for the remote object
	   Hello stub = (Hello) registry.lookup("HelloMe");

	   //Calling the remote method using the obtained object
	   stub.printMsg();

	   //System.out.printIn("Remote method invoked");
	} catch (Exception e) {
	   System.err.println("Client exception: " + e.toString());
	   e.printStackTrace ();
	}
    }
}