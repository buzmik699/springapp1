package ru.buzmakov.springcourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Music: " + musicPlayer.playMusic();
    }
}
