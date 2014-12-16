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
 * A document containing one obliqueCartesianCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ObliqueCartesianCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ObliqueCartesianCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObliqueCartesianCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBLIQUECARTESIANCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "obliqueCartesianCSRef");
    
    
    /**
     * Gets the "obliqueCartesianCSRef" element
     */
    public net.opengis.gml.ObliqueCartesianCSRefType getObliqueCartesianCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObliqueCartesianCSRefType target = null;
            target = (net.opengis.gml.ObliqueCartesianCSRefType)get_store().find_element_user(OBLIQUECARTESIANCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obliqueCartesianCSRef" element
     */
     public void setObliqueCartesianCSRef(net.opengis.gml.ObliqueCartesianCSRefType obliqueCartesianCSRef)
    {
        generatedSetterHelperImpl(obliqueCartesianCSRef, OBLIQUECARTESIANCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "obliqueCartesianCSRef" element
     */
    public net.opengis.gml.ObliqueCartesianCSRefType addNewObliqueCartesianCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObliqueCartesianCSRefType target = null;
            target = (net.opengis.gml.ObliqueCartesianCSRefType)get_store().add_element_user(OBLIQUECARTESIANCSREF$0);
            return target;
        }
    }
}
