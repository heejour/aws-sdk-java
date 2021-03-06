/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DeleteSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSecretRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * (Optional) Specifies the number of days that AWS Secrets Manager waits before it can delete the secret.
     * </p>
     * <p>
     * This value can range from 7 to 30 days. The default value is 30.
     * </p>
     */
    private Long recoveryWindowInDays;

    /**
     * <p>
     * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     *        friendly name of the secret.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * 
     * @return Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or
     *         the friendly name of the secret.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     * friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the
     *        friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the number of days that AWS Secrets Manager waits before it can delete the secret.
     * </p>
     * <p>
     * This value can range from 7 to 30 days. The default value is 30.
     * </p>
     * 
     * @param recoveryWindowInDays
     *        (Optional) Specifies the number of days that AWS Secrets Manager waits before it can delete the
     *        secret.</p>
     *        <p>
     *        This value can range from 7 to 30 days. The default value is 30.
     */

    public void setRecoveryWindowInDays(Long recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
    }

    /**
     * <p>
     * (Optional) Specifies the number of days that AWS Secrets Manager waits before it can delete the secret.
     * </p>
     * <p>
     * This value can range from 7 to 30 days. The default value is 30.
     * </p>
     * 
     * @return (Optional) Specifies the number of days that AWS Secrets Manager waits before it can delete the
     *         secret.</p>
     *         <p>
     *         This value can range from 7 to 30 days. The default value is 30.
     */

    public Long getRecoveryWindowInDays() {
        return this.recoveryWindowInDays;
    }

    /**
     * <p>
     * (Optional) Specifies the number of days that AWS Secrets Manager waits before it can delete the secret.
     * </p>
     * <p>
     * This value can range from 7 to 30 days. The default value is 30.
     * </p>
     * 
     * @param recoveryWindowInDays
     *        (Optional) Specifies the number of days that AWS Secrets Manager waits before it can delete the
     *        secret.</p>
     *        <p>
     *        This value can range from 7 to 30 days. The default value is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSecretRequest withRecoveryWindowInDays(Long recoveryWindowInDays) {
        setRecoveryWindowInDays(recoveryWindowInDays);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getRecoveryWindowInDays() != null)
            sb.append("RecoveryWindowInDays: ").append(getRecoveryWindowInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSecretRequest == false)
            return false;
        DeleteSecretRequest other = (DeleteSecretRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getRecoveryWindowInDays() == null ^ this.getRecoveryWindowInDays() == null)
            return false;
        if (other.getRecoveryWindowInDays() != null && other.getRecoveryWindowInDays().equals(this.getRecoveryWindowInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getRecoveryWindowInDays() == null) ? 0 : getRecoveryWindowInDays().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSecretRequest clone() {
        return (DeleteSecretRequest) super.clone();
    }

}
