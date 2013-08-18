/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.w3.x2001.smil20.language.impl;

import com.google.inject.Inject;

/**
 * An XML animateType(@http://www.w3.org/2001/SMIL20/Language).
 *
 * This is a complex type.
 */
public class AnimateTypeImpl extends org.w3.x2001.smil20.impl.AnimatePrototypeImpl implements org.w3.x2001.smil20.language.AnimateType
{
    private static final long serialVersionUID = 1L;

    public AnimateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ID$0 =
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName CLASS1$2 =
        new javax.xml.namespace.QName("", "class");
    private static final javax.xml.namespace.QName LANG$4 =
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName ALT$6 =
        new javax.xml.namespace.QName("", "alt");
    private static final javax.xml.namespace.QName LONGDESC$8 =
        new javax.xml.namespace.QName("", "longdesc");
    private static final javax.xml.namespace.QName BEGIN$10 =
        new javax.xml.namespace.QName("", "begin");
    private static final javax.xml.namespace.QName END$12 =
        new javax.xml.namespace.QName("", "end");
    private static final javax.xml.namespace.QName DUR$14 =
        new javax.xml.namespace.QName("", "dur");
    private static final javax.xml.namespace.QName REPEATDUR$16 =
        new javax.xml.namespace.QName("", "repeatDur");
    private static final javax.xml.namespace.QName REPEATCOUNT$18 =
        new javax.xml.namespace.QName("", "repeatCount");
    private static final javax.xml.namespace.QName REPEAT$20 =
        new javax.xml.namespace.QName("", "repeat");
    private static final javax.xml.namespace.QName MIN$22 =
        new javax.xml.namespace.QName("", "min");
    private static final javax.xml.namespace.QName MAX$24 =
        new javax.xml.namespace.QName("", "max");
    private static final javax.xml.namespace.QName SYNCBEHAVIOR$26 =
        new javax.xml.namespace.QName("", "syncBehavior");
    private static final javax.xml.namespace.QName SYNCTOLERANCE$28 =
        new javax.xml.namespace.QName("", "syncTolerance");
    private static final javax.xml.namespace.QName SYNCBEHAVIORDEFAULT$30 =
        new javax.xml.namespace.QName("", "syncBehaviorDefault");
    private static final javax.xml.namespace.QName SYNCTOLERANCEDEFAULT$32 =
        new javax.xml.namespace.QName("", "syncToleranceDefault");
    private static final javax.xml.namespace.QName RESTART$34 =
        new javax.xml.namespace.QName("", "restart");
    private static final javax.xml.namespace.QName RESTARTDEFAULT$36 =
        new javax.xml.namespace.QName("", "restartDefault");
    private static final javax.xml.namespace.QName FILL$38 =
        new javax.xml.namespace.QName("", "fill");
    private static final javax.xml.namespace.QName FILLDEFAULT$40 =
        new javax.xml.namespace.QName("", "fillDefault");
    private static final javax.xml.namespace.QName TARGETELEMENT$42 =
        new javax.xml.namespace.QName("", "targetElement");
    private static final javax.xml.namespace.QName CALCMODE$44 =
        new javax.xml.namespace.QName("", "calcMode");
    private static final javax.xml.namespace.QName SKIPCONTENT$46 =
        new javax.xml.namespace.QName("", "skip-content");


    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            return target;
        }
    }

    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Inject(optional=true) public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }

    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }

    /**
     * Gets the "class" attribute
     */
    public java.lang.String getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "class" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$2);
            return target;
        }
    }

    /**
     * True if has "class" attribute
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASS1$2) != null;
        }
    }

    /**
     * Sets the "class" attribute
     */
    @Inject(optional=true) public void setClass1(java.lang.String class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$2);
            }
            target.setStringValue(class1);
        }
    }

    /**
     * Sets (as xml) the "class" attribute
     */
    public void xsetClass1(org.apache.xmlbeans.XmlString class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$2);
            }
            target.set(class1);
        }
    }

    /**
     * Unsets the "class" attribute
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASS1$2);
        }
    }

    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            return target;
        }
    }

    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$4) != null;
        }
    }

    /**
     * Sets the "lang" attribute
     */
    @Inject(optional=true) public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
            }
            target.setStringValue(lang);
        }
    }

    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$4);
            }
            target.set(lang);
        }
    }

    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$4);
        }
    }

    /**
     * Gets the "alt" attribute
     */
    public java.lang.String getAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALT$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "alt" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALT$6);
            return target;
        }
    }

    /**
     * True if has "alt" attribute
     */
    public boolean isSetAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALT$6) != null;
        }
    }

    /**
     * Sets the "alt" attribute
     */
    @Inject(optional=true) public void setAlt(java.lang.String alt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALT$6);
            }
            target.setStringValue(alt);
        }
    }

    /**
     * Sets (as xml) the "alt" attribute
     */
    public void xsetAlt(org.apache.xmlbeans.XmlString alt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALT$6);
            }
            target.set(alt);
        }
    }

    /**
     * Unsets the "alt" attribute
     */
    public void unsetAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALT$6);
        }
    }

    /**
     * Gets the "longdesc" attribute
     */
    public java.lang.String getLongdesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGDESC$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "longdesc" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetLongdesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LONGDESC$8);
            return target;
        }
    }

    /**
     * True if has "longdesc" attribute
     */
    public boolean isSetLongdesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LONGDESC$8) != null;
        }
    }

    /**
     * Sets the "longdesc" attribute
     */
    @Inject(optional=true) public void setLongdesc(java.lang.String longdesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGDESC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LONGDESC$8);
            }
            target.setStringValue(longdesc);
        }
    }

    /**
     * Sets (as xml) the "longdesc" attribute
     */
    public void xsetLongdesc(org.apache.xmlbeans.XmlAnyURI longdesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LONGDESC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(LONGDESC$8);
            }
            target.set(longdesc);
        }
    }

    /**
     * Unsets the "longdesc" attribute
     */
    public void unsetLongdesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LONGDESC$8);
        }
    }

    /**
     * Gets the "begin" attribute
     */
    public java.lang.String getBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGIN$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "begin" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BEGIN$10);
            return target;
        }
    }

    /**
     * True if has "begin" attribute
     */
    public boolean isSetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BEGIN$10) != null;
        }
    }

    /**
     * Sets the "begin" attribute
     */
    @Inject(optional=true) public void setBegin(java.lang.String begin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEGIN$10);
            }
            target.setStringValue(begin);
        }
    }

    /**
     * Sets (as xml) the "begin" attribute
     */
    public void xsetBegin(org.apache.xmlbeans.XmlString begin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BEGIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BEGIN$10);
            }
            target.set(begin);
        }
    }

    /**
     * Unsets the "begin" attribute
     */
    public void unsetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BEGIN$10);
        }
    }

    /**
     * Gets the "end" attribute
     */
    public java.lang.String getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "end" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(END$12);
            return target;
        }
    }

    /**
     * True if has "end" attribute
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(END$12) != null;
        }
    }

    /**
     * Sets the "end" attribute
     */
    @Inject(optional=true) public void setEnd(java.lang.String end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$12);
            }
            target.setStringValue(end);
        }
    }

    /**
     * Sets (as xml) the "end" attribute
     */
    public void xsetEnd(org.apache.xmlbeans.XmlString end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(END$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(END$12);
            }
            target.set(end);
        }
    }

    /**
     * Unsets the "end" attribute
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(END$12);
        }
    }

    /**
     * Gets the "dur" attribute
     */
    public java.lang.String getDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DUR$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "dur" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DUR$14);
            return target;
        }
    }

    /**
     * True if has "dur" attribute
     */
    public boolean isSetDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DUR$14) != null;
        }
    }

    /**
     * Sets the "dur" attribute
     */
    @Inject(optional=true) public void setDur(java.lang.String dur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DUR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DUR$14);
            }
            target.setStringValue(dur);
        }
    }

    /**
     * Sets (as xml) the "dur" attribute
     */
    public void xsetDur(org.apache.xmlbeans.XmlString dur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DUR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DUR$14);
            }
            target.set(dur);
        }
    }

    /**
     * Unsets the "dur" attribute
     */
    public void unsetDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DUR$14);
        }
    }

    /**
     * Gets the "repeatDur" attribute
     */
    public java.lang.String getRepeatDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATDUR$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "repeatDur" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRepeatDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPEATDUR$16);
            return target;
        }
    }

    /**
     * True if has "repeatDur" attribute
     */
    public boolean isSetRepeatDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPEATDUR$16) != null;
        }
    }

    /**
     * Sets the "repeatDur" attribute
     */
    @Inject(optional=true) public void setRepeatDur(java.lang.String repeatDur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATDUR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATDUR$16);
            }
            target.setStringValue(repeatDur);
        }
    }

    /**
     * Sets (as xml) the "repeatDur" attribute
     */
    public void xsetRepeatDur(org.apache.xmlbeans.XmlString repeatDur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPEATDUR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REPEATDUR$16);
            }
            target.set(repeatDur);
        }
    }

    /**
     * Unsets the "repeatDur" attribute
     */
    public void unsetRepeatDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPEATDUR$16);
        }
    }

    /**
     * Gets the "repeatCount" attribute
     */
    public java.math.BigDecimal getRepeatCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATCOUNT$18);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }

    /**
     * Gets (as xml) the "repeatCount" attribute
     */
    public org.w3.x2001.smil20.NonNegativeDecimalType xgetRepeatCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.NonNegativeDecimalType target = null;
            target = (org.w3.x2001.smil20.NonNegativeDecimalType)get_store().find_attribute_user(REPEATCOUNT$18);
            return target;
        }
    }

    /**
     * True if has "repeatCount" attribute
     */
    public boolean isSetRepeatCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPEATCOUNT$18) != null;
        }
    }

    /**
     * Sets the "repeatCount" attribute
     */
    @Inject(optional=true) public void setRepeatCount(java.math.BigDecimal repeatCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATCOUNT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATCOUNT$18);
            }
            target.setBigDecimalValue(repeatCount);
        }
    }

    /**
     * Sets (as xml) the "repeatCount" attribute
     */
    public void xsetRepeatCount(org.w3.x2001.smil20.NonNegativeDecimalType repeatCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.NonNegativeDecimalType target = null;
            target = (org.w3.x2001.smil20.NonNegativeDecimalType)get_store().find_attribute_user(REPEATCOUNT$18);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.NonNegativeDecimalType)get_store().add_attribute_user(REPEATCOUNT$18);
            }
            target.set(repeatCount);
        }
    }

    /**
     * Unsets the "repeatCount" attribute
     */
    public void unsetRepeatCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPEATCOUNT$18);
        }
    }

    /**
     * Gets the "repeat" attribute
     */
    public java.math.BigInteger getRepeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEAT$20);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "repeat" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetRepeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(REPEAT$20);
            return target;
        }
    }

    /**
     * True if has "repeat" attribute
     */
    public boolean isSetRepeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPEAT$20) != null;
        }
    }

    /**
     * Sets the "repeat" attribute
     */
    @Inject(optional=true) public void setRepeat(java.math.BigInteger repeat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEAT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEAT$20);
            }
            target.setBigIntegerValue(repeat);
        }
    }

    /**
     * Sets (as xml) the "repeat" attribute
     */
    public void xsetRepeat(org.apache.xmlbeans.XmlNonNegativeInteger repeat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(REPEAT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(REPEAT$20);
            }
            target.set(repeat);
        }
    }

    /**
     * Unsets the "repeat" attribute
     */
    public void unsetRepeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPEAT$20);
        }
    }

    /**
     * Gets the "min" attribute
     */
    public java.lang.String getMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "min" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIN$22);
            return target;
        }
    }

    /**
     * True if has "min" attribute
     */
    public boolean isSetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MIN$22) != null;
        }
    }

    /**
     * Sets the "min" attribute
     */
    @Inject(optional=true) public void setMin(java.lang.String min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$22);
            }
            target.setStringValue(min);
        }
    }

    /**
     * Sets (as xml) the "min" attribute
     */
    public void xsetMin(org.apache.xmlbeans.XmlString min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIN$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MIN$22);
            }
            target.set(min);
        }
    }

    /**
     * Unsets the "min" attribute
     */
    public void unsetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MIN$22);
        }
    }

    /**
     * Gets the "max" attribute
     */
    public java.lang.String getMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "max" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAX$24);
            return target;
        }
    }

    /**
     * True if has "max" attribute
     */
    public boolean isSetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAX$24) != null;
        }
    }

    /**
     * Sets the "max" attribute
     */
    @Inject(optional=true) public void setMax(java.lang.String max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$24);
            }
            target.setStringValue(max);
        }
    }

    /**
     * Sets (as xml) the "max" attribute
     */
    public void xsetMax(org.apache.xmlbeans.XmlString max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAX$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAX$24);
            }
            target.set(max);
        }
    }

    /**
     * Unsets the "max" attribute
     */
    public void unsetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAX$24);
        }
    }

    /**
     * Gets the "syncBehavior" attribute
     */
    public org.w3.x2001.smil20.SyncBehaviorType.Enum getSyncBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCBEHAVIOR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SYNCBEHAVIOR$26);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.SyncBehaviorType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "syncBehavior" attribute
     */
    public org.w3.x2001.smil20.SyncBehaviorType xgetSyncBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.SyncBehaviorType target = null;
            target = (org.w3.x2001.smil20.SyncBehaviorType)get_store().find_attribute_user(SYNCBEHAVIOR$26);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.SyncBehaviorType)get_default_attribute_value(SYNCBEHAVIOR$26);
            }
            return target;
        }
    }

    /**
     * True if has "syncBehavior" attribute
     */
    public boolean isSetSyncBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SYNCBEHAVIOR$26) != null;
        }
    }

    /**
     * Sets the "syncBehavior" attribute
     */
    @Inject(optional=true) public void setSyncBehavior(org.w3.x2001.smil20.SyncBehaviorType.Enum syncBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCBEHAVIOR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCBEHAVIOR$26);
            }
            target.setEnumValue(syncBehavior);
        }
    }

    /**
     * Sets (as xml) the "syncBehavior" attribute
     */
    public void xsetSyncBehavior(org.w3.x2001.smil20.SyncBehaviorType syncBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.SyncBehaviorType target = null;
            target = (org.w3.x2001.smil20.SyncBehaviorType)get_store().find_attribute_user(SYNCBEHAVIOR$26);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.SyncBehaviorType)get_store().add_attribute_user(SYNCBEHAVIOR$26);
            }
            target.set(syncBehavior);
        }
    }

    /**
     * Unsets the "syncBehavior" attribute
     */
    public void unsetSyncBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SYNCBEHAVIOR$26);
        }
    }

    /**
     * Gets the "syncTolerance" attribute
     */
    public java.lang.String getSyncTolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTOLERANCE$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "syncTolerance" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSyncTolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYNCTOLERANCE$28);
            return target;
        }
    }

    /**
     * True if has "syncTolerance" attribute
     */
    public boolean isSetSyncTolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SYNCTOLERANCE$28) != null;
        }
    }

    /**
     * Sets the "syncTolerance" attribute
     */
    @Inject(optional=true) public void setSyncTolerance(java.lang.String syncTolerance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTOLERANCE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCTOLERANCE$28);
            }
            target.setStringValue(syncTolerance);
        }
    }

    /**
     * Sets (as xml) the "syncTolerance" attribute
     */
    public void xsetSyncTolerance(org.apache.xmlbeans.XmlString syncTolerance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYNCTOLERANCE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYNCTOLERANCE$28);
            }
            target.set(syncTolerance);
        }
    }

    /**
     * Unsets the "syncTolerance" attribute
     */
    public void unsetSyncTolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SYNCTOLERANCE$28);
        }
    }

    /**
     * Gets the "syncBehaviorDefault" attribute
     */
    public org.w3.x2001.smil20.SyncBehaviorDefaultType.Enum getSyncBehaviorDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCBEHAVIORDEFAULT$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SYNCBEHAVIORDEFAULT$30);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.SyncBehaviorDefaultType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "syncBehaviorDefault" attribute
     */
    public org.w3.x2001.smil20.SyncBehaviorDefaultType xgetSyncBehaviorDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.SyncBehaviorDefaultType target = null;
            target = (org.w3.x2001.smil20.SyncBehaviorDefaultType)get_store().find_attribute_user(SYNCBEHAVIORDEFAULT$30);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.SyncBehaviorDefaultType)get_default_attribute_value(SYNCBEHAVIORDEFAULT$30);
            }
            return target;
        }
    }

    /**
     * True if has "syncBehaviorDefault" attribute
     */
    public boolean isSetSyncBehaviorDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SYNCBEHAVIORDEFAULT$30) != null;
        }
    }

    /**
     * Sets the "syncBehaviorDefault" attribute
     */
    @Inject(optional=true) public void setSyncBehaviorDefault(org.w3.x2001.smil20.SyncBehaviorDefaultType.Enum syncBehaviorDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCBEHAVIORDEFAULT$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCBEHAVIORDEFAULT$30);
            }
            target.setEnumValue(syncBehaviorDefault);
        }
    }

    /**
     * Sets (as xml) the "syncBehaviorDefault" attribute
     */
    public void xsetSyncBehaviorDefault(org.w3.x2001.smil20.SyncBehaviorDefaultType syncBehaviorDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.SyncBehaviorDefaultType target = null;
            target = (org.w3.x2001.smil20.SyncBehaviorDefaultType)get_store().find_attribute_user(SYNCBEHAVIORDEFAULT$30);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.SyncBehaviorDefaultType)get_store().add_attribute_user(SYNCBEHAVIORDEFAULT$30);
            }
            target.set(syncBehaviorDefault);
        }
    }

    /**
     * Unsets the "syncBehaviorDefault" attribute
     */
    public void unsetSyncBehaviorDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SYNCBEHAVIORDEFAULT$30);
        }
    }

    /**
     * Gets the "syncToleranceDefault" attribute
     */
    public java.lang.String getSyncToleranceDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTOLERANCEDEFAULT$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SYNCTOLERANCEDEFAULT$32);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "syncToleranceDefault" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSyncToleranceDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYNCTOLERANCEDEFAULT$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(SYNCTOLERANCEDEFAULT$32);
            }
            return target;
        }
    }

    /**
     * True if has "syncToleranceDefault" attribute
     */
    public boolean isSetSyncToleranceDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SYNCTOLERANCEDEFAULT$32) != null;
        }
    }

    /**
     * Sets the "syncToleranceDefault" attribute
     */
    @Inject(optional=true) public void setSyncToleranceDefault(java.lang.String syncToleranceDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTOLERANCEDEFAULT$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCTOLERANCEDEFAULT$32);
            }
            target.setStringValue(syncToleranceDefault);
        }
    }

    /**
     * Sets (as xml) the "syncToleranceDefault" attribute
     */
    public void xsetSyncToleranceDefault(org.apache.xmlbeans.XmlString syncToleranceDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYNCTOLERANCEDEFAULT$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYNCTOLERANCEDEFAULT$32);
            }
            target.set(syncToleranceDefault);
        }
    }

    /**
     * Unsets the "syncToleranceDefault" attribute
     */
    public void unsetSyncToleranceDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SYNCTOLERANCEDEFAULT$32);
        }
    }

    /**
     * Gets the "restart" attribute
     */
    public org.w3.x2001.smil20.RestartTimingType.Enum getRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTART$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESTART$34);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.RestartTimingType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "restart" attribute
     */
    public org.w3.x2001.smil20.RestartTimingType xgetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.RestartTimingType target = null;
            target = (org.w3.x2001.smil20.RestartTimingType)get_store().find_attribute_user(RESTART$34);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.RestartTimingType)get_default_attribute_value(RESTART$34);
            }
            return target;
        }
    }

    /**
     * True if has "restart" attribute
     */
    public boolean isSetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESTART$34) != null;
        }
    }

    /**
     * Sets the "restart" attribute
     */
    @Inject(optional=true) public void setRestart(org.w3.x2001.smil20.RestartTimingType.Enum restart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTART$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESTART$34);
            }
            target.setEnumValue(restart);
        }
    }

    /**
     * Sets (as xml) the "restart" attribute
     */
    public void xsetRestart(org.w3.x2001.smil20.RestartTimingType restart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.RestartTimingType target = null;
            target = (org.w3.x2001.smil20.RestartTimingType)get_store().find_attribute_user(RESTART$34);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.RestartTimingType)get_store().add_attribute_user(RESTART$34);
            }
            target.set(restart);
        }
    }

    /**
     * Unsets the "restart" attribute
     */
    public void unsetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESTART$34);
        }
    }

    /**
     * Gets the "restartDefault" attribute
     */
    public org.w3.x2001.smil20.RestartDefaultType.Enum getRestartDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTARTDEFAULT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESTARTDEFAULT$36);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.RestartDefaultType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "restartDefault" attribute
     */
    public org.w3.x2001.smil20.RestartDefaultType xgetRestartDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.RestartDefaultType target = null;
            target = (org.w3.x2001.smil20.RestartDefaultType)get_store().find_attribute_user(RESTARTDEFAULT$36);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.RestartDefaultType)get_default_attribute_value(RESTARTDEFAULT$36);
            }
            return target;
        }
    }

    /**
     * True if has "restartDefault" attribute
     */
    public boolean isSetRestartDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESTARTDEFAULT$36) != null;
        }
    }

    /**
     * Sets the "restartDefault" attribute
     */
    @Inject(optional=true) public void setRestartDefault(org.w3.x2001.smil20.RestartDefaultType.Enum restartDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTARTDEFAULT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESTARTDEFAULT$36);
            }
            target.setEnumValue(restartDefault);
        }
    }

    /**
     * Sets (as xml) the "restartDefault" attribute
     */
    public void xsetRestartDefault(org.w3.x2001.smil20.RestartDefaultType restartDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.RestartDefaultType target = null;
            target = (org.w3.x2001.smil20.RestartDefaultType)get_store().find_attribute_user(RESTARTDEFAULT$36);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.RestartDefaultType)get_store().add_attribute_user(RESTARTDEFAULT$36);
            }
            target.set(restartDefault);
        }
    }

    /**
     * Unsets the "restartDefault" attribute
     */
    public void unsetRestartDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESTARTDEFAULT$36);
        }
    }

    /**
     * Gets the "fill" attribute
     */
    public org.w3.x2001.smil20.FillTimingAttrsType.Enum getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILL$38);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.FillTimingAttrsType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "fill" attribute
     */
    public org.w3.x2001.smil20.FillTimingAttrsType xgetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.FillTimingAttrsType target = null;
            target = (org.w3.x2001.smil20.FillTimingAttrsType)get_store().find_attribute_user(FILL$38);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.FillTimingAttrsType)get_default_attribute_value(FILL$38);
            }
            return target;
        }
    }

    /**
     * True if has "fill" attribute
     */
    public boolean isSetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILL$38) != null;
        }
    }

    /**
     * Sets the "fill" attribute
     */
    @Inject(optional=true) public void setFill(org.w3.x2001.smil20.FillTimingAttrsType.Enum fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILL$38);
            }
            target.setEnumValue(fill);
        }
    }

    /**
     * Sets (as xml) the "fill" attribute
     */
    public void xsetFill(org.w3.x2001.smil20.FillTimingAttrsType fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.FillTimingAttrsType target = null;
            target = (org.w3.x2001.smil20.FillTimingAttrsType)get_store().find_attribute_user(FILL$38);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.FillTimingAttrsType)get_store().add_attribute_user(FILL$38);
            }
            target.set(fill);
        }
    }

    /**
     * Unsets the "fill" attribute
     */
    public void unsetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILL$38);
        }
    }

    /**
     * Gets the "fillDefault" attribute
     */
    public org.w3.x2001.smil20.FillDefaultType.Enum getFillDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLDEFAULT$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILLDEFAULT$40);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.FillDefaultType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "fillDefault" attribute
     */
    public org.w3.x2001.smil20.FillDefaultType xgetFillDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.FillDefaultType target = null;
            target = (org.w3.x2001.smil20.FillDefaultType)get_store().find_attribute_user(FILLDEFAULT$40);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.FillDefaultType)get_default_attribute_value(FILLDEFAULT$40);
            }
            return target;
        }
    }

    /**
     * True if has "fillDefault" attribute
     */
    public boolean isSetFillDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLDEFAULT$40) != null;
        }
    }

    /**
     * Sets the "fillDefault" attribute
     */
    @Inject(optional=true) public void setFillDefault(org.w3.x2001.smil20.FillDefaultType.Enum fillDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLDEFAULT$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLDEFAULT$40);
            }
            target.setEnumValue(fillDefault);
        }
    }

    /**
     * Sets (as xml) the "fillDefault" attribute
     */
    public void xsetFillDefault(org.w3.x2001.smil20.FillDefaultType fillDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.FillDefaultType target = null;
            target = (org.w3.x2001.smil20.FillDefaultType)get_store().find_attribute_user(FILLDEFAULT$40);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.FillDefaultType)get_store().add_attribute_user(FILLDEFAULT$40);
            }
            target.set(fillDefault);
        }
    }

    /**
     * Unsets the "fillDefault" attribute
     */
    public void unsetFillDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLDEFAULT$40);
        }
    }

    /**
     * Gets the "targetElement" attribute
     */
    public java.lang.String getTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETELEMENT$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "targetElement" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETELEMENT$42);
            return target;
        }
    }

    /**
     * True if has "targetElement" attribute
     */
    public boolean isSetTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETELEMENT$42) != null;
        }
    }

    /**
     * Sets the "targetElement" attribute
     */
    @Inject(optional=true) public void setTargetElement(java.lang.String targetElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETELEMENT$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETELEMENT$42);
            }
            target.setStringValue(targetElement);
        }
    }

    /**
     * Sets (as xml) the "targetElement" attribute
     */
    public void xsetTargetElement(org.apache.xmlbeans.XmlIDREF targetElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(TARGETELEMENT$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(TARGETELEMENT$42);
            }
            target.set(targetElement);
        }
    }

    /**
     * Unsets the "targetElement" attribute
     */
    public void unsetTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETELEMENT$42);
        }
    }

    /**
     * Gets the "calcMode" attribute
     */
    public org.w3.x2001.smil20.language.AnimateType.CalcMode.Enum getCalcMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCMODE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CALCMODE$44);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.language.AnimateType.CalcMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "calcMode" attribute
     */
    public org.w3.x2001.smil20.language.AnimateType.CalcMode xgetCalcMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType.CalcMode target = null;
            target = (org.w3.x2001.smil20.language.AnimateType.CalcMode)get_store().find_attribute_user(CALCMODE$44);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.language.AnimateType.CalcMode)get_default_attribute_value(CALCMODE$44);
            }
            return target;
        }
    }

    /**
     * True if has "calcMode" attribute
     */
    public boolean isSetCalcMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALCMODE$44) != null;
        }
    }

    /**
     * Sets the "calcMode" attribute
     */
    @Inject(optional=true) public void setCalcMode(org.w3.x2001.smil20.language.AnimateType.CalcMode.Enum calcMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCMODE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALCMODE$44);
            }
            target.setEnumValue(calcMode);
        }
    }

    /**
     * Sets (as xml) the "calcMode" attribute
     */
    public void xsetCalcMode(org.w3.x2001.smil20.language.AnimateType.CalcMode calcMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType.CalcMode target = null;
            target = (org.w3.x2001.smil20.language.AnimateType.CalcMode)get_store().find_attribute_user(CALCMODE$44);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.language.AnimateType.CalcMode)get_store().add_attribute_user(CALCMODE$44);
            }
            target.set(calcMode);
        }
    }

    /**
     * Unsets the "calcMode" attribute
     */
    public void unsetCalcMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALCMODE$44);
        }
    }

    /**
     * Gets the "skip-content" attribute
     */
    public boolean getSkipContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPCONTENT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SKIPCONTENT$46);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "skip-content" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSkipContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SKIPCONTENT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SKIPCONTENT$46);
            }
            return target;
        }
    }

    /**
     * True if has "skip-content" attribute
     */
    public boolean isSetSkipContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SKIPCONTENT$46) != null;
        }
    }

    /**
     * Sets the "skip-content" attribute
     */
    @Inject(optional=true) public void setSkipContent(boolean skipContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPCONTENT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKIPCONTENT$46);
            }
            target.setBooleanValue(skipContent);
        }
    }

    /**
     * Sets (as xml) the "skip-content" attribute
     */
    public void xsetSkipContent(org.apache.xmlbeans.XmlBoolean skipContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SKIPCONTENT$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SKIPCONTENT$46);
            }
            target.set(skipContent);
        }
    }

    /**
     * Unsets the "skip-content" attribute
     */
    public void unsetSkipContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SKIPCONTENT$46);
        }
    }
    /**
     * An XML calcMode(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.smil20.language.AnimateType$CalcMode.
     */
    public static class CalcModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.smil20.language.AnimateType.CalcMode
    {
        private static final long serialVersionUID = 1L;

        public CalcModeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }

        protected CalcModeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
