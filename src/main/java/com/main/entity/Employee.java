package com.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="EMP_CONTROLLER_TAB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	  @Id
	  @SequenceGenerator(name = "emp_gen1", sequenceName = "EMP_SEQ1", initialValue = 1000, allocationSize = 1)
	  @GeneratedValue(generator = "emp_gen1", strategy = GenerationType.SEQUENCE)
      private Integer eno;
      private String ename;
      private Float esal;
      private String eaddr;
}
