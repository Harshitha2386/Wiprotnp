package IO_operations;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class HandsOnAssignment3 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();
        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();
        TreeMap<String, Integer> map = new TreeMap<>();
        try {
            Scanner fileScanner = new Scanner(new File(inputFile));
            while (fileScanner.hasNext()){
                String word = fileScanner.next();
                if (map.containsKey(word)){
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            fileScanner.close();
            FileWriter fw = new FileWriter(outputFile);
            for (Map.Entry<String, Integer> entry : map.entrySet()){
                fw.write(entry.getKey() + " : " + entry.getValue());
                fw.write(System.lineSeparator());
            }
            fw.close();
            System.out.println("Word count written to " + outputFile);
        } catch (IOException e){
            System.out.println("File not found");
        }

        sc.close();
    }
}
