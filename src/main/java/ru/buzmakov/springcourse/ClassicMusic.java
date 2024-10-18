package ru.buzmakov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {
    List<String> songs;

    public ClassicMusic() {
        songs = new ArrayList<>();
        songs.add("RHAPSODY IN BLUE by GEORGE GERSHWIN");
        songs.add("Fanfare by Also Sprach Zarathustra");
        songs.add("Mozart's Houset by Clean Bandit");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
