/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
import java.util.Scanner;
public class Reader {
    private Scanner s; 
    
    public Reader(){
    s = new Scanner(System.in);
}
    public String readString(){
     return  s.nextLine();
      
    }
    public int readInteger(){
        return Integer.parseInt(s.nextLine());
    }
   
}
