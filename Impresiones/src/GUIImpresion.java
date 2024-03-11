import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIImpresion extends JFrame {

	private JPanel contentPane;
	int opcion = 0;
	int nodo_info = 0;
	Cola cola = new Cola();// objeto y contadores para el nodo
	
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
				nodo_info=Integer.parseInt(JOptionPane.showInputDialog
						(null, "Ingrese el n. de archivo a imprimir:\n\n"
								+ "1.Horario\n"
								+ "2.Facturas\n"
								+ "3.Presupuesto\n"
								+ "4.Catalogo\n"
								+ "5.Ventas\n"
								+ "6.Etiquetas\n"
								+ "7.Volantes\n"));
				cola.Insertar(nodo_info);
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
		btnImp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!cola.ColaVacia()) {
					JOptionPane.showMessageDialog(null, "Se imprimio el archivo numero: "
							+ cola.Extraer());
				}else {
					JOptionPane.showMessageDialog(null, "Todos los archivos se imprimieron correctamente");
				}
			}
		});
		btnImp.setBounds(288, 167, 91, 21);
		contentPane.add(btnImp);
		
		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cola.VaciarCola(nodo_info);
			}
		});
		btnVaciar.setBounds(288, 205, 91, 21);
		contentPane.add(btnVaciar);
		
		JButton btnVer = new JButton("Cola de impresion (pendientes)");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!cola.ColaVacia()) {
					cola.MostrarCola();
				}else {
					JOptionPane.showMessageDialog(null, "No hay impresiones pendientes");
				}
			}
		});
		btnVer.setBounds(29, 205, 249, 21);
		contentPane.add(btnVer);
	}
}
