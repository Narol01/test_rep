package forum.dao;

import forum.model.Post;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ForumImpl implements Forum{

    static Comparator<Post> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return res != 0 ? res : Integer.compare(p1.getPostId(), p2.getPostId());
    };

    Post[] posts;

    int size;

    public ForumImpl(int capacity){
        posts=new Post[capacity];
    }

    @Override
    public boolean addPost(Post post) {
        if (post == null || size == posts.length || getPostById(post.getPostId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(posts, 0, size, post, comparator);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(posts, index, posts, index + 1, size - index);
        posts[index] = post;
        size++;
        return true;
    }

    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i].getPostId() == postId) {
                posts[i] = posts[size - 1];
                posts[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        Post post = getPostById( postId); // find content
        if(post == null) {
            return false;
        }
        post.setContent(content); // update content
        return true;
    }

    @Override
    public Post getPostById(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                return posts[i];
            }
        }
        return null;
    }

    @Override
    public Post[] getPostByAuthor(String author) {
        return findPredicate(p -> author == (p.getAuthor()));
    }

    private Post[] findPredicate(Predicate<Post> predicate) {
        Post[] res = new Post[size];
        int j = 0; // счетчик найденых фото в альбоме
        for (int i = 0; i < size; i++) {
            if (predicate.test(posts[i])) {
                res[j] = posts[i];
                j++;
            }
        }
        return Arrays.copyOf(res, j);
    }

    @Override
    public Post[] getAllPostByAuthorBetweenDate(LocalDateTime date, LocalDateTime dateTo) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getDate().isAfter(date) && posts[i].getDate().isBefore(dateTo)) {
                c++;
            }
        }
        Post[] doc = new Post[c];
        for (int i = 0, j = 0; j < c; i++) {
            if (posts[i].getDate().isAfter(date) && posts[i].getDate().isBefore(dateTo)) {
                doc[j++] = posts[i];
            }
        }
        return doc;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printArray() {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null) {
                System.out.println(posts[i]);
            }
        }

    }
}
