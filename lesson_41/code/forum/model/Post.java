package forum.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Post {
    int postId;
    String title;
    String author;
    String content;
    LocalDateTime date;
    int likes;

    public Post(int postId, String title, String author, String content, LocalDateTime date, int likes) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
        this.date = date;
        this.likes = likes;
    }

    public int getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getLikes() {
        return likes;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    int addLIke(){
        return likes++;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", likes=" + likes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return postId == post.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
    }
}
