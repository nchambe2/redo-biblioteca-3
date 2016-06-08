import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Library {
    private List<Book> checkedInBooks;
    private List<Book> checkedOutBooks;
    private PrintStream printstream;
    private BufferedReader bufferedReader;

    public Library(List<Book> checkedInBooks, List<Book> checkedOutBooks, PrintStream printstream, BufferedReader bufferedReader) {

        this.checkedInBooks = checkedInBooks;
        this.checkedOutBooks = checkedOutBooks;
        this.printstream = printstream;
        this.bufferedReader = bufferedReader;
    }

    public void displayBookDetails() {
        printstream.println(list());
    }

    private String list() {
        String titleAuthorYearPublished = "";

        for (Book book : checkedInBooks) {
            titleAuthorYearPublished += book.details() + "\n";
        }

        return titleAuthorYearPublished;
    }


    public void checkout() {
        String bookToCheckout = getUserInput();

        for(Book book : checkedInBooks){
            if(book.getTitle().equals(bookToCheckout)) {
               checkedOutBooks.add(book);
               checkedInBooks.remove(book);
            }
        }
    }

    private String getUserInput() {
        try {
            return bufferedReader.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
