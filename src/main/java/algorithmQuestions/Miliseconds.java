public class Miliseconds {
    public static void main(String[] args) {

        long milliseconds = 366006456;

        int seconds = (int) (milliseconds / 1000) % 60 ;

        int minutes = (int) ((milliseconds / (1000*60)) % 60);

        int hours   = (int) ((milliseconds / (1000*60*60)) % 24);

        System.out.println(milliseconds + " Milliseconds = " + hours + " Hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
