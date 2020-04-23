/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracuclassroom;

/**
 *
 * @author hamza
 */
public class Faculty {
    private String FacultyName;
    private String FacultyID;
    private String StudentName;
    private String StudentID;
    private String Section;
    private String CurrentSemester;
    private String Course;
    private int Quiz1; //raw data ta emne emnei convert kore nibe
    private int Quiz2;
    private int Quiz3;
    private int Assignment;
    private int MidExam;
    private int FinalExam;
    private int TotalMarksBeforeMid;
    private int TotalMarksFinal;
    private String FinalGrade;
    
public Faculty(String FacultyName,String FacultyID,String StudentName,String StudentID,String Section,String CurrentSemester, String Course,int Quiz1, int Quiz2 ,int Quiz3, int Assignment, int MidExam ,int FinalExam,int TotalMarksBeforeMid,int TotalMarksFinal ,String FinalGrade){

 this.FacultyName=FacultyName;
 this.FacultyID=FacultyID;
 this.StudentName=StudentName;
 this.StudentID=StudentID;
 this.Section=Section;
 this.CurrentSemester=CurrentSemester;
 this.Course=Course;
 this.Quiz1=Quiz1;
 this.Quiz2=Quiz2;
 this.Quiz3=Quiz3;
 this.Assignment=Assignment;
 this.MidExam=MidExam;
 this.FinalExam=FinalExam;
 this.TotalMarksBeforeMid=TotalMarksBeforeMid;
 this.TotalMarksFinal=TotalMarksFinal;
 this.FinalGrade=FinalGrade;
 
}   

    Faculty(String StudentName,String StudentID) {
        
 this.StudentName=StudentName;
 this.StudentID=StudentID;
 
     //To change body of generated methods, choose Tools | Templates.
        
        
        
    }
 public String getFacultyName(){
 return FacultyName;
 } 
 public String getFacultyID(){
 return FacultyID;
 }
 public String getStudentName(){
 return StudentName;
 }
 public String getStudentID(){
 return StudentID;
 }
 public String getSection(){
 return Section;
 }
 public String getCurrentSemester(){
 return CurrentSemester;
 }
 public String getCourse(){
 return Course;
 }
 public int getQuiz1(){
 return Quiz1;
 }
 public int getQuiz2(){
 return Quiz2;
 }
 public int getQuiz3(){
 return Quiz3;
 }
 public int getAssignment(){
 return Assignment;
 }
 public int getMidExam(){
 return MidExam;
 }
 public int getFinalExam(){
 return FinalExam;
 }
  public int getTotalMarksBeforeMid(){
 return TotalMarksBeforeMid;
 }
   public int getTotalMarksFinal(){
 return TotalMarksFinal;
 }
public String getFinalGrade(){
 return FinalGrade;
 } //end of the method
 
                                  








}
 



 
            

 
    

