package Multithreading;

public class Demo3 {
    public static void main(String[] args) {
        Thread audioThread = new Thread(() -> playAudio());
        Thread videoThread = new Thread(() -> playVideo());
        audioThread.start();
        videoThread.start();
    }
    private static void playAudio() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Playing audio... " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Audio thread interrupted");
            }
        }
        System.out.println("Audio playback completed");
    }

    private static void playVideo() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Playing video... " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Video thread interrupted");
            }
        }
        System.out.println("Video playback completed");
    }
}
