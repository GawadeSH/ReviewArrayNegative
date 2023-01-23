
public class ArrayNegative {
    public static void main(String[] args) {
        int temp;
        int a[] = {4, 2, 4, 1, -3, 4, -2, -1, 3};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (a[i] != 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }
}