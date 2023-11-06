package practice.pet.model;

public class Pet {
    //поля класса
    private String kind;
    private int age;
    private String nickname;

    //конструктор

    public Pet( String kindOfAnimal, int age, String nickname) {
        this.kind = kindOfAnimal;
        this.age = age;
        this.nickname = nickname;
    }
    //геттеры и сеттеры

    public String getKindOfAnimal() {
        return kind;
    }

    public void setKindOfAnimal(String kindOfAnimal) {
        this.kind = kindOfAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void display() {
        System.out.println("Nickname: "+nickname+"\nAge: "+age+"\nKind: "+kind);
    }

    public void play() {
        System.out.println(nickname+" playing");
    }
    public void sleep() {
        System.out.println(nickname+" The pet slept");
    }
    public void eating() {
        System.out.println(nickname+" The pet ate well");
    }
    public void walk() {
        System.out.println(nickname+" The pet went for a walk");
    }
    public void makeASound() {
        System.out.println(nickname+" making a sound");
    }
    public static void split(){
        System.out.println("-------------------------------");
    }

}
