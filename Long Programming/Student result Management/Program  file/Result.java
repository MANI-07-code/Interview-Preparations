import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Result {
    public static void main(String[] args) {

        
    List<StudendResult> list=new ArrayList<>();
    Exam exam =new Exam();
    StudendResult student= new StudendResult(101,"mani","27-10-2005"); 
    StudendResult student1=new StudendResult(102,"bharath","18-01-2005");

    list.add(student);
    list.add(student1);
    Scanner sc=new Scanner(System.in);
    int n=0;

    while(n!=3){
        System.out.println("Who you are ?:\n 1.teacher \n 2.student ");
        
             n=sc.nextInt();
             if(n==3)
                break;
    if(n==1){
        System.out.println("Enter teacher id and password :");
        int tid=sc.nextInt();
        int tpass=sc.nextInt();
        User user =new User();
        if(user.authentication(tid,tpass)){
        while(true){
        System.out.println("Enter student_id:"); 
        int sid=sc.nextInt();
        sc.nextLine();
        int flag=0;
        for(StudendResult s:list){
    
        if(sid==s.getSid())
        {
            flag=1;
            System.out.println("Enter the student marks for all subject:");
            int t=sc.nextInt();
            //exam.setTamil(t);
            int e=sc.nextInt();
            //exam.setEnglish(e);
            int m=sc.nextInt();
            //exam.setMaths(m);
            int sci=sc.nextInt();
            //exam.setScience(sci);
            int soc=sc.nextInt();
            Exam ex = new Exam(t,e,m,sci,soc);
            //exam.setSocial(soc);
            s.setExamresult(ex);
            break;
        }
    }
    if(flag==0){
        System.out.println("Invalid student id");
    }
    else{
            System.out.println("Do you want to add marks for another student \n say Y or N ");
            char ch=sc.next().charAt(0);
            if(ch=='N')
            {
                break;
            }
        }
    }
    System.out.println("If you want to exit \n Enter 3 \n if you want to continue  else 1");
    n=sc.nextInt();
}
    }


else if(n==2){
    int f=0;
    while(f==0){
        
        System.out.println("Enter student_id:");
        int st_id =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student dofb: ");
        String dateofb=sc.nextLine();
        int flg=0;
        for(StudendResult s : list){
            if(st_id==s.getSid() && dateofb.equals(s.getDofb()))
                {
                    flg=1;
                    System.out.println("login sucessfull !!");
                    if(s.getExamresult() !=null){
                        System.out.println(s.getName()+" your marks are :\n Tamil :"+ s.getExamresult().getTamil()+"\n Englis :"+s.getExamresult().getEnglish()+"\n Maths :"+s.getExamresult().getMaths()+"\n Science :"+s.getExamresult().getScience()+"\n Social:"+s.getExamresult().getSocial());
                    }
                    else{
                        System.out.println("your marks not updated!!");
                    }
                }
}
if(flg==0)
    {
        System.out.println("Invalid data");
    }
    else{
        System.out.println("Do you want to retry\n say Y or N");
        char cr = sc.next().charAt(0);
        if(cr=='N')
            {
                f=1;
            }
        }
    }
    
    System.out.println("If you want to exit \n Enter 3 \n if you want to continue  else 1");
    n=sc.nextInt();
}

}
    }
}