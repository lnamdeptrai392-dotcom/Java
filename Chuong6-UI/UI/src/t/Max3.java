
import java.awt.*;
import java.awt.event.*;

public class Max3 extends Frame implements ActionListener {

    TextField t1, t2, t3;
    Label result;
    Button btn;

    public Max3() {

        setLayout(new FlowLayout());

        add(new Label("Nhap a:"));
        t1 = new TextField(10);
        add(t1);

        add(new Label("Nhap b:"));
        t2 = new TextField(10);
        add(t2);

        add(new Label("Nhap c:"));
        t3 = new TextField(10);
        add(t3);

        btn = new Button("Tim Max");
        add(btn);

        result = new Label("Ket qua:");
        add(result);

        btn.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        int max = Math.max(a, Math.max(b,c));

        result.setText("Max = " + max);
    }

    public static void main(String[] args) {
        new Max3();
    }
}

