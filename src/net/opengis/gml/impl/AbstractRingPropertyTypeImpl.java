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
 * An XML AbstractRingPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractRingPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AbstractRingPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractRingPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring");
    private static final org.apache.xmlbeans.QNameSet RING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ring"),
    });
    
    
    /**
     * Gets the "_Ring" element
     */
    public net.opengis.gml.AbstractRingType getRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().find_element_user(RING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Ring" element
     */
    @Inject(optional=true) public void setRing(net.opengis.gml.AbstractRingType ring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().find_element_user(RING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractRingType)get_store().add_element_user(RING$0);
            }
            target.set(ring);
        }
    }
    
    /**
     * Appends and returns a new empty "_Ring" element
     */
    public net.opengis.gml.AbstractRingType addNewRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().add_element_user(RING$0);
            return target;
        }
    }
}
