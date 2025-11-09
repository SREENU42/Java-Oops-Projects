

// Concepts: Polymorphism + interface usage (extra edge for interviews)
// Create interface Playable with play().
// Classes implementing it:
// AudioPlayer
// VideoPlayer
// LiveStreamPlayer
// When calling play(), output style should differ.
// Main:// Pass different player objects into a method that accepts Playable.
// Interview Focus: polymorphism using interfaces.
interface Playable{
    void play();
}
class AudioPlayer implements Playable{
    public void play(){
        System.out.println("Audio is Playing..............");
    }
}
class VideoPlayer implements Playable{
    public void play(){
        System.out.println("Video is Playing.............");
    }
}
class LiveStreamPlayer implements Playable{
    public void play(){
        System.out.println("Live is Streaming............");
    }
}


public class MediaPlayerSystem {

    static void startPlaying(Playable playable){
        playable.play();
    }
    public static void main(String[] args) {
        Playable audio=new AudioPlayer();
        Playable video=new VideoPlayer();
        Playable live=new LiveStreamPlayer();

        startPlaying(audio);
        startPlaying(video);
        startPlaying(live);
    }
}
