import java.awt.*;
import javax.swing.*;

public class GUI {
    public GUI() {
    }

    public static void main(String[] args) {
        String prompt = "Start";

        JFrame frame = new JFrame("Mads's GUI");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        JPanel PrgPanel = new JPanel();

        JPanel TopBar = new JPanel();


        JPanel Sliders = new JPanel();
        Sliders.setLayout(new GridLayout(0, 1));

        MySlider SliderRED = new MySlider(0, 255, "Red");
        Sliders.add(SliderRED);

        MySlider SliderGREEN = new MySlider(0, 255, "Green");
        Sliders.add(SliderGREEN);

        MySlider SliderBLUE = new MySlider(0, 255, "Blue");
        Sliders.add(SliderBLUE);


        JPanel CircleColor = new JPanel();
        CircleColor.setBorder(BorderFactory.createTitledBorder("Circle Color"));
        ColorBox cColor = new ColorBox(SliderRED, SliderGREEN, SliderBLUE);
        cColor.setPreferredSize(new Dimension(70, 30));
        CircleColor.add(cColor);

        JLabel ProgramName = new JLabel("Draw program", SwingConstants.CENTER);
        ProgramName.setBorder(BorderFactory.createTitledBorder(" "));


        JPanel CircleSize = new JPanel();
        SpinnerNumberModel snm = new SpinnerNumberModel(20, 10, 300, 10);
        JSpinner Radius = new JSpinner(snm);
        Radius.setPreferredSize(new Dimension(70, 30));
        CircleSize.add(Radius);
        CircleSize.setBorder(BorderFactory.createTitledBorder("Circle Size"));


        MyMenuBar MenuBar = new MyMenuBar(Radius, SliderRED, SliderGREEN, SliderBLUE);

        // Sets the layout of the top bar
        TopBar.setLayout(new BorderLayout());
        TopBar.add(CircleColor, BorderLayout.WEST);
        TopBar.add(ProgramName, BorderLayout.CENTER);
        TopBar.add(CircleSize, BorderLayout.EAST);


        JPanel ColorPanel = new JPanel();
        //ColorPanel.setPreferredSize(new Dimension(100, 0));
        ColorPanel.setLayout(new GridLayout(0, 1));
        JScrollPane ColorScroll = new JScrollPane(ColorPanel);


        MyButton ButtonBLACK = new MyButton(0, 0, 0, "Black", SliderRED, SliderGREEN, SliderBLUE);
        ColorPanel.add(ButtonBLACK);

        MyButton ButtonWHITE = new MyButton(255, 255, 255, "White", SliderRED, SliderGREEN, SliderBLUE);
        ColorPanel.add(ButtonWHITE);

        MyButton ButtonRED = new MyButton(255, 0, 0, "Red", SliderRED, SliderGREEN, SliderBLUE);
        ColorPanel.add(ButtonRED);

        MyButton ButtonGREEN = new MyButton(0, 255, 0, "Green", SliderRED, SliderGREEN, SliderBLUE);
        ColorPanel.add(ButtonGREEN);

        MyButton ButtonBLUE = new MyButton(0, 0, 255, "Blue", SliderRED, SliderGREEN, SliderBLUE);
        ColorPanel.add(ButtonBLUE);

        MyButton ButtonYELLOW = new MyButton(255, 255, 0, "Yellow", SliderRED, SliderGREEN, SliderBLUE);
        ColorPanel.add(ButtonYELLOW);

        MyButton ButtonMAGENTA = new MyButton(255, 0, 255, "Magenta", SliderRED, SliderGREEN, SliderBLUE);
        ColorPanel.add(ButtonMAGENTA);

        MyButton ButtonCYAN = new MyButton(0, 255, 255, "Cyan", SliderRED, SliderGREEN, SliderBLUE);
        ColorPanel.add(ButtonCYAN);

        for (int r = 0; r < 255; r += 10) {
            MyButton Color = new MyButton(r, 0, 0, "R: " + r, SliderRED, SliderGREEN, SliderBLUE);
            ColorPanel.add(Color);
        }

        for (int g = 0; g < 255; g += 10) {
            MyButton Color = new MyButton(0, g, 0, "G: " + g, SliderRED, SliderGREEN, SliderBLUE);
            ColorPanel.add(Color);
        }

        for (int b = 0; b < 255; b += 10) {
            MyButton Color = new MyButton(0, 0, b, "B: " + b, SliderRED, SliderGREEN, SliderBLUE);
            ColorPanel.add(Color);
        }

        for (int y = 0; y < 255; y += 10) {
            MyButton Color = new MyButton(y, y, 0, "Y: " + y, SliderRED, SliderGREEN, SliderBLUE);
            ColorPanel.add(Color);
        }

        for (int c = 0; c < 255; c += 10) {
            MyButton Color = new MyButton(0, c, c, "C: " + c, SliderRED, SliderGREEN, SliderBLUE);
            ColorPanel.add(Color);
        }

        for (int m = 0; m < 255; m += 10) {
            MyButton Color = new MyButton(m, 0, m, "M: " + m, SliderRED, SliderGREEN, SliderBLUE);
            ColorPanel.add(Color);
        }


        JTextPane Prompt = new JTextPane();

        MyCanvas Canvas = new MyCanvas(Prompt, Radius, SliderRED, SliderGREEN, SliderBLUE);


        Prompt.setText(prompt);

        JScrollPane TextScroll = new JScrollPane(Prompt);

        // Sets a border layout of the program panel
        PrgPanel.setLayout(new BorderLayout());
        PrgPanel.add(TopBar, BorderLayout.NORTH);
        PrgPanel.add(Sliders, BorderLayout.SOUTH);
        PrgPanel.add(ColorScroll, BorderLayout.EAST);
        PrgPanel.add(Canvas, BorderLayout.CENTER);

        JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, PrgPanel, TextScroll);

        splitpane.setDividerLocation(550);

        frame.add(splitpane);

        frame.setJMenuBar(MenuBar);
        frame.setVisible(true);
    }
}