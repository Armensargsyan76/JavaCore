package classwork.lesson25;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;
import java.util.Locale;


public class InputOutPut {

    private static String pathName1 = "C:\\Users\\Armen\\IdeaProjects\\JavaCore\\src\\homework\\fileutil\\folder\\hello.txt";

    private static String newPath = "C:\\Users\\Armen\\IdeaProjects\\JavaCore\\src\\homework\\fileutil\\folder\\hello2.txt";

    private static String folderPath = "C:\\Users\\Armen\\IdeaProjects\\JavaCore\\src\\homework\\fileutil\\folder\\";

    public static void main(String[] args) {

        File myFile = new File(folderPath);
//        Date date = new Date(myFile.lastModified());
//        System.out.println(date);
        File[] files = myFile.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
//        System.out.println(myFile.exists());
//        System.out.println(File.separator);
//        boolean b = myFile.renameTo(new File(newPath));
//        System.out.println(b);
//        File[] files = myFile.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.endsWith(".txt");
//            }
//
//        });
//        for (File file : files) {
//            System.out.println(file.getName());
//        }
//        String os_name = System.getProperty("os.name").toLowerCase();
//        System.out.println(os_name);
    }
}
