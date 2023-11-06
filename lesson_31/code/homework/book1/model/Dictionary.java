package homework.book1.model;

public class Dictionary extends Book {

    private String type;
    private int wordCount;


    public Dictionary(String title, String author, int year, String ISBN, String type, int wordCount) {
        super(title, author, year, ISBN);
        this.type = type;
        this.wordCount = wordCount;

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

}
