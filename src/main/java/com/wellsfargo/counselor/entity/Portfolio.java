package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioID;

    @OneToMany
    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    public Portfolio(long portfolioID, long clientId, String creationDate) {
        this.portfolioID = portfolioID;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioID() {
        return portfolioID;
    }

    public void setPortfolioID(long portfolioID) {
        this.portfolioID = portfolioID;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
