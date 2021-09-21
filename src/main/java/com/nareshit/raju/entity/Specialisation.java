package com.nareshit.raju.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="specialisation_tab")
public class Specialisation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="spec_id_col")
	long id;
	@Column(name="spec_code_col")
	String code;
	@Column(name="spec_name_col")
	String name;
	@Column(name="spec_notes_col")
	String notes;

}
