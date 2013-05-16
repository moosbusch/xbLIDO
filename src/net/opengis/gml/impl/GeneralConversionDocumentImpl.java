/*
 * An XML document type.
 * Localname: _GeneralConversion
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeneralConversionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _GeneralConversion(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralConversionDocumentImpl extends net.opengis.gml.impl.OperationDocumentImpl implements net.opengis.gml.GeneralConversionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralConversionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALCONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion");
    private static final org.apache.xmlbeans.QNameSet GENERALCONVERSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion"),
    });
    
    
    /**
     * Gets the "_GeneralConversion" element
     */
    public net.opengis.gml.AbstractGeneralConversionType getGeneralConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.AbstractGeneralConversionType)get_store().find_element_user(GENERALCONVERSION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeneralConversion" element
     */
    @Inject(optional=true) public void setGeneralConversion(net.opengis.gml.AbstractGeneralConversionType generalConversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.AbstractGeneralConversionType)get_store().find_element_user(GENERALCONVERSION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeneralConversionType)get_store().add_element_user(GENERALCONVERSION$0);
            }
            target.set(generalConversion);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeneralConversion" element
     */
    public net.opengis.gml.AbstractGeneralConversionType addNewGeneralConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.AbstractGeneralConversionType)get_store().add_element_user(GENERALCONVERSION$0);
            return target;
        }
    }
}
