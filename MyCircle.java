import java.awt.*;

public class MyCircle {
    float x = 0;
    float y = 0;
    int r = 0;
    int red = 0;
    int green = 0;
    int blue = 0;
    Color color;

    public MyCircle(float x, float y, int r, int red, int green, int blue) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.red = red;
        this.green = green;
        this.blue = blue;
        color = mkcolor(red, green, blue);
    }

    void draw(Graphics g) {
        g.setColor(mkcolor(red, green, blue));
        g.fillOval((int) x-r/2, (int) y-r/2, (int) r, (int) r);

    }

    static Color mkcolor(int r, int g, int b) {
        return new Color(r, g, b);
    }
    public String toString(){
        return ">> x:" + x + " y:" + y + " r:" + r + " red:" + red + " green:" + green + " blue:" + blue;
    }
}