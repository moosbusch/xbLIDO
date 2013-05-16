/*
 * An XML document type.
 * Localname: geometryStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometryStyleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one geometryStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometryStyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeometryStyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometryStyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geometryStyle");
    
    
    /**
     * Gets the "geometryStyle" element
     */
    public net.opengis.gml.GeometryStylePropertyType getGeometryStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryStylePropertyType target = null;
            target = (net.opengis.gml.GeometryStylePropertyType)get_store().find_element_user(GEOMETRYSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geometryStyle" element
     */
    @Inject(optional=true) public void setGeometryStyle(net.opengis.gml.GeometryStylePropertyType geometryStyle)
    {
        generatedSetterHelperImpl(geometryStyle, GEOMETRYSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometryStyle" element
     */
    public net.opengis.gml.GeometryStylePropertyType addNewGeometryStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryStylePropertyType target = null;
            target = (net.opengis.gml.GeometryStylePropertyType)get_store().add_element_user(GEOMETRYSTYLE$0);
            return target;
        }
    }
}
