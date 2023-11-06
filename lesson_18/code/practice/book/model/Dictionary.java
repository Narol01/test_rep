package practice.book.model;

public class Dictionary extends Book{

    private String type;
    private int wordCount;
    private boolean relevance;

    public Dictionary(String title, String author, int year, String ISBN, String type, int wordCount, boolean relevance) {
        super(title, author, year, ISBN);
        this.type = type;
        this.wordCount = wordCount;
        this.relevance = relevance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public boolean isRelevance() {
        return relevance;
    }

    public void setRelevance(boolean relevance) {
        this.relevance = relevance;
    }

    public void display() {
        System.out.println("Title: "+ getTitle()+"\nAuthor: "+getAuthor()+"\nYear of publication: "
                +getYear()+"\nUnique number - ISBN: "+getISBN()+"\nType of Dictionary: "+type+"\nPage count: "+wordCount+"\nRelevance: "+(relevance?"yes":"no"));
    }
}
