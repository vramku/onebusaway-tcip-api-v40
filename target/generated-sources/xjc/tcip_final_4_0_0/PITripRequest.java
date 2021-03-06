//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import atis_partial_03_00_74.RouteRequest;


/**
 * <p>Java class for PITripRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PITripRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tripRequest" type="{http://www.atis-partial-03-00-74}RouteRequest"/&gt;
 *         &lt;element name="returnRequest" type="{http://www.atis-partial-03-00-74}RouteRequest" minOccurs="0"/&gt;
 *         &lt;element name="profile" type="{http://www.TCIP-Final-4-0-0}PITravelerProfile" minOccurs="0"/&gt;
 *         &lt;element name="fareConstraints" type="{http://www.TCIP-Final-4-0-0}PITripRequestFareConstraints" minOccurs="0"/&gt;
 *         &lt;element name="mapRequest" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PITripRequest", propOrder = {
    "tripRequest",
    "returnRequest",
    "profile",
    "fareConstraints",
    "mapRequest"
})
public class PITripRequest {

    @XmlElement(required = true)
    protected RouteRequest tripRequest;
    protected RouteRequest returnRequest;
    protected PITravelerProfile profile;
    protected PITripRequestFareConstraints fareConstraints;
    protected boolean mapRequest;

    /**
     * Gets the value of the tripRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RouteRequest }
     *     
     */
    public RouteRequest getTripRequest() {
        return tripRequest;
    }

    /**
     * Sets the value of the tripRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRequest }
     *     
     */
    public void setTripRequest(RouteRequest value) {
        this.tripRequest = value;
    }

    /**
     * Gets the value of the returnRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RouteRequest }
     *     
     */
    public RouteRequest getReturnRequest() {
        return returnRequest;
    }

    /**
     * Sets the value of the returnRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRequest }
     *     
     */
    public void setReturnRequest(RouteRequest value) {
        this.returnRequest = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link PITravelerProfile }
     *     
     */
    public PITravelerProfile getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PITravelerProfile }
     *     
     */
    public void setProfile(PITravelerProfile value) {
        this.profile = value;
    }

    /**
     * Gets the value of the fareConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link PITripRequestFareConstraints }
     *     
     */
    public PITripRequestFareConstraints getFareConstraints() {
        return fareConstraints;
    }

    /**
     * Sets the value of the fareConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link PITripRequestFareConstraints }
     *     
     */
    public void setFareConstraints(PITripRequestFareConstraints value) {
        this.fareConstraints = value;
    }

    /**
     * Gets the value of the mapRequest property.
     * 
     */
    public boolean isMapRequest() {
        return mapRequest;
    }

    /**
     * Sets the value of the mapRequest property.
     * 
     */
    public void setMapRequest(boolean value) {
        this.mapRequest = value;
    }

}
