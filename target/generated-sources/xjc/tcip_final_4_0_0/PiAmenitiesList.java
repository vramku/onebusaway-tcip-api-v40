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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PiAmenitiesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PiAmenitiesList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionInfo" type="{http://www.TCIP-Final-4-0-0}CPTSubscriptionHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="routes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="500"&gt;
 *                   &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoppoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25000"&gt;
 *                   &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="facilities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="500"&gt;
 *                   &lt;element name="facilitie" type="{http://www.TCIP-Final-4-0-0}CPTTransitFacilityIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="update-since" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="deleted-amenities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25000"&gt;
 *                   &lt;element name="deleted-amenitie" type="{http://www.TCIP-Final-4-0-0}PIAmenityIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="amenities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25000"&gt;
 *                   &lt;element name="amenitie" type="{http://www.TCIP-Final-4-0-0}PIAmenity"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.TCIP-Final-4-0-0}tcipMsgAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PiAmenitiesList", propOrder = {
    "subscriptionInfo",
    "languages",
    "routes",
    "stoppoints",
    "facilities",
    "updateSince",
    "deletedAmenities",
    "amenities"
})
public class PiAmenitiesList {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionInfo;
    protected CPTLanguageList languages;
    protected PiAmenitiesList.Routes routes;
    protected PiAmenitiesList.Stoppoints stoppoints;
    protected PiAmenitiesList.Facilities facilities;
    @XmlElement(name = "update-since", type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime updateSince;
    @XmlElement(name = "deleted-amenities")
    protected PiAmenitiesList.DeletedAmenities deletedAmenities;
    protected PiAmenitiesList.Amenities amenities;
    @XmlAttribute(name = "created", required = true)
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime created;
    @XmlAttribute(name = "schVersion")
    protected String schVersion;
    @XmlAttribute(name = "sourceapp", required = true)
    protected String sourceapp;
    @XmlAttribute(name = "sourceip")
    protected String sourceip;
    @XmlAttribute(name = "sourceport")
    protected BigInteger sourceport;
    @XmlAttribute(name = "noNameSpaceSchemaLocation")
    @XmlSchemaType(name = "anyURI")
    protected String noNameSpaceSchemaLocation;
    @XmlAttribute(name = "activation")
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime activation;
    @XmlAttribute(name = "deactivation")
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime deactivation;

    /**
     * Gets the value of the subscriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public CPTSubscriptionHeader getSubscriptionInfo() {
        return subscriptionInfo;
    }

    /**
     * Sets the value of the subscriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public void setSubscriptionInfo(CPTSubscriptionHeader value) {
        this.subscriptionInfo = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link CPTLanguageList }
     *     
     */
    public CPTLanguageList getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTLanguageList }
     *     
     */
    public void setLanguages(CPTLanguageList value) {
        this.languages = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link PiAmenitiesList.Routes }
     *     
     */
    public PiAmenitiesList.Routes getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiAmenitiesList.Routes }
     *     
     */
    public void setRoutes(PiAmenitiesList.Routes value) {
        this.routes = value;
    }

    /**
     * Gets the value of the stoppoints property.
     * 
     * @return
     *     possible object is
     *     {@link PiAmenitiesList.Stoppoints }
     *     
     */
    public PiAmenitiesList.Stoppoints getStoppoints() {
        return stoppoints;
    }

    /**
     * Sets the value of the stoppoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiAmenitiesList.Stoppoints }
     *     
     */
    public void setStoppoints(PiAmenitiesList.Stoppoints value) {
        this.stoppoints = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * @return
     *     possible object is
     *     {@link PiAmenitiesList.Facilities }
     *     
     */
    public PiAmenitiesList.Facilities getFacilities() {
        return facilities;
    }

    /**
     * Sets the value of the facilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiAmenitiesList.Facilities }
     *     
     */
    public void setFacilities(PiAmenitiesList.Facilities value) {
        this.facilities = value;
    }

    /**
     * Gets the value of the updateSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getUpdateSince() {
        return updateSince;
    }

    /**
     * Sets the value of the updateSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateSince(org.joda.time.DateTime value) {
        this.updateSince = value;
    }

    /**
     * Gets the value of the deletedAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link PiAmenitiesList.DeletedAmenities }
     *     
     */
    public PiAmenitiesList.DeletedAmenities getDeletedAmenities() {
        return deletedAmenities;
    }

    /**
     * Sets the value of the deletedAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiAmenitiesList.DeletedAmenities }
     *     
     */
    public void setDeletedAmenities(PiAmenitiesList.DeletedAmenities value) {
        this.deletedAmenities = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link PiAmenitiesList.Amenities }
     *     
     */
    public PiAmenitiesList.Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiAmenitiesList.Amenities }
     *     
     */
    public void setAmenities(PiAmenitiesList.Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(org.joda.time.DateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the schVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchVersion() {
        return schVersion;
    }

    /**
     * Sets the value of the schVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchVersion(String value) {
        this.schVersion = value;
    }

    /**
     * Gets the value of the sourceapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceapp() {
        return sourceapp;
    }

    /**
     * Sets the value of the sourceapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceapp(String value) {
        this.sourceapp = value;
    }

    /**
     * Gets the value of the sourceip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceip() {
        return sourceip;
    }

    /**
     * Sets the value of the sourceip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceip(String value) {
        this.sourceip = value;
    }

    /**
     * Gets the value of the sourceport property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceport() {
        return sourceport;
    }

    /**
     * Sets the value of the sourceport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceport(BigInteger value) {
        this.sourceport = value;
    }

    /**
     * Gets the value of the noNameSpaceSchemaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoNameSpaceSchemaLocation() {
        return noNameSpaceSchemaLocation;
    }

    /**
     * Sets the value of the noNameSpaceSchemaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoNameSpaceSchemaLocation(String value) {
        this.noNameSpaceSchemaLocation = value;
    }

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivation(org.joda.time.DateTime value) {
        this.activation = value;
    }

    /**
     * Gets the value of the deactivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getDeactivation() {
        return deactivation;
    }

    /**
     * Sets the value of the deactivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivation(org.joda.time.DateTime value) {
        this.deactivation = value;
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
     *       &lt;sequence maxOccurs="25000"&gt;
     *         &lt;element name="amenitie" type="{http://www.TCIP-Final-4-0-0}PIAmenity"/&gt;
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
        "amenitie"
    })
    public static class Amenities {

        @XmlElement(required = true)
        protected List<PIAmenity> amenitie;

        /**
         * Gets the value of the amenitie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amenitie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmenitie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIAmenity }
         * 
         * 
         */
        public List<PIAmenity> getAmenitie() {
            if (amenitie == null) {
                amenitie = new ArrayList<PIAmenity>();
            }
            return this.amenitie;
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
     *       &lt;sequence maxOccurs="25000"&gt;
     *         &lt;element name="deleted-amenitie" type="{http://www.TCIP-Final-4-0-0}PIAmenityIden"/&gt;
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
        "deletedAmenitie"
    })
    public static class DeletedAmenities {

        @XmlElement(name = "deleted-amenitie", required = true)
        protected List<PIAmenityIden> deletedAmenitie;

        /**
         * Gets the value of the deletedAmenitie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deletedAmenitie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeletedAmenitie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIAmenityIden }
         * 
         * 
         */
        public List<PIAmenityIden> getDeletedAmenitie() {
            if (deletedAmenitie == null) {
                deletedAmenitie = new ArrayList<PIAmenityIden>();
            }
            return this.deletedAmenitie;
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
     *       &lt;sequence maxOccurs="500"&gt;
     *         &lt;element name="facilitie" type="{http://www.TCIP-Final-4-0-0}CPTTransitFacilityIden"/&gt;
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
        "facilitie"
    })
    public static class Facilities {

        @XmlElement(required = true)
        protected List<CPTTransitFacilityIden> facilitie;

        /**
         * Gets the value of the facilitie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the facilitie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFacilitie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTTransitFacilityIden }
         * 
         * 
         */
        public List<CPTTransitFacilityIden> getFacilitie() {
            if (facilitie == null) {
                facilitie = new ArrayList<CPTTransitFacilityIden>();
            }
            return this.facilitie;
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
     *       &lt;sequence maxOccurs="500"&gt;
     *         &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
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
        "route"
    })
    public static class Routes {

        @XmlElement(required = true)
        protected List<SCHRouteIden> route;

        /**
         * Gets the value of the route property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the route property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHRouteIden }
         * 
         * 
         */
        public List<SCHRouteIden> getRoute() {
            if (route == null) {
                route = new ArrayList<SCHRouteIden>();
            }
            return this.route;
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
     *       &lt;sequence maxOccurs="25000"&gt;
     *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
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
        "stoppoint"
    })
    public static class Stoppoints {

        @XmlElement(required = true)
        protected List<CPTStoppointIden> stoppoint;

        /**
         * Gets the value of the stoppoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stoppoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStoppoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTStoppointIden }
         * 
         * 
         */
        public List<CPTStoppointIden> getStoppoint() {
            if (stoppoint == null) {
                stoppoint = new ArrayList<CPTStoppointIden>();
            }
            return this.stoppoint;
        }

    }

}
