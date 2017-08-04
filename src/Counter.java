import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Alexey Lisitsyn for MailruGroup Golang course on 04.08.2017.
 *
 */
public class Counter {
    public static void main(String[] args) {
        try {
            long i = 0;
            File inpFile = new File(args[0]);
            Scanner fileList = new Scanner(new FileReader(inpFile));
            while (fileList.hasNextLine()) {
                fileList.nextLine();
                i++;
            }
            System.out.println(i + " " + inpFile.getName()); //Вывод сделан такой же как и у команды wc -l
        } catch (Exception e) {
            System.out.println("Usage: If the input file is in the same directory as the JAR-file, just type full file name.\n Example: 123.txt\n If the input file is somewhere else type full path to the file.\n Example: C:\\Directory\\Path\\123.txt");
            System.out.println(e.toString());
        }

    }
}
