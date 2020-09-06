package com.excel.demo.reader;/* 
@Author : Yogesh Deshmukh
*/

import com.excel.demo.model.FileData;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelReaderService {


    public static List<List<String>> readExcel(String filename) throws IOException {
        List<List<String>> fileData = new ArrayList<List<String>>();

        try(
                Reader reader = Files.newBufferedReader(Paths.get(filename));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
                ){

            for(CSVRecord csvRecord : csvParser){
                List<String> tempList = new ArrayList<>();
                for(int i=0;i<csvRecord.size();i++){
                    tempList.add(csvRecord.get(i));
                }
                fileData.add(tempList);
            }
        }
        return fileData;
    }
}
