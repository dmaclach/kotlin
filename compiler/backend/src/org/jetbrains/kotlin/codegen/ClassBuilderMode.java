/*
 * Copyright 2010-2015 JetBrains s.r.o.
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
 */

package org.jetbrains.kotlin.codegen;

public class ClassBuilderMode {
    public final boolean generateBodies;
    public final boolean generateSourceRetentionAnnotations;

    private ClassBuilderMode(
            boolean generateBodies,
            boolean generateSourceRetentionAnnotations
    ) {
        this.generateBodies = generateBodies;
        this.generateSourceRetentionAnnotations = generateSourceRetentionAnnotations;
    }

    /**
     * Full function bodies
     */
    public final static ClassBuilderMode FULL = new ClassBuilderMode(
            /* bodies = */ true,
            /* sourceRetention = */ false
    );

    /**
     * Generating light classes: Only function signatures
     */
    public final static ClassBuilderMode LIGHT_CLASSES = new ClassBuilderMode(
            /* bodies = */ false,
            /* sourceRetention = */ true
    );

    /**
     * Same as light classes: Only function signatures
     */
    public final static ClassBuilderMode KAPT3 = new ClassBuilderMode(
            /* bodies = */ false,
            /* sourceRetention = */ true
    );
}
