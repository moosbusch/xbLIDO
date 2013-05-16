/*
 * An XML document type.
 * Localname: centerLineOf
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CenterLineOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one centerLineOf(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CenterLineOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CenterLineOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public CenterLineOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CENTERLINEOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "centerLineOf");
    
    
    /**
     * Gets the "centerLineOf" element
     */
    public net.opengis.gml.CurvePropertyType getCenterLineOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(CENTERLINEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "centerLineOf" element
     */
    @Inject(optional=true) public void setCenterLineOf(net.opengis.gml.CurvePropertyType centerLineOf)
    {
        generatedSetterHelperImpl(centerLineOf, CENTERLINEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "centerLineOf" element
     */
    public net.opengis.gml.CurvePropertyType addNewCenterLineOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(CENTERLINEOF$0);
            return target;
        }
    }
}
