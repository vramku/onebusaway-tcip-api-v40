//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOffset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="point" type="{http://www.lrms-final-09-07}PointLocation"/&gt;
 *         &lt;element name="offsetEast" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *         &lt;element name="offsetNorth" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *         &lt;element name="height" type="{http://www.lrms-final-09-07}Height" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOffset", propOrder = {
    "point",
    "offsetEast",
    "offsetNorth",
    "height"
})
public class PointOffset {

    @XmlElement(required = true)
    protected PointLocation point;
    @XmlElement(required = true)
    protected Distance offsetEast;
    @XmlElement(required = true)
    protected Distance offsetNorth;
    protected Height height;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointLocation }
     *     
     */
    public PointLocation getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLocation }
     *     
     */
    public void setPoint(PointLocation value) {
        this.point = value;
    }

    /**
     * Gets the value of the offsetEast property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getOffsetEast() {
        return offsetEast;
    }

    /**
     * Sets the value of the offsetEast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setOffsetEast(Distance value) {
        this.offsetEast = value;
    }

    /**
     * Gets the value of the offsetNorth property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getOffsetNorth() {
        return offsetNorth;
    }

    /**
     * Sets the value of the offsetNorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setOffsetNorth(Distance value) {
        this.offsetNorth = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setHeight(Height value) {
        this.height = value;
    }

}
