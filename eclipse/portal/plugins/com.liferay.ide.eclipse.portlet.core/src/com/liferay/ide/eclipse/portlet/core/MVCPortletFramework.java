/*******************************************************************************
 * Copyright (c) 2010-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.eclipse.portlet.core;

import com.liferay.ide.eclipse.project.core.AbstractPortletFramework;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;

/**
 * @author Greg Amerson
 */
public class MVCPortletFramework extends AbstractPortletFramework {

	public MVCPortletFramework() {
		super();
	}

	public IStatus configureNewProject(IDataModel dataModel, IFacetedProjectWorkingCopy facetedProject) {
		// nothing to do for MVCPortlet projects its already properly configured.

		return Status.OK_STATUS;
	}

}
