package Interface;
import java.util.ArrayList;
public class interfaceEx1 {
        public static void main(String[] args) {
        	 ArrayList<Playable> playableList = new ArrayList<>();
             playableList.add(new MusicPlayer());
             playableList.add(new VideoPlayer());
             for (Playable playable : playableList) {
                 playable.play();
                 playable.pause();
                 playable.stop();
                 System.out.println(); // Add an empty line for better readability
             }
         }
     }
     interface Playable {
     void play();
     void pause();
     void stop();
}
class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped.");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video is stopped.");
    }
}