package com.denizturkmen.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Adress_table")
public class Adress {

	// Not foreign key ile bağlı olan alanları tostring almıyorsun
	// çünkü ben session employee.getadress bilgisini yazdırıyorum sys ile kendim

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Adres_ID")
	private Integer adressId;

	@Column(name = "Street")
	private String street;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	@Column(name = "Pin_Code")
	private Long pin_code;

	// Mapped by foreign key ile baglanan class daki filed ismini aynısı alcak
	// ÇOk adres bir employee ait
	@ManyToOne
	@JoinColumn(name = "Employee_id")
	private Employee employee;

	public Integer getAdressId() {
		return adressId;
	}

	public void setAdressId(Integer adressId) {
		this.adressId = adressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPin_code() {
		return pin_code;
	}

	public void setPin_code(Long pin_code) {
		this.pin_code = pin_code;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", state=" + state + ", pin_code=" + pin_code + "]";
	}

}
