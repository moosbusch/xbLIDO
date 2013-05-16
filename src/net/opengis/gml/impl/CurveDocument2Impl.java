/*
 * An XML document type.
 * Localname: Curve
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Curve(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CurveDocument2Impl extends net.opengis.gml.impl.CurveDocumentImpl implements net.opengis.gml.CurveDocument2
{
    private static final long serialVersionUID = 1L;
    
    public CurveDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Curve");
    
    
    /**
     * Gets the "Curve" element
     */
    public net.opengis.gml.CurveType getCurve2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveType target = null;
            target = (net.opengis.gml.CurveType)get_store().find_element_user(CURVE2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Curve" element
     */
    @Inject(optional=true) public void setCurve2(net.opengis.gml.CurveType curve2)
    {
        generatedSetterHelperImpl(curve2, CURVE2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Curve" element
     */
    public net.opengis.gml.CurveType addNewCurve2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveType target = null;
            target = (net.opengis.gml.CurveType)get_store().add_element_user(CURVE2$0);
            return target;
        }
    }
}
