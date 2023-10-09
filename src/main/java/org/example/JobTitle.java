package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JobTitle implements Title{
    private String jobTitleName;

    @Override
    public String getTitle() {
        return jobTitleName;
    }

    @Override
    public void setTitle(String jobTitleName) {
        this.jobTitleName = jobTitleName;
    }

    @Override
    public String toString() {
        return jobTitleName;
    }
}
