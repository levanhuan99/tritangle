package tritacgle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap canh thu nhat ");
        double a=scanner.nextDouble();

        System.out.println("nhap canh thu hai ");
        double b=scanner.nextDouble();

        System.out.println("nhap canh thu ba ");
        double c=scanner.nextDouble();

        System.out.println("nhap mau sac ");
        String color=scanner.next();

        Tritacgle tritacgle=new Tritacgle(color,a,b,c);
        if (tritacgle.checkCondition(a,b,c)){
            System.out.println(tritacgle);
            System.out.println("area is "+tritacgle.getArea());
            System.out.println("perimeter is "+tritacgle.getPerimeter());
        }
        else System.out.println("3 canh ban nhap khong phu hop de tao len 1 tam giac");

    }
}
