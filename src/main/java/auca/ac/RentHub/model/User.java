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

@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String id;

    @Column (name = "user_name")
    private String name;
    @Column (name = "phone_number")
    private String phoneNumber;
    @Column (name = "email")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column (name = "role")
    private UserRole role;

    @OneToMany (mappedBy = "landlord")
    private List<Property> properties;

    @OneToMany (mappedBy = "renter")
    private List<RentalRequest> rentalRequests;
    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    
}
