package mensajes.vista;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;

public class Paneles extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;

	private List<JPanel> panels = null;

	public void run() {
		try {
			Paneles frame = new Paneles();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Paneles() {

		panels = new ArrayList<JPanel>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 436);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(51, 51, 51));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		// 0
		MenuPrincipal menuPrincipal = new MenuPrincipal(panels);
		menuPrincipal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		menuPrincipal.setBackground(new Color(192, 192, 192));
		menuPrincipal.setForeground(new Color(0, 0, 0));
		menuPrincipal.setVisible(true);
		contentPanel.add(menuPrincipal);
		panels.add(menuPrincipal);

		// 1
		MenuAniadir menuAniadir = new MenuAniadir(panels);
		menuAniadir.setVisible(false);
		contentPanel.add(menuAniadir);
		panels.add(menuAniadir);

		// 2
		MenuImprimir menuImprimir = new MenuImprimir(panels);
		menuImprimir.setVisible(false);
		contentPanel.add(menuImprimir);
		panels.add(menuImprimir);
	}

}
