//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Geometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geometry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationName" type="{http://www.lrms-final-09-07}Text-name255" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="node" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
 *           &lt;element name="nodeOffset"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="originNode" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
 *                     &lt;element name="offsetEast" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *                     &lt;element name="offsetNorth" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *                     &lt;element name="offsetHeight" type="{http://www.lrms-final-09-07}Height" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="link" type="{http://www.lrms-final-09-07}GeoLocationLink"/&gt;
 *           &lt;element name="area" type="{http://www.lrms-final-09-07}IdType"/&gt;
 *           &lt;element name="polygon" type="{http://www.lrms-final-09-07}Polygon"/&gt;
 *           &lt;element name="chain" type="{http://www.lrms-final-09-07}ChainP"/&gt;
 *           &lt;element name="transition" type="{http://www.lrms-final-09-07}Transition"/&gt;
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
@XmlType(name = "Geometry", propOrder = {
    "locationName",
    "node",
    "nodeOffset",
    "link",
    "area",
    "polygon",
    "chain",
    "transition"
})
public class Geometry {

    protected String locationName;
    protected GeoLocation node;
    protected Geometry.NodeOffset nodeOffset;
    protected GeoLocationLink link;
    protected IdType area;
    protected Polygon polygon;
    protected ChainP chain;
    protected Transition transition;
    @XmlAttribute(name = "locationID")
    protected String locationID;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setNode(GeoLocation value) {
        this.node = value;
    }

    /**
     * Gets the value of the nodeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry.NodeOffset }
     *     
     */
    public Geometry.NodeOffset getNodeOffset() {
        return nodeOffset;
    }

    /**
     * Sets the value of the nodeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry.NodeOffset }
     *     
     */
    public void setNodeOffset(Geometry.NodeOffset value) {
        this.nodeOffset = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationLink }
     *     
     */
    public GeoLocationLink getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationLink }
     *     
     */
    public void setLink(GeoLocationLink value) {
        this.link = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setArea(IdType value) {
        this.area = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * @return
     *     possible object is
     *     {@link Polygon }
     *     
     */
    public Polygon getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Polygon }
     *     
     */
    public void setPolygon(Polygon value) {
        this.polygon = value;
    }

    /**
     * Gets the value of the chain property.
     * 
     * @return
     *     possible object is
     *     {@link ChainP }
     *     
     */
    public ChainP getChain() {
        return chain;
    }

    /**
     * Sets the value of the chain property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChainP }
     *     
     */
    public void setChain(ChainP value) {
        this.chain = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link Transition }
     *     
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transition }
     *     
     */
    public void setTransition(Transition value) {
        this.transition = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="originNode" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
     *         &lt;element name="offsetEast" type="{http://www.lrms-final-09-07}Distance"/&gt;
     *         &lt;element name="offsetNorth" type="{http://www.lrms-final-09-07}Distance"/&gt;
     *         &lt;element name="offsetHeight" type="{http://www.lrms-final-09-07}Height" minOccurs="0"/&gt;
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
        "originNode",
        "offsetEast",
        "offsetNorth",
        "offsetHeight"
    })
    public static class NodeOffset {

        @XmlElement(required = true)
        protected GeoLocation originNode;
        @XmlElement(required = true)
        protected Distance offsetEast;
        @XmlElement(required = true)
        protected Distance offsetNorth;
        protected Height offsetHeight;

        /**
         * Gets the value of the originNode property.
         * 
         * @return
         *     possible object is
         *     {@link GeoLocation }
         *     
         */
        public GeoLocation getOriginNode() {
            return originNode;
        }

        /**
         * Sets the value of the originNode property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeoLocation }
         *     
         */
        public void setOriginNode(GeoLocation value) {
            this.originNode = value;
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
         * Gets the value of the offsetHeight property.
         * 
         * @return
         *     possible object is
         *     {@link Height }
         *     
         */
        public Height getOffsetHeight() {
            return offsetHeight;
        }

        /**
         * Sets the value of the offsetHeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Height }
         *     
         */
        public void setOffsetHeight(Height value) {
            this.offsetHeight = value;
        }

    }

}
