import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class STUDENTMA {
    private JTextField txtStname;
    private JTextField txtRl;
    private JTextField txtDM;
    private JTextField txtCM;
    private JTextField txtSM;
    private JTextField txtMM;
    private JTextField txtPM;
    private JTextField txtTM;
    private JTextField txtAVG;
    private JTextField txtGRADE;
    private JButton CALButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("STUDENTMA");
        frame.setContentPane((new STUDENTMA()).Main);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }

    public STUDENTMA() {
        this.$$$setupUI$$$();
        this.CALButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int DBMSmarks = Integer.parseInt(STUDENTMA.this.txtDM.getText());
                int CGmarks = Integer.parseInt(STUDENTMA.this.txtCM.getText());
                int PAmarks = Integer.parseInt(STUDENTMA.this.txtPM.getText());
                int SEmarks = Integer.parseInt(STUDENTMA.this.txtSM.getText());
                int M3marks = Integer.parseInt(STUDENTMA.this.txtMM.getText());
                int TOTAL = DBMSmarks + CGmarks + M3marks + SEmarks + PAmarks;
                STUDENTMA.this.txtTM.setText(String.valueOf(TOTAL));
                double avg = (double)(TOTAL / 5);
                STUDENTMA.this.txtAVG.setText(String.valueOf(avg));
                if (avg > 50.0D) {
                    STUDENTMA.this.txtGRADE.setText("PASS");
                } else {
                    STUDENTMA.this.txtGRADE.setText("Fail");
                }

            }
        });
    }
}