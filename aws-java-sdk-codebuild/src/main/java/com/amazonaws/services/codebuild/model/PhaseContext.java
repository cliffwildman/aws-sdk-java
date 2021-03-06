/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Additional information about a build phase that has an error, which you can use to help troubleshoot a failed build.
 * </p>
 */
public class PhaseContext implements Serializable, Cloneable {

    /**
     * <p>
     * The status code for the context of the build phase.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * An explanation of the build phase's context. This explanation may include a command ID and an exit code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code for the context of the build phase.
     * </p>
     * 
     * @param statusCode
     *        The status code for the context of the build phase.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code for the context of the build phase.
     * </p>
     * 
     * @return The status code for the context of the build phase.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code for the context of the build phase.
     * </p>
     * 
     * @param statusCode
     *        The status code for the context of the build phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhaseContext withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * An explanation of the build phase's context. This explanation may include a command ID and an exit code.
     * </p>
     * 
     * @param message
     *        An explanation of the build phase's context. This explanation may include a command ID and an exit code.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanation of the build phase's context. This explanation may include a command ID and an exit code.
     * </p>
     * 
     * @return An explanation of the build phase's context. This explanation may include a command ID and an exit code.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An explanation of the build phase's context. This explanation may include a command ID and an exit code.
     * </p>
     * 
     * @param message
     *        An explanation of the build phase's context. This explanation may include a command ID and an exit code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhaseContext withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhaseContext == false)
            return false;
        PhaseContext other = (PhaseContext) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public PhaseContext clone() {
        try {
            return (PhaseContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
