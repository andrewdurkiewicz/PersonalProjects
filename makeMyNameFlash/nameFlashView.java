import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class nameFlashView
{
    private static final int FRAME_WIDTH  = 800;
	private static final int FRAME_HEIGHT = 400;
    public static void main(String[] args)
    {
        
        JFrame frame = new JFrame();
        JTextField getText = new gettext();
        JPanel newpanel = new nameFlash();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(newpanel);
        frame.add(getText);
        frame.setVisible(true);

    }
}