import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        library.addBook();
        library.showBookList();

        boolean menuShow = true;
        while(menuShow){
            System.out.println("\nYeni kitap eklemek için 1'e tıklayınız...");
            System.out.println("Kitap silmek istiyorsanız 2'e tıklayınız...");
            System.out.println("Kitapları filtrelemek için 3'e tıklayınız...");
            System.out.println("Menüden çıkış yapmak için 0'a tıklayınız...");
            int selectCase = input.nextInt();
            switch (selectCase){
                case 1:
                    int a = library.bookList.size();
                    System.out.println("\nLütfen eklemek istediğiniz kitabın adını yazınız...");
                    String newBookName = input.next();
                    System.out.println("\nLütfen kitabın sayfa sayısını yazınız...");
                    int numberOfPages = input.nextInt();
                    System.out.println("\nLütfen kitabın yazarını yazınız...");
                    String authorsName = input.next();
                    System.out.println("\nLütfen kitabın basım yılını yazınız...");
                    int publicDate = input.nextInt();
                    library.bookList.add(new Book(a + 1 , newBookName, numberOfPages, authorsName, publicDate));
                    library.showBookList();
                    break;
                case 2: System.out.println("\nLütfen silmek istediğiniz telefonun numarasını yazınız...");
                    int selectBook = Integer.parseInt(input.next());
                    library.bookList.remove(selectBook - 1);
                    library.showBookList();
                    break;
                case 3: System.out.println("\nLütfen filtrelemek istediğiniz sayfa sayısını yazınız...");
                    int selectedBookPage = input.nextInt();
                    System.out.println("\n Aradığınız Kitap Sayfa sayısı : " + selectedBookPage);
                    System.out.println("\nBookList\n");
                    String format = "%-5s | %-30s | %-20s | %-20s| %-10s%n";
                    String header = String.format(format, "ID", "Kitap Adı", "Sayfa Sayısı", "Yazar Adı", "Basım Tarihi");
                    System.out.println(header);
                    library.bookList.stream().filter(i -> i.getNumberOfPages() > selectedBookPage).forEach(book ->
                    {
                        System.out.println(String.format(format, book.getId() , book.getBookName(), book.getNumberOfPages(), book.getAuthorsName(), book.getPublicDate()));
                    });
                    break;
                case 0:
                    menuShow = false;
                    break;
                default:
                    System.out.println("Lütfen girdiğiniz rakamı kontrol edip tekrar deneyiniz...");
            }
        }
    }
}