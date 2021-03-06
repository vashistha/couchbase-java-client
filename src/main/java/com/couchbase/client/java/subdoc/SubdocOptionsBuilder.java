/*
 * Copyright (c) 2017 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.couchbase.client.java.subdoc;

import com.couchbase.client.core.annotations.InterfaceAudience;
import com.couchbase.client.core.annotations.InterfaceStability;

/**
 * Sub-document options builder. Options supported are
 *  createParents
 * 	xattr
 *
 * @author Subhashni Balakrishnan
 * @since 2.4.2
 */
@InterfaceStability.Uncommitted
@InterfaceAudience.Public
public class SubdocOptionsBuilder {
    private boolean createParents;
    private boolean xattr;

    public SubdocOptionsBuilder() {
    }

    public static SubdocOptionsBuilder builder() {
        return new SubdocOptionsBuilder();
    }

    /**
     * Set createParents to true to create missing intermediary nodes, else false.
     */
    public SubdocOptionsBuilder createParents(boolean createParents) {
        this.createParents = createParents;
        return this;
    }

    /**
     * Get createParents value set on builder
     */
    public boolean createParents() {
        return this.createParents;
    }

    /**
     * Set xattr to true to accessing extended attributes, else false.
     */
    @InterfaceStability.Experimental
    public SubdocOptionsBuilder xattr(boolean xattr) {
        this.xattr = xattr;
        return this;
    }

    /**
     * Get xattr value set on builder
     */
    public boolean xattr() {
        return this.xattr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(" \"createParents\": " + createParents);
        sb.append(", \"xattr\":" + xattr);
        sb.append("}");
        return sb.toString();
    }
}