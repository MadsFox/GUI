import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MyCanvas extends JPanel {
    int x;
    int y;

    final JTextPane Prompt;
    String prompt = "Start\r";

    MySlider SliderRED;
    MySlider SliderGREEN;
    MySlider SliderBLUE;
    JSpinner Radius;
    ArrayList<MyCircle> myCircles = new ArrayList<MyCircle>();
    MyCircle Circle;

    public MyCanvas(final JTextPane Prompt, final JSpinner Radius, final MySlider SliderRED, final MySlider SliderGREEN, final MySlider SliderBLUE) {
        this.SliderRED = SliderRED;
        this.SliderGREEN = SliderGREEN;
        this.SliderBLUE = SliderBLUE;
        this.Radius = Radius;
        this.Prompt = Prompt;

        //on mouse click
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {


                if (e.getX() == 230 && e.getY() == 480){
                    easterEgg(e.getX(), e.getY(), (Integer)Radius.getModel().getValue(), 100);

                }

                System.out.println(Radius.getModel().getValue());

                Circle = new MyCircle(
                        e.getX(),
                        e.getY(),
                        (Integer) Radius.getModel().getValue(),
                        SliderRED.Slider.getValue(),
                        SliderGREEN.Slider.getValue(),
                        SliderBLUE.Slider.getValue());

                prompt += Circle.toString()+"\n";

                myCircles.add(Circle);

                System.out.println(
                        ">> " + Radius.getModel().getValue() +
                                " " + SliderRED.Slider.getValue() +
                                ":" + SliderGREEN.Slider.getValue() +
                                ":" + SliderBLUE.Slider.getValue());


                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < myCircles.size(); i++) {
            myCircles.get(i).draw(g);
        }
        Prompt.setText(prompt);
    }

    public void easterEgg(int x, int y, int r, int i){
        if (i > 0) {
            Circle = new MyCircle(x, y, 20, 0, 0, 0);
            myCircles.add(Circle);
            repaint();
            easterEgg(x - r/4, y-5, r, --i);
        }
    }

}
