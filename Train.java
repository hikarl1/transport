/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.transportation;

/**
 *
 * @author Aurel
 */
public class Train extends Vehicle{
    private static final int FIXED_FARE = 10000;//menetapkan tarif tetap per penumpang
    
    public Train(String name, int capacity, String route){//konstruktor dengan parameter
        super(name, capacity, route);
    }
    
    public void calculateFare(){//method menghitung tarif total
        System.out.println("Total penumpang: "+ getCurrentPassengers());// menampilkan banyak penumpang
        System.out.println("Tarif tetap per penumpang: Rp "+FIXED_FARE);// menampilkan tarif per penumpang
        int finalFare = FIXED_FARE * getCurrentPassengers();//rumus menghitung jumlah tarif di akhir 
        System.out.println("Total tarif perjalanan kereta: Rp " +finalFare);//menampilkan total tarif di akhir
    }
}