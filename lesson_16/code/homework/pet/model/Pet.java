package homework.pet.model;

public class Pet {
    //поля класса
    private int id;
    private String kindOfAnimal;
    private int age;
    private String nickname;

    //конструктор

    public Pet(int id, String kindOfAnimal, int age, String nickname) {
        this.id = id;
        this.kindOfAnimal = kindOfAnimal;
        this.age = age;
        this.nickname = nickname;
    }
    //геттеры и сеттеры

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public void setKindOfAnimal(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
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
        System.out.println("ID: "+id+"\nNickname: "+nickname+"\nAge: "+age+"\nKind: "+kindOfAnimal);
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
