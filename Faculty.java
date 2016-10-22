public class Faculty
{

private String firstName;
private String lastName;
private String department;
private String researchArea;
private double monthly_salary;
private boolean hourlyPaid;
private double hourlyRate;

public Faculty(String fName, String lName, String dep, String res, boolean hp, double ms, double hr)
{
  firstName= fName;
  lastName = lName;
  department = dep;
  researchArea = res;
  hourlyPaid = hp;
  monthly_salary = ms;
  hourlyRate = hr;

}
public void viewFaculty()
{

  System.out.println();
  System.out.println("First Name:" + firstName);
  System.out.println("Last Name:" + lastName);
  System.out.println("Department:" + department);
  System.out.println("Research Area:" + researchArea);
  if(hourlyPaid)
   System.out.println("Hourly Rate:" + hourlyRate);
  else
   System.out.println("Monthly Salary:" + monthly_salary);


}


}