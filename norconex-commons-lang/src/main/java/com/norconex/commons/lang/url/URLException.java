/* Copyright 2010-2016 Norconex Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.norconex.commons.lang.url;

/**
 * Runtime exception thrown when dealing with URL failures.
 * @author Pascal Essiembre
 */
public class URLException extends RuntimeException {

    private static final long serialVersionUID = 8484839654375152232L;

    /**
     * Constructor.
     */
    public URLException() {
        super();
    }
    /**
     * Constructor.
     * @param message exception message
     */
    public URLException(String message) {
        super(message);
    }
    /**
     * Constructor.
     * @param cause exception cause
     */
    public URLException(Throwable cause) {
        super(cause);
    }
    /**
     * Constructor.
     * @param message exception message
     * @param cause exception cause
     */
    public URLException(String message, Throwable cause) {
        super(message, cause);
    }
}
