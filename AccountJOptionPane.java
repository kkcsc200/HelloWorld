import javax.swing.JOptionPane;

public class AccountJOptionPane {
	public static void main(String[] args){

		String nameInput = JOptionPane.showInputDialog("Enter your name");
		String ageInputStr = JOptionPane.showInputDialog("Enter your age");
		int ageInput = Integer.parseInt(ageInputStr);
		String emailInput = JOptionPane.showInputDialog("Enter your email");
		String dobInput = JOptionPane.showInputDialog("Enter your DOB");
		String addressInput = JOptionPane.showInputDialog("Enter your address");


		JOptionPane.showMessageDialog(null, "My name is" + nameInput);
		JOptionPane.showMessageDialog(null, "My age is" + ageInput);
		JOptionPane.showMessageDialog(null, "My email is" + emailInput);
		JOptionPane.showMessageDialog(null, "My DOB is" + dobInput);
		JOptionPane.showMessageDialog(null, "My address is" + addressInput);




	}
}
