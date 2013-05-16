/*
 * An XML document type.
 * Localname: value
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one value(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "value");
    
    
    /**
     * Gets the "value" element
     */
    public net.opengis.gml.MeasureType getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    @Inject(optional=true) public void setValue(net.opengis.gml.MeasureType value)
    {
        generatedSetterHelperImpl(value, VALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public net.opengis.gml.MeasureType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
}
