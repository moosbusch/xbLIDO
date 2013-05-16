/*
 * An XML document type.
 * Localname: VerticalCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.VerticalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one VerticalCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class VerticalCSDocumentImpl extends net.opengis.gml.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.VerticalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCS");
    
    
    /**
     * Gets the "VerticalCS" element
     */
    public net.opengis.gml.VerticalCSType getVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCSType target = null;
            target = (net.opengis.gml.VerticalCSType)get_store().find_element_user(VERTICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerticalCS" element
     */
    @Inject(optional=true) public void setVerticalCS(net.opengis.gml.VerticalCSType verticalCS)
    {
        generatedSetterHelperImpl(verticalCS, VERTICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerticalCS" element
     */
    public net.opengis.gml.VerticalCSType addNewVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCSType target = null;
            target = (net.opengis.gml.VerticalCSType)get_store().add_element_user(VERTICALCS$0);
            return target;
        }
    }
}
