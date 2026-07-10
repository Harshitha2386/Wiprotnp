package Miniproject.com.mile1.service;
import Miniproject.com.mile1.bean.Student;
import Miniproject.com.mile1.exception.NullMarksArrayException;
import Miniproject.com.mile1.exception.NullNameException;
import Miniproject.com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public void validate(Student s)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (s == null)
            throw new NullStudentObjectException();

        if (s.getName() == null)
            throw new NullNameException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();
    }

    // Find Grade
    public String findGrades(Student studentObject)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        validate(studentObject);

        int[] marks = studentObject.getMarks();

        int failedSubjects = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35)
                failedSubjects++;
        }

        if (failedSubjects == 0)
            return "A";

        else if (failedSubjects == 1)
            return "B";

        else if (failedSubjects == 2)
            return "C";

        else
            return "No Grade";
    }
}