public class SelectinSort {

    public static void main(String[] args) {
        int[] data = {5, 2, 4, 6, 1};

        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
