/*
 * An XML document type.
 * Localname: pointRep
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PointRepDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one pointRep(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PointRepDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PointRepDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointRepDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTREP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointRep");
    
    
    /**
     * Gets the "pointRep" element
     */
    public net.opengis.gml.PointPropertyType getPointRep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTREP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointRep" element
     */
    @Inject(optional=true) public void setPointRep(net.opengis.gml.PointPropertyType pointRep)
    {
        generatedSetterHelperImpl(pointRep, POINTREP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointRep" element
     */
    public net.opengis.gml.PointPropertyType addNewPointRep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTREP$0);
            return target;
        }
    }
}
