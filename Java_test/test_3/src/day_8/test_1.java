package day_8;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        Scanner run = new Scanner(System.in);
        System.out.print("中没中：");
        if (run.hasNext()) {
            String cip = run.next();
            switch (cip) {
                case "中":
                    System.out.println("买车");
                    break;
                case "没中":
                    System.out.println("接着买");
                    break;
                default:
                    System.out.println("输入错误！");
            }
        } else {
            System.out.println("输入错误！");
        }
    }
}
