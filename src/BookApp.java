import java.text.NumberFormat;
import java.util.Scanner;

public class BookApp {
    public static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        b.setAuthor("Shakespeare");
        b.setTitle("Romeo and Juliet");
        b.setDescription("A tragic romance");
        b.setPrice(19.95);
        b.setInStock(true);

        b.getDisplayText();

        //////////////////////////
        System.out.print("\nEnter a number of desired books: ");
        int num = sc.nextInt();

        double totalCost = b.getBookPricing(num);
        System.out.println("Total cost: " + currency.format(totalCost));

    }
}
