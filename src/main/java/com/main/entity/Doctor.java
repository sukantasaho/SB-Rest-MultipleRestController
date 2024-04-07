package com.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Jpa_Doctor_Info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor
{     
	
	  @Id
	  @SequenceGenerator(name = "doctor_gen1", sequenceName = "DOCTOR_REST_SEQ1", initialValue = 5000, allocationSize = 1)
	  @GeneratedValue(generator = "doctor_gen1", strategy = GenerationType.SEQUENCE)
	  @Column(name="DOC_ID")
      private Integer docId;
	  
	  @Column(name="DOC_NAME")
      private String docName;
	  @Column(name="INCOME")
      private Float income;
	  @Column(name="SPECIALIZATION")
      private String specialization;
}
