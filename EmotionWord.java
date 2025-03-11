import java.util.ArrayList;
import java.util.Scanner;
//takes care of analysis of input emotions and output words
//loads words and emotions from txt files to be used
public class EmotionWord {
    // ArrayLists to store user inputs and corresponding emotions
    private ArrayList<String> words;
    private ArrayList<String> emotions;

    // Constructor initializes the lists and loads words and emotions from files
    public EmotionWord() {
        this.words = FileReader.toStringList("words.txt");  // Load words from words.txt
        this.emotions = FileReader.toStringList("emotions.txt");  // Load emotions from emotions.txt
    }

    /**
  *Gets list of emotions
  *@return arrayList containing all emotions
  **/
    public ArrayList<String> getEmotions() {
        return emotions;
    }
 /**
  *Gets list of words
  *@return arrayList containing all words that correspond to emotions
  **/
    public ArrayList<String> getWords() {
        return words;
    }

    // method prompts user to select an emotion through number input
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        // Display available emotions 1-10
        System.out.println("Select an emotion by number:");
        for (int i = 0; i < emotions.size(); i++) {
            System.out.println((i + 1) + ". " + emotions.get(i));
        }

        // Gets user's choice to pass through scanner
        System.out.print("Enter the number corresponding to your emotion: ");
        int input = scanner.nextInt();

        // Makes sure the input is within the valid range (1-10)
        if (input < 1 || input > emotions.size()) {
            System.out.println("Invalid input. Please enter a number between 1 and " + emotions.size());
            return;
        }

        // Analyze and store the emotion
        analyzeEmotion(input);
    }

    /**
  *method
  *analyzes emotion based on user input and displays result
  *@param input index (starting at 1 not 0) for selected emotion
  **/
//STUDENT DEVELOPED ALGORITHM
    public void analyzeEmotion(int input) {
        String selectedEmotion = emotions.get(input - 1);  // Get the emotion based on the input
        String correspondingWord = words.get(input - 1);   // Get the corresponding word based on the input
     //prints out emotion and corresponding word in console
 //makes output have all uppercase letters
        System.out.println("You are feeling: " + selectedEmotion.toUpperCase());
        System.out.println("The corresponding word is: " + correspondingWord.toUpperCase());
    }

    // Method displaying the corresponding word for the selected emotion
    public void displayCorrespondingWord() {
    }
}
