/*
 * An XML document type.
 * Localname: degrees
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DegreesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one degrees(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DegreesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DegreesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DegreesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEGREES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "degrees");
    
    
    /**
     * Gets the "degrees" element
     */
    public net.opengis.gml.DegreesType getDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DegreesType target = null;
            target = (net.opengis.gml.DegreesType)get_store().find_element_user(DEGREES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "degrees" element
     */
    @Inject(optional=true) public void setDegrees(net.opengis.gml.DegreesType degrees)
    {
        generatedSetterHelperImpl(degrees, DEGREES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "degrees" element
     */
    public net.opengis.gml.DegreesType addNewDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DegreesType target = null;
            target = (net.opengis.gml.DegreesType)get_store().add_element_user(DEGREES$0);
            return target;
        }
    }
}
