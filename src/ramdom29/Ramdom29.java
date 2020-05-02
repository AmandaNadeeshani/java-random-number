/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramdom29;
import java.util.Random;
/**
 *
 * @author Amanda Nadeeshani
 */
public class Ramdom29 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int num;
        
        for(int i=0; i<10; i++){
           num =1+rnd.nextInt(5);
            System.out.println(num);
        }
    }
    
}
