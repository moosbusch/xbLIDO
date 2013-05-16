/*
 * An XML document type.
 * Localname: _association
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AssociationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _association(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class AssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_association");
    
    
    /**
     * Gets the "_association" element
     */
    public net.opengis.gml.AssociationType getAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().find_element_user(ASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_association" element
     */
    @Inject(optional=true) public void setAssociation(net.opengis.gml.AssociationType association)
    {
        generatedSetterHelperImpl(association, ASSOCIATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "_association" element
     */
    public net.opengis.gml.AssociationType addNewAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().add_element_user(ASSOCIATION$0);
            return target;
        }
    }
}
