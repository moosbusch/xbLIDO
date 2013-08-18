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
 * A document containing one _TopoPrimitive(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoPrimitiveDocumentImpl extends net.opengis.gml.impl.TopologyDocumentImpl implements net.opengis.gml.TopoPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive");
    private static final org.apache.xmlbeans.QNameSet TOPOPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Node"),
    });
    
    
    /**
     * Gets the "_TopoPrimitive" element
     */
    public net.opengis.gml.AbstractTopoPrimitiveType getTopoPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().find_element_user(TOPOPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TopoPrimitive" element
     */
    @Inject(optional=true) public void setTopoPrimitive(net.opengis.gml.AbstractTopoPrimitiveType topoPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().find_element_user(TOPOPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().add_element_user(TOPOPRIMITIVE$0);
            }
            target.set(topoPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "_TopoPrimitive" element
     */
    public net.opengis.gml.AbstractTopoPrimitiveType addNewTopoPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().add_element_user(TOPOPRIMITIVE$0);
            return target;
        }
    }
}
