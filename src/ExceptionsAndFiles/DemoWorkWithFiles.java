package ExceptionsAndFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class DemoWorkWithFiles {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        String text = "text привет hjkfsjdflsjkld; pd;k fksl;dkl ;kl;skjdlj jk;lsjdkj lkjskdlj ;jlsd'l js" +
                " jsdkj lksjdkj hgujndskng kljnskdj ks;dlj;o trpejituifhgbj;ar a rjargh j" +
                "a hrrj jakrhgj hjkdghja hrkuh jhgjfaklhrjhgh hjrltkejarkl; jklgjlkafjlkhrihti lh hoart a] " +
                " jhkhfsuid f8jkgl a;dfjg ;lajd " +
                "ag arg arg fgarg.";
        Path path1 = Path.of("C:\\temp\\test1.txt");
        Path path2 = Path.of("src\\ExceptionsAndFiles\\test2.txt");
        Path path3 = Path.of("src\\ExceptionsAndFiles\\car.txt");
        String line;

        try (FileOutputStream fos1 = new FileOutputStream(path1.toString());
             FileOutputStream fos2 = new FileOutputStream(path2.toString());
             BufferedReader reader1 = Files.newBufferedReader(path1);
             BufferedReader reader2 = Files.newBufferedReader(path2);
             FileOutputStream outputStream = new FileOutputStream(path3.toString());
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
             FileInputStream fileInputStream = new FileInputStream(path3.toString());
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            //==== запись в файлы ====
            fos1.write(text.getBytes());
            fos2.write(text.getBytes());
            //========================

            //=== чтение из файлов ===
            System.out.println("Первый файл:");
            while ((line = reader1.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Второй файл:");
            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }
            //========================

            Car car = new Car("BMW i9");
            objectOutputStream.writeObject(car);    //сериализация класса Car
            Car car2 = (Car) objectInputStream.readObject();    //десериализация
            System.out.println(car2);
        } catch (IOException e) {
            System.out.println("Сработал обработчик для IOException:");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Сработал обработчик для ClassNotFoundException:");
            e.printStackTrace();
        }
    }
}
