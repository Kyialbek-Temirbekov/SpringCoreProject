package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic classicalMusic,@Qualifier("rockMusic") RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicGenre musicGenre) {
        switch (musicGenre) {
            case ROCK: return "Playing: " + rockMusic.getSong();
            case CLASSICAL: return "Playing: " + classicalMusic.getSong();
            default: return null;
        }
    }
}
