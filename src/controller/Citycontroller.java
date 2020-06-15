package controller;

import model.service.CityService;

import java.time.LocalDate;

public class Citycontroller {

    private CityService cityservice;

    public Citycontroller () throws Exception {
        cityservice=new CityService();
    }

    public void cityreport() throws Exception {
        cityservice.cityreport();
    }
    public void allreports(){
       cityservice.allreports();
    }
    public void specific(LocalDate local) throws Exception {
        cityservice.specific(local);
    }
}
