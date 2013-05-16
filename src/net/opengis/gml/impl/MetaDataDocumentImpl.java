/*
 * An XML document type.
 * Localname: _MetaData
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MetaDataDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _MetaData(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MetaDataDocumentImpl extends net.opengis.gml.impl.ObjectDocumentImpl implements net.opengis.gml.MetaDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetaDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_MetaData");
    private static final org.apache.xmlbeans.QNameSet METADATA$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GenericMetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_MetaData"),
    });
    
    
    /**
     * Gets the "_MetaData" element
     */
    public net.opengis.gml.AbstractMetaDataType getMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractMetaDataType target = null;
            target = (net.opengis.gml.AbstractMetaDataType)get_store().find_element_user(METADATA$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_MetaData" element
     */
    @Inject(optional=true) public void setMetaData(net.opengis.gml.AbstractMetaDataType metaData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractMetaDataType target = null;
            target = (net.opengis.gml.AbstractMetaDataType)get_store().find_element_user(METADATA$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractMetaDataType)get_store().add_element_user(METADATA$0);
            }
            target.set(metaData);
        }
    }
    
    /**
     * Appends and returns a new empty "_MetaData" element
     */
    public net.opengis.gml.AbstractMetaDataType addNewMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractMetaDataType target = null;
            target = (net.opengis.gml.AbstractMetaDataType)get_store().add_element_user(METADATA$0);
            return target;
        }
    }
}
