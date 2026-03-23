import javax.swing.*;
import java.awt.*;
import JPanelsPackage.JPanelsClass;

public class BorderLayoutExample {
    JFrame BorderFrame;
    JMenuBar BorderMenuBar;
    JMenu BorderJMenuOne, BorderJMenuTwo;
    JPanelsClass JP =  new JPanelsClass();
    public BorderLayoutExample() {
        this.CreateJFrameBorderLayout();
    }

    public void CreateJFrameBorderLayout(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        BorderFrame = new JFrame("BorderLayout Example");
        BorderFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        BorderFrame.setLayout(new GridLayout(1, 4));
        BorderFrame.setJMenuBar(this.CreateJMenuBar());
        BorderFrame.add(JPanelsClass.CreateJPanelOne());
        BorderFrame.add(JPanelsClass.CreateJPanelTwo());
        BorderFrame.add(JPanelsClass.CreateJPanelThree());
//        BorderFrame.add(JPanelsClass.CreateJPanelFour());

        BorderFrame.setVisible(true);
    }

    public JMenuBar CreateJMenuBar(){
        BorderMenuBar = new JMenuBar();
        BorderMenuBar.add(this.CreateJMenuOne());
        return BorderMenuBar;
    }

    public JMenu CreateJMenuOne(){
        BorderJMenuOne = new JMenu("Menu One");
        return BorderJMenuOne;
    }

    public JMenu CreateJMenuTwo(){
        BorderJMenuTwo = new JMenu("Menu One");
        return BorderJMenuTwo;
    }
}
