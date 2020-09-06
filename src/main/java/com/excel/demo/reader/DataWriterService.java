package com.excel.demo.reader;/* 
@Author : Yogesh Deshmukh
*/

import com.excel.demo.model.FileData;
import com.excel.demo.resource.DataWriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataWriterService {

    @Autowired
    private DataWriterRepository dataWriter;

    public void putDatainDatabase(List<List<String>> data){

        for(List<String> temp : data){

            FileData fileData = new FileData(temp.get(0), temp.get(1), temp.get(2), temp.get(3), temp.get(4), temp.get(5));

            dataWriter.save(fileData);

        }

    }
}
