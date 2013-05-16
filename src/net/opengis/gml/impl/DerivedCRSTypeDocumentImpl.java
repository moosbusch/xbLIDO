/*
 * An XML document type.
 * Localname: derivedCRSType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DerivedCRSTypeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one derivedCRSType(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DerivedCRSTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DerivedCRSTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivedCRSType");
    
    
    /**
     * Gets the "derivedCRSType" element
     */
    public net.opengis.gml.DerivedCRSTypeType getDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSTypeType target = null;
            target = (net.opengis.gml.DerivedCRSTypeType)get_store().find_element_user(DERIVEDCRSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedCRSType" element
     */
    @Inject(optional=true) public void setDerivedCRSType(net.opengis.gml.DerivedCRSTypeType derivedCRSType)
    {
        generatedSetterHelperImpl(derivedCRSType, DERIVEDCRSTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivedCRSType" element
     */
    public net.opengis.gml.DerivedCRSTypeType addNewDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSTypeType target = null;
            target = (net.opengis.gml.DerivedCRSTypeType)get_store().add_element_user(DERIVEDCRSTYPE$0);
            return target;
        }
    }
}
