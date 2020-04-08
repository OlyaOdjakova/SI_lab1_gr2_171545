class Student {
  	String index;
  	String firstName;
  	String lastName;
  	
	List<Integer> grades;
  	
public Student(String index, String firstName, String lastName){
    this.index = index;
    this.firstName = firstName;
    this.lastName = lastName;
 }
  public double getAverage(){
    double sum = 0;
    for (Integer g : grades) sum += g;
    return sum / grades.length;
  }

  public int ECTSCredits(){
    return grades.length * 6;
  }

}
