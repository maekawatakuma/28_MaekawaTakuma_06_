package com.company;

import java.util.Scanner;

public class coincase_main {
    public static void main(String[] args) {
        coincase coincase = new coincase();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i  < 6; i++){
            System.out.println("硬貨の種類を選んでください");
            String type = scanner.nextLine();
            System.out.println("硬貨の枚数を選んでください");
            String count = scanner.nextLine();
            coincase.addcoins(Integer.parseInt(type),Integer.parseInt(count));
        }
        System.out.println("500円は"+ coincase.GetCount(500) +"枚 100円は"+ coincase.GetCount(100)+
                "枚 50円は"+ coincase.GetCount(50) + "枚 10円は"+ coincase.GetCount(10) +
                "枚 5円は"+ coincase.GetCount(5) + "枚 1円は"+ coincase.GetCount(1) + "円");
        System.out.println("総額は" + coincase.GetAmount() + "円です");


    }
}
