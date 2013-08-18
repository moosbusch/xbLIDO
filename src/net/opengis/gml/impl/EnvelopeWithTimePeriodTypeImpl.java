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
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML EnvelopeWithTimePeriodType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class EnvelopeWithTimePeriodTypeImpl extends net.opengis.gml.impl.EnvelopeTypeImpl implements net.opengis.gml.EnvelopeWithTimePeriodType
{
    private static final long serialVersionUID = 1L;

    public EnvelopeWithTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName TIMEPOSITION$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "timePosition");
    private static final javax.xml.namespace.QName FRAME$2 =
        new javax.xml.namespace.QName("", "frame");


    /**
     * Gets a List of "timePosition" elements
     */
    public java.util.List<net.opengis.gml.TimePositionType> getTimePosList()
    {
        final class TimePositionList extends java.util.AbstractList<net.opengis.gml.TimePositionType>
        {
            @Override
            public net.opengis.gml.TimePositionType get(int i)
                { return EnvelopeWithTimePeriodTypeImpl.this.getTimePositionArray(i); }

            @Override
            public net.opengis.gml.TimePositionType set(int i, net.opengis.gml.TimePositionType o)
            {
                net.opengis.gml.TimePositionType old = EnvelopeWithTimePeriodTypeImpl.this.getTimePositionArray(i);
                EnvelopeWithTimePeriodTypeImpl.this.setTimePositionArray(i, o);
                return old;
            }

            @Override
            public void add(int i, net.opengis.gml.TimePositionType o)
                { EnvelopeWithTimePeriodTypeImpl.this.insertNewTimePosition(i).set(o); }

            @Override
            public net.opengis.gml.TimePositionType remove(int i)
            {
                net.opengis.gml.TimePositionType old = EnvelopeWithTimePeriodTypeImpl.this.getTimePositionArray(i);
                EnvelopeWithTimePeriodTypeImpl.this.removeTimePosition(i);
                return old;
            }

            @Override
            public int size()
                { return EnvelopeWithTimePeriodTypeImpl.this.sizeOfTimePositionArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new TimePositionList();
        }
    }

    /**
     * Gets array of all "timePosition" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimePositionType[] getTimePositionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimePositionType> targetList = new java.util.ArrayList<net.opengis.gml.TimePositionType>();
            get_store().find_all_element_users(TIMEPOSITION$0, targetList);
            net.opengis.gml.TimePositionType[] result = new net.opengis.gml.TimePositionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "timePosition" element
     */
    public net.opengis.gml.TimePositionType getTimePositionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().find_element_user(TIMEPOSITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "timePosition" element
     */
    public int sizeOfTimePositionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEPOSITION$0);
        }
    }

    /**
     * Sets array of all "timePosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTimePositionArray(net.opengis.gml.TimePositionType[] timePositionArray)
    {
        check_orphaned();
        arraySetterHelper(timePositionArray, TIMEPOSITION$0);
    }

    /**
     * Sets ith "timePosition" element
     */
    @Inject(optional=true) public void setTimePositionArray(int i, net.opengis.gml.TimePositionType timePosition)
    {
        generatedSetterHelperImpl(timePosition, TIMEPOSITION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "timePosition" element
     */
    public net.opengis.gml.TimePositionType insertNewTimePosition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().insert_element_user(TIMEPOSITION$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "timePosition" element
     */
    public net.opengis.gml.TimePositionType addNewTimePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().add_element_user(TIMEPOSITION$0);
            return target;
        }
    }

    /**
     * Removes the ith "timePosition" element
     */
    public void removeTimePosition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEPOSITION$0, i);
        }
    }

    /**
     * Gets the "frame" attribute
     */
    public java.lang.String getFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FRAME$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "frame" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FRAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(FRAME$2);
            }
            return target;
        }
    }

    /**
     * True if has "frame" attribute
     */
    public boolean isSetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAME$2) != null;
        }
    }

    /**
     * Sets the "frame" attribute
     */
    @Inject(optional=true) public void setFrame(java.lang.String frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$2);
            }
            target.setStringValue(frame);
        }
    }

    /**
     * Sets (as xml) the "frame" attribute
     */
    public void xsetFrame(org.apache.xmlbeans.XmlAnyURI frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FRAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(FRAME$2);
            }
            target.set(frame);
        }
    }

    /**
     * Unsets the "frame" attribute
     */
    public void unsetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAME$2);
        }
    }
}
