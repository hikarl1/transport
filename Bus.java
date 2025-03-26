/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.transportation;

/**
 *
 * @author Aurel
 */
public class Bus extends Vehicle{
    private static final int FARE_PER_STOP = 2000;//menetapkan tarif per halte
    
    public Bus(String name, int capacity, String route){//konstruktor dengan parameter
        super(name, capacity, route);
    }
    public void calculateFare(int stops){//method menghitung tarif total
        System.out.println("Total penumpang: "+ getCurrentPassengers());//menampilkan banyak penumpang
        System.out.println("Total pemberhentian: "+stops);//menampilkan banyak halte yang dilewati
        System.out.println("Tarif per halte: Rp "+FARE_PER_STOP);//menampilkan tarif per halte
        int finalFare = FARE_PER_STOP * stops * getCurrentPassengers();//rumus menghitung total tarif per stop untuk jumlah seluruh penumpang
        System.out.println("Total tarif perjalanan bus : Rp " +finalFare);//menampilkan pesan jumlah tarif akhir 
    }
}
