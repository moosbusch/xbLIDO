/*
 * An XML document type.
 * Localname: MultiPolygon
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPolygonDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MultiPolygon(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiPolygonDocumentImpl extends net.opengis.gml.impl.GeometricAggregateDocumentImpl implements net.opengis.gml.MultiPolygonDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPolygonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOLYGON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon");
    
    
    /**
     * Gets the "MultiPolygon" element
     */
    public net.opengis.gml.MultiPolygonType getMultiPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPolygonType target = null;
            target = (net.opengis.gml.MultiPolygonType)get_store().find_element_user(MULTIPOLYGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiPolygon" element
     */
    @Inject(optional=true) public void setMultiPolygon(net.opengis.gml.MultiPolygonType multiPolygon)
    {
        generatedSetterHelperImpl(multiPolygon, MULTIPOLYGON$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiPolygon" element
     */
    public net.opengis.gml.MultiPolygonType addNewMultiPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPolygonType target = null;
            target = (net.opengis.gml.MultiPolygonType)get_store().add_element_user(MULTIPOLYGON$0);
            return target;
        }
    }
}
