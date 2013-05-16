/*
 * An XML document type.
 * Localname: priorityLocation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PriorityLocationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one priorityLocation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PriorityLocationDocumentImpl extends net.opengis.gml.impl.LocationDocumentImpl implements net.opengis.gml.PriorityLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public PriorityLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIORITYLOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "priorityLocation");
    
    
    /**
     * Gets the "priorityLocation" element
     */
    public net.opengis.gml.PriorityLocationPropertyType getPriorityLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PriorityLocationPropertyType target = null;
            target = (net.opengis.gml.PriorityLocationPropertyType)get_store().find_element_user(PRIORITYLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "priorityLocation" element
     */
    @Inject(optional=true) public void setPriorityLocation(net.opengis.gml.PriorityLocationPropertyType priorityLocation)
    {
        generatedSetterHelperImpl(priorityLocation, PRIORITYLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "priorityLocation" element
     */
    public net.opengis.gml.PriorityLocationPropertyType addNewPriorityLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PriorityLocationPropertyType target = null;
            target = (net.opengis.gml.PriorityLocationPropertyType)get_store().add_element_user(PRIORITYLOCATION$0);
            return target;
        }
    }
}
