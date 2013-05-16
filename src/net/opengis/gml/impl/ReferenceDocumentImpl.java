/*
 * An XML document type.
 * Localname: _reference
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _reference(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_reference");
    
    
    /**
     * Gets the "_reference" element
     */
    public net.opengis.gml.ReferenceType getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_reference" element
     */
    @Inject(optional=true) public void setReference(net.opengis.gml.ReferenceType reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "_reference" element
     */
    public net.opengis.gml.ReferenceType addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().add_element_user(REFERENCE$0);
            return target;
        }
    }
}
