/*
 * XML Type:  CurveType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CurveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CurveTypeImpl extends net.opengis.gml.impl.AbstractCurveTypeImpl implements net.opengis.gml.CurveType
{
    private static final long serialVersionUID = 1L;
    
    public CurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEGMENTS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "segments");
    
    
    /**
     * Gets the "segments" element
     */
    public net.opengis.gml.CurveSegmentArrayPropertyType getSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.CurveSegmentArrayPropertyType)get_store().find_element_user(SEGMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "segments" element
     */
    @Inject(optional=true) public void setSegments(net.opengis.gml.CurveSegmentArrayPropertyType segments)
    {
        generatedSetterHelperImpl(segments, SEGMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "segments" element
     */
    public net.opengis.gml.CurveSegmentArrayPropertyType addNewSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.CurveSegmentArrayPropertyType)get_store().add_element_user(SEGMENTS$0);
            return target;
        }
    }
}
