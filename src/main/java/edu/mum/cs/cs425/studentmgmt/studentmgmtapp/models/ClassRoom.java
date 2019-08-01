package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "classrooms")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classRoomId;
    @Column(nullable = false)
    private String buildingName;
    @Column(nullable = false)
    private String roomNumber;
    @OneToMany(mappedBy = "classRoom")
    private List<Student> student ;

    public ClassRoom() {
    }

    public ClassRoom(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        student =new ArrayList<>();
    }

    public Long getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(Long classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classRoomId=" + classRoomId +
                ", buildingName='" + buildingName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +

                '}';
    }
}
