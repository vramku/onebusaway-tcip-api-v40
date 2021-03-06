//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupName" type="{http://www.lrms-final-09-07}Text-name255" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="100"&gt;
 *           &lt;element name="pointLocation" type="{http://www.lrms-final-09-07}PointLocation"/&gt;
 *           &lt;element name="linkLocation" type="{http://www.lrms-final-09-07}LinkLocation"/&gt;
 *           &lt;element name="areaLocation" type="{http://www.lrms-final-09-07}AreaLocation"/&gt;
 *           &lt;element name="referenceLocation" type="{http://www.lrms-final-09-07}LocationReference"/&gt;
 *           &lt;element name="routeLocation" type="{http://www.lrms-final-09-07}RouteLocation"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="locationID" type="{http://www.lrms-final-09-07}String-index64" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupLocation", propOrder = {
    "groupName",
    "pointLocationOrLinkLocationOrAreaLocation"
})
public class GroupLocation {

    protected String groupName;
    @XmlElements({
        @XmlElement(name = "pointLocation", type = PointLocation.class),
        @XmlElement(name = "linkLocation", type = LinkLocation.class),
        @XmlElement(name = "areaLocation", type = AreaLocation.class),
        @XmlElement(name = "referenceLocation", type = LocationReference.class),
        @XmlElement(name = "routeLocation", type = RouteLocation.class)
    })
    protected List<Object> pointLocationOrLinkLocationOrAreaLocation;
    @XmlAttribute(name = "locationID")
    protected String locationID;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the pointLocationOrLinkLocationOrAreaLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointLocationOrLinkLocationOrAreaLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointLocationOrLinkLocationOrAreaLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointLocation }
     * {@link LinkLocation }
     * {@link AreaLocation }
     * {@link LocationReference }
     * {@link RouteLocation }
     * 
     * 
     */
    public List<Object> getPointLocationOrLinkLocationOrAreaLocation() {
        if (pointLocationOrLinkLocationOrAreaLocation == null) {
            pointLocationOrLinkLocationOrAreaLocation = new ArrayList<Object>();
        }
        return this.pointLocationOrLinkLocationOrAreaLocation;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

}
