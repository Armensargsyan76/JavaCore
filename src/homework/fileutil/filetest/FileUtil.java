package homework.fileutil.filetest;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }


    static void recursionSearch(File directory, String filName) {
        boolean b = false;
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().equals(filName)) {
                b = true;
                System.out.println(b);
                System.out.println(file.getPath());
            } else if (file.isDirectory()) {
                recursionSearch(file, filName);
            }
        }
    }

    static void recursionSearchFileByKeyword(File directory, String keyword) {
        String contain = "";
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String filePath = file.getPath();
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    while ((contain = reader.readLine()) != null) {
                        if (contain.contains(keyword)) {
                            System.out.println(file.getName());
                            break;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("wrong file");
                }

            } else if (file.isDirectory()) {
                recursionSearchFileByKeyword(file, keyword);
            }
        }
    }

    static Long toCountRecursion(File directory) {
        long size = 0L;
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
            } else if (file.isDirectory()) {
                toCountRecursion(file);
            }
        }
        return size;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        boolean b = false;
        System.out.println("please input path");
        String path = scanner.nextLine();
        File myFile = new File(path);
        if (myFile.isDirectory()) {
            System.out.println("please input file name");
            String fileName = scanner.nextLine();
            File[] files = myFile.listFiles();
            recursionSearch(myFile, fileName);
        } else {
            System.out.println("please input correct path");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("please input path");
        String path = scanner.nextLine();
        File myFile = new File(path);
        if (myFile.isDirectory()) {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            recursionSearchFileByKeyword(myFile, keyword);
        } else {
            System.out.println("please input correct folder path");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("please input file path");
        String txtPath = scanner.nextLine();
        File myFile = new File(txtPath);
        if (myFile.isFile()) {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(txtPath))) {
                String line = "";
                int row = 0;
                while ((line = reader.readLine()) != null) {
                    row++;
                    if (line.contains(keyword)) {
                        System.out.println(row + " " + line);
                    }
                }
            } catch (IOException e) {
                System.out.println("wrong file");
            }
        } else {
            System.out.println("please input correct path");
        }


    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input folder path");
        String path = scanner.nextLine();
        File myFile = new File(path);
        Long size = toCountRecursion(myFile);
        System.out.println((size * 1024) + " kb");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input file name");
        String fileName = scanner.nextLine();
        String filePath = path + File.separator + fileName;
        File myFile = new File(filePath);
        boolean newFile = false;
        try {
            newFile = myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("error: create file");
        }
        if (newFile) {
            System.out.println("please input content");
            String content = scanner.nextLine();
            try (BufferedWriter bufWrit = new BufferedWriter(new FileWriter(filePath))) {
                bufWrit.write(content);
            } catch (IOException e) {
                System.out.println("can not write file");
            }
        } else {
            System.out.println("can not create file");
        }

    }

}


