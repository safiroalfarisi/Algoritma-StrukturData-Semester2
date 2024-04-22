package Minggu5;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idx;

    void tambah (Hotel h){
        if (idx<rooms.length) {
            rooms[idx] = h;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!!");
        }
    }

    void tampil(){
        for(Hotel h : rooms){
            h.tampil();
            System.out.println("________________________");
        }
    }

    void selectionSortHarga() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idhMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idhMin].harga) {
                    idhMin = j;
                }
            }
            Hotel temp = rooms[idhMin];
            rooms[idhMin] = rooms[i];
            rooms[i] = temp;
        }
    }

    void bubbleSortRating(){
        for (int i =0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i; j++){
                if (rooms[j].bintang > rooms[j-1].bintang) {
                    Hotel tmp= rooms[j];
                    rooms[j]= rooms[j-1];
                    rooms[j-1]=tmp;
                }
            }
        }
    }

}
