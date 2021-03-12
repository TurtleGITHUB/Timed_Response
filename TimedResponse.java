// exercise on pages 213-215

import javax.swing.JOptionPane;
import java.time.*;

public class TimedResponse
{
	public static void main(String[] args)
	{
		// variables and constants
		LocalDateTime time1, time2;
		int seconds1, seconds2, difference;

		// input phase
		// capture the time that the dialog box first appears
		
		time1 = LocalDateTime.now();
		seconds1 = time1.getSecond();
		
		// now let's make the dialog box
		
		JOptionPane.showConfirmDialog(null, "Is stealing ever justified? ");
		
		// now capture the time when the dialog box was closed

		time2 = LocalDateTime.now();
		seconds2 = time2.getSecond();

		// calculation phase
		difference = seconds2 - seconds1;

		//output phase
			JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 + "\nStart seconds: " + seconds1 + "\nIt took " + difference + " seconds for you to answer");

	}
}