// Lager en knapp
JButton btn = new JButton("Hi");

// Legger til denne i vinduet
getContentPane().add(btn);

// Sier hva som skal lytte pa knappen etter trykk.
btn.addActionListener(btnListen);

/* Action Listener */
btnListen = new Listen();
btn.addActionListener(btnListen);

class Listen implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Someone pushed me!");
	}
}
