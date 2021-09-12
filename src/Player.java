import processing.core.PApplet;

public class Player extends PApplet {
    int x ;
    int y ;
    int fall;
    public Player(int x , int y) {
        this.x = x;
        this.y = y;
        this.fall = -20;


    }
    public void showBird() {
        Main p = Main.instance;
        p.noStroke();
        p.fill(255,255,0);
        p.ellipse(x, y, 30, 30);
    }
    public void updateBird() {


        this.fall += Main.gravity;
        this.y += fall;
        if (this.y < 0) {
            this.y = 0;
        }
        if (this.y > 1100) {
            System.exit(0);
        }
    }
    public  void jump() {
        if (this.fall > 0) {
            this.fall = -20;

        }

    }

}
