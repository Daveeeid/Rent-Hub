package auca.ac.RentHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PropertyImage {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String imageUrl;
    
    @ManyToOne 
    @JoinColumn (name = "property_id")
    private Property property;
    public PropertyImage() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    
}
