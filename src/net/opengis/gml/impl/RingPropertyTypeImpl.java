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
 * An XML RingPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class RingPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.RingPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public RingPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ring");
    
    
    /**
     * Gets the "Ring" element
     */
    public net.opengis.gml.RingType getRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RingType target = null;
            target = (net.opengis.gml.RingType)get_store().find_element_user(RING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ring" element
     */
     public void setRing(net.opengis.gml.RingType ring)
    {
        generatedSetterHelperImpl(ring, RING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Ring" element
     */
    public net.opengis.gml.RingType addNewRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RingType target = null;
            target = (net.opengis.gml.RingType)get_store().add_element_user(RING$0);
            return target;
        }
    }
}
