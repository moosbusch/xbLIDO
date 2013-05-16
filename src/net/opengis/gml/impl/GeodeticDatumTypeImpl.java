/*
 * XML Type:  GeodeticDatumType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeodeticDatumType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML GeodeticDatumType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeodeticDatumTypeImpl extends net.opengis.gml.impl.AbstractDatumTypeImpl implements net.opengis.gml.GeodeticDatumType
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESPRIMEMERIDIAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesPrimeMeridian");
    private static final javax.xml.namespace.QName USESELLIPSOID$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesEllipsoid");
    
    
    /**
     * Gets the "usesPrimeMeridian" element
     */
    public net.opengis.gml.PrimeMeridianRefType getUsesPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PrimeMeridianRefType target = null;
            target = (net.opengis.gml.PrimeMeridianRefType)get_store().find_element_user(USESPRIMEMERIDIAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesPrimeMeridian" element
     */
    @Inject(optional=true) public void setUsesPrimeMeridian(net.opengis.gml.PrimeMeridianRefType usesPrimeMeridian)
    {
        generatedSetterHelperImpl(usesPrimeMeridian, USESPRIMEMERIDIAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesPrimeMeridian" element
     */
    public net.opengis.gml.PrimeMeridianRefType addNewUsesPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PrimeMeridianRefType target = null;
            target = (net.opengis.gml.PrimeMeridianRefType)get_store().add_element_user(USESPRIMEMERIDIAN$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesEllipsoid" element
     */
    public net.opengis.gml.EllipsoidRefType getUsesEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidRefType target = null;
            target = (net.opengis.gml.EllipsoidRefType)get_store().find_element_user(USESELLIPSOID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEllipsoid" element
     */
    @Inject(optional=true) public void setUsesEllipsoid(net.opengis.gml.EllipsoidRefType usesEllipsoid)
    {
        generatedSetterHelperImpl(usesEllipsoid, USESELLIPSOID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEllipsoid" element
     */
    public net.opengis.gml.EllipsoidRefType addNewUsesEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidRefType target = null;
            target = (net.opengis.gml.EllipsoidRefType)get_store().add_element_user(USESELLIPSOID$2);
            return target;
        }
    }
}
