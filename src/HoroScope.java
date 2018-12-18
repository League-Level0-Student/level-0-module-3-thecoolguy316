import javax.swing.JOptionPane;

public class HoroScope {
public static void main(String[] args) {
String question = JOptionPane.showInputDialog(null, "What is your Zodiac Sign?");

if (question.equalsIgnoreCase("scorpio")) {
	JOptionPane.showMessageDialog(null, "Upside: Scorpio exhibit\n extreme self-control in many areas,\n and as a result expect that of those around them.\n They are disciplined, protective and are very interested in others.\n They give of themselves but do expect the same in return.\n Scorpio males and females both need to be the leaders, \nand excel at problem solving \nand troubleshooting projects and situations.\r\n" + 
			"\r\n" + 
			"Downside: Scorpio invented the term ‘vendetta’.\n Once a Scorpio is crossed, they don’t forget it. \nFemale Scorpio are worse about this than they \nothers, often going decades without making\n amends with friends and family. Scorpio also \ntend to be pessimistic, often seeing threats where \nthere aren’t any, which can make them suspicious\n, stubborn and paranoid without cause.");
}	else if (question.equalsIgnoreCase("cancer")) {
	JOptionPane.showMessageDialog(null, "Upside: Cancer have an offbeat sense of humor\n, often finding something humorous that others don’t.\n They are extremely good listeners and have a heart for the problems of others.\n In fact, many gravitate toward this sign because they intuitively know that a Cancer will understand.\n When a Cancer becomes your friend you can be sure that they are truly your friend and will not consider using someone to their own benefit.\n Cancer tend to be dependable and reliable.\n They will tell you anything you want to know about them without blinking an eye as they are drawn to honesty in others as well as themselves.\n\r\n" + 
				"\r\n" + 
				"Downside: This sign can be moody, clingy, and often become incredibly insecure if they feel that they are about to lose the friendship or love of someone close to them.\n If the situation calls for it, they will lie, but often this dishonesty stems\n from a deep insecurity about being alone.")
	}
	
}
}

