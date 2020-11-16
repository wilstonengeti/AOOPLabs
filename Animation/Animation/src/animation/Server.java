/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImplExample{
     public Server () {}
     public static void main (String args[]) {
	try {
	   //Instaniating the implementation class
	   ImplExample obj = new ImplExample ();

	   //Exporting the object of implementation class
	   //  (here we are exporting the remote object to the stub)
	   Hello stub = (Hello) UnicastRemoteObject.exportObject (obj, 0);

	   //Binding the remote object (stub) in the registry
	   Registry registry = LocateRegistry.getRegistry();

	   registry.bind("HelloMe", stub);
	   System.err.println("Server ready");
	} catch (Exception e) {
	   System.err.println("Server exception: "+ e.toString());
	   e.printStackTrace();

	}
   }
}
