/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadat
 */
public class Calculator {
    private Reader s; 
    private int count; 
    private int value1; 
    private int value2; 
    
    public Calculator(){
        s = new Reader();
        this.count = 0;
        this.value1 = 0; 
        this.value2 = 0; 
    }
    
    private int readValue1(){
        System.out.print("Value1: ");
        int value1 = s.readInteger();
        
        return value1; 
    }
    
    private int readValue2(){
        System.out.print("Value2: ");
        int value2 = s.readInteger();
        
        return value2;
    }
    
    private void setValue1(){
        this.value1 = readValue1();
    }
    
    private void setValue2(){
        this.value2 = readValue2(); 
    }
    
    private void setAllValues(){
        setValue1(); 
        setValue2();
    }
   
   
    private void sum(){
        setAllValues();
         int sum = value1 + value2; 
      count++;
        System.out.println("sum of the values "+sum);
        
    }
    private void product(){
        setAllValues();
        int product = value1*value2; 
        count++;
        System.out.println("product of the values "+product);
    }
    
    private void difference(){
        setAllValues();
        int difference = value1 - value2; 
        count++;
        System.out.println("difference of the values "+difference);
    }
    private void statistics(){
        System.out.println("Calculations done "+count);
    }
    
    public void start(){
        while (true){
            System.out.print("command: ");
            String command = s.readString();
            if(command.equals("end")){
                break;
            }
            if(command.equals("sum")){
                sum();
            }else if(command.equals("product")){
                product();
            }else if(command.equals("difference")){
                difference();
            }
        }
        statistics();
    }
    
}
