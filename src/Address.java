public class Address {
    private String houseNum;
    private String strName;
    private String aptNum;
    private String city;
    private String state;
    private String zipcode;

    public Address(String houseNum, String streetName, String aptNum, String city, String state, String zip) {
        this.houseNum = houseNum;
        strName = streetName;
        this.aptNum = aptNum;
        this.city = city;
        this.state = state;
        zipcode = zip;
    }

    public Address(Address address) {
        houseNum = address.getHouseNum();
        strName = address.getStrName();
        aptNum = address.getAptNum();
        city = address.getCity();
        state = address.getState();
        zipcode = address.getZipcode();
    }

    public Address(String address) {
        int delim2 = 0;
        int delim1 = address.indexOf(" ");
        houseNum = address.substring(0, delim1);
        if (address.contains("Apt")) {
            delim2 = address.indexOf("Apt");
        } else {
            delim2 = address.indexOf(",");
        }
        strName = address.substring(delim1, delim2);
        if (address.contains("Apt")) {
            aptNum = address.substring(delim2, address.indexOf(","));
            address = address.substring((address.indexOf(",")) + 1);
        } else {
            address = address.substring(delim2 + 1);
        }
        city = address.substring(0, address.indexOf(","));
        address = address.substring(address.indexOf(",") + 1);
        state = address.substring(0, address.indexOf(" "));
        zipcode = address.substring(address.indexOf(" "));
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return houseNum + strName + aptNum + "," + city + "," + state + zipcode;
    }
}
