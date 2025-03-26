/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Train;
import praktic.inheritance.transportation.Taxi;
//import praktic.inheritance.transportation.Vehicle;
/**
 *
 * @author Aurel
 */
public class VehicleMain {
    
    public static void printGaris(){//membuat spasi dan garis batas
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
    }
    public static void main(String[] args){
        Bus bus = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B");//inisialisasi objek bus(nama: Bus Transjakarta, kapasitas 50, rute Terminal A-Terminal B)
        Train kereta = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");//inisialisasi objek kereta(nama: Kereta Commuter Line, kapasitas 200, rute Stasiun Kota-Stasiun Pusat)
        Taxi taksi = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel");//inisialisasi objek taksi(nama: Taksi Bluebird, kapasitas 4, rute Bandara ke Hotel)
        
        bus.startJourney();// bus memulai perjalanan sesuai dengan rute
        bus.boardPassengers(30); //30 penumpang naik
        bus.boardPassengers(20);//bus berhenti dan 20 penumpang naik
        bus.calculateFare(5);//untuk menghitung tarif perjalanan dengan total pemberhentian = 5
        bus.stopJourney();//bus sampai ke tujuan akhir
        bus.dropPassengers(50);//50 penumpang turun
        printGaris();
        
        kereta.startJourney();//kereta memulai perjalanan sesuai dengan rute
        kereta.boardPassengers(200);//200 penumpang naik
        kereta.calculateFare();//menghitung tarif total
        kereta.stopJourney();//kereta sampai ke tujuan akhir
        kereta.dropPassengers(200);//200 penumpang turun
        printGaris();
        
        taksi.startJourney();//taksi memulai perjalanan sesuai dengan rute
        taksi.boardPassengers(4);//4 penumpang naik
        taksi.calculateFare(10);//menghitung tarif total dengan total jarak 10 km
        taksi.stopJourney();//taksi sampai ke tujuan akhir
        taksi.dropPassengers(4);//4 penumpang turun
        printGaris();
        
        /*
        //Sama seperti sebelumnya tapi kapasitas penuh dan yang turun sampai ke negatif
        bus.startJourney();// bus memulai perjalanan sesuai dengan rute
        bus.boardPassengers(50);
        bus.boardPassengers(100);//100 penumpang naik melebihi kapasitas
        bus.calculateFare(5);
        bus.stopJourney();
        bus.dropPassengers(50);//semua penumpang sudah turun
        bus.dropPassengers(200);//tidak bisa menurunkan penumpang lagi karena sudah tidak ada lagi penumpang
        printGaris();
        
        kereta.startJourney();
        kereta.boardPassengers(200);
        kereta.boardPassengers(400);//400 penumpang naik melebihi kapasitas
        kereta.calculateFare();
        kereta.stopJourney();
        kereta.dropPassengers(200);
        kereta.dropPassengers(200);//tidak bisa menurunkan 200 penumpang karena sebelumnya semua penumpang sudah turun
        printGaris();
        
        taksi.startJourney();
        taksi.boardPassengers(4);
        taksi.boardPassengers(10);//10 penumpang naik melebihi kapasitas
        taksi.calculateFare(10);
        taksi.stopJourney();
        taksi.dropPassengers(4);
        taksi.dropPassengers(5);//tidak bisa menurunkan penumpang lagi
        printGaris();*/
    }
}
