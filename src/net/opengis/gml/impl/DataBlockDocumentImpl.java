/*
 * An XML document type.
 * Localname: DataBlock
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DataBlockDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one DataBlock(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DataBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DataBlockDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATABLOCK$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DataBlock");
    
    
    /**
     * Gets the "DataBlock" element
     */
    public net.opengis.gml.DataBlockType getDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DataBlockType target = null;
            target = (net.opengis.gml.DataBlockType)get_store().find_element_user(DATABLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataBlock" element
     */
    @Inject(optional=true) public void setDataBlock(net.opengis.gml.DataBlockType dataBlock)
    {
        generatedSetterHelperImpl(dataBlock, DATABLOCK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DataBlock" element
     */
    public net.opengis.gml.DataBlockType addNewDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DataBlockType target = null;
            target = (net.opengis.gml.DataBlockType)get_store().add_element_user(DATABLOCK$0);
            return target;
        }
    }
}
