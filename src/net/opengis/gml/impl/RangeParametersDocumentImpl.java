/*
 * An XML document type.
 * Localname: rangeParameters
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RangeParametersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one rangeParameters(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RangeParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.RangeParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public RangeParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rangeParameters");
    
    
    /**
     * Gets the "rangeParameters" element
     */
    public net.opengis.gml.RangeParametersType getRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeParametersType target = null;
            target = (net.opengis.gml.RangeParametersType)get_store().find_element_user(RANGEPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeParameters" element
     */
    @Inject(optional=true) public void setRangeParameters(net.opengis.gml.RangeParametersType rangeParameters)
    {
        generatedSetterHelperImpl(rangeParameters, RANGEPARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeParameters" element
     */
    public net.opengis.gml.RangeParametersType addNewRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeParametersType target = null;
            target = (net.opengis.gml.RangeParametersType)get_store().add_element_user(RANGEPARAMETERS$0);
            return target;
        }
    }
}
