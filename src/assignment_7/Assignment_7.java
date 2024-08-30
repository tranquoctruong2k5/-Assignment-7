package assignment_7;

import java.util.Scanner;

public class Assignment_7 {

   public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("nhap so thu " + (i + 1) + " la :");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }
    public static void printData(float[] arrays) {
        System.out.println("//-------------------------//");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("so thu " + (i + 1) + " la :" + arrays[i]);
            System.out.println();
        }
    }
    public static float Max(float[] arr) {
        float max1, max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }
        return max2;
    }
    public static void deleteOddNumber(float[] arrays) {
        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                arrays[index] = arrays[i];
                index++;
            }
        }
        for (int i = index; i < arrays.length; i++) {
            arrays[i] = 0;
        }
        System.out.print("so chan trong mang : ");
        for (int i = 0; i < index; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu ");
        int num = scanner.nextInt();
        float[] arrays = new float[num];
        importData(arrays);
        printData(arrays);
        float max2 = Max(arrays);
        System.out.println("Gia tri thu 2 : " + max2);
        deleteOddNumber(arrays);
    }
}
