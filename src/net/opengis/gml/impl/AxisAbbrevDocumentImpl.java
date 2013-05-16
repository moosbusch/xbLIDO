/*
 * An XML document type.
 * Localname: axisAbbrev
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AxisAbbrevDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one axisAbbrev(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class AxisAbbrevDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AxisAbbrevDocument
{
    private static final long serialVersionUID = 1L;
    
    public AxisAbbrevDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXISABBREV$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "axisAbbrev");
    
    
    /**
     * Gets the "axisAbbrev" element
     */
    public net.opengis.gml.CodeType getAxisAbbrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(AXISABBREV$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axisAbbrev" element
     */
    @Inject(optional=true) public void setAxisAbbrev(net.opengis.gml.CodeType axisAbbrev)
    {
        generatedSetterHelperImpl(axisAbbrev, AXISABBREV$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "axisAbbrev" element
     */
    public net.opengis.gml.CodeType addNewAxisAbbrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(AXISABBREV$0);
            return target;
        }
    }
}
