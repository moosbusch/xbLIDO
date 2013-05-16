/*
 * An XML document type.
 * Localname: TopoPoint
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TopoPoint(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoPoint");
    
    
    /**
     * Gets the "TopoPoint" element
     */
    public net.opengis.gml.TopoPointType getTopoPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPointType target = null;
            target = (net.opengis.gml.TopoPointType)get_store().find_element_user(TOPOPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoPoint" element
     */
    @Inject(optional=true) public void setTopoPoint(net.opengis.gml.TopoPointType topoPoint)
    {
        generatedSetterHelperImpl(topoPoint, TOPOPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoPoint" element
     */
    public net.opengis.gml.TopoPointType addNewTopoPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPointType target = null;
            target = (net.opengis.gml.TopoPointType)get_store().add_element_user(TOPOPOINT$0);
            return target;
        }
    }
}
