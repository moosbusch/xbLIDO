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
 * A document containing one GridFunction(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GridFunctionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GridFunctionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GridFunctionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDFUNCTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridFunction");
    private static final org.apache.xmlbeans.QNameSet GRIDFUNCTION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridFunction"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "IndexMap"),
    });
    
    
    /**
     * Gets the "GridFunction" element
     */
    public net.opengis.gml.GridFunctionType getGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridFunctionType target = null;
            target = (net.opengis.gml.GridFunctionType)get_store().find_element_user(GRIDFUNCTION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GridFunction" element
     */
    @Inject(optional=true) public void setGridFunction(net.opengis.gml.GridFunctionType gridFunction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridFunctionType target = null;
            target = (net.opengis.gml.GridFunctionType)get_store().find_element_user(GRIDFUNCTION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.GridFunctionType)get_store().add_element_user(GRIDFUNCTION$0);
            }
            target.set(gridFunction);
        }
    }
    
    /**
     * Appends and returns a new empty "GridFunction" element
     */
    public net.opengis.gml.GridFunctionType addNewGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridFunctionType target = null;
            target = (net.opengis.gml.GridFunctionType)get_store().add_element_user(GRIDFUNCTION$0);
            return target;
        }
    }
}
