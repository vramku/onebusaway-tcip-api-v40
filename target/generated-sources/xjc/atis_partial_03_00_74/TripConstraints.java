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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="5"&gt;
 *                   &lt;element name="mode" type="{http://www.atis-partial-03-00-74}Mode"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="needs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="5"&gt;
 *                   &lt;element name="need" type="{http://www.atis-partial-03-00-74}ADA-Access"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="vehicleRestrictions" type="{http://www.atis-partial-03-00-74}VehicleRestrictions" minOccurs="0"/&gt;
 *         &lt;element name="otherNeeds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="5"&gt;
 *                   &lt;element name="otherNeed" type="{http://www.atis-partial-03-00-74}AmenitiesList"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="vehicleNeeds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="5"&gt;
 *                   &lt;element name="vehicleNeed" type="{http://www.atis-partial-03-00-74}AmenitiesList"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripConstraints", propOrder = {
    "modes",
    "needs",
    "vehicleRestrictions",
    "otherNeeds",
    "vehicleNeeds"
})
public class TripConstraints {

    protected TripConstraints.Modes modes;
    protected TripConstraints.Needs needs;
    protected VehicleRestrictions vehicleRestrictions;
    protected TripConstraints.OtherNeeds otherNeeds;
    protected TripConstraints.VehicleNeeds vehicleNeeds;

    /**
     * Gets the value of the modes property.
     * 
     * @return
     *     possible object is
     *     {@link TripConstraints.Modes }
     *     
     */
    public TripConstraints.Modes getModes() {
        return modes;
    }

    /**
     * Sets the value of the modes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripConstraints.Modes }
     *     
     */
    public void setModes(TripConstraints.Modes value) {
        this.modes = value;
    }

    /**
     * Gets the value of the needs property.
     * 
     * @return
     *     possible object is
     *     {@link TripConstraints.Needs }
     *     
     */
    public TripConstraints.Needs getNeeds() {
        return needs;
    }

    /**
     * Sets the value of the needs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripConstraints.Needs }
     *     
     */
    public void setNeeds(TripConstraints.Needs value) {
        this.needs = value;
    }

    /**
     * Gets the value of the vehicleRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRestrictions }
     *     
     */
    public VehicleRestrictions getVehicleRestrictions() {
        return vehicleRestrictions;
    }

    /**
     * Sets the value of the vehicleRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRestrictions }
     *     
     */
    public void setVehicleRestrictions(VehicleRestrictions value) {
        this.vehicleRestrictions = value;
    }

    /**
     * Gets the value of the otherNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link TripConstraints.OtherNeeds }
     *     
     */
    public TripConstraints.OtherNeeds getOtherNeeds() {
        return otherNeeds;
    }

    /**
     * Sets the value of the otherNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripConstraints.OtherNeeds }
     *     
     */
    public void setOtherNeeds(TripConstraints.OtherNeeds value) {
        this.otherNeeds = value;
    }

    /**
     * Gets the value of the vehicleNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link TripConstraints.VehicleNeeds }
     *     
     */
    public TripConstraints.VehicleNeeds getVehicleNeeds() {
        return vehicleNeeds;
    }

    /**
     * Sets the value of the vehicleNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripConstraints.VehicleNeeds }
     *     
     */
    public void setVehicleNeeds(TripConstraints.VehicleNeeds value) {
        this.vehicleNeeds = value;
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
     *       &lt;sequence maxOccurs="5"&gt;
     *         &lt;element name="mode" type="{http://www.atis-partial-03-00-74}Mode"/&gt;
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
        "mode"
    })
    public static class Modes {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> mode;

        /**
         * Gets the value of the mode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMode() {
            if (mode == null) {
                mode = new ArrayList<String>();
            }
            return this.mode;
        }

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
     *       &lt;sequence maxOccurs="5"&gt;
     *         &lt;element name="need" type="{http://www.atis-partial-03-00-74}ADA-Access"/&gt;
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
        "need"
    })
    public static class Needs {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> need;

        /**
         * Gets the value of the need property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the need property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNeed() {
            if (need == null) {
                need = new ArrayList<String>();
            }
            return this.need;
        }

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
     *       &lt;sequence maxOccurs="5"&gt;
     *         &lt;element name="otherNeed" type="{http://www.atis-partial-03-00-74}AmenitiesList"/&gt;
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
        "otherNeed"
    })
    public static class OtherNeeds {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> otherNeed;

        /**
         * Gets the value of the otherNeed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherNeed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherNeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOtherNeed() {
            if (otherNeed == null) {
                otherNeed = new ArrayList<String>();
            }
            return this.otherNeed;
        }

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
     *       &lt;sequence maxOccurs="5"&gt;
     *         &lt;element name="vehicleNeed" type="{http://www.atis-partial-03-00-74}AmenitiesList"/&gt;
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
        "vehicleNeed"
    })
    public static class VehicleNeeds {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> vehicleNeed;

        /**
         * Gets the value of the vehicleNeed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleNeed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleNeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVehicleNeed() {
            if (vehicleNeed == null) {
                vehicleNeed = new ArrayList<String>();
            }
            return this.vehicleNeed;
        }

    }

}
