package ru.buzmakov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "The Wind Cries Mary by Jimi Hendrix";
    }
}
