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
 * An XML TimeOrdinalEraType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeOrdinalEraTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.TimeOrdinalEraType
{
    private static final long serialVersionUID = 1L;
    
    public TimeOrdinalEraTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "relatedTime");
    private static final javax.xml.namespace.QName START$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "start");
    private static final javax.xml.namespace.QName END$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "end");
    private static final javax.xml.namespace.QName EXTENT$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "extent");
    private static final javax.xml.namespace.QName MEMBER$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "member");
    private static final javax.xml.namespace.QName GROUP$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "group");
    
    
    /**
     * Gets a List of "relatedTime" elements
     */
    public java.util.List<net.opengis.gml.RelatedTimeType> getRelatedTimeList()
    {
        final class RelatedTimeList extends java.util.AbstractList<net.opengis.gml.RelatedTimeType>
        {
            @Override
            public net.opengis.gml.RelatedTimeType get(int i)
                { return TimeOrdinalEraTypeImpl.this.getRelatedTimeArray(i); }
            
            @Override
            public net.opengis.gml.RelatedTimeType set(int i, net.opengis.gml.RelatedTimeType o)
            {
                net.opengis.gml.RelatedTimeType old = TimeOrdinalEraTypeImpl.this.getRelatedTimeArray(i);
                TimeOrdinalEraTypeImpl.this.setRelatedTimeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.RelatedTimeType o)
                { TimeOrdinalEraTypeImpl.this.insertNewRelatedTime(i).set(o); }
            
            @Override
            public net.opengis.gml.RelatedTimeType remove(int i)
            {
                net.opengis.gml.RelatedTimeType old = TimeOrdinalEraTypeImpl.this.getRelatedTimeArray(i);
                TimeOrdinalEraTypeImpl.this.removeRelatedTime(i);
                return old;
            }
            
            @Override
            public int size()
                { return TimeOrdinalEraTypeImpl.this.sizeOfRelatedTimeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RelatedTimeList();
        }
    }
    
    /**
     * Gets array of all "relatedTime" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.RelatedTimeType[] getRelatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.RelatedTimeType> targetList = new java.util.ArrayList<net.opengis.gml.RelatedTimeType>();
            get_store().find_all_element_users(RELATEDTIME$0, targetList);
            net.opengis.gml.RelatedTimeType[] result = new net.opengis.gml.RelatedTimeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedTime" element
     */
    public net.opengis.gml.RelatedTimeType getRelatedTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RelatedTimeType target = null;
            target = (net.opengis.gml.RelatedTimeType)get_store().find_element_user(RELATEDTIME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedTime" element
     */
    public int sizeOfRelatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDTIME$0);
        }
    }
    
    /**
     * Sets array of all "relatedTime" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRelatedTimeArray(net.opengis.gml.RelatedTimeType[] relatedTimeArray)
    {
        check_orphaned();
        arraySetterHelper(relatedTimeArray, RELATEDTIME$0);
    }
    
    /**
     * Sets ith "relatedTime" element
     */
    @Inject(optional=true) public void setRelatedTimeArray(int i, net.opengis.gml.RelatedTimeType relatedTime)
    {
        generatedSetterHelperImpl(relatedTime, RELATEDTIME$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedTime" element
     */
    public net.opengis.gml.RelatedTimeType insertNewRelatedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RelatedTimeType target = null;
            target = (net.opengis.gml.RelatedTimeType)get_store().insert_element_user(RELATEDTIME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedTime" element
     */
    public net.opengis.gml.RelatedTimeType addNewRelatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RelatedTimeType target = null;
            target = (net.opengis.gml.RelatedTimeType)get_store().add_element_user(RELATEDTIME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedTime" element
     */
    public void removeRelatedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDTIME$0, i);
        }
    }
    
    /**
     * Gets the "start" element
     */
    public net.opengis.gml.TimeNodePropertyType getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodePropertyType target = null;
            target = (net.opengis.gml.TimeNodePropertyType)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "start" element
     */
    @Inject(optional=true) public void setStart(net.opengis.gml.TimeNodePropertyType start)
    {
        generatedSetterHelperImpl(start, START$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "start" element
     */
    public net.opengis.gml.TimeNodePropertyType addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodePropertyType target = null;
            target = (net.opengis.gml.TimeNodePropertyType)get_store().add_element_user(START$2);
            return target;
        }
    }
    
    /**
     * Gets the "end" element
     */
    public net.opengis.gml.TimeNodePropertyType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodePropertyType target = null;
            target = (net.opengis.gml.TimeNodePropertyType)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "end" element
     */
    @Inject(optional=true) public void setEnd(net.opengis.gml.TimeNodePropertyType end)
    {
        generatedSetterHelperImpl(end, END$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public net.opengis.gml.TimeNodePropertyType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodePropertyType target = null;
            target = (net.opengis.gml.TimeNodePropertyType)get_store().add_element_user(END$4);
            return target;
        }
    }
    
    /**
     * Gets the "extent" element
     */
    public net.opengis.gml.TimePeriodPropertyType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.TimePeriodPropertyType)get_store().find_element_user(EXTENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extent" element
     */
    public boolean isSetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENT$6) != 0;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    @Inject(optional=true) public void setExtent(net.opengis.gml.TimePeriodPropertyType extent)
    {
        generatedSetterHelperImpl(extent, EXTENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public net.opengis.gml.TimePeriodPropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.TimePeriodPropertyType)get_store().add_element_user(EXTENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "extent" element
     */
    public void unsetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENT$6, 0);
        }
    }
    
    /**
     * Gets a List of "member" elements
     */
    public java.util.List<net.opengis.gml.TimeOrdinalEraPropertyType> getMemberList()
    {
        final class MemberList extends java.util.AbstractList<net.opengis.gml.TimeOrdinalEraPropertyType>
        {
            @Override
            public net.opengis.gml.TimeOrdinalEraPropertyType get(int i)
                { return TimeOrdinalEraTypeImpl.this.getMemberArray(i); }
            
            @Override
            public net.opengis.gml.TimeOrdinalEraPropertyType set(int i, net.opengis.gml.TimeOrdinalEraPropertyType o)
            {
                net.opengis.gml.TimeOrdinalEraPropertyType old = TimeOrdinalEraTypeImpl.this.getMemberArray(i);
                TimeOrdinalEraTypeImpl.this.setMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TimeOrdinalEraPropertyType o)
                { TimeOrdinalEraTypeImpl.this.insertNewMember(i).set(o); }
            
            @Override
            public net.opengis.gml.TimeOrdinalEraPropertyType remove(int i)
            {
                net.opengis.gml.TimeOrdinalEraPropertyType old = TimeOrdinalEraTypeImpl.this.getMemberArray(i);
                TimeOrdinalEraTypeImpl.this.removeMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return TimeOrdinalEraTypeImpl.this.sizeOfMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MemberList();
        }
    }
    
    /**
     * Gets array of all "member" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimeOrdinalEraPropertyType[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimeOrdinalEraPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.TimeOrdinalEraPropertyType>();
            get_store().find_all_element_users(MEMBER$8, targetList);
            net.opengis.gml.TimeOrdinalEraPropertyType[] result = new net.opengis.gml.TimeOrdinalEraPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "member" element
     */
    public net.opengis.gml.TimeOrdinalEraPropertyType getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.TimeOrdinalEraPropertyType)get_store().find_element_user(MEMBER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$8);
        }
    }
    
    /**
     * Sets array of all "member" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMemberArray(net.opengis.gml.TimeOrdinalEraPropertyType[] memberArray)
    {
        check_orphaned();
        arraySetterHelper(memberArray, MEMBER$8);
    }
    
    /**
     * Sets ith "member" element
     */
    @Inject(optional=true) public void setMemberArray(int i, net.opengis.gml.TimeOrdinalEraPropertyType member)
    {
        generatedSetterHelperImpl(member, MEMBER$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    public net.opengis.gml.TimeOrdinalEraPropertyType insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.TimeOrdinalEraPropertyType)get_store().insert_element_user(MEMBER$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    public net.opengis.gml.TimeOrdinalEraPropertyType addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.TimeOrdinalEraPropertyType)get_store().add_element_user(MEMBER$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$8, i);
        }
    }
    
    /**
     * Gets the "group" element
     */
    public net.opengis.gml.ReferenceType getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().find_element_user(GROUP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "group" element
     */
    public boolean isSetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$10) != 0;
        }
    }
    
    /**
     * Sets the "group" element
     */
    @Inject(optional=true) public void setGroup(net.opengis.gml.ReferenceType group)
    {
        generatedSetterHelperImpl(group, GROUP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public net.opengis.gml.ReferenceType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().add_element_user(GROUP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "group" element
     */
    public void unsetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$10, 0);
        }
    }
}
