import java.util.Scanner;
import java.util.ArrayList;
class Books{
    String bookTitle, bookAuthor, bookGenre,bookDueDate;
    String[][] defaultBooks;

    public Books() {
        this.bookTitle = "";
        this.bookAuthor = "";
        this.bookGenre = "";
        this.bookDueDate = "";
        this.defaultBooks = new String[][]{
                {"Don Quixote", "Miguel de Cervantes", "Fiction"},
                {"Alice's Adventures in Wonderland", "Lewis Carroll", "Fantasy"},
                {"The Adventures of Huckleberry Finn", "Mark Twain", "Adventure"},
                {"The Adventures of Tom Sawyer", "Mark Twain", "Adventure"},
                {"Treasure Island", "Robert Louis Stevenson", "Adventure"},
                {"Pride and Prejudice", "Jane Austen", "Romance"},
                {"Wuthering Heights", "Emily Brontë", "Gothic Fiction"},
                {"Jane Eyre", "Charlotte Brontë", "Gothic Fiction"},
                {"Moby Dick", "Herman Melville", "Adventure"},
                {"The Scarlet Letter", "Nathaniel Hawthorne", "Historical Fiction"},
                {"Gulliver's Travels", "Jonathan Swift", "Satire"},
                {"The Pilgrim's Progress", "John Bunyan", "Allegory"},
                {"A Christmas Carol", "Charles Dickens", "Fiction"},
                {"David Copperfield", "Charles Dickens", "Fiction"},
                {"A Tale of Two Cities", "Charles Dickens", "Historical Fiction"},
                {"Little Women", "Louisa May Alcott", "Coming-of-Age"},
                {"Great Expectations", "Charles Dickens", "Fiction"},
                {"The Hobbit, or, There and Back Again", "J.R.R. Tolkien", "Fantasy"},
                {"Frankenstein, or, the Modern Prometheus", "Mary Shelley", "Gothic Fiction"},
                {"Oliver Twist", "Charles Dickens", "Fiction"},
                {"Uncle Tom's Cabin", "Harriet Beecher Stowe", "Anti-Slavery Novel"},
                {"Crime and Punishment", "Fyodor Dostoyevsky", "Psychological Fiction"},
                {"Madame Bovary: Patterns of Provincial life", "Gustave Flaubert", "Realism"},
                {"The Return of the King", "J.R.R. Tolkien", "Fantasy"},
                {"Dracula", "Bram Stoker", "Gothic Fiction"},
                {"The Three Musketeers", "Alexandre Dumas", "Historical Adventure"},
                {"Brave New World", "Aldous Huxley", "Dystopian Fiction"},
                {"War and Peace", "Leo Tolstoy", "Historical Fiction"},
                {"To Kill a Mockingbird", "Harper Lee", "Southern Gothic"},
                {"The Wizard of Oz", "L. Frank Baum", "Fantasy"},
                {"Les Misérables", "Victor Hugo", "Historical Fiction"},
                {"The Secret Garden", "Frances Hodgson Burnett", "Children's Literature"},
                {"Animal Farm", "George Orwell", "Political Satire"},
                {"The Great Gatsby", "F. Scott Fitzgerald", "Fiction"},
                {"The Little Prince", "Antoine de Saint-Exupéry", "Children's Literature"},
                {"The Call of the Wild", "Jack London", "Adventure"},
                {"20,000 Leagues Under the Sea", "Jules Verne", "Adventure"},
                {"Anna Karenina", "Leo Tolstoy", "Realist Fiction"},
                {"The Wind in the Willows", "Kenneth Grahame", "Children's Literature"},
                {"The Picture of Dorian Gray", "Oscar Wilde", "Gothic Fiction"}
        };
    }
}
class Library{
    ArrayList<ArrayList<String>> libraryBooks = new ArrayList<ArrayList<String>>();


    void hi(){
        System.out.println("HI!!!!");
    }
}
class Records{
    String[] recordsOptions = {"Search Available Book/s", "Order Book/s", "Book-Cart", "Renew Book", "Checkout Book/s" };

}



class LibrarySystem{
    public static Books book = new Books();
    public static Library library = new Library();
    public static Records records = new Records();

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("\t \tLibrary System ver 1.");
        System.out.println("---------------------------------------");



    }
    static void initListBooks(){
        for(byte i = 0 ; i < book.defaultBooks.length; i++){

        }
    }
}