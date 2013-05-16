/*
 * An XML document type.
 * Localname: axisID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AxisIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one axisID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class AxisIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AxisIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public AxisIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXISID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "axisID");
    
    
    /**
     * Gets the "axisID" element
     */
    public net.opengis.gml.IdentifierType getAxisID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(AXISID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axisID" element
     */
    @Inject(optional=true) public void setAxisID(net.opengis.gml.IdentifierType axisID)
    {
        generatedSetterHelperImpl(axisID, AXISID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "axisID" element
     */
    public net.opengis.gml.IdentifierType addNewAxisID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(AXISID$0);
            return target;
        }
    }
}
