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
 * An XML SequenceRuleType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.SequenceRuleType.
 */
public class SequenceRuleTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.SequenceRuleType
{
    private static final long serialVersionUID = 1L;
    
    public SequenceRuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected SequenceRuleTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ORDER$0 = 
        new javax.xml.namespace.QName("", "order");
    
    
    /**
     * Gets the "order" attribute
     */
    public net.opengis.gml.IncrementOrder.Enum getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.IncrementOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "order" attribute
     */
    public net.opengis.gml.IncrementOrder xgetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IncrementOrder target = null;
            target = (net.opengis.gml.IncrementOrder)get_store().find_attribute_user(ORDER$0);
            return target;
        }
    }
    
    /**
     * True if has "order" attribute
     */
    public boolean isSetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORDER$0) != null;
        }
    }
    
    /**
     * Sets the "order" attribute
     */
     public void setOrder(net.opengis.gml.IncrementOrder.Enum order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDER$0);
            }
            target.setEnumValue(order);
        }
    }
    
    /**
     * Sets (as xml) the "order" attribute
     */
    public void xsetOrder(net.opengis.gml.IncrementOrder order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IncrementOrder target = null;
            target = (net.opengis.gml.IncrementOrder)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                target = (net.opengis.gml.IncrementOrder)get_store().add_attribute_user(ORDER$0);
            }
            target.set(order);
        }
    }
    
    /**
     * Unsets the "order" attribute
     */
    public void unsetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORDER$0);
        }
    }
}
