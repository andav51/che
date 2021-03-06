/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.git.exception;

import java.util.Map;
import org.eclipse.che.api.core.rest.shared.dto.ServiceError;

public class GitInvalidRepositoryException extends GitException {

  public GitInvalidRepositoryException(String message) {
    super(message);
  }

  public GitInvalidRepositoryException(String message, Throwable cause) {
    super(message, cause);
  }

  public GitInvalidRepositoryException(Throwable cause) {
    super(cause);
  }

  public GitInvalidRepositoryException(String message, int errorCode) {
    super(message, errorCode);
  }

  public GitInvalidRepositoryException(ServiceError serviceError) {
    super(serviceError);
  }

  public GitInvalidRepositoryException(
      String message, int errorCode, Map<String, String> attributes) {
    super(message, errorCode, attributes);
  }
}
