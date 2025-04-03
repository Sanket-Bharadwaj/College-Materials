import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileRenameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name (with path if not in current directory): ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size (bytes): " + file.length());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Last Modified: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
        } else {
            System.out.println("The specified file does not exist.");
        }

        sc.close();
    }
}
