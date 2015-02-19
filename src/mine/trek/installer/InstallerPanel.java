package mine.trek.installer;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;

public class InstallerPanel extends JPanel {
	//public static JProgressBar bar;
	public static JPasswordField field;
	public static JCheckBox box3;
	public static JComboBox box2;
	public static List<JComponent> componentList = new ArrayList<JComponent>();
	public static String[] minecraftVersions = { "1.8" };
	public static int scrollbarOldPos = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = -6154261330956502643L;

	public InstallerPanel(){
		super();
		this.setPreferredSize(new Dimension(300,240));
		setFocusable(true);
		requestFocus();
	    JLabel textLabel = new JLabel("  Install MineTrek mod", 0); textLabel.setPreferredSize(new Dimension(250, 10));
	    textLabel.setFont(new Font("Arial", 1, 14));
		JButton buttonYes;
		buttonYes = new JButton("Install");
		this.add(textLabel);
		componentList.add(textLabel);
		this.add(buttonYes);
		componentList.add(buttonYes);
		JButton buttonNo;
		buttonNo = new JButton("Cancel");
		this.add(buttonNo);
		componentList.add(buttonNo);
		buttonNo.addActionListener(new ActionListenerNo());
		buttonYes.addActionListener(new ActionListenerYes());
		JCheckBox box = new JCheckBox("Use beta build");
		this.add(box);
		componentList.add(box);
		box.setEnabled(false);
		box.setSelected(true);
		/*bar = new JProgressBar();
		this.add(bar);
		bar.setMinimum(0);
		bar.setMaximum(100);
		bar.setValue(0);*/
		/*JRadioButton botttom = new JRadioButton("lol");
		this.add(botttom);*/
	    JLabel minecraftversionTextLabel = new JLabel("Select Minecraft Version:", 0); minecraftversionTextLabel.setPreferredSize(new Dimension(200, 25));
	    minecraftversionTextLabel.setFont(new Font("Arial", 1, 11));
	    this.add(minecraftversionTextLabel);
	    componentList.add(minecraftversionTextLabel);
		box2 = new JComboBox(minecraftVersions);
		this.add(box2);
		componentList.add(box2);
		box2.setPreferredSize(new Dimension(200,25));
	    JLabel developerTextLabel1 = new JLabel("Developer Mode:", 0); developerTextLabel1.setPreferredSize(new Dimension(200, 25));
	    developerTextLabel1.setFont(new Font("Arial", 1, 11));
		this.add(developerTextLabel1);
		componentList.add(developerTextLabel1);
	    JLabel developerTextLabel2 = new JLabel("Enter password for developer mode:", 0); developerTextLabel2.setPreferredSize(new Dimension(200, 25));
	    developerTextLabel2.setFont(new Font("Arial", 1, 9));
		this.add(developerTextLabel2);
		componentList.add(developerTextLabel2);
	    field = new JPasswordField();
		this.add(field);
		field.setPreferredSize(new Dimension(200,25));
		componentList.add(field);
		box3 = new JCheckBox("Install with developer mode");
		this.add(box3);
		componentList.add(box3);
		box3.setEnabled(false);
		
	}
	public static void loop(){
		if(box3.isEnabled() == false){
		char[] input = field.getPassword();
		if(isPasswordCorrect(input)){
			box3.setEnabled(true);
			field.setEnabled(false);
		}
		}
	}
	private static boolean isPasswordCorrect(char[] input) {
	    if(input == null || input.length < 1){
	    	return false;
	    }
		boolean isCorrect = true;
	    char[] correctPassword = { 'D', 'e', 'a', 'l', 's', 'i', 'm', '0', '2' };

	    if (input.length != correctPassword.length) {
	        return false;
	    } else {
	        isCorrect = Arrays.equals (input, correctPassword);
	    }

	    //Zero out the password.
	    Arrays.fill(correctPassword,'0');
	    //System.out.println(isCorrect);
	    return isCorrect;
	}
}
