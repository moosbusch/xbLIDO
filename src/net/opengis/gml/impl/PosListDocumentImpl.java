/*
 * An XML document type.
 * Localname: posList
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PosListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one posList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PosListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PosListDocument
{
    private static final long serialVersionUID = 1L;
    
    public PosListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "posList");
    
    
    /**
     * Gets the "posList" element
     */
    public net.opengis.gml.DirectPositionListType getPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionListType target = null;
            target = (net.opengis.gml.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "posList" element
     */
    @Inject(optional=true) public void setPosList(net.opengis.gml.DirectPositionListType posList)
    {
        generatedSetterHelperImpl(posList, POSLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "posList" element
     */
    public net.opengis.gml.DirectPositionListType addNewPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionListType target = null;
            target = (net.opengis.gml.DirectPositionListType)get_store().add_element_user(POSLIST$0);
            return target;
        }
    }
}
