/*
 * An XML document type.
 * Localname: verticalCSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.VerticalCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one verticalCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class VerticalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.VerticalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "verticalCSRef");
    
    
    /**
     * Gets the "verticalCSRef" element
     */
    public net.opengis.gml.VerticalCSRefType getVerticalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCSRefType target = null;
            target = (net.opengis.gml.VerticalCSRefType)get_store().find_element_user(VERTICALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalCSRef" element
     */
    @Inject(optional=true) public void setVerticalCSRef(net.opengis.gml.VerticalCSRefType verticalCSRef)
    {
        generatedSetterHelperImpl(verticalCSRef, VERTICALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalCSRef" element
     */
    public net.opengis.gml.VerticalCSRefType addNewVerticalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCSRefType target = null;
            target = (net.opengis.gml.VerticalCSRefType)get_store().add_element_user(VERTICALCSREF$0);
            return target;
        }
    }
}
