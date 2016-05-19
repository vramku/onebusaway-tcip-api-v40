//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07_for_atis_im;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lrms_final_09_07_for_atis_im package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LocationReference_QNAME = new QName("http://www.lrms-final-09-07-for-atis-im", "locationReference");
    private final static QName _AdminAreaGroupCity_QNAME = new QName("", "city");
    private final static QName _AdminAreaGroupCounty_QNAME = new QName("", "county");
    private final static QName _AdminAreaGroupState_QNAME = new QName("", "state");
    private final static QName _AdminAreaGroupPostalCode_QNAME = new QName("", "postalCode");
    private final static QName _AdminAreaGroupCountryCode_QNAME = new QName("", "countryCode");
    private final static QName _AdminAreaGroupStateFIPS_QNAME = new QName("", "stateFIPS");
    private final static QName _AdminAreaGroupEntityIPS_QNAME = new QName("", "entityIPS");
    private final static QName _AdminAreaGroupCountyFIPS_QNAME = new QName("", "countyFIPS");
    private final static QName _AdminAreaGroupCityFIPS_QNAME = new QName("", "cityFIPS");
    private final static QName _AdminAreaGroupLocalAdminAreaGroup_QNAME = new QName("", "localAdminAreaGroup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lrms_final_09_07_for_atis_im
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SpatialObject }
     * 
     */
    public SpatialObject createSpatialObject() {
        return new SpatialObject();
    }

    /**
     * Create an instance of {@link NodeAttribute }
     * 
     */
    public NodeAttribute createNodeAttribute() {
        return new NodeAttribute();
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link GridPointSequence }
     * 
     */
    public GridPointSequence createGridPointSequence() {
        return new GridPointSequence();
    }

    /**
     * Create an instance of {@link GridPointSequence.PointPairInfo }
     * 
     */
    public GridPointSequence.PointPairInfo createGridPointSequencePointPairInfo() {
        return new GridPointSequence.PointPairInfo();
    }

    /**
     * Create an instance of {@link GridPointPair }
     * 
     */
    public GridPointPair createGridPointPair() {
        return new GridPointPair();
    }

    /**
     * Create an instance of {@link GridPointPair.PointPairInfo }
     * 
     */
    public GridPointPair.PointPairInfo createGridPointPairPointPairInfo() {
        return new GridPointPair.PointPairInfo();
    }

    /**
     * Create an instance of {@link GridPoint }
     * 
     */
    public GridPoint createGridPoint() {
        return new GridPoint();
    }

    /**
     * Create an instance of {@link GridPoint.GridPointInfo }
     * 
     */
    public GridPoint.GridPointInfo createGridPointGridPointInfo() {
        return new GridPoint.GridPointInfo();
    }

    /**
     * Create an instance of {@link Geometry }
     * 
     */
    public Geometry createGeometry() {
        return new Geometry();
    }

    /**
     * Create an instance of {@link GeoLocationDelta }
     * 
     */
    public GeoLocationDelta createGeoLocationDelta() {
        return new GeoLocationDelta();
    }

    /**
     * Create an instance of {@link GeoLocationDelta.Delta }
     * 
     */
    public GeoLocationDelta.Delta createGeoLocationDeltaDelta() {
        return new GeoLocationDelta.Delta();
    }

    /**
     * Create an instance of {@link ChainS }
     * 
     */
    public ChainS createChainS() {
        return new ChainS();
    }

    /**
     * Create an instance of {@link AreaLocation }
     * 
     */
    public AreaLocation createAreaLocation() {
        return new AreaLocation();
    }

    /**
     * Create an instance of {@link LocationReference }
     * 
     */
    public LocationReference createLocationReference() {
        return new LocationReference();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressLink }
     * 
     */
    public AddressLink createAddressLink() {
        return new AddressLink();
    }

    /**
     * Create an instance of {@link AddressPoint }
     * 
     */
    public AddressPoint createAddressPoint() {
        return new AddressPoint();
    }

    /**
     * Create an instance of {@link lrms_final_09_07_for_atis_im.AdminAreaGroup }
     * 
     */
    public lrms_final_09_07_for_atis_im.AdminAreaGroup createAdminAreaGroup() {
        return new lrms_final_09_07_for_atis_im.AdminAreaGroup();
    }

    /**
     * Create an instance of {@link Angle }
     * 
     */
    public Angle createAngle() {
        return new Angle();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link CrossStreets }
     * 
     */
    public CrossStreets createCrossStreets() {
        return new CrossStreets();
    }

    /**
     * Create an instance of {@link CrossStreetsLink }
     * 
     */
    public CrossStreetsLink createCrossStreetsLink() {
        return new CrossStreetsLink();
    }

    /**
     * Create an instance of {@link CrossStreetsPoint }
     * 
     */
    public CrossStreetsPoint createCrossStreetsPoint() {
        return new CrossStreetsPoint();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link GeoCoord }
     * 
     */
    public GeoCoord createGeoCoord() {
        return new GeoCoord();
    }

    /**
     * Create an instance of {@link GeoLocation }
     * 
     */
    public GeoLocation createGeoLocation() {
        return new GeoLocation();
    }

    /**
     * Create an instance of {@link GeoLocationLink }
     * 
     */
    public GeoLocationLink createGeoLocationLink() {
        return new GeoLocationLink();
    }

    /**
     * Create an instance of {@link Grid }
     * 
     */
    public Grid createGrid() {
        return new Grid();
    }

    /**
     * Create an instance of {@link GridArray }
     * 
     */
    public GridArray createGridArray() {
        return new GridArray();
    }

    /**
     * Create an instance of {@link GridInfo }
     * 
     */
    public GridInfo createGridInfo() {
        return new GridInfo();
    }

    /**
     * Create an instance of {@link GroupLocation }
     * 
     */
    public GroupLocation createGroupLocation() {
        return new GroupLocation();
    }

    /**
     * Create an instance of {@link Height }
     * 
     */
    public Height createHeight() {
        return new Height();
    }

    /**
     * Create an instance of {@link LinkGeneral }
     * 
     */
    public LinkGeneral createLinkGeneral() {
        return new LinkGeneral();
    }

    /**
     * Create an instance of {@link LinkLocation }
     * 
     */
    public LinkLocation createLinkLocation() {
        return new LinkLocation();
    }

    /**
     * Create an instance of {@link LinearReference }
     * 
     */
    public LinearReference createLinearReference() {
        return new LinearReference();
    }

    /**
     * Create an instance of {@link PointLocation }
     * 
     */
    public PointLocation createPointLocation() {
        return new PointLocation();
    }

    /**
     * Create an instance of {@link PointOffset }
     * 
     */
    public PointOffset createPointOffset() {
        return new PointOffset();
    }

    /**
     * Create an instance of {@link PolarCoordinates }
     * 
     */
    public PolarCoordinates createPolarCoordinates() {
        return new PolarCoordinates();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link PreCoded }
     * 
     */
    public PreCoded createPreCoded() {
        return new PreCoded();
    }

    /**
     * Create an instance of {@link PublicGrid }
     * 
     */
    public PublicGrid createPublicGrid() {
        return new PublicGrid();
    }

    /**
     * Create an instance of {@link PublicGridLocalReference }
     * 
     */
    public PublicGridLocalReference createPublicGridLocalReference() {
        return new PublicGridLocalReference();
    }

    /**
     * Create an instance of {@link PublicGridStatePlane }
     * 
     */
    public PublicGridStatePlane createPublicGridStatePlane() {
        return new PublicGridStatePlane();
    }

    /**
     * Create an instance of {@link PublicGridUSNG }
     * 
     */
    public PublicGridUSNG createPublicGridUSNG() {
        return new PublicGridUSNG();
    }

    /**
     * Create an instance of {@link RouteLocation }
     * 
     */
    public RouteLocation createRouteLocation() {
        return new RouteLocation();
    }

    /**
     * Create an instance of {@link StreetInfo }
     * 
     */
    public StreetInfo createStreetInfo() {
        return new StreetInfo();
    }

    /**
     * Create an instance of {@link Transition }
     * 
     */
    public Transition createTransition() {
        return new Transition();
    }

    /**
     * Create an instance of {@link SpatialObject.PointOrNodeObject }
     * 
     */
    public SpatialObject.PointOrNodeObject createSpatialObjectPointOrNodeObject() {
        return new SpatialObject.PointOrNodeObject();
    }

    /**
     * Create an instance of {@link SpatialObject.LinkObject }
     * 
     */
    public SpatialObject.LinkObject createSpatialObjectLinkObject() {
        return new SpatialObject.LinkObject();
    }

    /**
     * Create an instance of {@link SpatialObject.ChainObject }
     * 
     */
    public SpatialObject.ChainObject createSpatialObjectChainObject() {
        return new SpatialObject.ChainObject();
    }

    /**
     * Create an instance of {@link SpatialObject.TransitionObject }
     * 
     */
    public SpatialObject.TransitionObject createSpatialObjectTransitionObject() {
        return new SpatialObject.TransitionObject();
    }

    /**
     * Create an instance of {@link SpatialObject.AreaObject }
     * 
     */
    public SpatialObject.AreaObject createSpatialObjectAreaObject() {
        return new SpatialObject.AreaObject();
    }

    /**
     * Create an instance of {@link SpatialObject.PolygonObject }
     * 
     */
    public SpatialObject.PolygonObject createSpatialObjectPolygonObject() {
        return new SpatialObject.PolygonObject();
    }

    /**
     * Create an instance of {@link SpatialObject.RouteObject }
     * 
     */
    public SpatialObject.RouteObject createSpatialObjectRouteObject() {
        return new SpatialObject.RouteObject();
    }

    /**
     * Create an instance of {@link NodeAttribute.Streets }
     * 
     */
    public NodeAttribute.Streets createNodeAttributeStreets() {
        return new NodeAttribute.Streets();
    }

    /**
     * Create an instance of {@link IdType.IntOrAlpha }
     * 
     */
    public IdType.IntOrAlpha createIdTypeIntOrAlpha() {
        return new IdType.IntOrAlpha();
    }

    /**
     * Create an instance of {@link GridPointSequence.PointPairInfo.PointPairInfoItem }
     * 
     */
    public GridPointSequence.PointPairInfo.PointPairInfoItem createGridPointSequencePointPairInfoPointPairInfoItem() {
        return new GridPointSequence.PointPairInfo.PointPairInfoItem();
    }

    /**
     * Create an instance of {@link GridPointPair.PointPairInfo.PointPairInfoItem }
     * 
     */
    public GridPointPair.PointPairInfo.PointPairInfoItem createGridPointPairPointPairInfoPointPairInfoItem() {
        return new GridPointPair.PointPairInfo.PointPairInfoItem();
    }

    /**
     * Create an instance of {@link GridPoint.GridPointInfo.GridPointInfoItem }
     * 
     */
    public GridPoint.GridPointInfo.GridPointInfoItem createGridPointGridPointInfoGridPointInfoItem() {
        return new GridPoint.GridPointInfo.GridPointInfoItem();
    }

    /**
     * Create an instance of {@link Geometry.NodeOffset }
     * 
     */
    public Geometry.NodeOffset createGeometryNodeOffset() {
        return new Geometry.NodeOffset();
    }

    /**
     * Create an instance of {@link GeoLocationDelta.Delta.DeltaCoords }
     * 
     */
    public GeoLocationDelta.Delta.DeltaCoords createGeoLocationDeltaDeltaDeltaCoords() {
        return new GeoLocationDelta.Delta.DeltaCoords();
    }

    /**
     * Create an instance of {@link GeoLocationDelta.Delta.DeltaDistance }
     * 
     */
    public GeoLocationDelta.Delta.DeltaDistance createGeoLocationDeltaDeltaDeltaDistance() {
        return new GeoLocationDelta.Delta.DeltaDistance();
    }

    /**
     * Create an instance of {@link ChainS.Chain }
     * 
     */
    public ChainS.Chain createChainSChain() {
        return new ChainS.Chain();
    }

    /**
     * Create an instance of {@link AreaLocation.Roads }
     * 
     */
    public AreaLocation.Roads createAreaLocationRoads() {
        return new AreaLocation.Roads();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.lrms-final-09-07-for-atis-im", name = "locationReference")
    public JAXBElement<LocationReference> createLocationReference(LocationReference value) {
        return new JAXBElement<LocationReference>(_LocationReference_QNAME, LocationReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "city", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<String> createAdminAreaGroupCity(String value) {
        return new JAXBElement<String>(_AdminAreaGroupCity_QNAME, String.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "county", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<String> createAdminAreaGroupCounty(String value) {
        return new JAXBElement<String>(_AdminAreaGroupCounty_QNAME, String.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<String> createAdminAreaGroupState(String value) {
        return new JAXBElement<String>(_AdminAreaGroupState_QNAME, String.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postalCode", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<String> createAdminAreaGroupPostalCode(String value) {
        return new JAXBElement<String>(_AdminAreaGroupPostalCode_QNAME, String.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "countryCode", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<CountryCodeText> createAdminAreaGroupCountryCode(CountryCodeText value) {
        return new JAXBElement<CountryCodeText>(_AdminAreaGroupCountryCode_QNAME, CountryCodeText.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stateFIPS", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<Short> createAdminAreaGroupStateFIPS(Short value) {
        return new JAXBElement<Short>(_AdminAreaGroupStateFIPS_QNAME, Short.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entityIPS", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<Long> createAdminAreaGroupEntityIPS(Long value) {
        return new JAXBElement<Long>(_AdminAreaGroupEntityIPS_QNAME, Long.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "countyFIPS", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<Integer> createAdminAreaGroupCountyFIPS(Integer value) {
        return new JAXBElement<Integer>(_AdminAreaGroupCountyFIPS_QNAME, Integer.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cityFIPS", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<Long> createAdminAreaGroupCityFIPS(Long value) {
        return new JAXBElement<Long>(_AdminAreaGroupCityFIPS_QNAME, Long.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link lrms_local_atis_im.AdminAreaGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "localAdminAreaGroup", scope = lrms_final_09_07_for_atis_im.AdminAreaGroup.class)
    public JAXBElement<lrms_local_atis_im.AdminAreaGroup> createAdminAreaGroupLocalAdminAreaGroup(lrms_local_atis_im.AdminAreaGroup value) {
        return new JAXBElement<lrms_local_atis_im.AdminAreaGroup>(_AdminAreaGroupLocalAdminAreaGroup_QNAME, lrms_local_atis_im.AdminAreaGroup.class, lrms_final_09_07_for_atis_im.AdminAreaGroup.class, value);
    }

}
