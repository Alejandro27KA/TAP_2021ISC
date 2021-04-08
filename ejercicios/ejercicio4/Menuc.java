package ejercicios.ejercicio4;
import java.awt.*;
import java.awt.event.*;

public class Menuc extends Frame implements ActionListener {
    private Label lbl_msg;
    private TextArea txt_out;
    private Button btn_clear;
    private TextField txt_ini;
    private Button btn_aceptar;
    private Panel panel_central;
    private Panel panel_superior;
    private Panel panel_inferior;

    public Menuc() {
        initComponents();
    }

    public void initComponents() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // panel_superior = new Panel();
        // panel_central = new Panel();
        // panel_inferior = new Panel();
        // panel_central.setLayout(new BorderLayout());
        // panel_superior.setLayout(new BorderLayout());
        // panel_inferior.setLayout(new BorderLayout());
        txt_ini = new TextField();
        btn_aceptar = new Button("Aceptar");
        btn_clear = new Button("Limpiar");
        txt_out = new TextArea();
        lbl_msg = new Label("Introduzca el texto :");
        btn_aceptar.addActionListener(this);
        btn_clear.addActionListener(this);
        this.setLayout(new GridLayout(3,3));
        this.add(lbl_msg, 0, 0);
        this.add(txt_ini, 1, 1);
        this.add(btn_aceptar, 0, 2);
        this.add(txt_out, 0,1);
        this.add(btn_clear,2,2);
        this.setSize(400,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        
    }
    
    public static void main(String args[]){
        Menuc m = new Menuc();
    }

}