    package com.company;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            // write your code here
            int size;
            int[] array;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter a size: ");
                size = scanner.nextInt();
                if (size > 20)
                    System.out.println("Kích thước mảng không vượt quá 20");

            } while (size > 20);
            array = new int[size];
            int i = 0;
            while (i < array.length) {
                System.out.println("Enter element " + (i + 1) + " : ");
                array[i] = scanner.nextInt();
                i++;
            }
            System.out.print("Dữ liệu đã nhập là: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            int max = array[0];
            int index = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }
            System.out.println("Số lớn nhất là " + max + " , ở vị trí thứ " + index);

                }

            }


