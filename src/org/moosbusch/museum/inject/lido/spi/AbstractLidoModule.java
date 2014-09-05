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
package org.moosbusch.museum.inject.lido.spi;

import org.apache.xmlbeans.XmlObject;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.MuseumXmlModule;
import org.moosbusch.museum.inject.MuseumXmlObjectFactory;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;
import org.moosbusch.museum.inject.lido.LidoModule;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractLidoModule extends AbstractMuseumXmlModule implements LidoModule {

    private final String relatedEncoding;

    public AbstractLidoModule(MuseumXmlObjectFactory<? extends MuseumXmlModule,
            ? extends XmlObject> objFactory) {
        this.relatedEncoding = initRelatedEncoding();
    }

    private String initRelatedEncoding() {
        return createRelatedEncoding();
    }

    protected abstract String createRelatedEncoding();

    @Override
    protected String createLanguage() {
        return MuseumXmlDocument.DEFAULT_LANGUAGE;
    }

    @Override
    public String getRelatedEncoding() {
        return relatedEncoding;
    }

}
