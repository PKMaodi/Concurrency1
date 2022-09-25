/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttwentyints;

/**
 *
 * @author Paul
 */
public class FrstTwntyInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntPrinter mp = new IntPrinter();
        
        // create thread --> pass resource and the message you want printed
        Thread t1 = new IntThread(mp,50);
        
        //start the thread
        t1.start();
    }
    
}
