/*
 * XML Type:  GeographicCRSType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeographicCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML GeographicCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeographicCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.GeographicCRSType
{
    private static final long serialVersionUID = 1L;
    
    public GeographicCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESELLIPSOIDALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesEllipsoidalCS");
    private static final javax.xml.namespace.QName USESGEODETICDATUM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesGeodeticDatum");
    
    
    /**
     * Gets the "usesEllipsoidalCS" element
     */
    public net.opengis.gml.EllipsoidalCSRefType getUsesEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidalCSRefType target = null;
            target = (net.opengis.gml.EllipsoidalCSRefType)get_store().find_element_user(USESELLIPSOIDALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEllipsoidalCS" element
     */
    @Inject(optional=true) public void setUsesEllipsoidalCS(net.opengis.gml.EllipsoidalCSRefType usesEllipsoidalCS)
    {
        generatedSetterHelperImpl(usesEllipsoidalCS, USESELLIPSOIDALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEllipsoidalCS" element
     */
    public net.opengis.gml.EllipsoidalCSRefType addNewUsesEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidalCSRefType target = null;
            target = (net.opengis.gml.EllipsoidalCSRefType)get_store().add_element_user(USESELLIPSOIDALCS$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesGeodeticDatum" element
     */
    public net.opengis.gml.GeodeticDatumRefType getUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().find_element_user(USESGEODETICDATUM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesGeodeticDatum" element
     */
    @Inject(optional=true) public void setUsesGeodeticDatum(net.opengis.gml.GeodeticDatumRefType usesGeodeticDatum)
    {
        generatedSetterHelperImpl(usesGeodeticDatum, USESGEODETICDATUM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesGeodeticDatum" element
     */
    public net.opengis.gml.GeodeticDatumRefType addNewUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().add_element_user(USESGEODETICDATUM$2);
            return target;
        }
    }
}
