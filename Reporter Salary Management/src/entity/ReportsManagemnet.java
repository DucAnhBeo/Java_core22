package entity;

import java.util.Arrays;

public class ReportsManagemnet {
    private Reporter reporter;
    ReportsManagementDetail[] details;

    public ReportsManagemnet(Reporter reporter, ReportsManagementDetail[] details) {
        this.reporter = reporter;
        this.details = details;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public ReportsManagementDetail[] getDetails() {
        return details;
    }

    public void setDetails(ReportsManagementDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ReportsManagemnet{" +
                "reporter=" + reporter +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
