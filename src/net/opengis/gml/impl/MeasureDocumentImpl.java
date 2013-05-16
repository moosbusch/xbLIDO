/*
 * An XML document type.
 * Localname: measure
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MeasureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one measure(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "measure");
    
    
    /**
     * Gets the "measure" element
     */
    public net.opengis.gml.MeasureType getMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(MEASURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "measure" element
     */
    @Inject(optional=true) public void setMeasure(net.opengis.gml.MeasureType measure)
    {
        generatedSetterHelperImpl(measure, MEASURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "measure" element
     */
    public net.opengis.gml.MeasureType addNewMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(MEASURE$0);
            return target;
        }
    }
}
