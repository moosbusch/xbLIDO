/*
 * An XML document type.
 * Localname: boundedBy
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BoundedByDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one boundedBy(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BoundedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BoundedByDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDEDBY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "boundedBy");
    
    
    /**
     * Gets the "boundedBy" element
     */
    public net.opengis.gml.BoundingShapeType getBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BoundingShapeType target = null;
            target = (net.opengis.gml.BoundingShapeType)get_store().find_element_user(BOUNDEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "boundedBy" element
     */
    @Inject(optional=true) public void setBoundedBy(net.opengis.gml.BoundingShapeType boundedBy)
    {
        generatedSetterHelperImpl(boundedBy, BOUNDEDBY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "boundedBy" element
     */
    public net.opengis.gml.BoundingShapeType addNewBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BoundingShapeType target = null;
            target = (net.opengis.gml.BoundingShapeType)get_store().add_element_user(BOUNDEDBY$0);
            return target;
        }
    }
}
