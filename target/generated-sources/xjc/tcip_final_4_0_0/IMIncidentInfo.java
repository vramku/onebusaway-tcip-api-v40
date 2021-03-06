//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMIncidentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMIncidentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incident" type="{http://www.TCIP-Final-4-0-0}IMIncidentIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData" minOccurs="0"/&gt;
 *         &lt;element name="subsumedIncidents" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="subsumedIncident" type="{http://www.TCIP-Final-4-0-0}IMIncidentIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="incidentDescription" type="{http://www.TCIP-Final-4-0-0}IMIncident" minOccurs="0"/&gt;
 *         &lt;element name="trafficImpact" type="{http://www.TCIP-Final-4-0-0}IMTrafficImpact" minOccurs="0"/&gt;
 *         &lt;element name="incidentClosed" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *         &lt;element name="localIMIncidentInfo" type="{http://www.tcip-4-0-0-local}IMIncidentInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMIncidentInfo", propOrder = {
    "incident",
    "metadata",
    "subsumedIncidents",
    "incidentDescription",
    "trafficImpact",
    "incidentClosed",
    "localIMIncidentInfo"
})
public class IMIncidentInfo {

    @XmlElement(required = true)
    protected IMIncidentIden incident;
    protected CPTRowMetaData metadata;
    protected IMIncidentInfo.SubsumedIncidents subsumedIncidents;
    protected IMIncident incidentDescription;
    protected IMTrafficImpact trafficImpact;
    protected boolean incidentClosed;
    protected tcip_4_0_0_local.IMIncidentInfo localIMIncidentInfo;

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link IMIncidentIden }
     *     
     */
    public IMIncidentIden getIncident() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMIncidentIden }
     *     
     */
    public void setIncident(IMIncidentIden value) {
        this.incident = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link CPTRowMetaData }
     *     
     */
    public CPTRowMetaData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTRowMetaData }
     *     
     */
    public void setMetadata(CPTRowMetaData value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the subsumedIncidents property.
     * 
     * @return
     *     possible object is
     *     {@link IMIncidentInfo.SubsumedIncidents }
     *     
     */
    public IMIncidentInfo.SubsumedIncidents getSubsumedIncidents() {
        return subsumedIncidents;
    }

    /**
     * Sets the value of the subsumedIncidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMIncidentInfo.SubsumedIncidents }
     *     
     */
    public void setSubsumedIncidents(IMIncidentInfo.SubsumedIncidents value) {
        this.subsumedIncidents = value;
    }

    /**
     * Gets the value of the incidentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link IMIncident }
     *     
     */
    public IMIncident getIncidentDescription() {
        return incidentDescription;
    }

    /**
     * Sets the value of the incidentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMIncident }
     *     
     */
    public void setIncidentDescription(IMIncident value) {
        this.incidentDescription = value;
    }

    /**
     * Gets the value of the trafficImpact property.
     * 
     * @return
     *     possible object is
     *     {@link IMTrafficImpact }
     *     
     */
    public IMTrafficImpact getTrafficImpact() {
        return trafficImpact;
    }

    /**
     * Sets the value of the trafficImpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMTrafficImpact }
     *     
     */
    public void setTrafficImpact(IMTrafficImpact value) {
        this.trafficImpact = value;
    }

    /**
     * Gets the value of the incidentClosed property.
     * 
     */
    public boolean isIncidentClosed() {
        return incidentClosed;
    }

    /**
     * Sets the value of the incidentClosed property.
     * 
     */
    public void setIncidentClosed(boolean value) {
        this.incidentClosed = value;
    }

    /**
     * Gets the value of the localIMIncidentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.IMIncidentInfo }
     *     
     */
    public tcip_4_0_0_local.IMIncidentInfo getLocalIMIncidentInfo() {
        return localIMIncidentInfo;
    }

    /**
     * Sets the value of the localIMIncidentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.IMIncidentInfo }
     *     
     */
    public void setLocalIMIncidentInfo(tcip_4_0_0_local.IMIncidentInfo value) {
        this.localIMIncidentInfo = value;
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
     *         &lt;element name="subsumedIncident" type="{http://www.TCIP-Final-4-0-0}IMIncidentIden"/&gt;
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
        "subsumedIncident"
    })
    public static class SubsumedIncidents {

        @XmlElement(required = true)
        protected List<IMIncidentIden> subsumedIncident;

        /**
         * Gets the value of the subsumedIncident property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subsumedIncident property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubsumedIncident().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMIncidentIden }
         * 
         * 
         */
        public List<IMIncidentIden> getSubsumedIncident() {
            if (subsumedIncident == null) {
                subsumedIncident = new ArrayList<IMIncidentIden>();
            }
            return this.subsumedIncident;
        }

    }

}
