/*
 * An XML document type.
 * Localname: tupleList
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TupleListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one tupleList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TupleListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TupleListDocument
{
    private static final long serialVersionUID = 1L;
    
    public TupleListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TUPLELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "tupleList");
    
    
    /**
     * Gets the "tupleList" element
     */
    public net.opengis.gml.CoordinatesType getTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinatesType target = null;
            target = (net.opengis.gml.CoordinatesType)get_store().find_element_user(TUPLELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tupleList" element
     */
    @Inject(optional=true) public void setTupleList(net.opengis.gml.CoordinatesType tupleList)
    {
        generatedSetterHelperImpl(tupleList, TUPLELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "tupleList" element
     */
    public net.opengis.gml.CoordinatesType addNewTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinatesType target = null;
            target = (net.opengis.gml.CoordinatesType)get_store().add_element_user(TUPLELIST$0);
            return target;
        }
    }
}
