/*
 * XML Type:  CylinderType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CylinderType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CylinderType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CylinderTypeImpl extends net.opengis.gml.impl.AbstractGriddedSurfaceTypeImpl implements net.opengis.gml.CylinderType
{
    private static final long serialVersionUID = 1L;
    
    public CylinderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HORIZONTALCURVETYPE$0 = 
        new javax.xml.namespace.QName("", "horizontalCurveType");
    private static final javax.xml.namespace.QName VERTICALCURVETYPE$2 = 
        new javax.xml.namespace.QName("", "verticalCurveType");
    
    
    /**
     * Gets the "horizontalCurveType" attribute
     */
    public net.opengis.gml.CurveInterpolationType.Enum getHorizontalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALCURVETYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HORIZONTALCURVETYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "horizontalCurveType" attribute
     */
    public net.opengis.gml.CurveInterpolationType xgetHorizontalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveInterpolationType target = null;
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(HORIZONTALCURVETYPE$0);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_default_attribute_value(HORIZONTALCURVETYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "horizontalCurveType" attribute
     */
    public boolean isSetHorizontalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORIZONTALCURVETYPE$0) != null;
        }
    }
    
    /**
     * Sets the "horizontalCurveType" attribute
     */
    @Inject(optional=true) public void setHorizontalCurveType(net.opengis.gml.CurveInterpolationType.Enum horizontalCurveType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALCURVETYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALCURVETYPE$0);
            }
            target.setEnumValue(horizontalCurveType);
        }
    }
    
    /**
     * Sets (as xml) the "horizontalCurveType" attribute
     */
    public void xsetHorizontalCurveType(net.opengis.gml.CurveInterpolationType horizontalCurveType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveInterpolationType target = null;
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(HORIZONTALCURVETYPE$0);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_store().add_attribute_user(HORIZONTALCURVETYPE$0);
            }
            target.set(horizontalCurveType);
        }
    }
    
    /**
     * Unsets the "horizontalCurveType" attribute
     */
    public void unsetHorizontalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORIZONTALCURVETYPE$0);
        }
    }
    
    /**
     * Gets the "verticalCurveType" attribute
     */
    public net.opengis.gml.CurveInterpolationType.Enum getVerticalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALCURVETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERTICALCURVETYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "verticalCurveType" attribute
     */
    public net.opengis.gml.CurveInterpolationType xgetVerticalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveInterpolationType target = null;
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(VERTICALCURVETYPE$2);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_default_attribute_value(VERTICALCURVETYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "verticalCurveType" attribute
     */
    public boolean isSetVerticalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTICALCURVETYPE$2) != null;
        }
    }
    
    /**
     * Sets the "verticalCurveType" attribute
     */
    @Inject(optional=true) public void setVerticalCurveType(net.opengis.gml.CurveInterpolationType.Enum verticalCurveType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALCURVETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALCURVETYPE$2);
            }
            target.setEnumValue(verticalCurveType);
        }
    }
    
    /**
     * Sets (as xml) the "verticalCurveType" attribute
     */
    public void xsetVerticalCurveType(net.opengis.gml.CurveInterpolationType verticalCurveType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveInterpolationType target = null;
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(VERTICALCURVETYPE$2);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_store().add_attribute_user(VERTICALCURVETYPE$2);
            }
            target.set(verticalCurveType);
        }
    }
    
    /**
     * Unsets the "verticalCurveType" attribute
     */
    public void unsetVerticalCurveType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTICALCURVETYPE$2);
        }
    }
}
