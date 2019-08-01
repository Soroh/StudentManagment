package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.models;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(nullable = false)
    private String studentNumber;
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @Column(nullable = false)
    private String lastName;
    private Double cgpa;
    @Column(nullable = false)
    private LocalDate dataOfEnrollment;
    @OneToOne
    @JoinColumn(name = "transcript_id")
    private Transcript transcript;
    @ManyToOne
    @JoinColumn(name = "class_room_id")
    private ClassRoom classRoom;


    public Student() {
    }

    public Student(String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dataOfEnrollment, Transcript transcript, ClassRoom classRoom) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dataOfEnrollment = dataOfEnrollment;
        this.transcript = transcript;
        this.classRoom = classRoom;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDataOfEnrollment() {
        return dataOfEnrollment;
    }

    public void setDataOfEnrollment(LocalDate dataOfEnrollment) {
        this.dataOfEnrollment = dataOfEnrollment;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dataOfEnrollment=" + dataOfEnrollment +
                ",\n\t transcript=" + transcript +
                ",\n\t classRoom=" + classRoom +
                '}';
    }

}
