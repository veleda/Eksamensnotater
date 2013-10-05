import javax.swing.*;
import java.awt.*;

class Main {
	public static void main(String[] args) {
		new Eksempel();
	}
}

class Eksempel {
	Eksempel() {
		// Lager vinduet
		JFrame frame;
		frame = new JFrame("Testvindu");

		// Avslutt ved kryss i hjornet
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Setter px x px str
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
