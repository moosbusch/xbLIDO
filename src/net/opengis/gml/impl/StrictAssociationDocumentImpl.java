/*
 * An XML document type.
 * Localname: _strictAssociation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.StrictAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _strictAssociation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class StrictAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.StrictAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public StrictAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRICTASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_strictAssociation");
    
    
    /**
     * Gets the "_strictAssociation" element
     */
    public net.opengis.gml.AssociationType getStrictAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().find_element_user(STRICTASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_strictAssociation" element
     */
    @Inject(optional=true) public void setStrictAssociation(net.opengis.gml.AssociationType strictAssociation)
    {
        generatedSetterHelperImpl(strictAssociation, STRICTASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "_strictAssociation" element
     */
    public net.opengis.gml.AssociationType addNewStrictAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().add_element_user(STRICTASSOCIATION$0);
            return target;
        }
    }
}
