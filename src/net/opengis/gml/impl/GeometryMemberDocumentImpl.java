/*
 * An XML document type.
 * Localname: geometryMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometryMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one geometryMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometryMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeometryMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometryMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geometryMember");
    
    
    /**
     * Gets the "geometryMember" element
     */
    public net.opengis.gml.GeometryPropertyType getGeometryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryPropertyType target = null;
            target = (net.opengis.gml.GeometryPropertyType)get_store().find_element_user(GEOMETRYMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geometryMember" element
     */
    @Inject(optional=true) public void setGeometryMember(net.opengis.gml.GeometryPropertyType geometryMember)
    {
        generatedSetterHelperImpl(geometryMember, GEOMETRYMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometryMember" element
     */
    public net.opengis.gml.GeometryPropertyType addNewGeometryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryPropertyType target = null;
            target = (net.opengis.gml.GeometryPropertyType)get_store().add_element_user(GEOMETRYMEMBER$0);
            return target;
        }
    }
}
