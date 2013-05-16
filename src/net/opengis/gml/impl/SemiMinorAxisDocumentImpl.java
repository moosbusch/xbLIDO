/*
 * An XML document type.
 * Localname: semiMinorAxis
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SemiMinorAxisDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one semiMinorAxis(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SemiMinorAxisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SemiMinorAxisDocument
{
    private static final long serialVersionUID = 1L;
    
    public SemiMinorAxisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEMIMINORAXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "semiMinorAxis");
    
    
    /**
     * Gets the "semiMinorAxis" element
     */
    public net.opengis.gml.MeasureType getSemiMinorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(SEMIMINORAXIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "semiMinorAxis" element
     */
    @Inject(optional=true) public void setSemiMinorAxis(net.opengis.gml.MeasureType semiMinorAxis)
    {
        generatedSetterHelperImpl(semiMinorAxis, SEMIMINORAXIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "semiMinorAxis" element
     */
    public net.opengis.gml.MeasureType addNewSemiMinorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(SEMIMINORAXIS$0);
            return target;
        }
    }
}
