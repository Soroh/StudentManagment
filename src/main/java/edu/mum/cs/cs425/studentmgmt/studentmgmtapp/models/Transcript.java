package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.models;

import javax.persistence.*;

@Entity
@Table(name = "transcripts")
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transcriptId;
    @Column(nullable = false)
    private String degreeTitle;
    @OneToOne(mappedBy = "transcript")
    private Student  student;

    public Transcript() {

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;

    }

    public Long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(Long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "transcriptId=" + transcriptId +
                ", degreeTitle='" + degreeTitle + '\'' +

                '}';
    }
}
