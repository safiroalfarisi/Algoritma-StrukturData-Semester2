package MergeSortTest;

public class MergeSortingMain27 {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        MergeSorting27 mSort = new MergeSorting27();
        System.out.println("data awal"); 
        mSort.printArr(data);
        mSort.mergeSort(data);
        System.out.println("");
        System.out.println("setelah diurutkan ");
        mSort.printArr(data);
    }
}