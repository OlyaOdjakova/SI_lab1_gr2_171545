class Faculty {
  List<Student> students;
  public void addStudent(Student s) { 
    students.add(student)
  }
  public double averageGrade() {
    double sum = 0;
    foreach (Student s : students) {
      sum += s.getAverage();
    }
    return sum / students.length;
  }
}