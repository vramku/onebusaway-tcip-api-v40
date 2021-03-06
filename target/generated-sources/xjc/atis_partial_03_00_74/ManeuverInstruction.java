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
import atis_03_00_74_local.ManeuverInstruction2;
import lrms_final_09_07_for_atis_im.Distance;


/**
 * <p>Java class for ManeuverInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManeuverInstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maneuverLocationType" type="{http://www.atis-partial-03-00-74}ManeuverLocationType" minOccurs="0"/&gt;
 *         &lt;element name="instructions"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="3"&gt;
 *                   &lt;element name="instruction"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="turn" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
 *                             &lt;element name="merge" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
 *                             &lt;element name="branch" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
 *                             &lt;element name="exit" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
 *                             &lt;element name="continue" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
 *                             &lt;element name="payToll" type="{http://www.atis-partial-03-00-74}Cost"/&gt;
 *                             &lt;element name="takeElevator" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
 *                             &lt;element name="takeEscalator" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
 *                             &lt;element name="takeStairs" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
 *                             &lt;element name="board" type="{http://www.atis-partial-03-00-74}Mode"/&gt;
 *                             &lt;element name="alight" type="{http://www.atis-partial-03-00-74}Mode"/&gt;
 *                             &lt;element name="getTransfer" type="{http://www.atis-partial-03-00-74}CPTStoppointIden"/&gt;
 *                             &lt;element name="localManeuverInstruction" type="{http://www.atis-03-00-74-local}ManeuverInstruction" minOccurs="0"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descripton" type="{http://www.atis-partial-03-00-74}Freetext" minOccurs="0"/&gt;
 *         &lt;element name="distance" type="{http://www.lrms-final-09-07-for-atis-im}Distance" minOccurs="0"/&gt;
 *         &lt;element name="outboundRoad" type="{http://www.atis-partial-03-00-74}Freetext" minOccurs="0"/&gt;
 *         &lt;element name="maneuversign" type="{http://www.atis-partial-03-00-74}Freetext" minOccurs="0"/&gt;
 *         &lt;element name="direction" type="{http://www.atis-partial-03-00-74}CompassDirection" minOccurs="0"/&gt;
 *         &lt;element name="localManeuverInstruction2" type="{http://www.atis-03-00-74-local}ManeuverInstruction2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManeuverInstruction", propOrder = {
    "maneuverLocationType",
    "instructions",
    "descripton",
    "distance",
    "outboundRoad",
    "maneuversign",
    "direction",
    "localManeuverInstruction2"
})
public class ManeuverInstruction {

    @XmlSchemaType(name = "anySimpleType")
    protected String maneuverLocationType;
    @XmlElement(required = true)
    protected ManeuverInstruction.Instructions instructions;
    protected String descripton;
    protected Distance distance;
    protected String outboundRoad;
    protected String maneuversign;
    @XmlSchemaType(name = "anySimpleType")
    protected String direction;
    protected ManeuverInstruction2 localManeuverInstruction2;

    /**
     * Gets the value of the maneuverLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManeuverLocationType() {
        return maneuverLocationType;
    }

    /**
     * Sets the value of the maneuverLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManeuverLocationType(String value) {
        this.maneuverLocationType = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link ManeuverInstruction.Instructions }
     *     
     */
    public ManeuverInstruction.Instructions getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManeuverInstruction.Instructions }
     *     
     */
    public void setInstructions(ManeuverInstruction.Instructions value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the descripton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripton() {
        return descripton;
    }

    /**
     * Sets the value of the descripton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripton(String value) {
        this.descripton = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the outboundRoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundRoad() {
        return outboundRoad;
    }

    /**
     * Sets the value of the outboundRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundRoad(String value) {
        this.outboundRoad = value;
    }

    /**
     * Gets the value of the maneuversign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManeuversign() {
        return maneuversign;
    }

    /**
     * Sets the value of the maneuversign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManeuversign(String value) {
        this.maneuversign = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the localManeuverInstruction2 property.
     * 
     * @return
     *     possible object is
     *     {@link ManeuverInstruction2 }
     *     
     */
    public ManeuverInstruction2 getLocalManeuverInstruction2() {
        return localManeuverInstruction2;
    }

    /**
     * Sets the value of the localManeuverInstruction2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManeuverInstruction2 }
     *     
     */
    public void setLocalManeuverInstruction2(ManeuverInstruction2 value) {
        this.localManeuverInstruction2 = value;
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
     *       &lt;sequence maxOccurs="3"&gt;
     *         &lt;element name="instruction"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="turn" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
     *                   &lt;element name="merge" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
     *                   &lt;element name="branch" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
     *                   &lt;element name="exit" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
     *                   &lt;element name="continue" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
     *                   &lt;element name="payToll" type="{http://www.atis-partial-03-00-74}Cost"/&gt;
     *                   &lt;element name="takeElevator" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
     *                   &lt;element name="takeEscalator" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
     *                   &lt;element name="takeStairs" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
     *                   &lt;element name="board" type="{http://www.atis-partial-03-00-74}Mode"/&gt;
     *                   &lt;element name="alight" type="{http://www.atis-partial-03-00-74}Mode"/&gt;
     *                   &lt;element name="getTransfer" type="{http://www.atis-partial-03-00-74}CPTStoppointIden"/&gt;
     *                   &lt;element name="localManeuverInstruction" type="{http://www.atis-03-00-74-local}ManeuverInstruction" minOccurs="0"/&gt;
     *                 &lt;/choice&gt;
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
    @XmlType(name = "", propOrder = {
        "instruction"
    })
    public static class Instructions {

        @XmlElement(required = true)
        protected List<ManeuverInstruction.Instructions.Instruction> instruction;

        /**
         * Gets the value of the instruction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instruction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstruction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ManeuverInstruction.Instructions.Instruction }
         * 
         * 
         */
        public List<ManeuverInstruction.Instructions.Instruction> getInstruction() {
            if (instruction == null) {
                instruction = new ArrayList<ManeuverInstruction.Instructions.Instruction>();
            }
            return this.instruction;
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
         *       &lt;choice&gt;
         *         &lt;element name="turn" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
         *         &lt;element name="merge" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
         *         &lt;element name="branch" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
         *         &lt;element name="exit" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
         *         &lt;element name="continue" type="{http://www.atis-partial-03-00-74}TurnType"/&gt;
         *         &lt;element name="payToll" type="{http://www.atis-partial-03-00-74}Cost"/&gt;
         *         &lt;element name="takeElevator" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
         *         &lt;element name="takeEscalator" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
         *         &lt;element name="takeStairs" type="{http://www.atis-partial-03-00-74}VerticalType"/&gt;
         *         &lt;element name="board" type="{http://www.atis-partial-03-00-74}Mode"/&gt;
         *         &lt;element name="alight" type="{http://www.atis-partial-03-00-74}Mode"/&gt;
         *         &lt;element name="getTransfer" type="{http://www.atis-partial-03-00-74}CPTStoppointIden"/&gt;
         *         &lt;element name="localManeuverInstruction" type="{http://www.atis-03-00-74-local}ManeuverInstruction" minOccurs="0"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "turn",
            "merge",
            "branch",
            "exit",
            "_continue",
            "payToll",
            "takeElevator",
            "takeEscalator",
            "takeStairs",
            "board",
            "alight",
            "getTransfer",
            "localManeuverInstruction"
        })
        public static class Instruction {

            @XmlSchemaType(name = "anySimpleType")
            protected String turn;
            @XmlSchemaType(name = "anySimpleType")
            protected String merge;
            @XmlSchemaType(name = "anySimpleType")
            protected String branch;
            @XmlSchemaType(name = "anySimpleType")
            protected String exit;
            @XmlElement(name = "continue")
            @XmlSchemaType(name = "anySimpleType")
            protected String _continue;
            protected Cost payToll;
            @XmlSchemaType(name = "anySimpleType")
            protected String takeElevator;
            @XmlSchemaType(name = "anySimpleType")
            protected String takeEscalator;
            @XmlSchemaType(name = "anySimpleType")
            protected String takeStairs;
            @XmlSchemaType(name = "anySimpleType")
            protected String board;
            @XmlSchemaType(name = "anySimpleType")
            protected String alight;
            protected CPTStoppointIden getTransfer;
            protected atis_03_00_74_local.ManeuverInstruction localManeuverInstruction;

            /**
             * Gets the value of the turn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTurn() {
                return turn;
            }

            /**
             * Sets the value of the turn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTurn(String value) {
                this.turn = value;
            }

            /**
             * Gets the value of the merge property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMerge() {
                return merge;
            }

            /**
             * Sets the value of the merge property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMerge(String value) {
                this.merge = value;
            }

            /**
             * Gets the value of the branch property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranch() {
                return branch;
            }

            /**
             * Sets the value of the branch property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranch(String value) {
                this.branch = value;
            }

            /**
             * Gets the value of the exit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExit() {
                return exit;
            }

            /**
             * Sets the value of the exit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExit(String value) {
                this.exit = value;
            }

            /**
             * Gets the value of the continue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContinue() {
                return _continue;
            }

            /**
             * Sets the value of the continue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContinue(String value) {
                this._continue = value;
            }

            /**
             * Gets the value of the payToll property.
             * 
             * @return
             *     possible object is
             *     {@link Cost }
             *     
             */
            public Cost getPayToll() {
                return payToll;
            }

            /**
             * Sets the value of the payToll property.
             * 
             * @param value
             *     allowed object is
             *     {@link Cost }
             *     
             */
            public void setPayToll(Cost value) {
                this.payToll = value;
            }

            /**
             * Gets the value of the takeElevator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTakeElevator() {
                return takeElevator;
            }

            /**
             * Sets the value of the takeElevator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTakeElevator(String value) {
                this.takeElevator = value;
            }

            /**
             * Gets the value of the takeEscalator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTakeEscalator() {
                return takeEscalator;
            }

            /**
             * Sets the value of the takeEscalator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTakeEscalator(String value) {
                this.takeEscalator = value;
            }

            /**
             * Gets the value of the takeStairs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTakeStairs() {
                return takeStairs;
            }

            /**
             * Sets the value of the takeStairs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTakeStairs(String value) {
                this.takeStairs = value;
            }

            /**
             * Gets the value of the board property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBoard() {
                return board;
            }

            /**
             * Sets the value of the board property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBoard(String value) {
                this.board = value;
            }

            /**
             * Gets the value of the alight property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlight() {
                return alight;
            }

            /**
             * Sets the value of the alight property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlight(String value) {
                this.alight = value;
            }

            /**
             * Gets the value of the getTransfer property.
             * 
             * @return
             *     possible object is
             *     {@link CPTStoppointIden }
             *     
             */
            public CPTStoppointIden getGetTransfer() {
                return getTransfer;
            }

            /**
             * Sets the value of the getTransfer property.
             * 
             * @param value
             *     allowed object is
             *     {@link CPTStoppointIden }
             *     
             */
            public void setGetTransfer(CPTStoppointIden value) {
                this.getTransfer = value;
            }

            /**
             * Gets the value of the localManeuverInstruction property.
             * 
             * @return
             *     possible object is
             *     {@link atis_03_00_74_local.ManeuverInstruction }
             *     
             */
            public atis_03_00_74_local.ManeuverInstruction getLocalManeuverInstruction() {
                return localManeuverInstruction;
            }

            /**
             * Sets the value of the localManeuverInstruction property.
             * 
             * @param value
             *     allowed object is
             *     {@link atis_03_00_74_local.ManeuverInstruction }
             *     
             */
            public void setLocalManeuverInstruction(atis_03_00_74_local.ManeuverInstruction value) {
                this.localManeuverInstruction = value;
            }

        }

    }

}
