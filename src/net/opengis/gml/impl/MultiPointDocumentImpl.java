/*
 * An XML document type.
 * Localname: MultiPoint
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MultiPoint(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiPointDocumentImpl extends net.opengis.gml.impl.GeometricAggregateDocumentImpl implements net.opengis.gml.MultiPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPoint");
    
    
    /**
     * Gets the "MultiPoint" element
     */
    public net.opengis.gml.MultiPointType getMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointType target = null;
            target = (net.opengis.gml.MultiPointType)get_store().find_element_user(MULTIPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiPoint" element
     */
    @Inject(optional=true) public void setMultiPoint(net.opengis.gml.MultiPointType multiPoint)
    {
        generatedSetterHelperImpl(multiPoint, MULTIPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiPoint" element
     */
    public net.opengis.gml.MultiPointType addNewMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointType target = null;
            target = (net.opengis.gml.MultiPointType)get_store().add_element_user(MULTIPOINT$0);
            return target;
        }
    }
}
