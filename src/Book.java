public class Book extends PrintEdition{

    public Book(String name, int quantityOfPages, int year, String author, String[] pages) {
        super(name);
        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;
        this.pages = pages;
    }

    int quantityOfPages;
    int year;
    String author;
    String[] pages = new String[quantityOfPages + 1];

    //n-ый элемент — текст на n-ой странице


    //0 элемент — строка вида {название книги, автор} (например, "Капитанская дочка, Пушкин")


    public String getPage(int n){
        return pages[n];
    }

}
