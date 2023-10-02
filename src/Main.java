import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task1
        int [] num = new int[]{1, 2, 3};
        double [] arr = {1.57, 7.654, 9.986};
        int [] mass = {1, 4, 6, 7, 9};

        //Task2
        System.out.print(num[0] + ", " + num[1] + ", " + num[2]);
        System.out.println();
        System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println();
        System.out.print(mass[0] + ", " + mass[1] + ", " + mass[2] + ", " + mass[3]);
        System.out.println();

        //Task3
        System.out.print(num[2] + ", " + num[1] + ", " + num[0]);
        System.out.println();
        System.out.print(arr[2] + ", " + arr[1] + ", " + arr[0]);
        System.out.println();
        System.out.print(mass[3] + ", " + mass[2] + ", " + mass[1] + ", " + mass[0]);
        System.out.println();

        //Task4
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i]++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}