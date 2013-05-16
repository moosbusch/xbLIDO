/*
 * An XML document type.
 * Localname: usesVerticalDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesVerticalDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesVerticalDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesVerticalDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesVerticalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesVerticalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESVERTICALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesVerticalDatum");
    
    
    /**
     * Gets the "usesVerticalDatum" element
     */
    public net.opengis.gml.VerticalDatumRefType getUsesVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumRefType target = null;
            target = (net.opengis.gml.VerticalDatumRefType)get_store().find_element_user(USESVERTICALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesVerticalDatum" element
     */
    @Inject(optional=true) public void setUsesVerticalDatum(net.opengis.gml.VerticalDatumRefType usesVerticalDatum)
    {
        generatedSetterHelperImpl(usesVerticalDatum, USESVERTICALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesVerticalDatum" element
     */
    public net.opengis.gml.VerticalDatumRefType addNewUsesVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumRefType target = null;
            target = (net.opengis.gml.VerticalDatumRefType)get_store().add_element_user(USESVERTICALDATUM$0);
            return target;
        }
    }
}
