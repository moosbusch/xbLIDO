/*
 * An XML document type.
 * Localname: verticalDatumRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.VerticalDatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one verticalDatumRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class VerticalDatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.VerticalDatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALDATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "verticalDatumRef");
    
    
    /**
     * Gets the "verticalDatumRef" element
     */
    public net.opengis.gml.VerticalDatumRefType getVerticalDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumRefType target = null;
            target = (net.opengis.gml.VerticalDatumRefType)get_store().find_element_user(VERTICALDATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalDatumRef" element
     */
    @Inject(optional=true) public void setVerticalDatumRef(net.opengis.gml.VerticalDatumRefType verticalDatumRef)
    {
        generatedSetterHelperImpl(verticalDatumRef, VERTICALDATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalDatumRef" element
     */
    public net.opengis.gml.VerticalDatumRefType addNewVerticalDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumRefType target = null;
            target = (net.opengis.gml.VerticalDatumRefType)get_store().add_element_user(VERTICALDATUMREF$0);
            return target;
        }
    }
}
