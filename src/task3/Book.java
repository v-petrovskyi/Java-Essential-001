package task3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Content content= new Content();
        Title title = new Title();

        author.setAuthor("Stephen King");
        content.setContent("horror novel");
        title.setTitle("Carrie");

        author.show();
        content.show();
        title.show();
    }
}
