import data.Student;
import data.StudentDatabase;

class MapFilterReduce {

  public static int noOfNoteBooks() {
    return StudentDatabase.getAllStudents().stream()
      .filter(student -> student.getGradeLevel() >= 3)
      .filter(student -> student.getGender().equalsIgnoreCase("female"))
      .map(Student::getNoOfNotebooks)
      .reduce(0, Integer::sum);
  }

  public static void main(String[] args) {
    System.out.println(noOfNoteBooks());
  }

}
