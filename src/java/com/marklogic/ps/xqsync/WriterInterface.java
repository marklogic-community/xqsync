/** -*- mode: java; indent-tabs-mode: nil; c-basic-offset: 4; -*-
 *
 * Copyright (c) 2008-2012 MarkLogic Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The use of the Apache License does not indicate that this project is
 * affiliated with the Apache Software Foundation.
 */
package com.marklogic.ps.xqsync;

/**
 * @author Michael Blakeley, michael.blakeley@marklogic.com
 * 
 */
public interface WriterInterface {

    /**
     * @param _outputUri
     * @param _contentBytes
     * @param _metadata
     * @return
     * 
     * returns the number of Bytes written
     * @throws SyncException 
     */
    int write(String _outputUri, byte[] _contentBytes,
            XQSyncDocumentMetadata _metadata) throws SyncException;

    /**
     * This version is able to write multiple documents.  Depending on
     * subclass's implementation, the multiple writes may or may not
     * occur within a single txn.
     *
     * @param _outputUri[]
     * @param _contentBytes[][]
     * @param _metadata[]
     * @return
     * 
     * returns the number of Bytes written
     * @throws SyncException 
     */
    int write(String[] _outputUri, byte[][] _contentBytes,
	      XQSyncDocumentMetadata[] _metadata) throws SyncException;

}
