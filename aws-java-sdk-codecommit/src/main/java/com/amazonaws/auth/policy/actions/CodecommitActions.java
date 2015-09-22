/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for CodeCommit.
 */

public enum CodecommitActions implements Action {

    /** Represents any action executed on CodeCommit. */
    AllCodecommitActions("codecommit:*"),

    /** Action for the BatchGetRepositories operation. */
    BatchGetRepositories("codecommit:BatchGetRepositories"),
    /** Action for the CreateBranch operation. */
    CreateBranch("codecommit:CreateBranch"),
    /** Action for the CreateRepository operation. */
    CreateRepository("codecommit:CreateRepository"),
    /** Action for the DeleteRepository operation. */
    DeleteRepository("codecommit:DeleteRepository"),
    /** Action for the GetBranch operation. */
    GetBranch("codecommit:GetBranch"),
    /** Action for the GetRepository operation. */
    GetRepository("codecommit:GetRepository"),
    /** Action for the ListBranches operation. */
    ListBranches("codecommit:ListBranches"),
    /** Action for the ListRepositories operation. */
    ListRepositories("codecommit:ListRepositories"),
    /** Action for the UpdateDefaultBranch operation. */
    UpdateDefaultBranch("codecommit:UpdateDefaultBranch"),
    /** Action for the UpdateRepositoryDescription operation. */
    UpdateRepositoryDescription("codecommit:UpdateRepositoryDescription"),
    /** Action for the UpdateRepositoryName operation. */
    UpdateRepositoryName("codecommit:UpdateRepositoryName"),

    ;

    private final String action;

    private CodecommitActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}