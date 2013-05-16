/*
 * An XML document type.
 * Localname: semiMajorAxis
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SemiMajorAxisDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one semiMajorAxis(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SemiMajorAxisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SemiMajorAxisDocument
{
    private static final long serialVersionUID = 1L;
    
    public SemiMajorAxisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEMIMAJORAXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "semiMajorAxis");
    
    
    /**
     * Gets the "semiMajorAxis" element
     */
    public net.opengis.gml.MeasureType getSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(SEMIMAJORAXIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "semiMajorAxis" element
     */
    @Inject(optional=true) public void setSemiMajorAxis(net.opengis.gml.MeasureType semiMajorAxis)
    {
        generatedSetterHelperImpl(semiMajorAxis, SEMIMAJORAXIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "semiMajorAxis" element
     */
    public net.opengis.gml.MeasureType addNewSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(SEMIMAJORAXIS$0);
            return target;
        }
    }
}
