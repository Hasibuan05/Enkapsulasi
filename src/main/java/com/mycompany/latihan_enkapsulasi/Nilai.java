
package com.mycompany.latihan_enkapsulasi;


public class Nilai {
    private int nilai_praktek;
    private int nilai_teori;
    
    public int getnilaiPraktek(){
        return nilai_praktek; 
    }
    public void setnilaiPraktek(int nilai_praktek){
        this.nilai_praktek = nilai_praktek;
        
    }
    public int getnilaiTeori(){
        return nilai_teori;
    }
    public void setnilaiTeori(int nilai_teori){
        this.nilai_teori = nilai_teori;
        
    }
    
    public Nilai(){
        int na=0;
        int nt=0;
        
        }
    public int nilaiAkhir(int np,int nt){
        return (np+nt)/2;
    }
    public int getnilaiAkhir(){
        return nilaiAkhir(nilai_praktek,nilai_teori);
    
    
    }
}
