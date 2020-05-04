/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;

/**
 *
 * @author Sukanta
 */
class RegistrationData implements Serializable {
    private String name;
    private String password;
    private String address;
    private String city;
    private String gender;
    private String dob;
    private String interests;
    private String currentDateValue;
    private String currentTimeValue;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the interests
     */
    public String getInterests() {
        return interests;
    }

    /**
     * @param interests the interests to set
     */
    public void setInterests(String interests) {
        this.interests = interests;
    }

    /**
     * @return the currentDateValue
     */
    public String getCurrentDateValue() {
        return currentDateValue;
    }

    /**
     * @param currentDateValue the currentDateValue to set
     */
    public void setCurrentDateValue(String currentDateValue) {
        this.currentDateValue = currentDateValue;
    }

    /**
     * @return the currentTimeValue
     */
    public String getCurrentTimeValue() {
        return currentTimeValue;
    }

    /**
     * @param currentTimeValue the currentTimeValue to set
     */
    public void setCurrentTimeValue(String currentTimeValue) {
        this.currentTimeValue = currentTimeValue;
    }
    
}
