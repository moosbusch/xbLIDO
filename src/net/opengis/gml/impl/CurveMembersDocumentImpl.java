/*
 * An XML document type.
 * Localname: curveMembers
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one curveMembers(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CurveMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CurveMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveMembers");
    
    
    /**
     * Gets the "curveMembers" element
     */
    public net.opengis.gml.CurveArrayPropertyType getCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.CurveArrayPropertyType)get_store().find_element_user(CURVEMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curveMembers" element
     */
    @Inject(optional=true) public void setCurveMembers(net.opengis.gml.CurveArrayPropertyType curveMembers)
    {
        generatedSetterHelperImpl(curveMembers, CURVEMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveMembers" element
     */
    public net.opengis.gml.CurveArrayPropertyType addNewCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.CurveArrayPropertyType)get_store().add_element_user(CURVEMEMBERS$0);
            return target;
        }
    }
}
