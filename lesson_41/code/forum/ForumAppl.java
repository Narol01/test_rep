package forum;

import forum.dao.Forum;
import forum.dao.ForumImpl;
import forum.model.Post;


import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class ForumAppl {
    public static void main(String[] args) {
        Forum forum;
        forum = new ForumImpl(5);
        Post[] posts;
        posts = new Post[4];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to ToDoList Menu");
        while (true) {
            MenuForum.printMenu();
            System.out.print("Choose an action: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    while (true) {
                        System.out.print("Input data");
                        System.out.print(" Input PostId:");
                        int postId = scanner.nextInt();
                        System.out.print(" Input title:");
                        String title = scanner.next();
                        System.out.print(" Input author:");
                        String author = scanner.next();
                        System.out.print(" Input content:");
                        String content = scanner.next();
                        int likes = random.nextInt(1, 100);
                        int c = random.nextInt(1, 30);
                        System.out.print("Likes:" + likes + "\n");
                        LocalDateTime LocalNow = LocalDateTime.now();
                        Post post1 = new Post(postId, title, author, content, LocalNow.minusDays(c), likes);
                        forum.addPost(post1);
                        forum.printArray();
                        System.out.println("Add more \n yes-to continue \n no-complete");
                        String a = scanner.next();
                        if (a.equals("no")) {
                            break;
                        }
                    }
                }
                case 2->{
                    System.out.println("Your documents: ");
                    forum.printArray();
                }
                case 3->{
                    System.out.println("You have " + forum.size() + " post.");
                }
                case 4->{
                    System.out.println("Exit the application.");
                    System.exit(0);
                }
                //раскопировать cases;
                default-> {
                    System.out.println("Wrong choice");
                }
            }
        }
    }
}
