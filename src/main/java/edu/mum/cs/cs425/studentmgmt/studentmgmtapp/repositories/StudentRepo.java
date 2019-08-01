package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repositories;

import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {

}
