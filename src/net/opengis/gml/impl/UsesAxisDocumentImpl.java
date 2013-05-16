/*
 * An XML document type.
 * Localname: usesAxis
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesAxisDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesAxis(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesAxisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesAxisDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesAxisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESAXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesAxis");
    
    
    /**
     * Gets the "usesAxis" element
     */
    public net.opengis.gml.CoordinateSystemAxisRefType getUsesAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemAxisRefType target = null;
            target = (net.opengis.gml.CoordinateSystemAxisRefType)get_store().find_element_user(USESAXIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesAxis" element
     */
    @Inject(optional=true) public void setUsesAxis(net.opengis.gml.CoordinateSystemAxisRefType usesAxis)
    {
        generatedSetterHelperImpl(usesAxis, USESAXIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesAxis" element
     */
    public net.opengis.gml.CoordinateSystemAxisRefType addNewUsesAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemAxisRefType target = null;
            target = (net.opengis.gml.CoordinateSystemAxisRefType)get_store().add_element_user(USESAXIS$0);
            return target;
        }
    }
}
