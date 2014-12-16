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
 * An XML AbstractPositionalAccuracyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractPositionalAccuracyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AbstractPositionalAccuracyType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractPositionalAccuracyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "measureDescription");
    
    
    /**
     * Gets the "measureDescription" element
     */
    public net.opengis.gml.CodeType getMeasureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(MEASUREDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "measureDescription" element
     */
    public boolean isSetMeasureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "measureDescription" element
     */
     public void setMeasureDescription(net.opengis.gml.CodeType measureDescription)
    {
        generatedSetterHelperImpl(measureDescription, MEASUREDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "measureDescription" element
     */
    public net.opengis.gml.CodeType addNewMeasureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(MEASUREDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "measureDescription" element
     */
    public void unsetMeasureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDESCRIPTION$0, 0);
        }
    }
}
