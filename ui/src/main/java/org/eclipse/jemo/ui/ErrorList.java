/*
 ********************************************************************************
 * Copyright (c) 9th November 2018 Cloudreach Limited Europe
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package org.eclipse.jemo.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * @author christopher stura
 */
public class ErrorList {
    private List<ApplicationError> errorList = new ArrayList<>();

    public boolean hasErrors() {
        return !errorList.isEmpty();
    }

    public ApplicationError addError(String key, String message) {
        ApplicationError error = new ApplicationError(key, message);
        errorList.add(error);
        return error;
    }

    @Override
    public String toString() {
        return "ErrorList{" + "errorList=" + errorList + '}';
    }

    public List<ApplicationError> getErrorList() {
        return errorList;
    }
}
