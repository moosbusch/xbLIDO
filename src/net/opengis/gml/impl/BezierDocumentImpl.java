/*
 * An XML document type.
 * Localname: Bezier
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BezierDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Bezier(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BezierDocumentImpl extends net.opengis.gml.impl.BSplineDocumentImpl implements net.opengis.gml.BezierDocument
{
    private static final long serialVersionUID = 1L;
    
    public BezierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEZIER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Bezier");
    
    
    /**
     * Gets the "Bezier" element
     */
    public net.opengis.gml.BezierType getBezier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BezierType target = null;
            target = (net.opengis.gml.BezierType)get_store().find_element_user(BEZIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bezier" element
     */
    @Inject(optional=true) public void setBezier(net.opengis.gml.BezierType bezier)
    {
        generatedSetterHelperImpl(bezier, BEZIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Bezier" element
     */
    public net.opengis.gml.BezierType addNewBezier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BezierType target = null;
            target = (net.opengis.gml.BezierType)get_store().add_element_user(BEZIER$0);
            return target;
        }
    }
}
