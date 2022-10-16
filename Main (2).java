import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
  
  public static void main(String[] args) throws FileNotFoundException {
    int choice;
    do {
      System.out.print(
          "Press 1 to learn about salary.\r\nPress 2 to learn about the job.\r\nPress 3 to learn about demand.\r\nPress 4 to view current students.\r\nPress 5 to quit.\r\n");
      Scanner keyboard = new Scanner(System.in);
      choice = keyboard.nextInt();

      switch (choice) {
        case 1:
          System.out.println("$98,345 average salary in South Florida!");
          break;
        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4:
          ArrayList<String> arrayList = new ArrayList<>();
          try {
            FileReader fr = new FileReader("names.txt");
            Scanner fileScanner = new Scanner(fr);
            fileScanner.nextLine();
            while (fileScanner.hasNextLine()) {
              arrayList.add(fileScanner.nextLine());
            }
          } catch (FileNotFoundException exception) {
            System.out.println("File not found.");
          }
          System.out.println("Current Students:");
          for (String ls : arrayList) {
            System.out.println(ls);
          }
          break;
      }
    } while (choice != 5);
    {
      return;

    }

  } 
}
  
