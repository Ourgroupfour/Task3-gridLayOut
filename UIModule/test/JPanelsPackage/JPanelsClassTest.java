package JPanelsPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JPanelsClassTest {

    @Test
    void testPanelsAreNotNull() {
        assertNotNull(JPanelsClass.CreateJPanelOne(), "JPanel One should not be null");
        assertNotNull(JPanelsClass.CreateJPanelTwo(), "JPanel Two should not be null");
        assertNotNull(JPanelsClass.CreateJPanelThree(), "JPanel Three should not be null");
        assertNotNull(JPanelsClass.CreateJPanelFour(), "JPanel Four should not be null");
    }
}