package ru.buzmakov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private RapMusic rapMusic;
    private RockMusic rockMusic;




    @Autowired
    public MusicPlayer(RapMusic rapMusic, RockMusic rockMusic) {
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Now playing: " + rockMusic.getSong();
    }
}
