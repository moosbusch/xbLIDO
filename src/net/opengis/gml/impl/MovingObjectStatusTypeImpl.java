/*
 * XML Type:  MovingObjectStatusType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MovingObjectStatusType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML MovingObjectStatusType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MovingObjectStatusTypeImpl extends net.opengis.gml.impl.AbstractTimeSliceTypeImpl implements net.opengis.gml.MovingObjectStatusType
{
    private static final long serialVersionUID = 1L;
    
    public MovingObjectStatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "priorityLocation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "location"),
    });
    private static final javax.xml.namespace.QName SPEED$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "speed");
    private static final javax.xml.namespace.QName BEARING$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "bearing");
    private static final javax.xml.namespace.QName ACCELERATION$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "acceleration");
    private static final javax.xml.namespace.QName ELEVATION$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "elevation");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "status");
    
    
    /**
     * Gets the "location" element
     */
    public net.opengis.gml.LocationPropertyType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    @Inject(optional=true) public void setLocation(net.opengis.gml.LocationPropertyType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LocationPropertyType)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public net.opengis.gml.LocationPropertyType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "speed" element
     */
    public net.opengis.gml.MeasureType getSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(SPEED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "speed" element
     */
    public boolean isSetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPEED$2) != 0;
        }
    }
    
    /**
     * Sets the "speed" element
     */
    @Inject(optional=true) public void setSpeed(net.opengis.gml.MeasureType speed)
    {
        generatedSetterHelperImpl(speed, SPEED$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "speed" element
     */
    public net.opengis.gml.MeasureType addNewSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(SPEED$2);
            return target;
        }
    }
    
    /**
     * Unsets the "speed" element
     */
    public void unsetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPEED$2, 0);
        }
    }
    
    /**
     * Gets the "bearing" element
     */
    public net.opengis.gml.DirectionPropertyType getBearing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionPropertyType target = null;
            target = (net.opengis.gml.DirectionPropertyType)get_store().find_element_user(BEARING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bearing" element
     */
    public boolean isSetBearing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEARING$4) != 0;
        }
    }
    
    /**
     * Sets the "bearing" element
     */
    @Inject(optional=true) public void setBearing(net.opengis.gml.DirectionPropertyType bearing)
    {
        generatedSetterHelperImpl(bearing, BEARING$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bearing" element
     */
    public net.opengis.gml.DirectionPropertyType addNewBearing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionPropertyType target = null;
            target = (net.opengis.gml.DirectionPropertyType)get_store().add_element_user(BEARING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bearing" element
     */
    public void unsetBearing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEARING$4, 0);
        }
    }
    
    /**
     * Gets the "acceleration" element
     */
    public net.opengis.gml.MeasureType getAcceleration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(ACCELERATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "acceleration" element
     */
    public boolean isSetAcceleration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCELERATION$6) != 0;
        }
    }
    
    /**
     * Sets the "acceleration" element
     */
    @Inject(optional=true) public void setAcceleration(net.opengis.gml.MeasureType acceleration)
    {
        generatedSetterHelperImpl(acceleration, ACCELERATION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "acceleration" element
     */
    public net.opengis.gml.MeasureType addNewAcceleration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(ACCELERATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "acceleration" element
     */
    public void unsetAcceleration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCELERATION$6, 0);
        }
    }
    
    /**
     * Gets the "elevation" element
     */
    public net.opengis.gml.MeasureType getElevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(ELEVATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "elevation" element
     */
    public boolean isSetElevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEVATION$8) != 0;
        }
    }
    
    /**
     * Sets the "elevation" element
     */
    @Inject(optional=true) public void setElevation(net.opengis.gml.MeasureType elevation)
    {
        generatedSetterHelperImpl(elevation, ELEVATION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "elevation" element
     */
    public net.opengis.gml.MeasureType addNewElevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(ELEVATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "elevation" element
     */
    public void unsetElevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEVATION$8, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public net.opengis.gml.StringOrRefType getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$10) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    @Inject(optional=true) public void setStatus(net.opengis.gml.StringOrRefType status)
    {
        generatedSetterHelperImpl(status, STATUS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public net.opengis.gml.StringOrRefType addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(STATUS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$10, 0);
        }
    }
}
