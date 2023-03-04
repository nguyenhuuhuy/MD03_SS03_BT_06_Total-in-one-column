package Tinh_Tong_Cac_So_Mot_Cot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z, sum = 0;
        System.out.println("nhập số dòng: ");
        x = sc.nextInt();
        System.out.println("Nhập số cột:");
        y = sc.nextInt();
        int[][] list = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Ô thứ: [" + i + "][" + j + "] = ");
                list[i][j] = sc.nextInt();
            }
        }
        System.out.println("mảng vừa nhập");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(list[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("nhập vào cột cần cộng");
        z = sc.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j == z - 1) {
                    sum += list[i][j];
                }
            }
        }
        System.out.println("tổng cột " + z + ": " + sum);
    }
}
