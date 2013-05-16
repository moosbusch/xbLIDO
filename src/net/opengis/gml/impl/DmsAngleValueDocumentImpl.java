/*
 * An XML document type.
 * Localname: dmsAngleValue
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DmsAngleValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one dmsAngleValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DmsAngleValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DmsAngleValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public DmsAngleValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DMSANGLEVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dmsAngleValue");
    
    
    /**
     * Gets the "dmsAngleValue" element
     */
    public net.opengis.gml.DMSAngleType getDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DMSAngleType target = null;
            target = (net.opengis.gml.DMSAngleType)get_store().find_element_user(DMSANGLEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dmsAngleValue" element
     */
    @Inject(optional=true) public void setDmsAngleValue(net.opengis.gml.DMSAngleType dmsAngleValue)
    {
        generatedSetterHelperImpl(dmsAngleValue, DMSANGLEVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dmsAngleValue" element
     */
    public net.opengis.gml.DMSAngleType addNewDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DMSAngleType target = null;
            target = (net.opengis.gml.DMSAngleType)get_store().add_element_user(DMSANGLEVALUE$0);
            return target;
        }
    }
}
