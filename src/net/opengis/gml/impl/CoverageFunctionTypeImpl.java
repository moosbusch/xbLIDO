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
 * An XML CoverageFunctionType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CoverageFunctionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoverageFunctionType
{
    private static final long serialVersionUID = 1L;
    
    public CoverageFunctionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPINGRULE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MappingRule");
    private static final javax.xml.namespace.QName GRIDFUNCTION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridFunction");
    private static final org.apache.xmlbeans.QNameSet GRIDFUNCTION$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridFunction"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "IndexMap"),
    });
    
    
    /**
     * Gets the "MappingRule" element
     */
    public net.opengis.gml.StringOrRefType getMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(MAPPINGRULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MappingRule" element
     */
    public boolean isSetMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPINGRULE$0) != 0;
        }
    }
    
    /**
     * Sets the "MappingRule" element
     */
     public void setMappingRule(net.opengis.gml.StringOrRefType mappingRule)
    {
        generatedSetterHelperImpl(mappingRule, MAPPINGRULE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MappingRule" element
     */
    public net.opengis.gml.StringOrRefType addNewMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(MAPPINGRULE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MappingRule" element
     */
    public void unsetMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPINGRULE$0, 0);
        }
    }
    
    /**
     * Gets the "GridFunction" element
     */
    public net.opengis.gml.GridFunctionType getGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridFunctionType target = null;
            target = (net.opengis.gml.GridFunctionType)get_store().find_element_user(GRIDFUNCTION$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GridFunction" element
     */
    public boolean isSetGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRIDFUNCTION$3) != 0;
        }
    }
    
    /**
     * Sets the "GridFunction" element
     */
     public void setGridFunction(net.opengis.gml.GridFunctionType gridFunction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridFunctionType target = null;
            target = (net.opengis.gml.GridFunctionType)get_store().find_element_user(GRIDFUNCTION$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.GridFunctionType)get_store().add_element_user(GRIDFUNCTION$2);
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
            target = (net.opengis.gml.GridFunctionType)get_store().add_element_user(GRIDFUNCTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "GridFunction" element
     */
    public void unsetGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRIDFUNCTION$3, 0);
        }
    }
}
