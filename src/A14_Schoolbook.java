public class A14_Schoolbook extends A14_Book {
    String subject;
    int grade;

    public A14_Schoolbook(
            String name,
            int quantityOfPages,
            int year,
            String author,
            String[] pages,
            String subject,
            int grade) {
        super(name, quantityOfPages, year, author, pages);
        this.subject = subject;
        this.grade = grade;
    }
}
