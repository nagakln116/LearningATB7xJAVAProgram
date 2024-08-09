package jul.ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the browser name :");
        String browser_name = sc.next();
        switch (browser_name) {
            case "edge":
                System.out.println("start edge");
                break;
            case "chrome":
                System.out.println("start chrome");
                break;
            case "firefox":
                System.out.println("start firefox");
                break;
            default:
                System.out.println("Please enter one of edge/chrome/firefox");

        }

    }
}
