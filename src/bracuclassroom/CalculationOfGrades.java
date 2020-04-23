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
public class CalculationOfGrades {

    private int Quiz1; //raw data ta emne emnei convert kore nibe
    private int Quiz2;
    private int Quiz3;
    private int Assignment;
    private int MidExam;
    private int FinalExam;
    private int TotalMarksBeforeMid;
    private int TotalMarksFinal;
    
    private int  MaximumQuiz1; //the best ones taken
    private int MaximumQuiz2;
    
    private String FinalGrade;
    
public CalculationOfGrades(int Quiz1, int Quiz2 ,int Quiz3, int Assignment, int MidExam ,int FinalExam,int TotalMarksBeforeMid,int TotalMarksFinal ,String FinalGrade){

 
 this.Quiz1=Quiz1;
 this.Quiz2=Quiz2;
 this.Quiz3=Quiz3;
 this.Assignment=Assignment;
 this.MidExam=MidExam;
 this.FinalExam=FinalExam;
 this.TotalMarksBeforeMid=TotalMarksBeforeMid;
 this.TotalMarksFinal=TotalMarksFinal;
 this.FinalGrade=FinalGrade;
 
 
  if(this.Quiz1>=this.Quiz2){ //for Quiz 1 check
MaximumQuiz1=this.Quiz1;
}
else if(this.Quiz2>=this.Quiz1){ //for Quiz 2 check
MaximumQuiz1=this.Quiz2;
}
MaximumQuiz2=this.Quiz3;

//SOLID MARKS ARE TAKEN


this.TotalMarksBeforeMid=MaximumQuiz1+this.Assignment+this.MidExam;
this.TotalMarksFinal=MaximumQuiz2+this.FinalExam+this.TotalMarksBeforeMid;

System.out.println("inside the calulation class"+TotalMarksFinal);
//////////////grade calculation
if(this.TotalMarksFinal<50){
this.FinalGrade="F";
}else if(this.TotalMarksFinal==50){
this.FinalGrade="E";
}else if((this.TotalMarksFinal>50)&&(this.TotalMarksFinal<=55)){
this.FinalGrade="D+";
}else if((this.TotalMarksFinal>55)&&(this.TotalMarksFinal<=60))
this.FinalGrade="D";
else if((this.TotalMarksFinal>60)&&(this.TotalMarksFinal<=65)){
this.FinalGrade="C-";
}else if((this.TotalMarksFinal>65)&&(this.TotalMarksFinal<=70)){
this.FinalGrade="C";
}else if((this.TotalMarksFinal>70)&&(this.TotalMarksFinal<=75)){
this.FinalGrade="C+";
}else if((this.TotalMarksFinal>75)&&(this.TotalMarksFinal<=80)){
this.FinalGrade="B-";
}else if((this.TotalMarksFinal>80)&&(this.TotalMarksFinal<=85)){
this.FinalGrade="B";
}else if((this.TotalMarksFinal>85)&&(this.TotalMarksFinal<=90)){
this.FinalGrade="B+";
}else if((this.TotalMarksFinal>90)&&(this.TotalMarksFinal<=95)){
this.FinalGrade="A-";
}else if((this.TotalMarksFinal>95)&&(this.TotalMarksFinal<=100)){
this.FinalGrade="A+";
}

//////////////grade calculation
//calculation done

System.out.println("Final Grade "+this.FinalGrade);

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
  public int getTotalMarksBeforeMid(){ //calculated
 return TotalMarksBeforeMid;
 }

    public int getTotalMarksFinal(){ //calculated
 return TotalMarksFinal;
 }
public String getFinalGrade(){
 return FinalGrade;
 } //end of the method
 
                                  








}
 



 
            

 
    

