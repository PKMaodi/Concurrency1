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
public class IntThread extends Thread{
    private IntPrinter ip;
    private Integer g;

    public IntThread(IntPrinter ip, Integer g) {
        this.ip = ip;
        this.g = g;
    }
    
    @Override
    public void run() {
       ip.printIntegers(g);
    }
    
}
