/*
 * An XML document type.
 * Localname: curveArrayProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveArrayPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one curveArrayProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CurveArrayPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CurveArrayPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveArrayPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEARRAYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveArrayProperty");
    
    
    /**
     * Gets the "curveArrayProperty" element
     */
    public net.opengis.gml.CurveArrayPropertyType getCurveArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.CurveArrayPropertyType)get_store().find_element_user(CURVEARRAYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curveArrayProperty" element
     */
    @Inject(optional=true) public void setCurveArrayProperty(net.opengis.gml.CurveArrayPropertyType curveArrayProperty)
    {
        generatedSetterHelperImpl(curveArrayProperty, CURVEARRAYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveArrayProperty" element
     */
    public net.opengis.gml.CurveArrayPropertyType addNewCurveArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.CurveArrayPropertyType)get_store().add_element_user(CURVEARRAYPROPERTY$0);
            return target;
        }
    }
}
