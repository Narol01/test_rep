public class Homework {
    public static void main(String[] args) {
        lesson();
        method1();
        method2();
        method3();
    }
    public static void method1(){
        stendup();
        System.out.println("My name is Oleg Petrovich and I am your teacher");
        System.out.println("Let's get acquainted");
        sitdown();
    }

    public static void method2(){
        stendup();
        System.out.println("My name is Vladislav");
        sitdown();
    }

    public static void method3(){
        stendup();
        System.out.println("My name is Roman and i came with my friends");
        friends();
        sitdown();
        lesson2();
    }
    public static void friends(){
        stendup();
        System.out.println("Hallo,my name is Nikita");
    }

    public static void stendup(){
        System.out.println("Got up from the chair");
    }
    public static void sitdown(){
        System.out.println("Sat on a chair");
    }
    public static void lesson(){
        System.out.println("Lesson started");
    }
    public static void lesson2(){
        System.out.println("Lesson end");
    }
}

