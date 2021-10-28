import processing.core.PApplet;
import processing.core.PVector;

    public class Main extends PApplet {
    Player player;
    Pipes pipe;
    Pipes pipe2;
    boolean SecondPipeShow = false;
    public static Main instance;
    public static int gravity = 1;

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        Main Sketch = new Main();
        PApplet.runSketch(processingArgs, Sketch);

    }
    public void settings() {
        size(800, 1100);
        player = new Player(200, 500);
        pipe = new Pipes();
        pipe2 = new Pipes();
        if (instance == null) {
            instance = this;
        }

    }
    public void draw() {
        Main p = Main.instance;

        p.background(135,206,250);
           if (pipe.x == 400) {
               SecondPipeShow = true;
           }
        if (pipe.x ==  -50) {
            pipe = new Pipes();

        }
        if (pipe2.x == -50) {
            pipe2 = new Pipes();
        }

        if (SecondPipeShow) {
            NEAT.score(pipe2);
            pipe2.updatePipe();
            pipe2.showPipes();
            pipe2.hasClollided(player);
        }

        pipe.updatePipe();
        pipe.showPipes();
        pipe.hasClollided(player);
        player.showBird();
        player.updateBird();
        NEAT.score(pipe);
    }
    public void keyPressed() {

        if (key == ' ') {
            player.jump();
        }
    }
}
