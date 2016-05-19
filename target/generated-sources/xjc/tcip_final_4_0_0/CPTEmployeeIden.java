//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPTEmployeeIden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPTEmployeeIden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.TCIP-Final-4-0-0}CPT-EmployeeID"/&gt;
 *         &lt;element name="ag" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyID" minOccurs="0"/&gt;
 *         &lt;element name="ssn" type="{http://www.TCIP-Final-4-0-0}CPT-SSN" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.TCIP-Final-4-0-0}CPT-PersonFirstName" minOccurs="0"/&gt;
 *         &lt;element name="firstNameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.TCIP-Final-4-0-0}CPT-PersonMiddleName" minOccurs="0"/&gt;
 *         &lt;element name="middleNameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.TCIP-Final-4-0-0}CPT-PersonLastName" minOccurs="0"/&gt;
 *         &lt;element name="lastNameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="userLoginName" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.TCIP-Final-4-0-0}IM-PersonIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="desig" type="{http://www.TCIP-Final-4-0-0}CPT-GenericDesignator" minOccurs="0"/&gt;
 *         &lt;element name="desigLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="agDesig" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyDesignator" minOccurs="0"/&gt;
 *         &lt;element name="agdesigLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="nameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPTEmployeeIden", propOrder = {
    "id",
    "ag",
    "ssn",
    "firstName",
    "firstNameLangs",
    "middleName",
    "middleNameLangs",
    "lastName",
    "lastNameLangs",
    "userLoginName",
    "name",
    "desig",
    "desigLangs",
    "agDesig",
    "agdesigLangs",
    "nameLangs"
})
public class CPTEmployeeIden {

    @XmlElement(required = true)
    protected String id;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ag;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ssn;
    protected String firstName;
    protected CPTAdditionalLanguageContents firstNameLangs;
    protected String middleName;
    protected CPTAdditionalLanguageContents middleNameLangs;
    protected String lastName;
    protected CPTAdditionalLanguageContents lastNameLangs;
    protected String userLoginName;
    protected String name;
    protected String desig;
    protected CPTAdditionalLanguageContents desigLangs;
    protected String agDesig;
    protected CPTAdditionalLanguageContents agdesigLangs;
    protected CPTAdditionalLanguageContents nameLangs;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAg() {
        return ag;
    }

    /**
     * Sets the value of the ag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAg(BigInteger value) {
        this.ag = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSsn(BigInteger value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the firstNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getFirstNameLangs() {
        return firstNameLangs;
    }

    /**
     * Sets the value of the firstNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setFirstNameLangs(CPTAdditionalLanguageContents value) {
        this.firstNameLangs = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the middleNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getMiddleNameLangs() {
        return middleNameLangs;
    }

    /**
     * Sets the value of the middleNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setMiddleNameLangs(CPTAdditionalLanguageContents value) {
        this.middleNameLangs = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getLastNameLangs() {
        return lastNameLangs;
    }

    /**
     * Sets the value of the lastNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setLastNameLangs(CPTAdditionalLanguageContents value) {
        this.lastNameLangs = value;
    }

    /**
     * Gets the value of the userLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLoginName() {
        return userLoginName;
    }

    /**
     * Sets the value of the userLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLoginName(String value) {
        this.userLoginName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the desig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesig() {
        return desig;
    }

    /**
     * Sets the value of the desig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesig(String value) {
        this.desig = value;
    }

    /**
     * Gets the value of the desigLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDesigLangs() {
        return desigLangs;
    }

    /**
     * Sets the value of the desigLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDesigLangs(CPTAdditionalLanguageContents value) {
        this.desigLangs = value;
    }

    /**
     * Gets the value of the agDesig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgDesig() {
        return agDesig;
    }

    /**
     * Sets the value of the agDesig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgDesig(String value) {
        this.agDesig = value;
    }

    /**
     * Gets the value of the agdesigLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getAgdesigLangs() {
        return agdesigLangs;
    }

    /**
     * Sets the value of the agdesigLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setAgdesigLangs(CPTAdditionalLanguageContents value) {
        this.agdesigLangs = value;
    }

    /**
     * Gets the value of the nameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNameLangs() {
        return nameLangs;
    }

    /**
     * Sets the value of the nameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNameLangs(CPTAdditionalLanguageContents value) {
        this.nameLangs = value;
    }

}
