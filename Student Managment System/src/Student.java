import java.util.Date;

public class Student {
    private String rollno;
    String name;
    String department;
    String bloodGroup;
    String phoneNo;
    static int count=1;
    Student(String name,String department,String bloodGroup,String phoneNo){
        this.name=name;
        this.department=department;
        this.bloodGroup=bloodGroup;
        this.phoneNo=phoneNo;
        this.rollno=assignRollno();
    }
    String getRollno(){ return rollno;}
    String getName(){return name;}
    String getDepartment(){return department;}
    String getBloodGroup(){return bloodGroup;}
    String getPhoneNo(){return phoneNo;}

    String assignRollno(){
        Date d=new Date();
        String rollno="parulUniversity-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rollno;
    }

    public String toString(){
        return "\nname: "+name+"\nRollNo: "+rollno+"\nDepartment: "+department+"\nBloodGroup: "+bloodGroup+"\nphoneNo: "+phoneNo+"\n";
    }
}
