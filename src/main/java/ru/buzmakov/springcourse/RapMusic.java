package ru.buzmakov.springcourse;

public class RapMusic implements Music {
    private RapMusic() {
        System.out.println("*constructor*");
    }

    public static RapMusic createRapMusic() {
        System.out.println("*factory method*");
        return new RapMusic();
    }

    private void doMyInit() {
        System.out.println("Initialization");
    }
    private void doMyDestroy() {
        System.out.println("Destruction");
    }

    @Override
    public String getSong() {
        return "Wassup by A$AP Rocky";
    }
}
