package auca.ac.RentHub.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "amenities")
public class Amenity {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "amenity_name", nullable = false)
    private String name;

    @ManyToMany (mappedBy = "amenities")
    private List<Property> properties;

    public Amenity() {
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

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
    
}
