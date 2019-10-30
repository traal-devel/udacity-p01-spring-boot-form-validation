package ch.traal.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class User {
  
  /* member variables */
  @NotEmpty(message = "username cannot be empty")
  private String name;
  
  @NotBlank(message = "password cannot be empty")
  @Length(min=6, max=10, message="Length of password not valid")
  private String password;

  @Min(value=0)
  @Max(value=100)
  private Double grade;
  
  @Email
  @NotEmpty
  private String email;


  /* constructors */
  public User(String name, String password, Double grade) {
      this.name = name;
      this.password = password;
      this.grade = grade;
  }


  /* methods */
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public Double getGrade() {
    return grade;
  }


  public void setGrade(Double grade) {
    this.grade = grade;
  }
  
  
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }

  
}