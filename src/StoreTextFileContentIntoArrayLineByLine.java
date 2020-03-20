import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class StoreTextFileContentIntoArrayLineByLine {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\ahmedt\\IdeaProjects\\Java IO Assignment - Swapna\\src\\Text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = "";
        ArrayList<String> list = new ArrayList<>();

        while ((line = br.readLine()) != null){
            list.add(line);
        }
        br.close();

        String[] arr = list.toArray(new String[]{});

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
