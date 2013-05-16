/*
 * An XML document type.
 * Localname: MultiSolid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MultiSolid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSolidDocumentImpl extends net.opengis.gml.impl.GeometricAggregateDocumentImpl implements net.opengis.gml.MultiSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolid");
    
    
    /**
     * Gets the "MultiSolid" element
     */
    public net.opengis.gml.MultiSolidType getMultiSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidType target = null;
            target = (net.opengis.gml.MultiSolidType)get_store().find_element_user(MULTISOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiSolid" element
     */
    @Inject(optional=true) public void setMultiSolid(net.opengis.gml.MultiSolidType multiSolid)
    {
        generatedSetterHelperImpl(multiSolid, MULTISOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiSolid" element
     */
    public net.opengis.gml.MultiSolidType addNewMultiSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidType target = null;
            target = (net.opengis.gml.MultiSolidType)get_store().add_element_user(MULTISOLID$0);
            return target;
        }
    }
}
