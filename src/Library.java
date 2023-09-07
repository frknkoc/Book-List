import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookList = new ArrayList<>();
    public void addBook() {
        bookList.add(new Book(1, "Sefiller", 1463, "Victor Hugo", 1862));
        bookList.add(new Book(2, "Suç ve Ceza", 574, "Fyodor Dostoyevski", 1866));
        bookList.add(new Book(3, "1984", 328, "George Orwell", 1949));
        bookList.add(new Book(4, "Harry Potter ve Felsefe Taşı", 332, "J.K. Rowling", 1997));
        bookList.add(new Book(5, "Yüzüklerin Efendisi", 531, "J.R.R. Tolkien", 1954));
        bookList.add(new Book(6, "Savaş ve Barış", 1225, "Lev Tolstoy", 1869));
        bookList.add(new Book(7, "Jane Eyre", 610, "Charlotte Bronte", 1847));
        bookList.add(new Book(8, "Romeo ve Juliet", 128, "William Shakespeare", 1597));
        bookList.add(new Book(9, "Dönüşüm", 61, "Franz Kafka", 1915));
        bookList.add(new Book(10, "Moby Dick", 704, "Herman Melville", 1851));
    }

    public void showBookList(){
        System.out.println("\nBookList\n");
        String format = "%-5s | %-30s | %-20s | %-20s| %-10s%n";
        String header = String.format(format, "ID", "Kitap Adı", "Sayfa Sayısı", "Yazar Adı", "Basım Tarihi");
        System.out.println(header);
        bookList.stream().forEach(book -> System.out.println(String.format(format, book.getId(), book.getBookName(), book.getNumberOfPages(), book.getAuthorsName(), book.getPublicDate())));
    }


}
