import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Random;
import java.time.LocalTime;

public class arquivo {
  public static void main(String[] args) {
    try {
      FileWriter arquivo = new FileWriter("filename.txt");
      for(int i = 0; i < 1000000 ; i++ ) {
        LocalTime time = LocalTime.now();
        arquivo.append(time + " " + (int) ((Math.random() * (60 - 1)) + 1) + "\n");
      }
      arquivo.close();
      
    System.out.println("Arquivo gravado com sucesso.");
      
    } catch (IOException e) {
      System.out.println("ERROOOOOOO");
      e.printStackTrace();
    }   
  }
}