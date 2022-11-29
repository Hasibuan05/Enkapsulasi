
package com.mycompany.encapsulasi;

public class Encapsulasi {

    public static void main(String[] args) {
       Persegi p = new Persegi();
       p.setLebar(7);
       p.setPanjang(6);
       
        System.out.println("PANJANG = "+p.getPanjang());
        System.out.println("LEBAR   = "+p.getLebar());
        System.out.println("LUAS    = "+p.getLuas());
           
       }
    }

