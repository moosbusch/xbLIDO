/*
 * An XML document type.
 * Localname: verticalCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.VerticalCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one verticalCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class VerticalCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.VerticalCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "verticalCRSRef");
    
    
    /**
     * Gets the "verticalCRSRef" element
     */
    public net.opengis.gml.VerticalCRSRefType getVerticalCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCRSRefType target = null;
            target = (net.opengis.gml.VerticalCRSRefType)get_store().find_element_user(VERTICALCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalCRSRef" element
     */
    @Inject(optional=true) public void setVerticalCRSRef(net.opengis.gml.VerticalCRSRefType verticalCRSRef)
    {
        generatedSetterHelperImpl(verticalCRSRef, VERTICALCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalCRSRef" element
     */
    public net.opengis.gml.VerticalCRSRefType addNewVerticalCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCRSRefType target = null;
            target = (net.opengis.gml.VerticalCRSRefType)get_store().add_element_user(VERTICALCRSREF$0);
            return target;
        }
    }
}
