package ru.buzmakov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RapMusic rapMusic = context.getBean("musicBean", RapMusic.class);
        System.out.println(rapMusic.getSong());
        RapMusic rapMusic1 = context.getBean("musicBean", RapMusic.class);
        context.close();
    }
}
