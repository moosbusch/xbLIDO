/*
 * An XML document type.
 * Localname: Conversion
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ConversionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Conversion(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ConversionDocumentImpl extends net.opengis.gml.impl.GeneralConversionDocumentImpl implements net.opengis.gml.ConversionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion");
    
    
    /**
     * Gets the "Conversion" element
     */
    public net.opengis.gml.ConversionType getConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionType target = null;
            target = (net.opengis.gml.ConversionType)get_store().find_element_user(CONVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Conversion" element
     */
    @Inject(optional=true) public void setConversion(net.opengis.gml.ConversionType conversion)
    {
        generatedSetterHelperImpl(conversion, CONVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Conversion" element
     */
    public net.opengis.gml.ConversionType addNewConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionType target = null;
            target = (net.opengis.gml.ConversionType)get_store().add_element_user(CONVERSION$0);
            return target;
        }
    }
}
