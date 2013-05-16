/*
 * An XML document type.
 * Localname: pointMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PointMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one pointMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PointMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PointMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointMember");
    
    
    /**
     * Gets the "pointMember" element
     */
    public net.opengis.gml.PointPropertyType getPointMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointMember" element
     */
    @Inject(optional=true) public void setPointMember(net.opengis.gml.PointPropertyType pointMember)
    {
        generatedSetterHelperImpl(pointMember, POINTMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointMember" element
     */
    public net.opengis.gml.PointPropertyType addNewPointMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTMEMBER$0);
            return target;
        }
    }
}
