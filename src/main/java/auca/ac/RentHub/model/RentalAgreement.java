package auca.ac.RentHub.model;

import java.time.LocalDate;
import java.util.List;

import auca.ac.RentHub.model.enums.AgreementStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "rental_agreements")
public class RentalAgreement {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
        private int id;
        private LocalDate startDate;
        private LocalDate endDate;
        private float monthlyRent;

        @Enumerated (EnumType.STRING)
        private AgreementStatus status;

        @OneToOne 
        @JoinColumn (name = "request_id")
        private RentalRequest rentalRequest;

        @OneToMany (mappedBy = "rentalAgreement")
        private List<Payment> payments;

        public RentalAgreement() {
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public LocalDate getStartDate() {
            return startDate;
        }
        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }
        public LocalDate getEndDate() {
            return endDate;
        }
        public void setEndDate(LocalDate endDate) {
            this.endDate = endDate;
        }
        public float getMonthlyRent() {
            return monthlyRent;
        }
        public void setMonthlyRent(float monthlyRent) {
            this.monthlyRent = monthlyRent;
        }
        public AgreementStatus getStatus() {
            return status;
        }
        public void setStatus(AgreementStatus status) {
            this.status = status;
        }

        
}
