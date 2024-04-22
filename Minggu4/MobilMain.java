package Minggu4;

    public class MobilMain {
        public static void main(String[] args) {
    
            Mobil[] dataMobil = {
                    new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
                    new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
                    new Mobil("Nissan", "370Z", 2009, 4360, 657),
                    new Mobil("Subaru", "BRZ", 2014, 4058, 609),
                    new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                    new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
                    new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
                    new Mobil("Volkswagen", "Golf GTI", 2014, 4108, 631)
            };
    
            double akselerasiMax = Mobil.cariAkselerasiMax(dataMobil, 0, dataMobil.length - 1);
            System.out.println("a) Top Acceleration Tertinggi menggunakan Divide and Conquer: " + akselerasiMax);

            double akselerasimin = Mobil.cariAkselerasiMin(dataMobil, 0, dataMobil.length - 1);
            System.out.println("b) Top Acceleration Terendah menggunakan Divide and Conquer: " + akselerasimin);

            double rataRataPower = Mobil.hitungRataRataTopPower(dataMobil);
            System.out.println("c) Rata-rata Top Power dari seluruh mobil menggunakan Brute Force: " + rataRataPower);
        }
}
