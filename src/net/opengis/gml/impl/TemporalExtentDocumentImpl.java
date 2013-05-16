/*
 * An XML document type.
 * Localname: temporalExtent
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TemporalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one temporalExtent(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TemporalExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TemporalExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "temporalExtent");
    
    
    /**
     * Gets the "temporalExtent" element
     */
    public net.opengis.gml.TimePeriodType getTemporalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodType target = null;
            target = (net.opengis.gml.TimePeriodType)get_store().find_element_user(TEMPORALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temporalExtent" element
     */
    @Inject(optional=true) public void setTemporalExtent(net.opengis.gml.TimePeriodType temporalExtent)
    {
        generatedSetterHelperImpl(temporalExtent, TEMPORALEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "temporalExtent" element
     */
    public net.opengis.gml.TimePeriodType addNewTemporalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodType target = null;
            target = (net.opengis.gml.TimePeriodType)get_store().add_element_user(TEMPORALEXTENT$0);
            return target;
        }
    }
}
