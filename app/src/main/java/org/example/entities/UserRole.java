package org.example.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity     //make it as this class as entity
@Data
@ToString
@NoArgsConstructor // automatic defaulat constructor
@AllArgsConstructor  // constructor with all the parameter of class;
@Table(name = "roles")

public class UserRole {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name="role_id")

       private Long roleId;
       private String name;

}
