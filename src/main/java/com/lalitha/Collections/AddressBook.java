package com.lalitha.Collections;

public class AddressBook {
    private String streetName;
    private int streetNo;
    private String city;
    private String state;
    private int zipCode;

    public AddressBook(String streetName, int streetNo, String city, String state, int zipCode){
        this.streetName = streetName;
        this.streetNo = streetNo;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "streetName='" + streetName + '\'' +
                ", streetNo=" + streetNo +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressBook)) return false;

        AddressBook that = (AddressBook) o;

        if (streetNo != that.streetNo) return false;
        if (zipCode != that.zipCode) return false;
        if (streetName != null ? !streetName.equals(that.streetName) : that.streetName != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        return state != null ? state.equals(that.state) : that.state == null;
    }

    @Override
    public int hashCode() {
        int result = streetName != null ? streetName.hashCode() : 0;
        result = 31 * result + streetNo;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + zipCode;
        return result;
    }
}
