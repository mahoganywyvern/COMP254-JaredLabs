import java.io.File;

/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-02-24
 */
public class FFinder {
    public static void find(String path, String filename) {
        File root = new File(path);
        if (!root.exists())  //real check incase of invalid directory
        {
            System.out.println("Directory does not exist.");
            return;
        }
        findFiles(root, filename);
    }

    private static void findFiles(File directory, String filename) {
        File[] files = directory.listFiles(); //list of files/directories within current directory
        if (files != null) { //nullcheck
            for (File file : files) { // Iterate thru each file/directory in the list
                if (file.isDirectory()) { //directory check
                    // Recursively search subdirectories
                    findFiles(file, filename); // case directory: recursively call this method to search thru dir
                } else if (file.getName().equals(filename)) { // case file: check if file is whats being looked for
                    // Found a file with the given filename
                    System.out.println("Found at: " + file.getAbsolutePath());
                }
            }
        }
    }
}
