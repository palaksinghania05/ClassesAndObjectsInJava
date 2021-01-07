package customclass;

import java.util.Scanner;

public class Rectangle {
    //Instance variable

    private int length;
    private int width;

    public static void main(String[] args) {
    Rectangle ob = new Rectangle();
        System.out.println("Length = "+ob.length);
        System.out.println("Width = "+ob.width);

        Scanner sc = new Scanner(System.in);
        ob.length = sc.nextInt();
        ob.width = sc.nextInt();

        System.out.println("Length = "+ob.length);
        System.out.println("Width = "+ob.width);
    }

    public int Area() {
        int response;
        response = length * width;
        return response;
    }

    public int Perimeter() {
        int response;
        response = 2 * (length + width);
        return response;
    }
}
