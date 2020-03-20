import java.io.*;

public class FindLongestWordInTextFile {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\ahmedt\\IdeaProjects\\Java IO Assignment - Swapna\\src\\Text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String longestWord = "";
        int longestLength = 0;

        String current;

        while ((current = br.readLine()) != null){
            String [] arr = current.split(" ");
            for (int i=0; i<arr.length; i++){
                if (arr[i].length() > longestLength){
                    longestWord = arr[i];
                    longestLength = arr[i].length();

                }
            }
        }
        br.close();
        System.out.println(longestWord+ " is the longest word");

    }
}
