/*
 * An XML document type.
 * Localname: valueList
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ValueListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one valueList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ValueListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValueListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueList");
    
    
    /**
     * Gets the "valueList" element
     */
    public net.opengis.gml.MeasureListType getValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureListType target = null;
            target = (net.opengis.gml.MeasureListType)get_store().find_element_user(VALUELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueList" element
     */
    @Inject(optional=true) public void setValueList(net.opengis.gml.MeasureListType valueList)
    {
        generatedSetterHelperImpl(valueList, VALUELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueList" element
     */
    public net.opengis.gml.MeasureListType addNewValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureListType target = null;
            target = (net.opengis.gml.MeasureListType)get_store().add_element_user(VALUELIST$0);
            return target;
        }
    }
}
