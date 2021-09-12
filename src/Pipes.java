public class Pipes {
    int width;
    int height;
    int height2;
    public int x;
    public Pipes() {
        this.width = 50;
        this.height = (int) (Math.random() * (800 - 150) ) + 150;
        this.height2 = this.height - 275;
        this.x = 800 + this.width;
    }
    public void showPipes() {
        Main p = Main.instance;
        p.fill(0, 204, 0);
        p.rect(this.x, this.height, this.width, 1000);
        p.rect(this.x, this.height2, this.width, -10000);
    }

    public void updatePipe() {
        this.x -= 5;
    }
    public void hasClollided(Player player) {
        if (player.x <= this.x + this.width && player.x > this.x && (player.y > this.height ||  player.y < this.height2) ) {
          System.exit(0);
        }

    }
}
