public class Bookshelf {
    public static void main(String[] args) {
        Book one = new Book("Boy (Luke)", "Frank Herbert", "Lucas LTD", "18/03/2006");
        Book two = new Book("Child (Ty)", "Frank Herbert", "Lucas LTD", "18/03/2006");
        Book three = new Book("Man (Lucas)", "Frank Herbert", "Lucas LTD", "18/03/2006");

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
    }
}
