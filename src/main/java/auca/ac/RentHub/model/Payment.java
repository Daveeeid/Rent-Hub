package auca.ac.RentHub.model;

import java.time.LocalDate;

import auca.ac.RentHub.model.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String paymentId;
    private double amount;
    private LocalDate paymentDate;
    private LocalDate dueDate;

    @Enumerated (EnumType.STRING)
    private PaymentStatus status;
    private float lateFee;

    @ManyToOne 
    @JoinColumn (name = "agreement_id")
    private RentalAgreement rentalAgreement;

    public Payment() {
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public float getLateFee() {
        return lateFee;
    }

    public void setLateFee(float lateFee) {
        this.lateFee = lateFee;
    }

    

    
}
