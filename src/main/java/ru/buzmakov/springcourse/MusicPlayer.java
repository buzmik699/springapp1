package ru.buzmakov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;


    @Autowired
    public MusicPlayer(@Qualifier("rapMusic") Music music1, @Qualifier("rockMusic") Music music2,
                       @Qualifier("classicMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int random_int = random.nextInt(3);

        switch (genre) {
            case RAP -> System.out.println(music1.getSong().get(random_int));
            case ROCK -> System.out.println(music2.getSong().get(random_int));
            case CLASSICAL -> System.out.println(music3.getSong().get(random_int));
        }
    }


}
