import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortFile {
    // Write a Java program to read words from a file and sort them and store it
    //another new file and also print number of lines and words in that file.

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ahmedt\\IdeaProjects\\Java IO Assignment - Swapna\\src\\Text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> storedLines = new ArrayList<>();
        String line = "";

        while ((line = br.readLine()) != null){
            storedLines.add(line);
        }
        br.close();
        System.out.println(storedLines);
        Collections.sort(storedLines);
        System.out.println("\nafter sorting:\n" + storedLines);

        BufferedWriter bw = null;
        try {
            File fileToWriteTo = new File("C:\\Users\\ahmedt\\IdeaProjects\\Java IO Assignment - Swapna\\src\\Text2.txt");
            if (!fileToWriteTo.exists()) {
                fileToWriteTo.createNewFile();
            }
            FileWriter fw = new FileWriter(fileToWriteTo, true);
            bw = new BufferedWriter(fw);

            for (String str : storedLines) bw.write(str + "\n");
            bw.close();

        }catch (Exception e){
            System.out.println("Error occurred\n" + e.getMessage());
        }

    }
}
