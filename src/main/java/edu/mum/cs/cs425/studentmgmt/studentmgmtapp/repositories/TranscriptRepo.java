package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repositories;

import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.models.Transcript;
import org.springframework.data.repository.CrudRepository;

public interface TranscriptRepo extends CrudRepository<Transcript,Long> {
}
