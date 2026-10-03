package auca.ac.RentHub.model;

import java.util.List;

import auca.ac.RentHub.model.enums.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "user_name")
    private String name;
    @Column (name = "phone_number")
    private String phoneNumber;
    @Column (name = "email", unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    @Column (name = "role")
    private UserRole role;

    @OneToMany (mappedBy = "landlord")
    private List<Property> properties;

    @OneToMany (mappedBy = "renter")
    private List<RentalRequest> rentalRequests;
    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<RentalRequest> getRentalRequests() {
        return rentalRequests;
    }

    public void setRentalRequests(List<RentalRequest> rentalRequests) {
        this.rentalRequests = rentalRequests;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
