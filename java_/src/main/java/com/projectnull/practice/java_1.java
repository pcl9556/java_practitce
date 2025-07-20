package com.projectnull.practice;

import java.util.Scanner;

public class java_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 10 사이의 정수를 입력하세요: ");
        int num = sc.nextInt();

        // 유효성 검사
        if (num < 1 || num > 10) {
            System.out.println("1부터 10 사이의 숫자만 입력해주세요.");
            return;
        }

        // 홀수만 골라서 구구단 출력
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {  // 홀수일 경우
                System.out.println("== " + i + "단 ==");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println(); // 단 사이 간격
            }
        }

        //====================

        int n = 5; // 총 줄 수

        for (int i = 1; i <= n; i++) {
            // 공백......어렵......
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int s = 1; s <= (2 * i - 1); s++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        //========================

        System.out.println("1. 불고기버거");
        System.out.println("2. 치즈버거");
        System.out.println("3. 새우버거");
        System.out.println("4. 감자튀김");
        System.out.println("5. 콜라");

        System.out.print("번호를 입력하세요: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("불고기버거를 선택하셨습니다.");
                break;
            case 2:
                System.out.println("치즈버거를 선택하셨습니다.");
                break;
            case 3:
                System.out.println("새우버거를 선택하셨습니다.");
                break;
            case 4:
                System.out.println("감자튀김을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("콜라를 선택하셨습니다.");
                break;
            default:
                System.out.println("올바른 번호를 입력해주세요. (1~5)");
        }

        //==========================

        System.out.print("정수를 한 개 입력해주세요 : ");
        int num2 = sc.nextInt();

        // 약수 출력 및 개수 세기
        int count = 0;  // 약수 저장
        System.out.print("\n" + num2 + "의 약수는 ");

        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        // 약수 개수 출력
        System.out.println("이고,");
        System.out.println("약수의 개수는 " + count + "개입니다.");

        // 소수 판별 (약수가 1과 자기 자신뿐이면)
        if (count == 2) {
            System.out.println("소수입니다.");
        }

    }
}
