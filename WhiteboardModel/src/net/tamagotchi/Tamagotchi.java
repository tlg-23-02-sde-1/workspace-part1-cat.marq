package net.tamagotchi;

public class Tamagotchi {
    // fields or instance variables
    public static final int MIN_HEALTH = 0;
    public static final int MAX_HEALTH = 100;
    public static final int MIN_AGE = 1;
    public static final int MAX_AGE = 25;

    public String breed;
    private int health= 100;
    private int age= 1;
    private CatPersonalityType personalityType = CatPersonalityType.valueOf("HAPPY");

    // constructors
    public Tamagotchi() {
        // No-op
    }

    public Tamagotchi(String breed) {
        setBreed(breed);
    }

    public Tamagotchi(String breed, int health, int age) {
        this(breed);
        setHealth(health);
        setAge(age);
    }

    public Tamagotchi(String breed, int health, int age, CatPersonalityType personalityType) {
        this(breed, health, age);
        setPersonalityType(personalityType);
    }

   // methods
   public void feed() {
        System.out.println("I fed the cat " );
    }

    public void play() {
        System.out.println("I play with the cat ");
    }

    public void nap() {
        System.out.println("The cat napped");
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= MIN_HEALTH && health <= MAX_HEALTH) {
            this.health = health;
        } else {
            System.out.println("HELP THE KITTY!! MEOW!!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            this.age = age;
        } else {
            System.out.println("**DEAD KITTY**");
        }
    }

    public CatPersonalityType getPersonalityType() {
        return personalityType;
    }

    public void setPersonalityType(CatPersonalityType personalityType) {
        this.personalityType = personalityType;
    }

    public String toString() {
        return "I am a " + this.breed + "\nMy health is " + this.health + "\nI am " + this.age + " years old." +
                ", personalityType=" + getPersonalityType();
    }

}