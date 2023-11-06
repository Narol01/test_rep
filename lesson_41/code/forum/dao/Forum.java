package forum.dao;

import forum.model.Post;

import java.time.LocalDateTime;

public interface Forum {
    boolean addPost(Post post);
    boolean removePost(int postId);
    boolean updatePost(int postId ,String content);
    Post getPostById(int postId);
    Post[] getPostByAuthor(String author);
    Post[] getAllPostByAuthorBetweenDate(LocalDateTime date, LocalDateTime dateTo);
    int size();

    void  printArray();
}
