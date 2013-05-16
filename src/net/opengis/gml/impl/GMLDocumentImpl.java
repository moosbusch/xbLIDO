/*
 * An XML document type.
 * Localname: _GML
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GMLDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _GML(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GMLDocumentImpl extends net.opengis.gml.impl.ObjectDocumentImpl implements net.opengis.gml.GMLDocument
{
    private static final long serialVersionUID = 1L;
    
    public GMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GML$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GML");
    private static final org.apache.xmlbeans.QNameSet GML$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiLineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GraphStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Style"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConcatenatedOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Datum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometricComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Feature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Topology"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationMethod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Bag"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendarEra"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Coverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ellipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeSlice"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GML"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeTopologyPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopologyStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Node"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Array"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Style"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometryStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_DiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Definition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionProxy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LabelStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Operation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CoordinateSystemAxis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Dictionary"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Grid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeInstant"),
    });
    
    
    /**
     * Gets the "_GML" element
     */
    public net.opengis.gml.AbstractGMLType getGML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGMLType target = null;
            target = (net.opengis.gml.AbstractGMLType)get_store().find_element_user(GML$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GML" element
     */
    @Inject(optional=true) public void setGML(net.opengis.gml.AbstractGMLType gml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGMLType target = null;
            target = (net.opengis.gml.AbstractGMLType)get_store().find_element_user(GML$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGMLType)get_store().add_element_user(GML$0);
            }
            target.set(gml);
        }
    }
    
    /**
     * Appends and returns a new empty "_GML" element
     */
    public net.opengis.gml.AbstractGMLType addNewGML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGMLType target = null;
            target = (net.opengis.gml.AbstractGMLType)get_store().add_element_user(GML$0);
            return target;
        }
    }
}
