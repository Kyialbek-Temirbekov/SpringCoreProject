package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements  Music {
    private static List<String> classicalMusicList = new ArrayList<>();
    static {
        classicalMusicList.add("Some classical Music");
        classicalMusicList.add("The best music ever");
        classicalMusicList.add("Fell like ...");
    }
    @Override
    public String getSong() {
        Random random = new Random();
        int i = random.nextInt(3);
        return classicalMusicList.get(i);
    }
}
