/*
 * An XML document type.
 * Localname: GeometryStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometryStyleDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one GeometryStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometryStyleDocument2Impl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.GeometryStyleDocument2
{
    private static final long serialVersionUID = 1L;
    
    public GeometryStyleDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometryStyle");
    
    
    /**
     * Gets the "GeometryStyle" element
     */
    public net.opengis.gml.GeometryStyleType getGeometryStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryStyleType target = null;
            target = (net.opengis.gml.GeometryStyleType)get_store().find_element_user(GEOMETRYSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeometryStyle" element
     */
    @Inject(optional=true) public void setGeometryStyle(net.opengis.gml.GeometryStyleType geometryStyle)
    {
        generatedSetterHelperImpl(geometryStyle, GEOMETRYSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeometryStyle" element
     */
    public net.opengis.gml.GeometryStyleType addNewGeometryStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryStyleType target = null;
            target = (net.opengis.gml.GeometryStyleType)get_store().add_element_user(GEOMETRYSTYLE$0);
            return target;
        }
    }
}
