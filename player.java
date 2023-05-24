import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class player {
    private List<File> songs;
    private int currentSongIndex;
    private Clip clip;

    public player() {
        songs = new ArrayList<>();
        currentSongIndex = 0;
    }

    public void addSong(File song) {
        songs.add(song);
    }

    public void play() {
        try {
            if (clip != null) {
                clip.stop();
                clip.close();
            }

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(songs.get(currentSongIndex));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        if (clip != null) {
            clip.stop();
        }
    }

    public void resume() {
        if (clip != null) {
            clip.start();
        }
    }

    public void next() {
        currentSongIndex = (currentSongIndex + 1) % songs.size();
        play();
    }

    public void previous() {
        currentSongIndex = (currentSongIndex - 1 + songs.size()) % songs.size();
        play();
    }
}

