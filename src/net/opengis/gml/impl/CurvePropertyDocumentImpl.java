/*
 * An XML document type.
 * Localname: curveProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurvePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one curveProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CurvePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CurvePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurvePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveProperty");
    
    
    /**
     * Gets the "curveProperty" element
     */
    public net.opengis.gml.CurvePropertyType getCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(CURVEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curveProperty" element
     */
    @Inject(optional=true) public void setCurveProperty(net.opengis.gml.CurvePropertyType curveProperty)
    {
        generatedSetterHelperImpl(curveProperty, CURVEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveProperty" element
     */
    public net.opengis.gml.CurvePropertyType addNewCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(CURVEPROPERTY$0);
            return target;
        }
    }
}
