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
public class IntPrinter {
    public void printIntegers(Integer userNumber){
        for(int g = 0;g < 20;g++){
            System.out.println(Thread.currentThread().getName() + " Integer: " + (userNumber + g));
        }
    }
}
