/*
 * An XML document type.
 * Localname: includesElement
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IncludesElementDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one includesElement(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IncludesElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IncludesElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludesElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesElement");
    
    
    /**
     * Gets the "includesElement" element
     */
    public net.opengis.gml.CovarianceElementType getIncludesElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CovarianceElementType target = null;
            target = (net.opengis.gml.CovarianceElementType)get_store().find_element_user(INCLUDESELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includesElement" element
     */
    @Inject(optional=true) public void setIncludesElement(net.opengis.gml.CovarianceElementType includesElement)
    {
        generatedSetterHelperImpl(includesElement, INCLUDESELEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includesElement" element
     */
    public net.opengis.gml.CovarianceElementType addNewIncludesElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CovarianceElementType target = null;
            target = (net.opengis.gml.CovarianceElementType)get_store().add_element_user(INCLUDESELEMENT$0);
            return target;
        }
    }
}
