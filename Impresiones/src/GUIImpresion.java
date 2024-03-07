import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;

public class GUIImpresion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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

	/**
	 * Create the frame.
	 */
	public GUIImpresion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 282, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Mandar");
		btnNewButton.setBounds(10, 60, 97, 21);
		contentPane.add(btnNewButton);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(117, 60, 85, 21);
		contentPane.add(btnImprimir);
		
		JButton btnNewButton_1_1 = new JButton("Vaciar");
		btnNewButton_1_1.setBounds(212, 60, 80, 21);
		contentPane.add(btnNewButton_1_1);
		
		JList list = new JList();
		list.setBounds(315, 14, 298, 345);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("(Imagen impresora)");
		lblNewLabel.setBounds(10, 107, 282, 108);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Primero:");
		lblNewLabel_1.setBounds(10, 238, 97, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ultimo:");
		lblNewLabel_1_1.setBounds(10, 261, 97, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Pendientes:");
		lblNewLabel_1_1_1.setBounds(10, 284, 97, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Esta llena:");
		lblNewLabel_1_1_1_1.setBounds(10, 307, 97, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Esta vacía:");
		lblNewLabel_1_1_1_1_1.setBounds(10, 330, 97, 13);
		contentPane.add(lblNewLabel_1_1_1_1_1);
	}
}
