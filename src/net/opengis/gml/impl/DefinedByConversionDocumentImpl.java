/*
 * An XML document type.
 * Localname: definedByConversion
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DefinedByConversionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one definedByConversion(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DefinedByConversionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DefinedByConversionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinedByConversionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINEDBYCONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "definedByConversion");
    
    
    /**
     * Gets the "definedByConversion" element
     */
    public net.opengis.gml.GeneralConversionRefType getDefinedByConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeneralConversionRefType target = null;
            target = (net.opengis.gml.GeneralConversionRefType)get_store().find_element_user(DEFINEDBYCONVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definedByConversion" element
     */
    @Inject(optional=true) public void setDefinedByConversion(net.opengis.gml.GeneralConversionRefType definedByConversion)
    {
        generatedSetterHelperImpl(definedByConversion, DEFINEDBYCONVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definedByConversion" element
     */
    public net.opengis.gml.GeneralConversionRefType addNewDefinedByConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeneralConversionRefType target = null;
            target = (net.opengis.gml.GeneralConversionRefType)get_store().add_element_user(DEFINEDBYCONVERSION$0);
            return target;
        }
    }
}
