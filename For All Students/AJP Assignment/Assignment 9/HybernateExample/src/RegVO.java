package com.vo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "hibernate_tbl")
public class RegVO {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private int id;
  @Column(name = "FirstName")
  private String fn;
  @Column(name = "LastName")
  private String ln;
  @Column(name = "Contact_Number")
  private String cn;
  @Column(name = "Address")
  private String add;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getFn() {
    return fn;
  }
  public void setFn(String fn) {
    this.fn = fn;
  }
  public String getLn() {
    return ln;
  }
  public void setLn(String ln) {
    this.ln = ln;
  }
  public String getCn() {
    return cn;
  }
  public void setCn(String cn) {
    this.cn = cn;
  }
  public String getAdd() {
    return add;
  }
  public void setAdd(String add) {
    this.add = add;
  }
}