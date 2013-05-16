/*
 * An XML document type.
 * Localname: dmsAngle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DmsAngleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one dmsAngle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DmsAngleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DmsAngleDocument
{
    private static final long serialVersionUID = 1L;
    
    public DmsAngleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DMSANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dmsAngle");
    
    
    /**
     * Gets the "dmsAngle" element
     */
    public net.opengis.gml.DMSAngleType getDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DMSAngleType target = null;
            target = (net.opengis.gml.DMSAngleType)get_store().find_element_user(DMSANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dmsAngle" element
     */
    @Inject(optional=true) public void setDmsAngle(net.opengis.gml.DMSAngleType dmsAngle)
    {
        generatedSetterHelperImpl(dmsAngle, DMSANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dmsAngle" element
     */
    public net.opengis.gml.DMSAngleType addNewDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DMSAngleType target = null;
            target = (net.opengis.gml.DMSAngleType)get_store().add_element_user(DMSANGLE$0);
            return target;
        }
    }
}
