

package com.mycompany.latihan_enkapsulasi;

public class Latihan_Enkapsulasi {

    public static void main(String[] args) {
       Nilai n = new Nilai();
       n.setnilaiPraktek(10);
       n.setnilaiTeori(6);
       
        System.out.println("NILAI PRAKTEK = "+n.getnilaiPraktek());
        System.out.println("NILAI TEORI   = "+n.getnilaiTeori());
        System.out.println("HASIL AKHIR   = "+n.getnilaiAkhir());
    }
}
