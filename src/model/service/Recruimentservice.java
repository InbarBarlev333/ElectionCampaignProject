package model.service;

import general_classes.RecruimentReport;
import model.repository.RecruitmentReportRepositoryImpl;

import java.time.LocalDate;

public class Recruimentservice {
    private RecruimentReport report1;
    private RecruitmentReportRepositoryImpl reports;

    public Recruimentservice() throws Exception {
        report1=new RecruimentReport();
        reports=RecruitmentReportRepositoryImpl.getInstance();
    }
    public void recruimentreport() throws Exception {
        RecruimentReport newreport=new  RecruimentReport();
        newreport.show_report();
    }

    public void allreports(){
        reports.show();
    }
    public void specific(LocalDate local) throws Exception {
        reports.showspecificreport(local);
    }
}
