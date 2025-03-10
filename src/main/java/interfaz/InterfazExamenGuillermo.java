package interfaz;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfazExamenGuillermo {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfazExamenGuillermo window = new InterfazExamenGuillermo();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public InterfazExamenGuillermo() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("Examen Guillermo");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centrar la ventana
        
        // Crear botón
        JButton btnMensaje = new JButton("Haz clic aquí");
        btnMensaje.setBounds(150, 100, 150, 50);
        
        // Acción al hacer clic
        btnMensaje.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Examen Guillermo"));

        // Agregar el botón al frame
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(btnMensaje);
    }
}
