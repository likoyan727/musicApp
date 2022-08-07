// Liana Ikoyan
// 002395362
// ikoyan@chapman.edu
// CPSC-231-01
// MP4_MusicApp
// This is the driver class for the MusicApp, displays and performs five options

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Driver {
  // main method
  public static void main(String[] args) {

    ContentCollections popMusic = new ContentCollections();
    ContentCollections rockMusic = new ContentCollections();
    ContentCollections jazzMusic = new ContentCollections();
    ContentCollections hiphopMusic = new ContentCollections();
    ContentCollections metalMusic = new ContentCollections();
    ContentCollections classicalMusic = new ContentCollections();
    ContentCollections otherMusic = new ContentCollections();
    ContentCollections podcasts = new ContentCollections();

    Listener listener1 = new Listener();


    BufferedReader reader = null;
    BufferedWriter writer = null;
    Scanner scnr = new Scanner(System.in);
    int userInput;

    System.out.println("Options: ");
    System.out.println("1. Create a listener account");
    System.out.println("2. List available playlists and albums");
    System.out.println("3. Add songs to an existing playlist");
    System.out.println("4. Export all songs on the platform");
    System.out.println("5. Exit");

    try {
      userInput = scnr.nextInt();
      scnr.nextLine();
      while (userInput < 1 || userInput > 5) {
        System.out.println("Answer 1, 2, 3, 4, or 5: ");
        userInput = scnr.nextInt();
        scnr.nextLine();
      }
      while (userInput != 5) {

        if (userInput == 1) {
          String idInput;

          System.out.print("Enter the account name: ");
          idInput = scnr.nextLine();
          listener1 = new Listener(idInput);
          System.out.println("Welcome, " + idInput + "!");

          System.out.println("What else would you like to do? ");
          userInput = scnr.nextInt();
          scnr.nextLine();
          while (userInput < 1 || userInput > 5) {
            System.out.println("Answer 1, 2, 3, 4, or 5: ");
            userInput = scnr.nextInt();
            scnr.nextLine();
          }


        } else if (userInput == 2) {
            try {
              reader = new BufferedReader(new FileReader("cCollections.txt"));
              String currentLine;
              int numInput = 0;

              int count = 1;
              while ((currentLine = reader.readLine()) != null) {
                System.out.println(count + " " + currentLine);
                ++count;
              }
              reader.close();
            } catch (FileNotFoundException e){
              System.out.println("Uh oh! Collections file could not be found.");
            } catch (IOException e) {
              System.out.println("Uh oh! Something went wrong while trying to access collections.");
            }

            System.out.println("Which collection would you like to play?");

            int numInput = 0;
            try {
              numInput = scnr.nextInt();
              scnr.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid answer");
            }

            if (numInput == 1) {
              for (Content c : listener1.getFavoredContent()) {
                System.out.println("Now playing: ");
                System.out.println(c);
              }
            } else if (numInput == 2) {
              popMusic.shuffle();
            } else if (numInput == 3) {
              rockMusic.shuffle();
            } else if (numInput == 4) {
              jazzMusic.shuffle();
            } else if (numInput == 5) {
              hiphopMusic.shuffle();
            } else if (numInput == 6) {
              metalMusic.shuffle();
            } else if (numInput == 7) {
              classicalMusic.shuffle();
            } else if (numInput == 8) {
              otherMusic.shuffle();
            } else if (numInput == 9) {
              podcasts.shuffle();
            }

          System.out.println("What else would you like to do? ");
          userInput = scnr.nextInt();
          scnr.nextLine();
          while (userInput < 1 || userInput > 5) {
            System.out.println("Answer 1, 2, 3, 4, or 5: ");
            userInput = scnr.nextInt();
            scnr.nextLine();
          }
        }

        else if (userInput == 3) {
          try {
            reader = new BufferedReader(new FileReader("cCollections.txt"));
            String currentLine;

            int count = 1;
            while ((currentLine = reader.readLine()) != null) {
              System.out.println(count + " " + currentLine);
              ++count;
            }
            reader.close();

            System.out.println("Which collection would you like to add to? Enter a number: ");
            int numInput = 0;
            numInput = scnr.nextInt();
            scnr.nextLine();

            String input;
            System.out.println("Enter the title: ");
            input = scnr.nextLine();
            String title = input;
            System.out.println("Enter the artist: ");
            input = scnr.nextLine();
            String artist = input;

            Song newContent = new Song(title, artist);

            if (numInput == 1) {
              listener1.favorite(newContent);
            } else if (numInput == 2) {
              popMusic.add(newContent);
            } else if (numInput == 3) {
              rockMusic.add(newContent);
            } else if (numInput == 4) {
              jazzMusic.add(newContent);
            } else if (numInput == 5) {
              hiphopMusic.add(newContent);
            } else if (numInput == 6) {
              metalMusic.add(newContent);
            } else if (numInput == 7) {
              classicalMusic.add(newContent);
            } else if (numInput == 8) {
              otherMusic.add(newContent);
            } else if (numInput == 9) {
              podcasts.add(newContent);
            }

            System.out.println("What else would you like to do? ");
            userInput = scnr.nextInt();
            scnr.nextLine();
            while (userInput < 1 || userInput > 5) {
              System.out.println("Answer 1, 2, 3, 4, or 5: ");
              userInput = scnr.nextInt();
              scnr.nextLine();
            }

          } catch (InputMismatchException e) {
             System.out.println("Invalid answer");
             break;
          } catch (FileNotFoundException e) {
              System.out.println("Uh oh! The collections could not be found.");
          } catch (IOException e) {
              System.out.println("Uh oh! Something went wrong while reading the collections.");
          }

        }
        else if (userInput == 4) {
          try {
            ArrayList<Content> sortList = new ArrayList<Content>();

            for (Content c : listener1.getFavoredContent()) {
              sortList.add(c);
            }
            for (Content c : popMusic.getCollection()) {
              sortList.add(c);
            }
            for (Content c : rockMusic.getCollection()) {
              sortList.add(c);
            }
            for (Content c : jazzMusic.getCollection()) {
              sortList.add(c);
            }
            for (Content c : hiphopMusic.getCollection()) {
              sortList.add(c);
            }
            for (Content c : metalMusic.getCollection()) {
              sortList.add(c);
            }
            for (Content c : classicalMusic.getCollection()) {
              sortList.add(c);
            }
            for (Content c : otherMusic.getCollection()) {
              sortList.add(c);
            }
            ArrayList<Content> sortedList = new ArrayList<Content>();

            for (Content c : sortList) {
              int maxTimesStreamed = c.getNumTimesStreamed();
              if (c.getNumTimesStreamed() > maxTimesStreamed) {
                sortedList.add(sortList.size() -1, c);
              } else {
                sortedList.add(c);
              }
            }
            System.out.println("Enter the file path you would like to export to: ");
            String fileName = scnr.nextLine();

            writer = new BufferedWriter(new FileWriter(fileName));
            for (Content c : sortedList) {
              writer.write(c.toString() + "\n");
            }
            writer.close();
          } catch (FileNotFoundException e) {
            System.out.println("Uh oh! The file could not be found.");
          } catch (IOException e) {
              System.out.println("Uh oh! Something went wrong while exporting.");
          }

          System.out.println("Export successful!");

          System.out.println("What else would you like to do? ");
          userInput = scnr.nextInt();
          scnr.nextLine();
          while (userInput < 1 || userInput > 5) {
            System.out.println("Answer 1, 2, 3, 4, or 5: ");
            userInput = scnr.nextInt();
            scnr.nextLine();
          }
        }
      }

    } catch (InputMismatchException e) {
        System.out.println("Invalid answer");
    }

  }
}
