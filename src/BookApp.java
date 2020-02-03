public class BookApp {
    public static void main(String[] args) {
        Book b = new Book();

        b.setAuthor("Shakespeare");
        b.setTitle("Romeo and Juliet");
        b.setDescription("A tragic romance");
        b.setPrice(19.95);
        b.setInStock(false);

        b.getDisplayText();

    }
}
