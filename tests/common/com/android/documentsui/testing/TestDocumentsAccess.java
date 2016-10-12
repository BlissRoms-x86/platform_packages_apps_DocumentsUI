/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.documentsui.testing;

import android.net.Uri;

import com.android.documentsui.DocumentsAccess;
import com.android.documentsui.base.DocumentInfo;
import com.android.documentsui.base.RootInfo;

import javax.annotation.Nullable;

public class TestDocumentsAccess implements DocumentsAccess {

    public @Nullable DocumentInfo nextRootDocument;
    public @Nullable DocumentInfo nextDocument;

    @Override
    public DocumentInfo getRootDocument(Uri uri) {
        return nextRootDocument;
    }

    @Override
    public DocumentInfo getRootDocument(RootInfo root) {
        return nextRootDocument;
    }

    @Override
    public DocumentInfo getDocument(Uri uri) {
        return nextDocument;
    }

    @Override
    public DocumentInfo getArchiveDocument(Uri uri) {
        return nextDocument;
    }
}