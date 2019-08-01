package edu.mum.cs.cs425.studentmgmt.studentmgmtapp;

import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.models.ClassRoom;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.models.Student;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.models.Transcript;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repositories.ClassRoomRepo;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repositories.StudentRepo;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repositories.TranscriptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentmgmtappApplication implements CommandLineRunner {

    @Autowired
    private ClassRoomRepo classRoomRepo;
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private TranscriptRepo transcriptRepo;



    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtappApplication.class, args);


    }
    @Override
    public void run(String... args) throws Exception {
        ClassRoom c1= new ClassRoom("Library","M123");
        ClassRoom c2= new ClassRoom("Library","M124");
        ClassRoom c3= new ClassRoom("Library","M125");

        c1 = classRoomRepo.save(c1);
        c2 = classRoomRepo.save(c2);
        c3 = classRoomRepo.save(c3);

        Transcript t1= new Transcript("Computer Science");
        Transcript t2= new Transcript("History");
        Transcript t3= new Transcript("MBA");

         t1 = transcriptRepo.save(t1);
         t2 = transcriptRepo.save(t2);
         t3 = transcriptRepo.save(t3);

        Student student = new Student("S102","Faustine","Moogi","Soroncho",3.5,
                LocalDate.of(1997,7,1),t1,c1);
        c1.getStudent().add(student);
        student=studentRepo.save(student);
        student = new Student("S102","Faustine","Moogi","Soroncho",3.5,
                LocalDate.of(1997,7,1),t2,c1);
        c1.getStudent().add(student);
        student=studentRepo.save(student);
         student = new Student("S102","Faustine","Moogi","Soroncho",3.5,
                LocalDate.of(1997,7,1),t3,c2);
        c2.getStudent().add(student);
        student=studentRepo.save(student);

        System.out.println("###################################################");
        c1.getStudent().stream().forEach(x->{
            if(x!=null)
            System.out.println(x);
        });
        System.out.println("###################################################");
    }



}
