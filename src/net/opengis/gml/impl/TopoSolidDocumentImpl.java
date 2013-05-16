/*
 * An XML document type.
 * Localname: TopoSolid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TopoSolid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoSolidDocumentImpl extends net.opengis.gml.impl.TopoPrimitiveDocumentImpl implements net.opengis.gml.TopoSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOSOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSolid");
    
    
    /**
     * Gets the "TopoSolid" element
     */
    public net.opengis.gml.TopoSolidType getTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoSolidType target = null;
            target = (net.opengis.gml.TopoSolidType)get_store().find_element_user(TOPOSOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoSolid" element
     */
    @Inject(optional=true) public void setTopoSolid(net.opengis.gml.TopoSolidType topoSolid)
    {
        generatedSetterHelperImpl(topoSolid, TOPOSOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoSolid" element
     */
    public net.opengis.gml.TopoSolidType addNewTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoSolidType target = null;
            target = (net.opengis.gml.TopoSolidType)get_store().add_element_user(TOPOSOLID$0);
            return target;
        }
    }
}
