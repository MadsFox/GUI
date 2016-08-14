import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class MyMenuBar extends JMenuBar {
    final MySlider SliderRED;
    final MySlider SliderGREEN;
    final MySlider SliderBLUE;
    final JSpinner Radius;


    public MyMenuBar (final JSpinner Radius, final MySlider SliderRED, final MySlider SliderGREEN, final MySlider SliderBLUE){
        this.SliderRED = SliderRED;
        this.SliderGREEN = SliderGREEN;
        this.SliderBLUE = SliderBLUE;
        this.Radius = Radius;


        JMenu MenuColor = new JMenu("Color");
        MenuColor.setMnemonic(KeyEvent.VK_C);
        MenuColor.getAccessibleContext().setAccessibleDescription("Chose a color for the circle");

        JMenuItem ColorWHITE= new JMenuItem("White", KeyEvent.VK_W);
        JMenuItem ColorBLACK = new JMenuItem("Black", KeyEvent.VK_B);
        JMenuItem ColorRED = new JMenuItem("Red", KeyEvent.VK_R);
        JMenuItem ColorGREEN = new JMenuItem("Green", KeyEvent.VK_G);
        JMenuItem ColorBLUE= new JMenuItem("Blue", KeyEvent.VK_L);
        JMenuItem ColorYELLOW = new JMenuItem("Yellow", KeyEvent.VK_Y);
        JMenuItem ColorMAGENTA = new JMenuItem("Magenta", KeyEvent.VK_M);
        JMenuItem ColorCYAN = new JMenuItem("Cyan", KeyEvent.VK_C);

        MenuColor.add(ColorWHITE);
        MenuColor.add(ColorBLACK);
        MenuColor.add(ColorRED);
        MenuColor.add(ColorGREEN);
        MenuColor.add(ColorBLUE);
        MenuColor.add(ColorYELLOW);
        MenuColor.add(ColorMAGENTA);
        MenuColor.add(ColorCYAN);

        add(MenuColor);

        JMenu MenuRadius = new JMenu("Radius");
        MenuRadius.setMnemonic(KeyEvent.VK_R);
        MenuRadius.getAccessibleContext().setAccessibleDescription("Chose a color for the circle");

        JMenuItem Size10 = new JMenuItem("10", KeyEvent.VK_1);
        JMenuItem Size20 = new JMenuItem("20", KeyEvent.VK_2);
        JMenuItem Size30 = new JMenuItem("30", KeyEvent.VK_3);
        JMenuItem Size40 = new JMenuItem("40", KeyEvent.VK_4);
        JMenuItem Size50 = new JMenuItem("50", KeyEvent.VK_5);
        JMenuItem Size60 = new JMenuItem("60", KeyEvent.VK_6);
        JMenuItem Size70 = new JMenuItem("70", KeyEvent.VK_7);

        MenuRadius.add(Size10);
        MenuRadius.add(Size20);
        MenuRadius.add(Size30);
        MenuRadius.add(Size40);
        MenuRadius.add(Size50);
        MenuRadius.add(Size60);
        MenuRadius.add(Size70);

        add(MenuRadius);

        ColorWHITE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SliderRED.Slider.setValue(255);
                SliderGREEN.Slider.setValue(255);
                SliderBLUE.Slider.setValue(255);
            }
        });

        ColorBLACK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SliderRED.Slider.setValue(0);
                SliderGREEN.Slider.setValue(0);
                SliderBLUE.Slider.setValue(0);
            }
        });

        ColorRED.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SliderRED.Slider.setValue(255);
                SliderGREEN.Slider.setValue(0);
                SliderBLUE.Slider.setValue(0);
            }
        });

        ColorGREEN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SliderRED.Slider.setValue(0);
                SliderGREEN.Slider.setValue(255);
                SliderBLUE.Slider.setValue(0);
            }
        });

        ColorBLUE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SliderRED.Slider.setValue(0);
                SliderGREEN.Slider.setValue(0);
                SliderBLUE.Slider.setValue(255);
            }
        });

        ColorYELLOW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SliderRED.Slider.setValue(255);
                SliderGREEN.Slider.setValue(255);
                SliderBLUE.Slider.setValue(0);
            }
        });

        ColorMAGENTA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SliderRED.Slider.setValue(255);
                SliderGREEN.Slider.setValue(0);
                SliderBLUE.Slider.setValue(255);
            }
        });

        ColorCYAN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SliderRED.Slider.setValue(0);
                SliderGREEN.Slider.setValue(255);
                SliderBLUE.Slider.setValue(255);
            }
        });

        Size10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Radius.getModel().setValue(10);
            }
        });

        Size20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Radius.getModel().setValue(20);
            }
        });

        Size30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Radius.getModel().setValue(30);
            }
        });

        Size40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Radius.getModel().setValue(40);
            }
        });

        Size50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Radius.getModel().setValue(50);
            }
        });

        Size60.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Radius.getModel().setValue(60);
            }
        });

        Size70.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Radius.getModel().setValue(70);
            }
        });
    }
}
