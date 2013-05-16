/*
 * An XML document type.
 * Localname: verticalDatumType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.VerticalDatumTypeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one verticalDatumType(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class VerticalDatumTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.VerticalDatumTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDatumTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALDATUMTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "verticalDatumType");
    
    
    /**
     * Gets the "verticalDatumType" element
     */
    public net.opengis.gml.VerticalDatumTypeType getVerticalDatumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumTypeType target = null;
            target = (net.opengis.gml.VerticalDatumTypeType)get_store().find_element_user(VERTICALDATUMTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalDatumType" element
     */
    @Inject(optional=true) public void setVerticalDatumType(net.opengis.gml.VerticalDatumTypeType verticalDatumType)
    {
        generatedSetterHelperImpl(verticalDatumType, VERTICALDATUMTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalDatumType" element
     */
    public net.opengis.gml.VerticalDatumTypeType addNewVerticalDatumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumTypeType target = null;
            target = (net.opengis.gml.VerticalDatumTypeType)get_store().add_element_user(VERTICALDATUMTYPE$0);
            return target;
        }
    }
}
