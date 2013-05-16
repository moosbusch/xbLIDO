/*
 * An XML document type.
 * Localname: result
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ResultDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one result(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "result");
    
    
    /**
     * Gets the "result" element
     */
    public net.opengis.gml.MeasureType getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(RESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "result" element
     */
    @Inject(optional=true) public void setResult(net.opengis.gml.MeasureType result)
    {
        generatedSetterHelperImpl(result, RESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "result" element
     */
    public net.opengis.gml.MeasureType addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(RESULT$0);
            return target;
        }
    }
}
