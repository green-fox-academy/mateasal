package com.example.workshop1.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(nullable = true, name = "CreatedAt")
  private Timestamp createdAt;
  @Column(nullable = true, name = "EndPoint")
  private String endPoint;
  @Column(nullable = true, name = "Data")
  private String data;

  public Log(Timestamp createdAt, String endPoint, String data) {
    this.createdAt = createdAt;
    this.endPoint = endPoint;
    this.data = data;
  }

  public Log() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
