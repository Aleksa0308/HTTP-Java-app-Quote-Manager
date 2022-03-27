package service.json;

public class Qod {
    private String Author;
    private String Quote;

    public Qod(String author, String quote) {
        Author = author;
        Quote = quote;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getQuote() {
        return Quote;
    }

    public void setQuote(String quote) {
        Quote = quote;
    }
}
