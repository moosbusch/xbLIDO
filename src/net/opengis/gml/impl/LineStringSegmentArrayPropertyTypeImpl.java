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
package net.opengis.gml.impl; 
/**
 * An XML LineStringSegmentArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class LineStringSegmentArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LineStringSegmentArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public LineStringSegmentArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRINGSEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineStringSegment");
    
    
    /**
     * Gets a List of "LineStringSegment" elements
     */
    public java.util.List<net.opengis.gml.LineStringSegmentType> getLineStringSegmentList()
    {
        final class LineStringSegmentList extends java.util.AbstractList<net.opengis.gml.LineStringSegmentType>
        {
            @Override
            public net.opengis.gml.LineStringSegmentType get(int i)
                { return LineStringSegmentArrayPropertyTypeImpl.this.getLineStringSegmentArray(i); }
            
            @Override
            public net.opengis.gml.LineStringSegmentType set(int i, net.opengis.gml.LineStringSegmentType o)
            {
                net.opengis.gml.LineStringSegmentType old = LineStringSegmentArrayPropertyTypeImpl.this.getLineStringSegmentArray(i);
                LineStringSegmentArrayPropertyTypeImpl.this.setLineStringSegmentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.LineStringSegmentType o)
                { LineStringSegmentArrayPropertyTypeImpl.this.insertNewLineStringSegment(i).set(o); }
            
            @Override
            public net.opengis.gml.LineStringSegmentType remove(int i)
            {
                net.opengis.gml.LineStringSegmentType old = LineStringSegmentArrayPropertyTypeImpl.this.getLineStringSegmentArray(i);
                LineStringSegmentArrayPropertyTypeImpl.this.removeLineStringSegment(i);
                return old;
            }
            
            @Override
            public int size()
                { return LineStringSegmentArrayPropertyTypeImpl.this.sizeOfLineStringSegmentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LineStringSegmentList();
        }
    }
    
    /**
     * Gets array of all "LineStringSegment" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.LineStringSegmentType[] getLineStringSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.LineStringSegmentType> targetList = new java.util.ArrayList<net.opengis.gml.LineStringSegmentType>();
            get_store().find_all_element_users(LINESTRINGSEGMENT$0, targetList);
            net.opengis.gml.LineStringSegmentType[] result = new net.opengis.gml.LineStringSegmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LineStringSegment" element
     */
    public net.opengis.gml.LineStringSegmentType getLineStringSegmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentType target = null;
            target = (net.opengis.gml.LineStringSegmentType)get_store().find_element_user(LINESTRINGSEGMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LineStringSegment" element
     */
    public int sizeOfLineStringSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINESTRINGSEGMENT$0);
        }
    }
    
    /**
     * Sets array of all "LineStringSegment" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setLineStringSegmentArray(net.opengis.gml.LineStringSegmentType[] lineStringSegmentArray)
    {
        check_orphaned();
        arraySetterHelper(lineStringSegmentArray, LINESTRINGSEGMENT$0);
    }
    
    /**
     * Sets ith "LineStringSegment" element
     */
     public void setLineStringSegmentArray(int i, net.opengis.gml.LineStringSegmentType lineStringSegment)
    {
        generatedSetterHelperImpl(lineStringSegment, LINESTRINGSEGMENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LineStringSegment" element
     */
    public net.opengis.gml.LineStringSegmentType insertNewLineStringSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentType target = null;
            target = (net.opengis.gml.LineStringSegmentType)get_store().insert_element_user(LINESTRINGSEGMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LineStringSegment" element
     */
    public net.opengis.gml.LineStringSegmentType addNewLineStringSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentType target = null;
            target = (net.opengis.gml.LineStringSegmentType)get_store().add_element_user(LINESTRINGSEGMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LineStringSegment" element
     */
    public void removeLineStringSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINESTRINGSEGMENT$0, i);
        }
    }
}
