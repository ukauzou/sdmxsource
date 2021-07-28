/*******************************************************************************
 * Copyright (c) 2013 Metadata Technology Ltd.
 *
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the GNU Lesser General Public License v 3.0 
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This file is part of the SDMX Component Library.
 *
 * The SDMX Component Library is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * The SDMX Component Library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License 
 * along with The SDMX Component Library If not, see 
 * http://www.gnu.org/licenses/lgpl.
 *
 * Contributors:
 * Metadata Technology - initial API and implementation
 ******************************************************************************/
package org.sdmxsource.sdmx.structureparser.builder.xmlBeans.v21;

import org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType;
import org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType;
import org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType;
import org.sdmxsource.sdmx.api.builder.Builder;
import org.sdmxsource.sdmx.api.exception.SdmxException;
import org.sdmxsource.sdmx.api.model.beans.categoryscheme.CategorisationBean;
import org.sdmxsource.sdmx.structureparser.builder.xmlBeans.v21.assemblers.MaintainableBeanAssembler;


/**
 * The type Categorisation xml bean builder.
 */
public class CategorisationXmlBeanBuilder extends MaintainableBeanAssembler implements Builder<CategorisationType, CategorisationBean> {

    @Override
    public CategorisationType build(CategorisationBean buildFrom) throws SdmxException {
        CategorisationType returnType = CategorisationType.Factory.newInstance();

        super.assembleMaintainable(returnType, buildFrom);
        if (buildFrom.getStructureReference() != null) {
            ObjectReferenceType objRefType = returnType.addNewSource();
            super.setReference(objRefType.addNewRef(), buildFrom.getStructureReference());
        }
        if (buildFrom.getCategoryReference() != null) {
            CategoryReferenceType catRefType = returnType.addNewTarget();
            super.setReference(catRefType.addNewRef(), buildFrom.getCategoryReference());
        }
        return returnType;
    }
}
