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
 * An XML GridFunctionType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GridFunctionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GridFunctionType
{
    private static final long serialVersionUID = 1L;
    
    public GridFunctionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQUENCERULE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "sequenceRule");
    private static final javax.xml.namespace.QName STARTPOINT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "startPoint");
    
    
    /**
     * Gets the "sequenceRule" element
     */
    public net.opengis.gml.SequenceRuleType getSequenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SequenceRuleType target = null;
            target = (net.opengis.gml.SequenceRuleType)get_store().find_element_user(SEQUENCERULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sequenceRule" element
     */
    public boolean isSetSequenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCERULE$0) != 0;
        }
    }
    
    /**
     * Sets the "sequenceRule" element
     */
    @Inject(optional=true) public void setSequenceRule(net.opengis.gml.SequenceRuleType sequenceRule)
    {
        generatedSetterHelperImpl(sequenceRule, SEQUENCERULE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequenceRule" element
     */
    public net.opengis.gml.SequenceRuleType addNewSequenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SequenceRuleType target = null;
            target = (net.opengis.gml.SequenceRuleType)get_store().add_element_user(SEQUENCERULE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sequenceRule" element
     */
    public void unsetSequenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCERULE$0, 0);
        }
    }
    
    /**
     * Gets the "startPoint" element
     */
    public java.util.List getStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPOINT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "startPoint" element
     */
    public net.opengis.gml.IntegerList xgetStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(STARTPOINT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "startPoint" element
     */
    public boolean isSetStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTPOINT$2) != 0;
        }
    }
    
    /**
     * Sets the "startPoint" element
     */
    @Inject(optional=true) public void setStartPoint(java.util.List startPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPOINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTPOINT$2);
            }
            target.setListValue(startPoint);
        }
    }
    
    /**
     * Sets (as xml) the "startPoint" element
     */
    public void xsetStartPoint(net.opengis.gml.IntegerList startPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(STARTPOINT$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IntegerList)get_store().add_element_user(STARTPOINT$2);
            }
            target.set(startPoint);
        }
    }
    
    /**
     * Unsets the "startPoint" element
     */
    public void unsetStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTPOINT$2, 0);
        }
    }
}
