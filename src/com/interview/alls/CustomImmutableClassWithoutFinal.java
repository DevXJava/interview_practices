package com.interview;
import java.util.Date;

class AddressNonFinal {
    private String city;
    private String state;

    public AddressNonFinal(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}


final class EmployeeFinal {
    private final int id;
    private final String name;
    private final Date dateOfJoining;
    private final AddressNonFinal address;

    public EmployeeFinal(int id, String name, Date dateOfJoining, AddressNonFinal address) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = new Date(dateOfJoining.getTime()); // defensive copy
        this.address = copyAddress(address); // deep defensive copy
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfJoining() {
        return new Date(dateOfJoining.getTime()); // defensive copy
    }

    public AddressNonFinal getAddress() {
        return copyAddress(address); // return a copy to avoid mutation
    }
    // This is mandatory method
    private AddressNonFinal copyAddress(AddressNonFinal original) {
        if (original == null) return null;
        return new AddressNonFinal(original.getCity(), original.getState());
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', dateOfJoining=" + dateOfJoining + ", address=" + address + '}';
    }
}


public class CustomImmutableClassWithoutFinal {

	public static void main(String[] args) {
		AddressNonFinal address = new AddressNonFinal("Pune", "MH");
        Date doj = new Date();

        EmployeeFinal emp = new EmployeeFinal(1, "Niraj", doj, address);

        // External changes
        address.setCity("Delhi");
        doj.setTime(0);

        // Try to mutate through getter
        emp.getAddress().setCity("Bangalore");

        System.out.println(emp); // Still shows original "Pune", not "Delhi" or "Bangalore"

	}

}
