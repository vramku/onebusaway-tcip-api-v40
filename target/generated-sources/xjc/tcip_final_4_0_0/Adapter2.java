//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.LocalTime;

public class Adapter2
    extends XmlAdapter<String, LocalTime>
{


    public LocalTime unmarshal(String value) {
        return new LocalTime(value);
    }

    public String marshal(LocalTime value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
