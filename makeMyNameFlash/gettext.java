import javax.swing.JTextField;

public class gettext extends JTextField
{
    private JTextField text;
    public JTextField gettext()
    {
        text = new JTextField();
        text.setText("Andrew");
        return text;
    }

}