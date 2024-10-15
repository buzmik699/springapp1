package ru.buzmakov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer2.setVolume(96); musicPlayer2.setName("MP2");
        musicPlayer1.setVolume(19); musicPlayer1.setName("MP1");
        musicPlayer1.playMusic();
        System.out.println("____________");
        musicPlayer2.playMusic();
    }
}
