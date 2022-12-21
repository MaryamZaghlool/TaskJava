package MyOnlineShop;

import java.util.Scanner;

abstract class Product {

    double price;
    String name;

    public abstract void setprice(double x);

    public abstract double getprice();

    public abstract void setname(String x);

}

class book extends Product {

    @Override
    public void setprice(double x) {
        price = x;
    }

    @Override
    public double getprice() {
        return price - 20;
    }

    @Override
    public void setname(String x) {
        name = x;
    }

}

class childrenbook extends book {

    @Override
    public double getprice() {
        return price - 10;
    }
}

public class MyOnlineShop {

    public static void main(String[] args) {
        double sum = 0;
        Scanner input = new Scanner(System.in);
        Product arr[] = new Product[3];
        arr[0] = new book();
        arr[1] = new childrenbook();
        arr[2] = new book();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of the book");
            String name = input.nextLine();
            arr[i].setname(name);
            System.out.println("Enter the price of the book");
            double price = input.nextInt();
            arr[i].setprice(price);
            sum += arr[i].getprice();
            input.nextLine();

        }
        System.out.println("The total price of books is : " + sum);
    }

}
