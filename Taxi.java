/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.transportation;

/**
 *
 * @author Aurel
 */
public class Taxi extends Vehicle{
    private static final int FARE_PER_KM = 5000;//menetapkan tarif per km
    
    public Taxi(String name, int capacity, String route){//kostruktor dengan parameter lengkap
        super(name, capacity, route);
    }
    public void calculateFare(int distance){//method untuk menghitung jumlah tarif akhir
        System.out.println("Total penumpang: "+ getCurrentPassengers());//menampilkan banyaknya penumpang
        System.out.println("Total jarak rute: "+distance+ " km");//menampilkan total jarak rute dalam km
        System.out.println("Tarif per km: Rp "+FARE_PER_KM);//menampilkan tarif per km nya
        int finalFare = FARE_PER_KM * distance;//rumus menghitung jumlah tarif akhir dengan cara tarif per km dikalikan total jarak rute
        System.out.println("Total tarif perjalanan taksi: Rp " +finalFare);//
    }
}
