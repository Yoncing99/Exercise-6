public class Student{
	//list of data members
private String matricNo;
	private double test1, test2, averageMark;
	
	//constructor
	public Student(String matric, double ts1, double ts2 ){
		matricNo = matric;
		test1 = ts1;
		test2 = ts2;	 
	}
	//method that returns some of students’ info
	public String getStudentInfo()
{
		return "\t"+matricNo+"\t\t"+averageMark;
	}
	//method that calculates the average of 2 tests
public void calculateAverage()
	{
		averageMark = (test1 + test2)/2;
	} 
  }//end of class Student

