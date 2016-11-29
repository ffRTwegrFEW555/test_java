package io.sequence_input_stream;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import java.util.zip.ZipInputStream;

/*
    package com.javarush.test.level31.lesson06.bonus01;
*/

/* Разархивируем файл
В метод main приходит список аргументов.
Первый аргумент - имя результирующего файла resultFileName, остальные аргументы - имена файлов fileNamePart.
Каждый файл (fileNamePart) - это кусочек zip архива. Нужно разархивировать целый файл, собрав его из кусочков.
Записать разархивированный файл в resultFileName.
Архив внутри может содержать файл большой длины, например, 50Mb.
Внутри архива может содержаться файл с любым именем.

Пример входных данных. Внутри архива находится один файл с именем abc.mp3:
C:/result.mp3
C:/pathToTest/test.zip.003
C:/pathToTest/test.zip.001
C:/pathToTest/test.zip.004
C:/pathToTest/test.zip.002
*/
public class TestDrive {
    public static void main(String[] args) throws IOException {
        //
        String resultFileName = args[0];

        String[] sortedFileNamePart = new String[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            sortedFileNamePart[i - 1] = args[i];
        }
        Arrays.sort(sortedFileNamePart);

        //
        List<InputStream> inputStreamList = new ArrayList<>();
        for (String s : sortedFileNamePart) {
            inputStreamList.add(new FileInputStream(s));
        }

        SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(inputStreamList));
        ZipInputStream zis      = new ZipInputStream(sis);

        zis.getNextEntry();
        Files.copy(zis, Paths.get(resultFileName), StandardCopyOption.REPLACE_EXISTING);

        sis.close();
        zis.close();
    }
}
