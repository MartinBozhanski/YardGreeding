import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double areaSum = area * 7.61;

        double discountSum = areaSum * 0.18;

        double finalPrice = areaSum - discountSum;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discountSum + " lv.");

    }
}
