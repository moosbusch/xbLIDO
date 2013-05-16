/*
 * An XML document type.
 * Localname: geometryMembers
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometryMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one geometryMembers(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometryMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeometryMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometryMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geometryMembers");
    
    
    /**
     * Gets the "geometryMembers" element
     */
    public net.opengis.gml.GeometryArrayPropertyType getGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryArrayPropertyType target = null;
            target = (net.opengis.gml.GeometryArrayPropertyType)get_store().find_element_user(GEOMETRYMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geometryMembers" element
     */
    @Inject(optional=true) public void setGeometryMembers(net.opengis.gml.GeometryArrayPropertyType geometryMembers)
    {
        generatedSetterHelperImpl(geometryMembers, GEOMETRYMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometryMembers" element
     */
    public net.opengis.gml.GeometryArrayPropertyType addNewGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryArrayPropertyType target = null;
            target = (net.opengis.gml.GeometryArrayPropertyType)get_store().add_element_user(GEOMETRYMEMBERS$0);
            return target;
        }
    }
}
