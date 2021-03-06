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
 * <p>Java class for PIAnnouncement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIAnnouncement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="announcement" type="{http://www.TCIP-Final-4-0-0}CCAnnouncementIden"/&gt;
 *         &lt;element name="headline" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="headlineLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="descriptionLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="announcementURL" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="freeform-text" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="freeform-textLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="related-routes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="200"&gt;
 *                   &lt;element name="related-route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="related-agencies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="related-agencie" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyID"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="related-zones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="related-zone" type="{http://www.TCIP-Final-4-0-0}PIGeoZoneIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="related-stoppoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1000"&gt;
 *                   &lt;element name="related-stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
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
@XmlType(name = "PIAnnouncement", propOrder = {
    "announcement",
    "headline",
    "headlineLangs",
    "description",
    "descriptionLangs",
    "announcementURL",
    "freeformText",
    "freeformTextLangs",
    "relatedRoutes",
    "relatedAgencies",
    "relatedZones",
    "relatedStoppoints"
})
public class PIAnnouncement {

    @XmlElement(required = true)
    protected CCAnnouncementIden announcement;
    protected String headline;
    protected CPTAdditionalLanguageContents headlineLangs;
    protected String description;
    protected CPTAdditionalLanguageContents descriptionLangs;
    protected String announcementURL;
    @XmlElement(name = "freeform-text")
    protected String freeformText;
    @XmlElement(name = "freeform-textLangs")
    protected CPTAdditionalLanguageContents freeformTextLangs;
    @XmlElement(name = "related-routes")
    protected PIAnnouncement.RelatedRoutes relatedRoutes;
    @XmlElement(name = "related-agencies")
    protected PIAnnouncement.RelatedAgencies relatedAgencies;
    @XmlElement(name = "related-zones")
    protected PIAnnouncement.RelatedZones relatedZones;
    @XmlElement(name = "related-stoppoints")
    protected PIAnnouncement.RelatedStoppoints relatedStoppoints;

    /**
     * Gets the value of the announcement property.
     * 
     * @return
     *     possible object is
     *     {@link CCAnnouncementIden }
     *     
     */
    public CCAnnouncementIden getAnnouncement() {
        return announcement;
    }

    /**
     * Sets the value of the announcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAnnouncementIden }
     *     
     */
    public void setAnnouncement(CCAnnouncementIden value) {
        this.announcement = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the headlineLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getHeadlineLangs() {
        return headlineLangs;
    }

    /**
     * Sets the value of the headlineLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setHeadlineLangs(CPTAdditionalLanguageContents value) {
        this.headlineLangs = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDescriptionLangs() {
        return descriptionLangs;
    }

    /**
     * Sets the value of the descriptionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDescriptionLangs(CPTAdditionalLanguageContents value) {
        this.descriptionLangs = value;
    }

    /**
     * Gets the value of the announcementURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementURL() {
        return announcementURL;
    }

    /**
     * Sets the value of the announcementURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementURL(String value) {
        this.announcementURL = value;
    }

    /**
     * Gets the value of the freeformText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeformText() {
        return freeformText;
    }

    /**
     * Sets the value of the freeformText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeformText(String value) {
        this.freeformText = value;
    }

    /**
     * Gets the value of the freeformTextLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getFreeformTextLangs() {
        return freeformTextLangs;
    }

    /**
     * Sets the value of the freeformTextLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setFreeformTextLangs(CPTAdditionalLanguageContents value) {
        this.freeformTextLangs = value;
    }

    /**
     * Gets the value of the relatedRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link PIAnnouncement.RelatedRoutes }
     *     
     */
    public PIAnnouncement.RelatedRoutes getRelatedRoutes() {
        return relatedRoutes;
    }

    /**
     * Sets the value of the relatedRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAnnouncement.RelatedRoutes }
     *     
     */
    public void setRelatedRoutes(PIAnnouncement.RelatedRoutes value) {
        this.relatedRoutes = value;
    }

    /**
     * Gets the value of the relatedAgencies property.
     * 
     * @return
     *     possible object is
     *     {@link PIAnnouncement.RelatedAgencies }
     *     
     */
    public PIAnnouncement.RelatedAgencies getRelatedAgencies() {
        return relatedAgencies;
    }

    /**
     * Sets the value of the relatedAgencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAnnouncement.RelatedAgencies }
     *     
     */
    public void setRelatedAgencies(PIAnnouncement.RelatedAgencies value) {
        this.relatedAgencies = value;
    }

    /**
     * Gets the value of the relatedZones property.
     * 
     * @return
     *     possible object is
     *     {@link PIAnnouncement.RelatedZones }
     *     
     */
    public PIAnnouncement.RelatedZones getRelatedZones() {
        return relatedZones;
    }

    /**
     * Sets the value of the relatedZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAnnouncement.RelatedZones }
     *     
     */
    public void setRelatedZones(PIAnnouncement.RelatedZones value) {
        this.relatedZones = value;
    }

    /**
     * Gets the value of the relatedStoppoints property.
     * 
     * @return
     *     possible object is
     *     {@link PIAnnouncement.RelatedStoppoints }
     *     
     */
    public PIAnnouncement.RelatedStoppoints getRelatedStoppoints() {
        return relatedStoppoints;
    }

    /**
     * Sets the value of the relatedStoppoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAnnouncement.RelatedStoppoints }
     *     
     */
    public void setRelatedStoppoints(PIAnnouncement.RelatedStoppoints value) {
        this.relatedStoppoints = value;
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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="related-agencie" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyID"/&gt;
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
        "relatedAgencie"
    })
    public static class RelatedAgencies {

        @XmlElement(name = "related-agencie", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected List<BigInteger> relatedAgencie;

        /**
         * Gets the value of the relatedAgencie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedAgencie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedAgencie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getRelatedAgencie() {
            if (relatedAgencie == null) {
                relatedAgencie = new ArrayList<BigInteger>();
            }
            return this.relatedAgencie;
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
     *       &lt;sequence maxOccurs="200"&gt;
     *         &lt;element name="related-route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
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
        "relatedRoute"
    })
    public static class RelatedRoutes {

        @XmlElement(name = "related-route", required = true)
        protected List<SCHRouteIden> relatedRoute;

        /**
         * Gets the value of the relatedRoute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedRoute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedRoute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHRouteIden }
         * 
         * 
         */
        public List<SCHRouteIden> getRelatedRoute() {
            if (relatedRoute == null) {
                relatedRoute = new ArrayList<SCHRouteIden>();
            }
            return this.relatedRoute;
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
     *       &lt;sequence maxOccurs="1000"&gt;
     *         &lt;element name="related-stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
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
        "relatedStoppoint"
    })
    public static class RelatedStoppoints {

        @XmlElement(name = "related-stoppoint", required = true)
        protected List<CPTStoppointIden> relatedStoppoint;

        /**
         * Gets the value of the relatedStoppoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedStoppoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedStoppoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTStoppointIden }
         * 
         * 
         */
        public List<CPTStoppointIden> getRelatedStoppoint() {
            if (relatedStoppoint == null) {
                relatedStoppoint = new ArrayList<CPTStoppointIden>();
            }
            return this.relatedStoppoint;
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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="related-zone" type="{http://www.TCIP-Final-4-0-0}PIGeoZoneIden"/&gt;
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
        "relatedZone"
    })
    public static class RelatedZones {

        @XmlElement(name = "related-zone", required = true)
        protected List<PIGeoZoneIden> relatedZone;

        /**
         * Gets the value of the relatedZone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedZone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedZone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIGeoZoneIden }
         * 
         * 
         */
        public List<PIGeoZoneIden> getRelatedZone() {
            if (relatedZone == null) {
                relatedZone = new ArrayList<PIGeoZoneIden>();
            }
            return this.relatedZone;
        }

    }

}
