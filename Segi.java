
package com.mycompany.encapsulasi;

public class Segi {
    private int panjang;
    private int lebar;
    
    public int getlebar(){
    return lebar;
    }
    
    public void setlebar (int lebar){
    this.lebar = lebar;
    }
    public int getpanjang(){
    return panjang;
    }
    
    public void setpanjang(int panjang){
    this.panjang = panjang;
    }
    public  Segi(){
    int p=0;
    int l=0;
    }
    
    public int luas (int p,int l){
    return p*l;
    }
    
    public int getluas(){
    return luas(panjang, lebar);
    }
    
}
