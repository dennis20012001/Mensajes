package mensajes.vista;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JPanel {

	private static final long serialVersionUID = -5871082331159322418L;

	public MenuPrincipal(List<JPanel> panels) {
		setBackground(new Color(51, 51, 51));
		setBounds(0, 0, 653, 417);
		setLayout(null);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(75, 97, 154, 28);
		add(btnCargar);
		
		JButton btnAniadir = new JButton("Añadir");
		btnAniadir.setBounds(75, 281, 154, 28);
		add(btnAniadir);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(378, 176, 178, 28);
		add(btnImprimir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(378, 97, 178, 28);
		add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ERROR);
			}
		});
		btnSalir.setBounds(461, 343, 95, 23);
		add(btnSalir);
	}
}