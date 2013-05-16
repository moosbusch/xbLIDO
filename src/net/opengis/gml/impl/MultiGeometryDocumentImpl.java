/*
 * An XML document type.
 * Localname: MultiGeometry
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiGeometryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MultiGeometry(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiGeometryDocumentImpl extends net.opengis.gml.impl.GeometricAggregateDocumentImpl implements net.opengis.gml.MultiGeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiGeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiGeometry");
    
    
    /**
     * Gets the "MultiGeometry" element
     */
    public net.opengis.gml.MultiGeometryType getMultiGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiGeometryType target = null;
            target = (net.opengis.gml.MultiGeometryType)get_store().find_element_user(MULTIGEOMETRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiGeometry" element
     */
    @Inject(optional=true) public void setMultiGeometry(net.opengis.gml.MultiGeometryType multiGeometry)
    {
        generatedSetterHelperImpl(multiGeometry, MULTIGEOMETRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiGeometry" element
     */
    public net.opengis.gml.MultiGeometryType addNewMultiGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiGeometryType target = null;
            target = (net.opengis.gml.MultiGeometryType)get_store().add_element_user(MULTIGEOMETRY$0);
            return target;
        }
    }
}
