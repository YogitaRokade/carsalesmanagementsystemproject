package com.carsales.entity;


import java.util.List;
//import javax.validation.constraints.Email;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "customer")

//customer entity class
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMERID",length = 10, unique = true, nullable = false)
	private Integer customerId;
	

	@Column(name="NAME",length = 30,nullable = false)
	private String cname;
	
	@Column(name="Email",length = 40, unique = true, nullable = false)
	private String email;
	
	@Column(name="PHONENO", unique = true, nullable = false )
	private Double phoneNumber;
	
	@Column(name="ADDRESS",nullable = false)
	private String address;
	

	@OneToMany(mappedBy = "customer",  cascade = CascadeType.ALL)
	private List<Cars> car;


}
