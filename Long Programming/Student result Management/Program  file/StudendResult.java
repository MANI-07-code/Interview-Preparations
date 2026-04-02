public class StudendResult {
    private int sid;
    private String name;
    private String Dofb;
    private Exam examresult;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDofb() {
        return Dofb;
    }
    public void setDofb(String dofb) {
        this.Dofb = dofb;
    }
    public Exam getExamresult() {
        return examresult;
    }
    public void setExamresult(Exam examresult) {
        this.examresult = examresult;
    }
    public StudendResult(int sid, String name, String dofb, Exam ex) {
        this.sid = sid;
        this.name = name;
        this.Dofb = dofb;
        this.examresult = ex;
    }
    
    public StudendResult(int sid, String name, String dofb) {
        this.sid = sid;
        this.name = name;
        Dofb = dofb;
    }
    public StudendResult() {}
    
}
