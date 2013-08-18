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
 * A document containing one target(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TargetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public TargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "target");
    private static final org.apache.xmlbeans.QNameSet TARGET$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "target"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "subject"),
    });
    
    
    /**
     * Gets the "target" element
     */
    public net.opengis.gml.TargetPropertyType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TargetPropertyType target = null;
            target = (net.opengis.gml.TargetPropertyType)get_store().find_element_user(TARGET$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "target" element
     */
    @Inject(optional=true) public void setTarget(net.opengis.gml.TargetPropertyType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TargetPropertyType target = null;
            target = (net.opengis.gml.TargetPropertyType)get_store().find_element_user(TARGET$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.TargetPropertyType)get_store().add_element_user(TARGET$0);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "target" element
     */
    public net.opengis.gml.TargetPropertyType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TargetPropertyType target = null;
            target = (net.opengis.gml.TargetPropertyType)get_store().add_element_user(TARGET$0);
            return target;
        }
    }
}
