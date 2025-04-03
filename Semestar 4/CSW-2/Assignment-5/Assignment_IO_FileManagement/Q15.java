import java.io.File;
import java.util.Scanner;

public class FileRenameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the current file name (with path if not in current directory): ");
        String currentFileName = sc.nextLine();

        System.out.print("Enter the new file name: ");
        String newFileName = sc.nextLine();

        File oldFile = new File(currentFileName);
        File newFile = new File(newFileName);

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully to: " + newFile.getName());
            } else {
                System.out.println("Failed to rename file.");
            }
        } else {
            System.out.println("The specified file does not exist.");
        }

        sc.close();
    }
}
