/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
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

package org.uberfire.ext.security.management.client.widgets.management.events;

import org.uberfire.workbench.events.UberFireEvent;

/**
 * <p>User ask for deleting an instance.</p>
 * @since 0.8.0
 */
public class OnDeleteEvent extends ContextualEvent implements UberFireEvent {

    private Object instance;

    public OnDeleteEvent(Object context,
                         Object instance) {
        super(context);
        this.instance = instance;
    }

    public Object getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "OnDeleteEvent [context=" + getContext() + "]";
    }
}
