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
package org.eclipse.che.api.watcher.server.detectors;

import org.eclipse.che.api.project.shared.dto.event.FileTrackingOperationDto;

/**
 * Describes file tracking operation call from client. There are several types of such calls:
 *
 * <ul>
 *   <li>START/STOP - tells to start/stop tracking specific file
 *   <li>SUSPEND/RESUME - tells to start/stop tracking all files registered for specific endpoint
 *   <li>MOVE - tells that file that is being tracked should be moved (renamed)
 * </ul>
 *
 * @author Roman Nikitenko
 */
public class FileTrackingOperationEvent {
  private final String endpointId;
  private final FileTrackingOperationDto fileTrackingOperation;

  FileTrackingOperationEvent(String endpointId, FileTrackingOperationDto fileTrackingOperation) {
    this.endpointId = endpointId;
    this.fileTrackingOperation = fileTrackingOperation;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public FileTrackingOperationDto getFileTrackingOperation() {
    return fileTrackingOperation;
  }
}
