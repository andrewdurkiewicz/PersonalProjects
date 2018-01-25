import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class nameFlashView
{
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