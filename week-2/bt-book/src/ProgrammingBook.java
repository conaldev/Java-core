public class ProgrammingBook extends Book {
    private String language;
    private boolean framework = false;

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, boolean framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String language, boolean framework) {
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isFramework() {
        return framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFramework(boolean framework) {
        this.framework = framework;
    }
}
