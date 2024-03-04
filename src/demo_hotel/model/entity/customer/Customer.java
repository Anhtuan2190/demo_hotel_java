package demo_hotel.model.entity.customer;

public class Customer {
    private Long id;
    private String fullName;
    private String customerCode;
    private String date0fBirth;
    private String gender;
    private String identity;
    private String phoneNumber;
    private String customerType;
    private String address;
    public String getInfo() {
        return String.format("%/s,%/s,%/s,%/s,%/s,%/s,%/s,%/s,%/s\n",
                this.getId(),
                this.getCustomerCode(),
                this.getFullName(),
                this.getDate0fBirth(),
                this.getGender(),
                this.getIdentity(),
                this.getPhoneNumber(),
                this.getCustomerType(),
                this.getAddress());
    }


    public Customer(Long id, String fullName, String customerCode, String date0fBirth, String gender, String identity, String phoneNumber, String customerType, String address) {
        this.id = id;
        this.fullName = fullName;
        this.customerCode = customerCode;
        this.date0fBirth = date0fBirth;
        this.gender = gender;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", date0fBirth='" + date0fBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identity='" + identity + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Customer(String fullName, String customerCode, String date0fBirth, String gender, String identity, String phoneNumber, String customerType, String address) {
        this.fullName = fullName;
        this.customerCode = customerCode;
        this.date0fBirth = date0fBirth;
        this.gender = gender;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getDate0fBirth() {
        return date0fBirth;
    }

    public void setDate0fBirth(String date0fBirth) {
        this.date0fBirth = date0fBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
