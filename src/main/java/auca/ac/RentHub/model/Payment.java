package auca.ac.RentHub.model;

import java.time.LocalDate;

import auca.ac.RentHub.model.enums.PaymentStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "payments")
public class Payment {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int paymentId;
    @Column (name = "amount", nullable = false)
    private double amount;
    @Column (name = "payment_date")
    private LocalDate paymentDate;
    @Column (name = "due_date", nullable = false)
    private LocalDate dueDate;

    @Enumerated (EnumType.STRING)
    @Column (name = "status", nullable = false)
    private PaymentStatus status;
    @Column (name = "late_fee", nullable = false)
    private double lateFee;

    @ManyToOne 
    @JoinColumn (name = "agreement_id")
    private RentalAgreement rentalAgreement;

    public Payment() {
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
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

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public RentalAgreement getRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    

    
}
