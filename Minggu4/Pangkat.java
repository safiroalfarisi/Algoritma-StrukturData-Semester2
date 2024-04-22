package Minggu4;

public class Pangkat {
    public int nilai, pangkat;

    public Pangkat(int nilai, int pangkat) {
        this.nilai=nilai;
        this.pangkat=pangkat;
    }

    int pangkatBF(int nilai, int pangkat){
        int hasil = 1;
        for(int i=0; i<pangkat;i++){
            hasil *=nilai;
        }
        return hasil;
    }

    int pangkatDC(int nilai, int pangkat) {
        if (pangkat == 1) {
            return 1;
        } else {
            if (pangkat%2==1) {
                return (pangkatDC(nilai, pangkat/2)*pangkatDC(nilai, pangkat/2)*nilai);
            }else{
                return (pangkatDC(nilai, pangkat/2)*pangkatDC(nilai, pangkat/2));
            }
        }
    }
}
