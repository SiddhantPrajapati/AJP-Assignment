package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Spring")
public class RegVO {
  @Id
  @Column(name = "Id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(name = "StudentID")
  private String studentID;
  @Column(name = "Enrollment")
  private String enrollment;
  @Column(name = "Semester")
  private String semester;
  @Column(name = "SPI")
  private String spi;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getStudentID() {
    return studentID;
  }
  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }
  public String getEnrollment() {
    return enrollment;
  }
  public void setEnrollment(String enrollment) {
    this.enrollment = enrollment;
  }
  public String getSemester() {
    return semester;
  }
  public void setSemester(String semester) {
    this.semester = semester;
  }
  public String getSPI() {
    return spi;
  }
  public void setSPI(String spi) {
    this.spi = spi;
  }
}