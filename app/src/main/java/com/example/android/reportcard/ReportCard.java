package com.example.android.reportcard;

/**
 * Created by Michael Brown on 6/13/2017.
 */

public class ReportCard {

    /**Initializing student name and school subject grade variables as private
     * to the ReportCard class*/
    private String studentName;
    private char mathGrade;
    private char englishGrade;
    private char scienceGrade;
    private char historyGrade;

    /**Contructor initializing the class object with each variable*/
    public ReportCard(String studentName, char mathGrade, char englishGrade, char scienceGrade, char historyGrade) {
        this.studentName = studentName;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        this.historyGrade = historyGrade;
    }

    /**getter and setter functions allowing the retrieval and changing of student name,
     * math grade, english grade, and science grade*/
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(char mathGrade) {
        this.mathGrade = mathGrade;
    }

    public char getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(char englishGrade) {
        this.englishGrade = englishGrade;
    }

    public char getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(char scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public char getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(char historyGrade) {
        this.historyGrade = historyGrade;
    }

    /**Overriding toString method to present the user with readable text of the students name and
     * grades*/
    @Override
    public String toString() {
        return "Student ReportCard " +
                "\n Name: " + studentName +
                "\n Math Grade: " + mathGrade +
                "\n English Grade: " + englishGrade +
                "\n Science Grade: " + scienceGrade +
                "\n History Grade: " + historyGrade;
    }
}
