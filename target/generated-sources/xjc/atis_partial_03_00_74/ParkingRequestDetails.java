//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package atis_partial_03_00_74;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import lrms_final_09_07_for_atis_im.Distance;


/**
 * <p>Java class for ParkingRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingRequestDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleData" type="{http://www.atis-partial-03-00-74}VehicleRestrictions" minOccurs="0"/&gt;
 *         &lt;element name="lengthofStay" type="{http://www.atis-partial-03-00-74}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="parkingType" type="{http://www.atis-partial-03-00-74}PI-ParkingType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="radius" type="{http://www.lrms-final-09-07-for-atis-im}Distance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingRequestDetails", propOrder = {
    "vehicleData",
    "lengthofStay",
    "parkingType",
    "radius"
})
public class ParkingRequestDetails {

    protected VehicleRestrictions vehicleData;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer lengthofStay;
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> parkingType;
    protected Distance radius;

    /**
     * Gets the value of the vehicleData property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRestrictions }
     *     
     */
    public VehicleRestrictions getVehicleData() {
        return vehicleData;
    }

    /**
     * Sets the value of the vehicleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRestrictions }
     *     
     */
    public void setVehicleData(VehicleRestrictions value) {
        this.vehicleData = value;
    }

    /**
     * Gets the value of the lengthofStay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLengthofStay() {
        return lengthofStay;
    }

    /**
     * Sets the value of the lengthofStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLengthofStay(Integer value) {
        this.lengthofStay = value;
    }

    /**
     * Gets the value of the parkingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParkingType() {
        if (parkingType == null) {
            parkingType = new ArrayList<String>();
        }
        return this.parkingType;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setRadius(Distance value) {
        this.radius = value;
    }

}