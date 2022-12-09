package pairmatching.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileConverter {

    public static List<String> convertFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> convertedFile = new ArrayList<>();
        String fileLine = bufferedReader.readLine();
        while (fileLine != null) {
            convertedFile.add(fileLine);
            fileLine = bufferedReader.readLine();
        }
        return convertedFile;
    }

}
