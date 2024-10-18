package ru.buzmakov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    List<String> songs;

    public RapMusic() {
        songs = new ArrayList<>();
        songs.add("Wassup by A$AP Rocky");
        songs.add("My eyes by Travis Scott");
        songs.add("Niggers in Paris by Kanye West");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
