import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String HappyQ = JOptionPane.showInputDialog(null, "Are you happy?");
		if (HappyQ.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
		} else if (HappyQ.equalsIgnoreCase("no")) {
			String DoYou = JOptionPane.showInputDialog(null, "Do you want to be happy");
			if (DoYou.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something in your life............");
			}
			else if (DoYou.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Its a yes or no SOCIAL EXPIREMENT, You are PUNISHED.... Go back to the begining!!!!!!!!!!!!!!!!!!!!!!!!!! ");
		}
	}
}