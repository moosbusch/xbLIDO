/*
 * An XML document type.
 * Localname: subject
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SubjectDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one subject(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SubjectDocumentImpl extends net.opengis.gml.impl.TargetDocumentImpl implements net.opengis.gml.SubjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "subject");
    
    
    /**
     * Gets the "subject" element
     */
    public net.opengis.gml.TargetPropertyType getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TargetPropertyType target = null;
            target = (net.opengis.gml.TargetPropertyType)get_store().find_element_user(SUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    @Inject(optional=true) public void setSubject(net.opengis.gml.TargetPropertyType subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public net.opengis.gml.TargetPropertyType addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TargetPropertyType target = null;
            target = (net.opengis.gml.TargetPropertyType)get_store().add_element_user(SUBJECT$0);
            return target;
        }
    }
}
