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
package org.w3.x1999.xlink.impl;
/**
 * An XML toType(@http://www.w3.org/1999/xlink).
 *
 * This is an atomic type that is a restriction of org.w3.x1999.xlink.ToType.
 */
public class ToTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.w3.x1999.xlink.ToType
{
    private static final long serialVersionUID = 1L;
    
    public ToTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ToTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
