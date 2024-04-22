package Minggu4;

public class Sum {
    int elemen;
    double keuntungan[], total;
    Sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }
    double totalBF(double arr[]){
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l+r) /2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid+1,r);
            return Math.round((lsum + rsum) * 100.0) / 100.0;
        }
        return 0 ;
    }
}
