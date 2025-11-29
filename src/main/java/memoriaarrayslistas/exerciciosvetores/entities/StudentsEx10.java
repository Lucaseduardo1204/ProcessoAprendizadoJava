package memoriaarrayslistas.exerciciosvetores.entities;

public class StudentsEx10 {
    private String name;
    private double firstGrade;
    private double secondGrade;

    public StudentsEx10(String name, double firstGrade, double secondGrade){
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public boolean pass(){
        if ((firstGrade+secondGrade) / 2 < 6.0){
            return false;
        }
        return true;
    }

}
