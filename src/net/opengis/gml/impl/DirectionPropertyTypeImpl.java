/*
 * XML Type:  DirectionPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DirectionPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML DirectionPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DirectionPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DirectionPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public DirectionPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTIONVECTOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectionVector");
    private static final javax.xml.namespace.QName COMPASSPOINT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompassPoint");
    private static final javax.xml.namespace.QName DIRECTIONKEYWORD$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectionKeyword");
    private static final javax.xml.namespace.QName DIRECTIONSTRING$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectionString");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type");
    private static final javax.xml.namespace.QName HREF$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href");
    private static final javax.xml.namespace.QName ROLE$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role");
    private static final javax.xml.namespace.QName ARCROLE$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "arcrole");
    private static final javax.xml.namespace.QName TITLE$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName SHOW$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "show");
    private static final javax.xml.namespace.QName ACTUATE$20 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "actuate");
    private static final javax.xml.namespace.QName REMOTESCHEMA$22 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remoteSchema");
    
    
    /**
     * Gets the "DirectionVector" element
     */
    public net.opengis.gml.DirectionVectorType getDirectionVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionVectorType target = null;
            target = (net.opengis.gml.DirectionVectorType)get_store().find_element_user(DIRECTIONVECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DirectionVector" element
     */
    public boolean isSetDirectionVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTIONVECTOR$0) != 0;
        }
    }
    
    /**
     * Sets the "DirectionVector" element
     */
    @Inject(optional=true) public void setDirectionVector(net.opengis.gml.DirectionVectorType directionVector)
    {
        generatedSetterHelperImpl(directionVector, DIRECTIONVECTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DirectionVector" element
     */
    public net.opengis.gml.DirectionVectorType addNewDirectionVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionVectorType target = null;
            target = (net.opengis.gml.DirectionVectorType)get_store().add_element_user(DIRECTIONVECTOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DirectionVector" element
     */
    public void unsetDirectionVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTIONVECTOR$0, 0);
        }
    }
    
    /**
     * Gets the "CompassPoint" element
     */
    public net.opengis.gml.CompassPointEnumeration.Enum getCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPASSPOINT$2, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.CompassPointEnumeration.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompassPoint" element
     */
    public net.opengis.gml.CompassPointEnumeration xgetCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompassPointEnumeration target = null;
            target = (net.opengis.gml.CompassPointEnumeration)get_store().find_element_user(COMPASSPOINT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CompassPoint" element
     */
    public boolean isSetCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPASSPOINT$2) != 0;
        }
    }
    
    /**
     * Sets the "CompassPoint" element
     */
    @Inject(optional=true) public void setCompassPoint(net.opengis.gml.CompassPointEnumeration.Enum compassPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPASSPOINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPASSPOINT$2);
            }
            target.setEnumValue(compassPoint);
        }
    }
    
    /**
     * Sets (as xml) the "CompassPoint" element
     */
    public void xsetCompassPoint(net.opengis.gml.CompassPointEnumeration compassPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompassPointEnumeration target = null;
            target = (net.opengis.gml.CompassPointEnumeration)get_store().find_element_user(COMPASSPOINT$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CompassPointEnumeration)get_store().add_element_user(COMPASSPOINT$2);
            }
            target.set(compassPoint);
        }
    }
    
    /**
     * Unsets the "CompassPoint" element
     */
    public void unsetCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPASSPOINT$2, 0);
        }
    }
    
    /**
     * Gets the "DirectionKeyword" element
     */
    public net.opengis.gml.CodeType getDirectionKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(DIRECTIONKEYWORD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DirectionKeyword" element
     */
    public boolean isSetDirectionKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTIONKEYWORD$4) != 0;
        }
    }
    
    /**
     * Sets the "DirectionKeyword" element
     */
    @Inject(optional=true) public void setDirectionKeyword(net.opengis.gml.CodeType directionKeyword)
    {
        generatedSetterHelperImpl(directionKeyword, DIRECTIONKEYWORD$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DirectionKeyword" element
     */
    public net.opengis.gml.CodeType addNewDirectionKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(DIRECTIONKEYWORD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DirectionKeyword" element
     */
    public void unsetDirectionKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTIONKEYWORD$4, 0);
        }
    }
    
    /**
     * Gets the "DirectionString" element
     */
    public net.opengis.gml.StringOrRefType getDirectionString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(DIRECTIONSTRING$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DirectionString" element
     */
    public boolean isSetDirectionString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTIONSTRING$6) != 0;
        }
    }
    
    /**
     * Sets the "DirectionString" element
     */
    @Inject(optional=true) public void setDirectionString(net.opengis.gml.StringOrRefType directionString)
    {
        generatedSetterHelperImpl(directionString, DIRECTIONSTRING$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DirectionString" element
     */
    public net.opengis.gml.StringOrRefType addNewDirectionString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(DIRECTIONSTRING$6);
            return target;
        }
    }
    
    /**
     * Unsets the "DirectionString" element
     */
    public void unsetDirectionString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTIONSTRING$6, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.TypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TypeType target = null;
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_default_attribute_value(TYPE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$8) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    @Inject(optional=true) public void setType(org.w3.x1999.xlink.TypeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.w3.x1999.xlink.TypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TypeType target = null;
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_store().add_attribute_user(TYPE$8);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$8);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.w3.x1999.xlink.HrefType xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.HrefType target = null;
            target = (org.w3.x1999.xlink.HrefType)get_store().find_attribute_user(HREF$10);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
    public boolean isSetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$10) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    @Inject(optional=true) public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$10);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.w3.x1999.xlink.HrefType href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.HrefType target = null;
            target = (org.w3.x1999.xlink.HrefType)get_store().find_attribute_user(HREF$10);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.HrefType)get_store().add_attribute_user(HREF$10);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
    public void unsetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$10);
        }
    }
    
    /**
     * Gets the "role" attribute
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public org.w3.x1999.xlink.RoleType xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.RoleType target = null;
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$12);
            return target;
        }
    }
    
    /**
     * True if has "role" attribute
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLE$12) != null;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
    @Inject(optional=true) public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$12);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.w3.x1999.xlink.RoleType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.RoleType target = null;
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$12);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.RoleType)get_store().add_attribute_user(ROLE$12);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" attribute
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLE$12);
        }
    }
    
    /**
     * Gets the "arcrole" attribute
     */
    public java.lang.String getArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arcrole" attribute
     */
    public org.w3.x1999.xlink.ArcroleType xgetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcroleType target = null;
            target = (org.w3.x1999.xlink.ArcroleType)get_store().find_attribute_user(ARCROLE$14);
            return target;
        }
    }
    
    /**
     * True if has "arcrole" attribute
     */
    public boolean isSetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARCROLE$14) != null;
        }
    }
    
    /**
     * Sets the "arcrole" attribute
     */
    @Inject(optional=true) public void setArcrole(java.lang.String arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCROLE$14);
            }
            target.setStringValue(arcrole);
        }
    }
    
    /**
     * Sets (as xml) the "arcrole" attribute
     */
    public void xsetArcrole(org.w3.x1999.xlink.ArcroleType arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcroleType target = null;
            target = (org.w3.x1999.xlink.ArcroleType)get_store().find_attribute_user(ARCROLE$14);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ArcroleType)get_store().add_attribute_user(ARCROLE$14);
            }
            target.set(arcrole);
        }
    }
    
    /**
     * Unsets the "arcrole" attribute
     */
    public void unsetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARCROLE$14);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.w3.x1999.xlink.TitleAttrType xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE$16);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$16) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    @Inject(optional=true) public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$16);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.w3.x1999.xlink.TitleAttrType title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE$16);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TitleAttrType)get_store().add_attribute_user(TITLE$16);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$16);
        }
    }
    
    /**
     * Gets the "show" attribute
     */
    public org.w3.x1999.xlink.ShowType.Enum getShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$18);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.ShowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "show" attribute
     */
    public org.w3.x1999.xlink.ShowType xgetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ShowType target = null;
            target = (org.w3.x1999.xlink.ShowType)get_store().find_attribute_user(SHOW$18);
            return target;
        }
    }
    
    /**
     * True if has "show" attribute
     */
    public boolean isSetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOW$18) != null;
        }
    }
    
    /**
     * Sets the "show" attribute
     */
    @Inject(optional=true) public void setShow(org.w3.x1999.xlink.ShowType.Enum show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOW$18);
            }
            target.setEnumValue(show);
        }
    }
    
    /**
     * Sets (as xml) the "show" attribute
     */
    public void xsetShow(org.w3.x1999.xlink.ShowType show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ShowType target = null;
            target = (org.w3.x1999.xlink.ShowType)get_store().find_attribute_user(SHOW$18);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ShowType)get_store().add_attribute_user(SHOW$18);
            }
            target.set(show);
        }
    }
    
    /**
     * Unsets the "show" attribute
     */
    public void unsetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOW$18);
        }
    }
    
    /**
     * Gets the "actuate" attribute
     */
    public org.w3.x1999.xlink.ActuateType.Enum getActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$20);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.ActuateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "actuate" attribute
     */
    public org.w3.x1999.xlink.ActuateType xgetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ActuateType target = null;
            target = (org.w3.x1999.xlink.ActuateType)get_store().find_attribute_user(ACTUATE$20);
            return target;
        }
    }
    
    /**
     * True if has "actuate" attribute
     */
    public boolean isSetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTUATE$20) != null;
        }
    }
    
    /**
     * Sets the "actuate" attribute
     */
    @Inject(optional=true) public void setActuate(org.w3.x1999.xlink.ActuateType.Enum actuate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTUATE$20);
            }
            target.setEnumValue(actuate);
        }
    }
    
    /**
     * Sets (as xml) the "actuate" attribute
     */
    public void xsetActuate(org.w3.x1999.xlink.ActuateType actuate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ActuateType target = null;
            target = (org.w3.x1999.xlink.ActuateType)get_store().find_attribute_user(ACTUATE$20);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ActuateType)get_store().add_attribute_user(ACTUATE$20);
            }
            target.set(actuate);
        }
    }
    
    /**
     * Unsets the "actuate" attribute
     */
    public void unsetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTUATE$20);
        }
    }
    
    /**
     * Gets the "remoteSchema" attribute
     */
    public java.lang.String getRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "remoteSchema" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$22);
            return target;
        }
    }
    
    /**
     * True if has "remoteSchema" attribute
     */
    public boolean isSetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REMOTESCHEMA$22) != null;
        }
    }
    
    /**
     * Sets the "remoteSchema" attribute
     */
    @Inject(optional=true) public void setRemoteSchema(java.lang.String remoteSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOTESCHEMA$22);
            }
            target.setStringValue(remoteSchema);
        }
    }
    
    /**
     * Sets (as xml) the "remoteSchema" attribute
     */
    public void xsetRemoteSchema(org.apache.xmlbeans.XmlAnyURI remoteSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(REMOTESCHEMA$22);
            }
            target.set(remoteSchema);
        }
    }
    
    /**
     * Unsets the "remoteSchema" attribute
     */
    public void unsetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REMOTESCHEMA$22);
        }
    }
}
