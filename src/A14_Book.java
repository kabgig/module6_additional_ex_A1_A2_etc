public class A14_Book extends A14_PrintEdition {
    int quantityOfPages;
    int year;
    String author;
    String[] pages;

    public A14_Book(String name,
                    int quantityOfPages,
                    int year,
                    String author,
                    String[] pages) {
        super(name);
        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;
        this.pages = new String[quantityOfPages + 1];
        this.pages[0] = name + ", " + author;
        for (int i = 1; i < this.pages.length; i++) {
            this.pages[i] = pages[i - 1];
        }
    }

    public String getPage(int n) {
        return pages[n];
    }
}
