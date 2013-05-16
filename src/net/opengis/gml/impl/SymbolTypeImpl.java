/*
 * XML Type:  SymbolType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SymbolType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML SymbolType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class SymbolTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SymbolType
{
    private static final long serialVersionUID = 1L;
    
    public SymbolTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYMBOLTYPE$0 = 
        new javax.xml.namespace.QName("", "symbolType");
    private static final javax.xml.namespace.QName TRANSFORM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "transform");
    private static final javax.xml.namespace.QName ABOUT$4 = 
        new javax.xml.namespace.QName("", "about");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type");
    private static final javax.xml.namespace.QName HREF$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href");
    private static final javax.xml.namespace.QName ROLE$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role");
    private static final javax.xml.namespace.QName ARCROLE$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "arcrole");
    private static final javax.xml.namespace.QName TITLE$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName SHOW$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "show");
    private static final javax.xml.namespace.QName ACTUATE$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "actuate");
    private static final javax.xml.namespace.QName REMOTESCHEMA$20 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remoteSchema");
    
    
    /**
     * Gets the "symbolType" attribute
     */
    public net.opengis.gml.SymbolTypeEnumeration.Enum getSymbolType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYMBOLTYPE$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.SymbolTypeEnumeration.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "symbolType" attribute
     */
    public net.opengis.gml.SymbolTypeEnumeration xgetSymbolType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SymbolTypeEnumeration target = null;
            target = (net.opengis.gml.SymbolTypeEnumeration)get_store().find_attribute_user(SYMBOLTYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "symbolType" attribute
     */
    @Inject(optional=true) public void setSymbolType(net.opengis.gml.SymbolTypeEnumeration.Enum symbolType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYMBOLTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYMBOLTYPE$0);
            }
            target.setEnumValue(symbolType);
        }
    }
    
    /**
     * Sets (as xml) the "symbolType" attribute
     */
    public void xsetSymbolType(net.opengis.gml.SymbolTypeEnumeration symbolType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SymbolTypeEnumeration target = null;
            target = (net.opengis.gml.SymbolTypeEnumeration)get_store().find_attribute_user(SYMBOLTYPE$0);
            if (target == null)
            {
                target = (net.opengis.gml.SymbolTypeEnumeration)get_store().add_attribute_user(SYMBOLTYPE$0);
            }
            target.set(symbolType);
        }
    }
    
    /**
     * Gets the "transform" attribute
     */
    public java.lang.String getTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFORM$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transform" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSFORM$2);
            return target;
        }
    }
    
    /**
     * True if has "transform" attribute
     */
    public boolean isSetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSFORM$2) != null;
        }
    }
    
    /**
     * Sets the "transform" attribute
     */
    @Inject(optional=true) public void setTransform(java.lang.String transform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFORM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSFORM$2);
            }
            target.setStringValue(transform);
        }
    }
    
    /**
     * Sets (as xml) the "transform" attribute
     */
    public void xsetTransform(org.apache.xmlbeans.XmlString transform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSFORM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TRANSFORM$2);
            }
            target.set(transform);
        }
    }
    
    /**
     * Unsets the "transform" attribute
     */
    public void unsetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSFORM$2);
        }
    }
    
    /**
     * Gets the "about" attribute
     */
    public java.lang.String getAbout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABOUT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "about" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAbout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ABOUT$4);
            return target;
        }
    }
    
    /**
     * True if has "about" attribute
     */
    public boolean isSetAbout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ABOUT$4) != null;
        }
    }
    
    /**
     * Sets the "about" attribute
     */
    @Inject(optional=true) public void setAbout(java.lang.String about)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABOUT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABOUT$4);
            }
            target.setStringValue(about);
        }
    }
    
    /**
     * Sets (as xml) the "about" attribute
     */
    public void xsetAbout(org.apache.xmlbeans.XmlAnyURI about)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ABOUT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ABOUT$4);
            }
            target.set(about);
        }
    }
    
    /**
     * Unsets the "about" attribute
     */
    public void unsetAbout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ABOUT$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$6);
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
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_default_attribute_value(TYPE$6);
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
            return get_store().find_attribute_user(TYPE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_store().add_attribute_user(TYPE$6);
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
            get_store().remove_attribute(TYPE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$8);
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
            target = (org.w3.x1999.xlink.HrefType)get_store().find_attribute_user(HREF$8);
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
            return get_store().find_attribute_user(HREF$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$8);
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
            target = (org.w3.x1999.xlink.HrefType)get_store().find_attribute_user(HREF$8);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.HrefType)get_store().add_attribute_user(HREF$8);
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
            get_store().remove_attribute(HREF$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$10);
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
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$10);
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
            return get_store().find_attribute_user(ROLE$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$10);
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
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$10);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.RoleType)get_store().add_attribute_user(ROLE$10);
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
            get_store().remove_attribute(ROLE$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$12);
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
            target = (org.w3.x1999.xlink.ArcroleType)get_store().find_attribute_user(ARCROLE$12);
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
            return get_store().find_attribute_user(ARCROLE$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCROLE$12);
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
            target = (org.w3.x1999.xlink.ArcroleType)get_store().find_attribute_user(ARCROLE$12);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ArcroleType)get_store().add_attribute_user(ARCROLE$12);
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
            get_store().remove_attribute(ARCROLE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$14);
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
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE$14);
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
            return get_store().find_attribute_user(TITLE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$14);
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
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE$14);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TitleAttrType)get_store().add_attribute_user(TITLE$14);
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
            get_store().remove_attribute(TITLE$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$16);
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
            target = (org.w3.x1999.xlink.ShowType)get_store().find_attribute_user(SHOW$16);
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
            return get_store().find_attribute_user(SHOW$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOW$16);
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
            target = (org.w3.x1999.xlink.ShowType)get_store().find_attribute_user(SHOW$16);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ShowType)get_store().add_attribute_user(SHOW$16);
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
            get_store().remove_attribute(SHOW$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$18);
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
            target = (org.w3.x1999.xlink.ActuateType)get_store().find_attribute_user(ACTUATE$18);
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
            return get_store().find_attribute_user(ACTUATE$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTUATE$18);
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
            target = (org.w3.x1999.xlink.ActuateType)get_store().find_attribute_user(ACTUATE$18);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ActuateType)get_store().add_attribute_user(ACTUATE$18);
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
            get_store().remove_attribute(ACTUATE$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$20);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$20);
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
            return get_store().find_attribute_user(REMOTESCHEMA$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOTESCHEMA$20);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(REMOTESCHEMA$20);
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
            get_store().remove_attribute(REMOTESCHEMA$20);
        }
    }
}
