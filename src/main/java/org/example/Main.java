package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("携帯電話の番号を入力してください（ハイフン(-)含む）：");
    String telephoneNumber = scanner.nextLine();

    if(telephoneNumber.matches("^0[789]0-\\d{4}-\\d{4}$")){
      System.out.println("\n" + telephoneNumber + " は有効な携帯電話番号です。");
    }else {
      System.out.println("\n" + telephoneNumber + " は無効な携帯電話番号です。");
    }
  }
}