public class Exam {
    private int tamil;
    private int english;
    private int maths;
    private int science;
    private int social;
    Exam(){}
    Exam(int tamil,int english,int maths,int science,int social)
    {
        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;

    }
    public int getTamil() {
        return tamil;
    }
    public int getEnglish() {
        return english;
    }
    public int getMaths() {
        return maths;
    }
    public int getScience() {
        return science;
    }
    public int getSocial() {
        return social;
    }
    public void setTamil(int tamil) {
        this.tamil = tamil;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public void setMaths(int maths) {
        this.maths = maths;
    }
    public void setScience(int science) {
        this.science = science;
    }
    public void setSocial(int social) {
        this.social = social;
    }
    

}
