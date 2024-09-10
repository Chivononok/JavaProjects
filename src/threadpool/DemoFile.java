package threadpool;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoFile {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        String filePath = "C:\\temp\\";
        int countFiles = 10;
        int countTextLines = 10;
        AtomicInteger taskNum = new AtomicInteger(0);

        Callable<ArrayList<String>> fileNameClb = ()->{

            ArrayList<String> result = new ArrayList<>();
            for (int i = 0; i < countFiles; i++) {
                //=== формируем тело файла ===
                String text = "";
                for (int j = 0; j < countTextLines; j++) {
                    text += generateRandomString(10) + "\n";
                }
                //============================
                //======= создаем файл =======
                String fileName = generateRandomString(5);  //придумываем имя файла из 5 букв
                FileOutputStream fos = new FileOutputStream(filePath + fileName+".txt");
                fos.write(text.getBytes());
                fos.close();
                //============================
                result.add(fileName + ".txt");   //запоминаем имя созданного файла
                int sleepTime = ThreadLocalRandom.current().nextInt(3); //получаем время, которое должен спать текущий поток
                System.out.println("Обработана задача №" + taskNum.getAndIncrement() + " на потоке " + Thread.currentThread().getName() + ". Поток уснет на " + sleepTime + "сек");

                Thread.sleep(sleepTime*1000);   //поток спит 0-2сек
            }
            return result;
        };

        List taskList = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            taskList.add(fileNameClb);
        }

        try {
            service.invokeAll(taskList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }

    private static String generateRandomString(int stringLength){
        //создание случайной строки
        int leftLimit = 97;     // буква 'a'
        int rightLimit = 122;   // буква 'z'

        StringBuilder buffer = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (ThreadLocalRandom.current().nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }
}
