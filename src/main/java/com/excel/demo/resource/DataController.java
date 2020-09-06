package com.excel.demo.resource;/* 
@Author : Yogesh Deshmukh
*/

import com.excel.demo.reader.DataWriterService;
import com.excel.demo.reader.ExcelReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DataController {

    @Autowired
    private ExcelReaderService excelReaderService;

    @Autowired
    private DataWriterService dataWriterService;


    @GetMapping("/data/{filename}")
    public String putDataController(@PathVariable("filename")String filename ) throws IOException {
        List<List<String>> data = excelReaderService.readExcel(filename);
        dataWriterService.putDatainDatabase(data);

        return "Inserted data in DB";
    }
}
