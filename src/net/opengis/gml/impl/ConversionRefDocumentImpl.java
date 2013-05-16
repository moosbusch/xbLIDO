/*
 * An XML document type.
 * Localname: conversionRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ConversionRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one conversionRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ConversionRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ConversionRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversionRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "conversionRef");
    
    
    /**
     * Gets the "conversionRef" element
     */
    public net.opengis.gml.ConversionRefType getConversionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionRefType target = null;
            target = (net.opengis.gml.ConversionRefType)get_store().find_element_user(CONVERSIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversionRef" element
     */
    @Inject(optional=true) public void setConversionRef(net.opengis.gml.ConversionRefType conversionRef)
    {
        generatedSetterHelperImpl(conversionRef, CONVERSIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversionRef" element
     */
    public net.opengis.gml.ConversionRefType addNewConversionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionRefType target = null;
            target = (net.opengis.gml.ConversionRefType)get_store().add_element_user(CONVERSIONREF$0);
            return target;
        }
    }
}
