import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class ColorBox extends JPanel {
    final MySlider SliderRED;
    final MySlider SliderGREEN;
    final MySlider SliderBLUE;
    int red;
    int green;
    int blue;
    JPanel cBox;

    public ColorBox(final MySlider SliderRED, final MySlider SliderGREEN, final MySlider SliderBLUE){
        this.SliderRED = SliderRED;
        this.SliderGREEN = SliderGREEN;
        this.SliderBLUE = SliderBLUE;

        red = SliderRED.Slider.getValue();
        green = SliderGREEN.Slider.getValue();
        blue = SliderBLUE.Slider.getValue();

        cBox = new JPanel();
        cBox.setBackground(new Color(red, green, blue));

        //on slider change
        SliderRED.Slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                    red = SliderRED.Slider.getValue();
                repaint();
            }
        });
        //on slider change
        SliderGREEN.Slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                    green = SliderGREEN.Slider.getValue();
                               repaint();
            }
        });
        //on slider change
        SliderBLUE.Slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                    blue = SliderBLUE.Slider.getValue();
                repaint();
            }
        });
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(new Color(red, green, blue));

    }
}

