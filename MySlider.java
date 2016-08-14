import javax.swing.*;
import java.awt.*;

public class MySlider extends JPanel {
    int MIN = 0;
    int MAX = 0;
    String n = "name";

    JLabel Name = new JLabel();
    JSlider Slider = new JSlider();

    public MySlider(int MIN, int MAX, String n)
    {
        this.n = n;
        this.MIN = MIN;
        this.MAX = MAX;


        this.setLayout(new BorderLayout());
        Name = new JLabel(n);
        Name.setPreferredSize(new Dimension(50,0));
        this.add(Name, BorderLayout.WEST);
        Slider = new JSlider(MIN, MAX);
        this.add(Slider, BorderLayout.CENTER);
    }
}
