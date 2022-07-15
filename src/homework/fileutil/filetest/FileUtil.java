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

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        boolean b = false;
        System.out.println("please input path");
        String path = scanner.nextLine();
        File myFile = new File(path);
        if (!myFile.isDirectory()) {
            System.out.println("please input correct path");
        } else {
            System.out.println("please input file name");
            String fileName = scanner.nextLine();
            File[] files = myFile.listFiles();
            for (File file : files) {
                if (file.getName().equals(fileName) && file.exists()) {
                    b = true;
                }
            }
            System.out.println(b);
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
        if (!myFile.isDirectory()) {
            System.out.println("please input correct path");
        } else {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            File[] files = myFile.listFiles();
            String contain = "";
            for (File file : files) {
                if (file.isFile()) {
                    String filePath = file.getPath();
                    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                        contain = reader.readLine();
                    } catch (IOException e) {
                        System.out.println("wrong file");
                    }
                    if (contain.contains(keyword)) {
                        System.out.println(file.getName());
                    }

                }

            }
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
        if (myFile.exists() && myFile.isFile()) {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(txtPath))) {
                String line = "";
                while ((line = reader.readLine()) != null) {
                    if (line.contains(keyword)) {
                        System.out.println(line);
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
        File[] files = myFile.listFiles();
        Long size = 0L;
        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
            }
        }
        System.out.println(size);
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
        String filePath = path + "\\" + fileName;
        File myFile = new File(filePath);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("can not create file");
        }
        System.out.println("please input content");
        String content = scanner.nextLine();
        try (BufferedWriter bufWrit = new BufferedWriter(new FileWriter(filePath))) {
            bufWrit.write(content);
        } catch (IOException e) {
            System.out.println("can not write file");
        }
    }

}


