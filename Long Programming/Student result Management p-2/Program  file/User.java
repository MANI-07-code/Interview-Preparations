public class User {
    private int teacherId=1001;
    private int teacherpassword=1234;
    
  boolean authentication(int tid ,int tpass)
  {
    if(teacherId==tid && teacherpassword==tpass) return true;
    return false;
  }

    
    
    
}
