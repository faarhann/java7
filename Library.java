import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<Book>();

    }

    public void addBook(Book newBook){
        books.add(new Book(newBook.title(), newBook.publisher(), newBook.year()));
    }

    public void printBooks(){
        for (Book book: books){
            System.out.println(book.toString());
        }

    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> t = new ArrayList<Book>();
        for (Book book: books){
            if (StringUtils.included(book.title(), title)){
                t.add(book);
            }
        }
        return t;



    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book: books){
            if (StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book: books){
            if (book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}
