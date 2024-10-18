package ru.buzmakov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs;

    public RockMusic() {
        songs = new ArrayList<>();
        songs.add("Eye of the Tiger by Survivor");
        songs.add("Smells Like Teen Spirit by Nirvana");
        songs.add("Alive by Pearl Jam");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
