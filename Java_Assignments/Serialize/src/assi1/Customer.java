package assi1;

import java.io.Serializable;

public class Customer implements Serializable {
private int custid ;
private String custname;
private String address; 
private int age;
public Customer(int custid, String custname, String address, int age) {
	super();
	this.custid = custid;
	this.custname = custname;
	this.address = address;
	this.age = age;
}
@Override
public String toString() {
	return "Customer [custid=" + custid + ", custname=" + custname + ", address=" + address + ", age=" + age + "]";
}


}
