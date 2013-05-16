/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.lido.inject.spi;

import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;
import org.moosbusch.museum.lido.inject.LIDOModule;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractLIDOModule extends AbstractMuseumXmlModule implements LIDOModule {

    @Override
    protected String createLanguage() {
        return MuseumXmlDocument.DEFAULT_LANGUAGE;
    }
}
