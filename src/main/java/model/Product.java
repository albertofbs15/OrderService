package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by AHernandezS on 7/11/2017.
 */
@Entity
@Table
public class Product {

    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private Date spectacleDate;
    @Column
    private Date arrivalDate;
    @Column
    private Date departureDate;
    @Column
    private int transportCode;
    @Column
    private int spectacleCode;
    @Column
    private int lodgingCode;
    @Column
    private String description;
    @Column
    private String imageReference;
    @Column
    private String sourceCity;
    @Column
    private String targetCity;

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

    public Date getSpectacleDate() {
        return spectacleDate;
    }

    public void setSpectacleDate(Date spectacleDate) {
        this.spectacleDate = spectacleDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getTransportCode() {
        return transportCode;
    }

    public void setTransportCode(int transportCode) {
        this.transportCode = transportCode;
    }

    public int getSpectacleCode() {
        return spectacleCode;
    }

    public void setSpectacleCode(int spectacleCode) {
        this.spectacleCode = spectacleCode;
    }

    public int getLodgingCode() {
        return lodgingCode;
    }

    public void setLodgingCode(int lodgingCode) {
        this.lodgingCode = lodgingCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageReference() {
        return imageReference;
    }

    public void setImageReference(String imageReference) {
        this.imageReference = imageReference;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(String targetCity) {
        this.targetCity = targetCity;
    }
}
