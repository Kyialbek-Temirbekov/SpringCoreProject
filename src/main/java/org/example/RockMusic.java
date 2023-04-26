package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private static List<String> rockMusicList = new ArrayList<>();
    static {
        rockMusicList.add("Wind cries Marry");
        rockMusicList.add("Some rock music");
        rockMusicList.add("Best Rock");
    }
    @Override
    public String getSong() {
        Random random = new Random();
        int i = random.nextInt(3);
        return rockMusicList.get(i);
    }
}
