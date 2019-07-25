package com.project.storedata;

@Entity(name = "new_schema_default")
public class Student {
	@Id
	private Integer id;
	private String name;
	private String email;
	private String address;
	
	public int getId() {
        return this.id;
    }
    // setter method
	public void setId(int id) {
        this.id = id;
    }
	
	public int getName() {
        return this.name;
    }
    // setter method
	public void setName(String name) {
        this.name = name;
    }
	
	public int getEmail() {
        return this.email;
    }
    // setter method
	public void setEmail(String email) {
        this.email = email;
    }
	
	public int getAddress() {
        return this.address;
    }
    // setter method
	public void setAddress(String address) {
        this.address = address;
    }

}
