package com.excel.demo.resource;/*
@Author : Yogesh Deshmukh
*/

import com.excel.demo.model.FileData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataWriterRepository extends JpaRepository<FileData, Long> {
}
