
package com.mycompany.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
     Character homero=new Character("Homero",39, male,Doh);
     homero.saySomething();
    }
    
   static class Character{
        String name;
        int age;
        char gender;
        String phrase;
        
    public Character(String name, int age, char gender, String phrase){
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.phrase=phrase;
    
        
            
        }
    }
    
}
