package ru.buzmakov.springcourse;

public class MusicPlayer {
    private Music music;
    public  MusicPlayer(Music music) {
        this.music = music;
    }
    public void getSong() {
        System.out.println("Now plaing: " + music.getSong());
    }
}
