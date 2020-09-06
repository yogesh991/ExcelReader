package com.excel.demo.model;/* 
@Author : Yogesh Deshmukh
*/

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name ="sensor_data")
public class FileData {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String DATE_TIME ;
    private String PLANT_ID;
    private String SOURCE_KEY;
    private String AMBIENT_TEMPERATURE;
    private String MODULE_TEMPERATURE;
    private String IRRADIATION;

    public FileData() {
    }

    public FileData(String DATE_TIME, String PLANT_ID, String SOURCE_KEY, String AMBIENT_TEMPERATURE, String MODULE_TEMPERATURE, String IRRADIATION) {
        this.DATE_TIME = DATE_TIME;
        this.PLANT_ID = PLANT_ID;
        this.SOURCE_KEY = SOURCE_KEY;
        this.AMBIENT_TEMPERATURE = AMBIENT_TEMPERATURE;
        this.MODULE_TEMPERATURE = MODULE_TEMPERATURE;
        this.IRRADIATION = IRRADIATION;
    }

    public String getDATE_TIME() {
        return DATE_TIME;
    }

    public void setDATE_TIME(String DATE_TIME) {
        this.DATE_TIME = DATE_TIME;
    }

    public String getPLANT_ID() {
        return PLANT_ID;
    }

    public void setPLANT_ID(String PLANT_ID) {
        this.PLANT_ID = PLANT_ID;
    }

    public String getSOURCE_KEY() {
        return SOURCE_KEY;
    }

    public void setSOURCE_KEY(String SOURCE_KEY) {
        this.SOURCE_KEY = SOURCE_KEY;
    }

    public String getAMBIENT_TEMPERATURE() {
        return AMBIENT_TEMPERATURE;
    }

    public void setAMBIENT_TEMPERATURE(String AMBIENT_TEMPERATURE) {
        this.AMBIENT_TEMPERATURE = AMBIENT_TEMPERATURE;
    }

    public String getMODULE_TEMPERATURE() {
        return MODULE_TEMPERATURE;
    }

    public void setMODULE_TEMPERATURE(String MODULE_TEMPERATURE) {
        this.MODULE_TEMPERATURE = MODULE_TEMPERATURE;
    }

    public String getIRRADIATION() {
        return IRRADIATION;
    }

    public void setIRRADIATION(String IRRADIATION) {
        this.IRRADIATION = IRRADIATION;
    }
}
