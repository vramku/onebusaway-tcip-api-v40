//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PITripRequestFareConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PITripRequestFareConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareInstrumentID" type="{http://www.TCIP-Final-4-0-0}FC-FareInstrID" minOccurs="0"/&gt;
 *         &lt;element name="agencyID" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyID" minOccurs="0"/&gt;
 *         &lt;element name="monetaryInstID" type="{http://www.TCIP-Final-4-0-0}FC-MonetaryInstrType" minOccurs="0"/&gt;
 *         &lt;element name="rideInstID" type="{http://www.TCIP-Final-4-0-0}FC-RideInstrID" minOccurs="0"/&gt;
 *         &lt;element name="passInstID" type="{http://www.TCIP-Final-4-0-0}FC-PassInstrID" minOccurs="0"/&gt;
 *         &lt;element name="riderClass" type="{http://www.atis-partial-03-00-74}TravelerClass" minOccurs="0"/&gt;
 *         &lt;element name="adaNeeds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="adaNeed" type="{http://www.TCIP-Final-4-0-0}PI-ADANeed"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="costMax" type="{http://www.TCIP-Final-4-0-0}PI-MaxCost" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PITripRequestFareConstraints", propOrder = {
    "fareInstrumentID",
    "agencyID",
    "monetaryInstID",
    "rideInstID",
    "passInstID",
    "riderClass",
    "adaNeeds",
    "costMax"
})
public class PITripRequestFareConstraints {

    protected String fareInstrumentID;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger agencyID;
    @XmlSchemaType(name = "anySimpleType")
    protected String monetaryInstID;
    @XmlSchemaType(name = "unsignedByte")
    protected Short rideInstID;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger passInstID;
    @XmlSchemaType(name = "anySimpleType")
    protected String riderClass;
    protected PITripRequestFareConstraints.AdaNeeds adaNeeds;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer costMax;

    /**
     * Gets the value of the fareInstrumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInstrumentID() {
        return fareInstrumentID;
    }

    /**
     * Sets the value of the fareInstrumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInstrumentID(String value) {
        this.fareInstrumentID = value;
    }

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgencyID(BigInteger value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the monetaryInstID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonetaryInstID() {
        return monetaryInstID;
    }

    /**
     * Sets the value of the monetaryInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonetaryInstID(String value) {
        this.monetaryInstID = value;
    }

    /**
     * Gets the value of the rideInstID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRideInstID() {
        return rideInstID;
    }

    /**
     * Sets the value of the rideInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRideInstID(Short value) {
        this.rideInstID = value;
    }

    /**
     * Gets the value of the passInstID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassInstID() {
        return passInstID;
    }

    /**
     * Sets the value of the passInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassInstID(BigInteger value) {
        this.passInstID = value;
    }

    /**
     * Gets the value of the riderClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiderClass() {
        return riderClass;
    }

    /**
     * Sets the value of the riderClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiderClass(String value) {
        this.riderClass = value;
    }

    /**
     * Gets the value of the adaNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link PITripRequestFareConstraints.AdaNeeds }
     *     
     */
    public PITripRequestFareConstraints.AdaNeeds getAdaNeeds() {
        return adaNeeds;
    }

    /**
     * Sets the value of the adaNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PITripRequestFareConstraints.AdaNeeds }
     *     
     */
    public void setAdaNeeds(PITripRequestFareConstraints.AdaNeeds value) {
        this.adaNeeds = value;
    }

    /**
     * Gets the value of the costMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCostMax() {
        return costMax;
    }

    /**
     * Sets the value of the costMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCostMax(Integer value) {
        this.costMax = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="10"&gt;
     *         &lt;element name="adaNeed" type="{http://www.TCIP-Final-4-0-0}PI-ADANeed"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "adaNeed"
    })
    public static class AdaNeeds {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> adaNeed;

        /**
         * Gets the value of the adaNeed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adaNeed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdaNeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAdaNeed() {
            if (adaNeed == null) {
                adaNeed = new ArrayList<String>();
            }
            return this.adaNeed;
        }

    }

}
