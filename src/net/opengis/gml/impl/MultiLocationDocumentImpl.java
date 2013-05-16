/*
 * An XML document type.
 * Localname: multiLocation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiLocationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiLocation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTILOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiLocation");
    
    
    /**
     * Gets the "multiLocation" element
     */
    public net.opengis.gml.MultiPointPropertyType getMultiLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointPropertyType target = null;
            target = (net.opengis.gml.MultiPointPropertyType)get_store().find_element_user(MULTILOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiLocation" element
     */
    @Inject(optional=true) public void setMultiLocation(net.opengis.gml.MultiPointPropertyType multiLocation)
    {
        generatedSetterHelperImpl(multiLocation, MULTILOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiLocation" element
     */
    public net.opengis.gml.MultiPointPropertyType addNewMultiLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointPropertyType target = null;
            target = (net.opengis.gml.MultiPointPropertyType)get_store().add_element_user(MULTILOCATION$0);
            return target;
        }
    }
}
