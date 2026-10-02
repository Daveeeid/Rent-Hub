package auca.ac.RentHub.model;

import java.util.List;

import auca.ac.RentHub.model.enums.AvailabilityStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "properties")
public class Property {

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String location;
    private float price;
    @Column (name = "number_of_rooms")
    private int numberOfRooms;
    @Column (name = "property_type")
    private String propertyType;
    private String description;

    @Enumerated(EnumType.STRING)
    private AvailabilityStatus status;

    @ManyToMany
    @JoinTable (
        joinColumns = @JoinColumn (name = "property_id"),
        inverseJoinColumns = @JoinColumn (name = "amenity_id")
    )
    private List<Amenity> amenities;

    @ManyToOne 
    @JoinColumn (name = "landlord_id")
    private User landlord;

    @OneToMany (mappedBy = "property")
    private List<RentalRequest> rentalRequests;

    @OneToMany (mappedBy = "property")
    private List<PropertyImage> propertyImages;

    public Property(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AvailabilityStatus getStatus() {
        return status;
    }

    public void setStatus(AvailabilityStatus status) {
        this.status = status;
    }

    
}
