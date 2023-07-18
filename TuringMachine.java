
// Java code for stack implementation
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class TuringMachine {

	public static int numberOfStates;
	public static String alphabet = new String("");
	public static ArrayList<String> transitions = new ArrayList<String>();
	public static StringBuilder tape = new StringBuilder("");
	public static int headPosition;

	public static void main(String[] args) throws Exception {
		readInputs();
		if (processing())
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
		System.out.println("Head Position is: " + (headPosition));
		tape = tape.insert(headPosition + 1, ')');
		tape = tape.insert(headPosition, '(');
		System.out.println("Tape is <" + tape);
	}

	public static void readInputs() throws Exception {
		int counter = 0;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(new File("turingMachine.txt")));
		String st;
		while ((st = br.readLine()) != null) {
			if (!st.startsWith("-")) {
				switch (counter) {
				case 1:
					numberOfStates = Integer.parseInt(st);
					break;
				case 2:
					alphabet = st;
					break;
				case 3:
					transitions.add(st);
					break;
				case 4:
					tape = tape.append(st);
					break;
				case 5:
					headPosition = Integer.parseInt(st);
					break;
				default:
					break;
				}
			} else
				counter++;
		}
		alphabet = alphabet.replaceAll("<|,|#", "");
	}

	public static boolean processing() throws Exception {
		tape = tape.append("##########"); // Add some hashes at the end of the tape.
		int currentState = 0; // Initialized with the initial state.
		boolean currentStateChanged = false; /* to break the inner for loop */
		ArrayList<Integer> Yes_No = new ArrayList<Integer>(); /* Save the 'y' and 'n' actions */
		for (int i = 0; i < transitions.size(); i++) {
			if (transitions.get(i).endsWith("y") || transitions.get(i).endsWith("n"))
				Yes_No.add(i);
		}
		int current_transition = 0;

		try {

			while (!Yes_No.contains(current_transition)) {
				for (int i = (currentState * (alphabet.length() + 1)); i < (currentState * (alphabet.length() + 1)
						+ (alphabet.length() + 1)); i++) {
					if (tape.charAt(headPosition) == transitions.get(i).charAt(2)) {
						tape.setCharAt(headPosition, transitions.get(i).charAt(6));
						currentState = Integer.parseInt(transitions.get(i).substring(4, 5));
						if (transitions.get(i).charAt(8) == 'r')
							headPosition++;
						else if (transitions.get(i).charAt(8) == 'l')
							headPosition--;
						currentStateChanged = true;
					}
					current_transition = i;
					if (currentStateChanged) {
						currentStateChanged = false;
						break;
					}
				}
			}
		} catch (Exception ex) {
			System.out.println("Exception happened! Is Head position < 0 ?");
		}
		if (transitions.get(current_transition).endsWith("n")) {
			tape.setCharAt(headPosition, transitions.get(current_transition).charAt(6));
			currentState = Integer.parseInt(transitions.get(current_transition).substring(0, 1));
			return false;
		} else {
			tape.setCharAt(headPosition, transitions.get(current_transition).charAt(6));
			currentState = Integer.parseInt(transitions.get(current_transition).substring(0, 1));
			return true;
		}
	}

}