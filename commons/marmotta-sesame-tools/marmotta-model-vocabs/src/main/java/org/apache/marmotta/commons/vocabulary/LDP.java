/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.marmotta.commons.vocabulary;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * LDP Namespace
 */
public class LDP {

    public static final String NAMESPACE = "http://www.w3.org/ns/ldp#";

    public static final String PREFIX = "ldp";

    public static final URI BasicContainer;
    public static final URI Container;
    public static final URI contains;
    public static final URI DirectContainer;
    public static final URI hasMemberRelation;
    public static final URI IndirectContainer;
    public static final URI insertedContentRelation;
    public static final URI isMemberOfRelation;
    public static final URI member;
    public static final URI membershipResource;
    public static final URI MemberSubject;
    public static final URI NonRDFSource;
    public static final URI PreferContainment;
    public static final URI PreferEmptyContainer;
    public static final URI PreferMembership;
    public static final URI RDFSource;
    public static final URI Resource;

    static {
        //TODO: check missing terms in the vocab
        ValueFactory factory = ValueFactoryImpl.getInstance();
        BasicContainer = factory.createURI(LDP.NAMESPACE, "BasicContainer");
        Container = factory.createURI(LDP.NAMESPACE, "Container");
        contains = factory.createURI(LDP.NAMESPACE, "contains");
        DirectContainer = factory.createURI(LDP.NAMESPACE, "DirectContainer");
        hasMemberRelation = factory.createURI(LDP.NAMESPACE, "hasMemberRelation");
        IndirectContainer = factory.createURI(LDP.NAMESPACE, "IndirectContainer");
        insertedContentRelation = factory.createURI(LDP.NAMESPACE, "insertedContentRelation");
        isMemberOfRelation = factory.createURI(LDP.NAMESPACE, "isMemberOfRelation");
        member = factory.createURI(LDP.NAMESPACE, "member");
        membershipResource = factory.createURI(LDP.NAMESPACE, "membershipResource");
        MemberSubject = factory.createURI(LDP.NAMESPACE, "MemberSubject");
        NonRDFSource = factory.createURI(LDP.NAMESPACE, "NonRDFSource");
        PreferContainment = factory.createURI(LDP.NAMESPACE, "PreferContainment");
        PreferEmptyContainer = factory.createURI(LDP.NAMESPACE, "PreferEmptyContainer");
        PreferMembership = factory.createURI(LDP.NAMESPACE, "PreferMembership");
        RDFSource = factory.createURI(LDP.NAMESPACE, "RDFSource");
        Resource = factory.createURI(LDP.NAMESPACE, "Resource");
    }

}