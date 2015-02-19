package mine.trek.installer;

import javax.swing.JFrame;

public class InstallerFrame {
	public static JFrame installerframe;
	public static boolean looping = true;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		installerframe = new JFrame("MineTrek Installer 1.0");
		installerframe.setLocationRelativeTo(null);
		installerframe.setContentPane(new InstallerPanel());
		installerframe.pack();
		installerframe.setVisible(true);
		installerframe.setResizable(false);
		installerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(looping){
			InstallerPanel.loop();
		}
	}

}
