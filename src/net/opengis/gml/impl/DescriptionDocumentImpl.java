/*
 * An XML document type.
 * Localname: description
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one description(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "description");
    
    
    /**
     * Gets the "description" element
     */
    public net.opengis.gml.StringOrRefType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    @Inject(optional=true) public void setDescription(net.opengis.gml.StringOrRefType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public net.opengis.gml.StringOrRefType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
}
