package mine.trek.installer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import javax.swing.JOptionPane;

public class ActionListenerYes implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(InstallerPanel.box2.getSelectedItem().toString().contentEquals("1.8")){
		FileOutputStream fos;
		String appdata = System.getenv("appdata");
		try {
			URL website = new URL("https://www.dropbox.com/s/1ca43g5m0ass9x6/minetrek.txt?dl=1");
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			fos = new FileOutputStream(appdata + "/.minecraft/mods/minetrek.txt");
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Download failed!");
			System.exit(1);
		}
		JOptionPane.showMessageDialog(null, "Download succesfull!");
		System.exit(0);
		}else{
			
		}
	}

}
