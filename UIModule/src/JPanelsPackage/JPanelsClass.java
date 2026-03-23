package JPanelsPackage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JPanelsClass {
    static JPanel JPanelOne, JPanelTwo, JPanelThree, JPanelFour;

    public static JPanel CreateJPanelOne(){
        JPanelOne = new JPanel();
        Border JPanelOneBorder = BorderFactory.createTitledBorder("JPanel One");
        JPanelOne.setBorder(JPanelOneBorder);
        JPanelOne.setBackground(Color.RED);
        return JPanelOne;
    }

    public static JPanel CreateJPanelTwo(){
        JPanelTwo = new JPanel();
        Border JPanelTwoBorder = BorderFactory.createTitledBorder("JPanel Two");
        JPanelTwo.setBorder(JPanelTwoBorder);
        JPanelTwo.setBackground(Color.BLUE);
        return JPanelTwo;
    }

    public static JPanel CreateJPanelThree(){
        JPanelThree = new JPanel();
        Border JPanelThreeBorder = BorderFactory.createTitledBorder("JPanel Three");
        JPanelThree.setBorder(JPanelThreeBorder);
        JPanelThree.setBackground(Color.GREEN);
        return JPanelThree;
    }

    public static JPanel CreateJPanelFour(){
        JPanelFour = new JPanel();
        Border JPanelFourBorder = BorderFactory.createTitledBorder("JPanel Four");
        JPanelFour.setBorder(JPanelFourBorder);
        return JPanelFour;
    }
}
