package mensajes.vista;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuAniadir extends JPanel {

	private static final long serialVersionUID = -5871082331159322418L;

	public MenuAniadir(List<JPanel> panels) {
		setBackground(new Color(51, 51, 51));
		setBounds(0, 0, 310, 680);
		setLayout(null);

		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.setForeground(new Color(255, 255, 255));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(104, 52, 102, 72);
		add(lblLogo);

		JButton btnAdmin = new JButton("Administration");
		btnAdmin.setBackground(new Color(255, 255, 255));
		btnAdmin.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		btnAdmin.setBounds(50, 150, 209, 40);
		
		add(btnAdmin);
	}
}
