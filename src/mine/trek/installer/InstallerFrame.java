package mine.trek.installer;

import javax.swing.JFrame;

public class InstallerFrame {
//https://www.dropbox.com/s/3xo266hvx44lty2/minetrek-1.0.jar?dl=1
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
