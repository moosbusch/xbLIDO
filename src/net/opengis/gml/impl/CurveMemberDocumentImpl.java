/*
 * An XML document type.
 * Localname: curveMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one curveMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CurveMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CurveMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveMember");
    
    
    /**
     * Gets the "curveMember" element
     */
    public net.opengis.gml.CurvePropertyType getCurveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(CURVEMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curveMember" element
     */
    @Inject(optional=true) public void setCurveMember(net.opengis.gml.CurvePropertyType curveMember)
    {
        generatedSetterHelperImpl(curveMember, CURVEMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveMember" element
     */
    public net.opengis.gml.CurvePropertyType addNewCurveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(CURVEMEMBER$0);
            return target;
        }
    }
}