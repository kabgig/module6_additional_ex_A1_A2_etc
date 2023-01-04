public class A14_Fiction extends A14_Book {
    String genre;

    public A14_Fiction(String name,
                       int quantityOfPages,
                       int year,
                       String author,
                       String[] pages,
                       String genre) {
        super(name, quantityOfPages, year, author, pages);
        this.genre = genre;
    }
}
