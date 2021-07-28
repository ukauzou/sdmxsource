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
package org.sdmxsource.sdmx.api.model.mutable.codelist;

import org.sdmxsource.sdmx.api.model.beans.codelist.HierarchicalCodelistBean;
import org.sdmxsource.sdmx.api.model.mutable.base.HierarchyMutableBean;
import org.sdmxsource.sdmx.api.model.mutable.base.MaintainableMutableBean;
import org.sdmxsource.sdmx.api.model.mutable.reference.CodelistRefMutableBean;

import java.util.List;


/**
 * The interface Hierarchical codelist mutable bean.
 */
public interface HierarchicalCodelistMutableBean extends MaintainableMutableBean {

    /**
     * Gets hierarchies.
     *
     * @return the hierarchies
     */
    List<HierarchyMutableBean> getHierarchies();

    /**
     * Sets hierarchies.
     *
     * @param hierarchies the hierarchies
     */
    void setHierarchies(List<HierarchyMutableBean> hierarchies);

    /**
     * Gets codelist ref.
     *
     * @return the codelist ref
     */
    List<CodelistRefMutableBean> getCodelistRef();

    /**
     * Sets codelist ref.
     *
     * @param codelistRefs the codelist refs
     */
    void setCodelistRef(List<CodelistRefMutableBean> codelistRefs);

    /**
     * Add hierarchies.
     *
     * @param hierarchy the hierarchy
     */
    void addHierarchies(HierarchyMutableBean hierarchy);

    /**
     * Add codelist ref.
     *
     * @param codelistRef the codelist ref
     */
    void addCodelistRef(CodelistRefMutableBean codelistRef);

    /**
     * Returns a representation of itself in a bean which can not be modified, modifications to the mutable bean
     * are not reflected in the returned instance of the MaintainableBean.
     */
    @Override
    HierarchicalCodelistBean getImmutableInstance();
}
