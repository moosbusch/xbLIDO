/*
 * An XML document type.
 * Localname: lineStringProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LineStringPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one lineStringProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LineStringPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LineStringPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public LineStringPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRINGPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "lineStringProperty");
    
    
    /**
     * Gets the "lineStringProperty" element
     */
    public net.opengis.gml.LineStringPropertyType getLineStringProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringPropertyType target = null;
            target = (net.opengis.gml.LineStringPropertyType)get_store().find_element_user(LINESTRINGPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lineStringProperty" element
     */
    @Inject(optional=true) public void setLineStringProperty(net.opengis.gml.LineStringPropertyType lineStringProperty)
    {
        generatedSetterHelperImpl(lineStringProperty, LINESTRINGPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lineStringProperty" element
     */
    public net.opengis.gml.LineStringPropertyType addNewLineStringProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringPropertyType target = null;
            target = (net.opengis.gml.LineStringPropertyType)get_store().add_element_user(LINESTRINGPROPERTY$0);
            return target;
        }
    }
}
