import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIImpresion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIImpresion frame = new GUIImpresion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//holaaaaaaaaaaaaaaaaaaaa
	//pruebarama
	/**
	 * Create the frame.
	 */
	public GUIImpresion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMandar = new JButton("Mandar archivo a la cola de impresion");
		btnMandar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMandar.setBounds(29, 167, 249, 21);
		contentPane.add(btnMandar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src/IMPRESORA.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(102, 48, 205, 109);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Impresora Epson-L3250");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(102, 25, 205, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnImp = new JButton("Imprimir");
		btnImp.setBounds(288, 167, 91, 21);
		contentPane.add(btnImp);
		
		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.setBounds(288, 205, 91, 21);
		contentPane.add(btnVaciar);
		
		JButton btnVer = new JButton("Cola de impresion (pendientes)");
		btnVer.setBounds(29, 205, 249, 21);
		contentPane.add(btnVer);
	}
}
