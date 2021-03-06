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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import lrms_final_09_07.AddressPoint;


/**
 * <p>Java class for IMPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personID" type="{http://www.TCIP-Final-4-0-0}IM-PersonIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="incident-roles"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="incident-role" type="{http://www.TCIP-Final-4-0-0}IM-RoleInIncident"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="firstName" type="{http://www.TCIP-Final-4-0-0}CPT-PersonFirstName" minOccurs="0"/&gt;
 *         &lt;element name="firstNameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.TCIP-Final-4-0-0}CPT-PersonMiddleName" minOccurs="0"/&gt;
 *         &lt;element name="middleNameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.TCIP-Final-4-0-0}CPT-PersonLastName" minOccurs="0"/&gt;
 *         &lt;element name="lastNameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.lrms-final-09-07}AddressPoint"/&gt;
 *         &lt;element name="home-phone" type="{http://www.TCIP-Final-4-0-0}IM-HomePhone"/&gt;
 *         &lt;element name="work-phone" type="{http://www.TCIP-Final-4-0-0}IM-WorkPhone" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.TCIP-Final-4-0-0}CPT-Sex" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.TCIP-Final-4-0-0}IM-Age" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="noteLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="localIMPerson" type="{http://www.tcip-4-0-0-local}IMPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMPerson", propOrder = {
    "personID",
    "incidentRoles",
    "firstName",
    "firstNameLangs",
    "middleName",
    "middleNameLangs",
    "lastName",
    "lastNameLangs",
    "address",
    "homePhone",
    "workPhone",
    "gender",
    "age",
    "note",
    "noteLangs",
    "localIMPerson"
})
public class IMPerson {

    protected String personID;
    @XmlElement(name = "incident-roles", required = true)
    protected IMPerson.IncidentRoles incidentRoles;
    protected String firstName;
    protected CPTAdditionalLanguageContents firstNameLangs;
    protected String middleName;
    protected CPTAdditionalLanguageContents middleNameLangs;
    protected String lastName;
    protected CPTAdditionalLanguageContents lastNameLangs;
    @XmlElement(required = true)
    protected AddressPoint address;
    @XmlElement(name = "home-phone", required = true)
    protected String homePhone;
    @XmlElement(name = "work-phone")
    protected String workPhone;
    @XmlSchemaType(name = "anySimpleType")
    protected String gender;
    @XmlSchemaType(name = "unsignedByte")
    protected Short age;
    protected String note;
    protected CPTAdditionalLanguageContents noteLangs;
    protected tcip_4_0_0_local.IMPerson localIMPerson;

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonID(String value) {
        this.personID = value;
    }

    /**
     * Gets the value of the incidentRoles property.
     * 
     * @return
     *     possible object is
     *     {@link IMPerson.IncidentRoles }
     *     
     */
    public IMPerson.IncidentRoles getIncidentRoles() {
        return incidentRoles;
    }

    /**
     * Sets the value of the incidentRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPerson.IncidentRoles }
     *     
     */
    public void setIncidentRoles(IMPerson.IncidentRoles value) {
        this.incidentRoles = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPoint }
     *     
     */
    public AddressPoint getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPoint }
     *     
     */
    public void setAddress(AddressPoint value) {
        this.address = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAge(Short value) {
        this.age = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the noteLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNoteLangs() {
        return noteLangs;
    }

    /**
     * Sets the value of the noteLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNoteLangs(CPTAdditionalLanguageContents value) {
        this.noteLangs = value;
    }

    /**
     * Gets the value of the localIMPerson property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.IMPerson }
     *     
     */
    public tcip_4_0_0_local.IMPerson getLocalIMPerson() {
        return localIMPerson;
    }

    /**
     * Sets the value of the localIMPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.IMPerson }
     *     
     */
    public void setLocalIMPerson(tcip_4_0_0_local.IMPerson value) {
        this.localIMPerson = value;
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
     *         &lt;element name="incident-role" type="{http://www.TCIP-Final-4-0-0}IM-RoleInIncident"/&gt;
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
        "incidentRole"
    })
    public static class IncidentRoles {

        @XmlElement(name = "incident-role", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> incidentRole;

        /**
         * Gets the value of the incidentRole property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incidentRole property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncidentRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncidentRole() {
            if (incidentRole == null) {
                incidentRole = new ArrayList<String>();
            }
            return this.incidentRole;
        }

    }

}
