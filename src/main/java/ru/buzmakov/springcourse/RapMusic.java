package ru.buzmakov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {


    @Override
    public String getSong() {
        return "Wassup by A$AP Rocky";
    }
}
