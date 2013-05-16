/*
 * An XML document type.
 * Localname: Grid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GridDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Grid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GridDocumentImpl extends net.opengis.gml.impl.ImplicitGeometryDocumentImpl implements net.opengis.gml.GridDocument
{
    private static final long serialVersionUID = 1L;
    
    public GridDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Grid");
    
    
    /**
     * Gets the "Grid" element
     */
    public net.opengis.gml.GridType getGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridType target = null;
            target = (net.opengis.gml.GridType)get_store().find_element_user(GRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Grid" element
     */
    @Inject(optional=true) public void setGrid(net.opengis.gml.GridType grid)
    {
        generatedSetterHelperImpl(grid, GRID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Grid" element
     */
    public net.opengis.gml.GridType addNewGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridType target = null;
            target = (net.opengis.gml.GridType)get_store().add_element_user(GRID$0);
            return target;
        }
    }
}
