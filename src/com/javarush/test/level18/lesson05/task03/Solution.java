package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOne = reader.readLine();
        String nameTwo = reader.readLine();
        String nameThree = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(new File(nameOne));
        FileOutputStream fileOutputStream1 = new FileOutputStream(new File(nameTwo));
        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(nameThree));
reader.close();
        while (fileInputStream.available() > 0) {
            if (fileInputStream.available() % 2 == 0) {
                byte[] first = new byte[fileInputStream.available() / 2];
                byte[] second = new byte[fileInputStream.available() / 2];
                int countOne = fileInputStream.read(first);
                int countTwo = fileInputStream.read(second);
                fileOutputStream1.write(first, 0, countOne);
                fileOutputStream2.write(second, 0, countTwo);
            }
            else {
                byte[] first = new byte[fileInputStream.available() / 2 + 1];
                byte[] second = new byte[fileInputStream.available() / 2];
                int countOne = fileInputStream.read(first);
                int countTwo = fileInputStream.read(second);
                fileOutputStream1.write(first, 0, countOne);
                fileOutputStream2.write(second, 0, countTwo);

            }
        }
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();

    }
}
