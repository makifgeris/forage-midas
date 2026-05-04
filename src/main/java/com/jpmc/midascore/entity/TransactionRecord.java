package com.jpmc.midascore.entity;
import jakarta.persistence.*;
@Entity
public class TransactionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private UserRecord sender;
    @ManyToOne(optional = false)
    private UserRecord recipient;
    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private float incentive;
    protected TransactionRecord() {}

        public TransactionRecord(UserRecord sender, UserRecord recipient, double amount, float incentive)
        {
            this.sender=sender;
            this.recipient=recipient;
            this.amount=amount;
            this.incentive=incentive;
        }
        public double getAmount() { return amount; }
        public UserRecord getSender() { return sender; }
    public UserRecord getRecipient() { return recipient; }

}
