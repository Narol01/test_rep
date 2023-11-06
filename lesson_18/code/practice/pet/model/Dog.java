package practice.pet.model;

public class Dog  extends Pet {

    private String breed;
    private int growth;
    private int weight;

    public Dog( String kind, int age, String nickname, String breed, int growth, int weight) {
        super( kind, age, nickname);
        this.breed = breed;
        this.growth = growth;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void display() {
        System.out.println("Breed: "+breed+"\nGrowth: "+growth+"\nWeight: "+weight);

    }

    public void toTrain() {
        System.out.println(getNickname()+" trained");
    }

    public void bathed() {
        System.out.println(getNickname()+" bathed");
    }

    public void voice() {
        System.out.println("Гав-гав");
    }

}
