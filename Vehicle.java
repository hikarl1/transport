/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktic.inheritance.transportation;

/**
 *
 * @author Aurel
 */
public class Vehicle {
    private String name;//field nama
    private int capacity;//field kapasitas
    private String route;//field rute 
    private int currentPassengers;//field jumlah penumpang
    
    public Vehicle(String name, int capacity, String route){//inisialisasi nama, kapasitas, rute
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0;//menyetel nilai awal penumpang menjadi 0
    }
    
    public void boardPassengers(int count){ //method penumpang naik
        if (currentPassengers+count > capacity){ //jika penumpang yang ada + penumpang yang ingin naik lebih banyak dari kapasitasnya
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " +count+ " penumpang");//mencetak pesan kapasitas penuh
        } else{// jika cukup
            currentPassengers += count;//total penumpang yang ada menjadi jumlah penumpang di dalam kendaraan + jumlah yang baru naik
            System.out.println( count+ " penumpang naik ke dalam " +name);//mencetak pesan jumlah penumpang naik
        }
    }
    
    public void dropPassengers(int count){//method penumpang turun
        if(currentPassengers - count < 0){//jika penumpang yang turun sampai negatif
            System.out.println("Tidak ada cukup penumpang untuk turun");//mencetak pesan tidak cukup penumpang turun   
        } else {
            currentPassengers -= count;// jumlah penumpang dalam kendaraan diupdate menjadi jumlah penumpang sebelumnya dikurang yang turun
            System.out.println(count+ " penumpang turun dari "+name);//mencetak pesan jumlah penumpang yang turun
        }
    }
    
    public void startJourney(){//method memulai perjalanan
        System.out.println(name+" memulai perjalanan di "+route);//mencetak pesan kendaraan memulai perjalanan dengan rute
    }
    
    public void stopJourney(){//method perjalanan berhenti
        System.out.println(name+" mencapai tujuan akhir dan berhenti");//mencetak pesan kendaraan mencapai tujuan akhir
    }
    
    public void calculateFare(){}//hitung tarif
    
    public int getCurrentPassengers(){//memanggil jumlah penumpang
        return currentPassengers;//mengembalikan nilai currentPassengers
    }
}

        
        /*int sisaKursi = capacity - currentPassengers;//sisaKursi untuk hitung sisa berapa yang muat untuk naik kendaraan(SAAT ADA 2 KALI ATAU LEBIH boardPassengers dipanggil di main)
        if (sisaKursi < count ){//jika kursi lebih sedikit dari yang ingin naik (melebihi kapasitas)
            System.out.println(sisaKursi+ "penumpang naik ke dalam "+name);
            currentPassengers=capacity;//jika sisa kursi yang ada sudah terisi semua berarti currentPassengers = capacity
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " +count+ " penumpang");//mencetak berapa yang tidak bisa naik menggunakan rumus (yang ingin naik(count)- yang menempati kursi sisa yg ada(sisaKursi))
        } else {
            currentPassengers += count;//
            System.out.println( count+ " penumpang naik ke dalam " +name);
        }*/
        //System.out.println("Total penumpang: "+currentPassengers);