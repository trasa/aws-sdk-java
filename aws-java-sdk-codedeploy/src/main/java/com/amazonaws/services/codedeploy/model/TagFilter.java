/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an on-premises instance tag filter.
 * </p>
 */
public class TagFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The on-premises instance tag filter key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The on-premises instance tag filter value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The on-premises instance tag filter type:
     * </p>
     * <ul>
     * <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li>
     * <li>KEY_AND_VALUE: Key and value.</li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The on-premises instance tag filter key.
     * </p>
     * 
     * @param key
     *        The on-premises instance tag filter key.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The on-premises instance tag filter key.
     * </p>
     * 
     * @return The on-premises instance tag filter key.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The on-premises instance tag filter key.
     * </p>
     * 
     * @param key
     *        The on-premises instance tag filter key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TagFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tag filter value.
     * </p>
     * 
     * @param value
     *        The on-premises instance tag filter value.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The on-premises instance tag filter value.
     * </p>
     * 
     * @return The on-premises instance tag filter value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The on-premises instance tag filter value.
     * </p>
     * 
     * @param value
     *        The on-premises instance tag filter value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TagFilter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tag filter type:
     * </p>
     * <ul>
     * <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li>
     * <li>KEY_AND_VALUE: Key and value.</li>
     * </ul>
     * 
     * @param type
     *        The on-premises instance tag filter type:</p>
     *        <ul>
     *        <li>KEY_ONLY: Key only.</li>
     *        <li>VALUE_ONLY: Value only.</li>
     *        <li>KEY_AND_VALUE: Key and value.</li>
     * @see TagFilterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The on-premises instance tag filter type:
     * </p>
     * <ul>
     * <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li>
     * <li>KEY_AND_VALUE: Key and value.</li>
     * </ul>
     * 
     * @return The on-premises instance tag filter type:</p>
     *         <ul>
     *         <li>KEY_ONLY: Key only.</li>
     *         <li>VALUE_ONLY: Value only.</li>
     *         <li>KEY_AND_VALUE: Key and value.</li>
     * @see TagFilterType
     */
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The on-premises instance tag filter type:
     * </p>
     * <ul>
     * <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li>
     * <li>KEY_AND_VALUE: Key and value.</li>
     * </ul>
     * 
     * @param type
     *        The on-premises instance tag filter type:</p>
     *        <ul>
     *        <li>KEY_ONLY: Key only.</li>
     *        <li>VALUE_ONLY: Value only.</li>
     *        <li>KEY_AND_VALUE: Key and value.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagFilterType
     */
    public TagFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tag filter type:
     * </p>
     * <ul>
     * <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li>
     * <li>KEY_AND_VALUE: Key and value.</li>
     * </ul>
     * 
     * @param type
     *        The on-premises instance tag filter type:</p>
     *        <ul>
     *        <li>KEY_ONLY: Key only.</li>
     *        <li>VALUE_ONLY: Value only.</li>
     *        <li>KEY_AND_VALUE: Key and value.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagFilterType
     */
    public void setType(TagFilterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The on-premises instance tag filter type:
     * </p>
     * <ul>
     * <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li>
     * <li>KEY_AND_VALUE: Key and value.</li>
     * </ul>
     * 
     * @param type
     *        The on-premises instance tag filter type:</p>
     *        <ul>
     *        <li>KEY_ONLY: Key only.</li>
     *        <li>VALUE_ONLY: Value only.</li>
     *        <li>KEY_AND_VALUE: Key and value.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagFilterType
     */
    public TagFilter withType(TagFilterType type) {
        setType(type);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagFilter == false)
            return false;
        TagFilter other = (TagFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null
                && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null
                && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TagFilter clone() {
        try {
            return (TagFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}