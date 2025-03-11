import java.util.Scanner;
public class NLPRunner {
  public static void main(String[] args) {
    // Create EmotionWord instance
    EmotionWord ew = new EmotionWord();
    
    // Displays available emotions and allows the user to choose one
    ew.getUserInput();
    
    // Displays the word corresponding to the selected emotion
    ew.displayCorrespondingWord();

   //ew.displayEmotions();
  }
}


