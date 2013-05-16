/*
 * An XML document type.
 * Localname: usesImageDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesImageDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesImageDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesImageDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesImageDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesImageDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESIMAGEDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesImageDatum");
    
    
    /**
     * Gets the "usesImageDatum" element
     */
    public net.opengis.gml.ImageDatumRefType getUsesImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageDatumRefType target = null;
            target = (net.opengis.gml.ImageDatumRefType)get_store().find_element_user(USESIMAGEDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesImageDatum" element
     */
    @Inject(optional=true) public void setUsesImageDatum(net.opengis.gml.ImageDatumRefType usesImageDatum)
    {
        generatedSetterHelperImpl(usesImageDatum, USESIMAGEDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesImageDatum" element
     */
    public net.opengis.gml.ImageDatumRefType addNewUsesImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageDatumRefType target = null;
            target = (net.opengis.gml.ImageDatumRefType)get_store().add_element_user(USESIMAGEDATUM$0);
            return target;
        }
    }
}
