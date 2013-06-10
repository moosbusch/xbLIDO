/*
 *
 *
 */
package org.moosbusch.museum.lido.inject.spi;

import org.apache.xmlbeans.XmlObject;
import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.inject.XmlModule;
import org.moosbusch.museum.inject.XmlObjectFactory;
import org.moosbusch.museum.inject.spi.AbstractXmlModule;
import org.moosbusch.museum.lido.inject.LIDOModule;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractLIDOModule extends AbstractXmlModule implements LIDOModule {

    private final String relatedEncoding;

    public AbstractLIDOModule(XmlObjectFactory<? extends XmlModule,
            ? extends XmlObject> objFactory) {
        this.relatedEncoding = initRelatedEncoding();
    }

    private String initRelatedEncoding() {
        return createRelatedEncoding();
    }

    protected abstract String createRelatedEncoding();

    @Override
    protected String createLanguage() {
        return XmlDocument.DEFAULT_LANGUAGE;
    }

    @Override
    public String getRelatedEncoding() {
        return relatedEncoding;
    }

}
