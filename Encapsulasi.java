

package com.mycompany.encapsulasi;

public class Encapsulasi {

    
    public static void main(String[] args) {
        Segi P = new Segi();
        P.setpanjang(7);
        P.setlebar(6);
        
        System.out.println("panjang :"+P.getpanjang());
        System.out.println("lebar :"+P.getlebar());
        System.out.println("luas :"+P.getluas());
        
        
    }
    
}

