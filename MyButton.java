import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MyButton extends JPanel {
    int red;
    int green;
    int blue;
    String name;

    MySlider SliderRED;
    MySlider SliderGREEN;
    MySlider SliderBLUE;

    public MyButton(final int red, final int green, final int blue, String name, final MySlider SliderRED, final MySlider SliderGREEN, final MySlider SliderBLUE) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
        this.SliderBLUE = SliderBLUE;
        this.SliderGREEN = SliderGREEN;
        this.SliderRED = SliderRED;

        JPanel Color = new JPanel();
        Color.setMinimumSize(new Dimension(60, 20));
        Color.setBackground(new Color(red, green, blue));

        JLabel Name = new JLabel(name);
        //Name.setPreferredSize(new Dimension(60,20));

        setLayout(new GridLayout(1, 2));

        //setPreferredSize(new Dimension(120,20));

        add(Name);
        add(Color);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SliderRED.Slider.setValue(red);
                SliderGREEN.Slider.setValue(green);
                SliderBLUE.Slider.setValue(blue);
            }
        });
    }
}