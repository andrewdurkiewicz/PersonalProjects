import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.text.NumberFormat;

public class nameFlash extends JPanel
{
    //set up the panel
    private static final int FRAME_WIDTH  = 800;
	private static final int FRAME_HEIGHT = 400;
    private JPanel panel;
    private JTextField text;

    public JPanel nameFlash()
    {
        panel = new JPanel();
        text = new gettext();
        panel.add(text, BorderLayout.CENTER);
        return panel;


    }

}