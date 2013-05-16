/*
 * XML Type:  KnotPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.KnotPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML KnotPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class KnotPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.KnotPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public KnotPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KNOT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Knot");
    
    
    /**
     * Gets the "Knot" element
     */
    public net.opengis.gml.KnotType getKnot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotType target = null;
            target = (net.opengis.gml.KnotType)get_store().find_element_user(KNOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Knot" element
     */
    @Inject(optional=true) public void setKnot(net.opengis.gml.KnotType knot)
    {
        generatedSetterHelperImpl(knot, KNOT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Knot" element
     */
    public net.opengis.gml.KnotType addNewKnot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotType target = null;
            target = (net.opengis.gml.KnotType)get_store().add_element_user(KNOT$0);
            return target;
        }
    }
}
