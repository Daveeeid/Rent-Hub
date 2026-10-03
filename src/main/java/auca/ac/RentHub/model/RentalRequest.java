package auca.ac.RentHub.model;

import java.time.LocalDate;

import auca.ac.RentHub.model.enums.RequestStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "rental_requests")
public class RentalRequest {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "request_date", nullable = false)
    private LocalDate requestDate;

    @Enumerated (EnumType.STRING)
    private RequestStatus status;
    @Column (name = "message", length = 255)
    private String message;

    @ManyToOne
    @JoinColumn(name = "renter_id")
    private User renter;

    @ManyToOne 
    @JoinColumn(name = "property_id")
    private Property property;

    @OneToOne (mappedBy = "rentalRequest")
    private RentalAgreement rentalAgreement;

    public RentalRequest() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getRequestDate() {
        return requestDate;
    }
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }
    public RequestStatus getStatus() {
        return status;
    }
    public void setStatus(RequestStatus status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public User getRenter() {
        return renter;
    }

    public void setRenter(User renter) {
        this.renter = renter;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public RentalAgreement getRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    
    
}
