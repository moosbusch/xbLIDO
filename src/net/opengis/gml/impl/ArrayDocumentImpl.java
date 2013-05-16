/*
 * An XML document type.
 * Localname: Array
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ArrayDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Array(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArrayDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.ArrayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Array");
    
    
    /**
     * Gets the "Array" element
     */
    public net.opengis.gml.ArrayType getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArrayType target = null;
            target = (net.opengis.gml.ArrayType)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Array" element
     */
    @Inject(optional=true) public void setArray(net.opengis.gml.ArrayType array)
    {
        generatedSetterHelperImpl(array, ARRAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Array" element
     */
    public net.opengis.gml.ArrayType addNewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArrayType target = null;
            target = (net.opengis.gml.ArrayType)get_store().add_element_user(ARRAY$0);
            return target;
        }
    }
}
