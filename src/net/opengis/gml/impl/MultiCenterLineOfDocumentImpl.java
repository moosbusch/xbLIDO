/*
 * An XML document type.
 * Localname: multiCenterLineOf
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiCenterLineOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiCenterLineOf(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiCenterLineOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiCenterLineOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCenterLineOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICENTERLINEOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiCenterLineOf");
    
    
    /**
     * Gets the "multiCenterLineOf" element
     */
    public net.opengis.gml.MultiCurvePropertyType getMultiCenterLineOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.MultiCurvePropertyType)get_store().find_element_user(MULTICENTERLINEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCenterLineOf" element
     */
    @Inject(optional=true) public void setMultiCenterLineOf(net.opengis.gml.MultiCurvePropertyType multiCenterLineOf)
    {
        generatedSetterHelperImpl(multiCenterLineOf, MULTICENTERLINEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCenterLineOf" element
     */
    public net.opengis.gml.MultiCurvePropertyType addNewMultiCenterLineOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.MultiCurvePropertyType)get_store().add_element_user(MULTICENTERLINEOF$0);
            return target;
        }
    }
}
