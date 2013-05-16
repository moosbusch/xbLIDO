/*
 * An XML document type.
 * Localname: _Feature
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FeatureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _Feature(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FeatureDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.FeatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Feature");
    private static final org.apache.xmlbeans.QNameSet FEATURE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Coverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Feature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_DiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage"),
    });
    
    
    /**
     * Gets the "_Feature" element
     */
    public net.opengis.gml.AbstractFeatureType getFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureType target = null;
            target = (net.opengis.gml.AbstractFeatureType)get_store().find_element_user(FEATURE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Feature" element
     */
    @Inject(optional=true) public void setFeature(net.opengis.gml.AbstractFeatureType feature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureType target = null;
            target = (net.opengis.gml.AbstractFeatureType)get_store().find_element_user(FEATURE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractFeatureType)get_store().add_element_user(FEATURE$0);
            }
            target.set(feature);
        }
    }
    
    /**
     * Appends and returns a new empty "_Feature" element
     */
    public net.opengis.gml.AbstractFeatureType addNewFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureType target = null;
            target = (net.opengis.gml.AbstractFeatureType)get_store().add_element_user(FEATURE$0);
            return target;
        }
    }
}
