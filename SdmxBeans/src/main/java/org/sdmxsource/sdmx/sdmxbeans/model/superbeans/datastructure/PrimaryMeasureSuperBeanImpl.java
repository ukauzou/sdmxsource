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
package org.sdmxsource.sdmx.sdmxbeans.model.superbeans.datastructure;

import org.sdmxsource.sdmx.api.model.beans.datastructure.PrimaryMeasureBean;
import org.sdmxsource.sdmx.api.model.superbeans.codelist.CodelistSuperBean;
import org.sdmxsource.sdmx.api.model.superbeans.conceptscheme.ConceptSuperBean;
import org.sdmxsource.sdmx.api.model.superbeans.datastructure.PrimaryMeasureSuperBean;
import org.sdmxsource.sdmx.sdmxbeans.model.superbeans.base.ComponentSuperBeanImpl;


/**
 * The type Primary measure super bean.
 */
public class PrimaryMeasureSuperBeanImpl extends ComponentSuperBeanImpl implements PrimaryMeasureSuperBean {
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Primary measure super bean.
     *
     * @param primaryMeasureBean the primary measure bean
     * @param codelistBean       the codelist bean
     * @param conceptSuperBean   the concept super bean
     */
    public PrimaryMeasureSuperBeanImpl(PrimaryMeasureBean primaryMeasureBean, CodelistSuperBean codelistBean, ConceptSuperBean conceptSuperBean) {
        super(primaryMeasureBean, codelistBean, conceptSuperBean);
    }


}
