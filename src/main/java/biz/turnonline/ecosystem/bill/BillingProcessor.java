/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
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

package biz.turnonline.ecosystem.bill;

/**
 * Service definition for BillingProcessor (v1).
 *
 * <p>
 * TurnOnline.biz Ecosystem Billing Processor
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.turnonline.biz/docs/bill.turnon.cloud/1" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link BillingProcessorRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @author Google, Inc.
 * @since 1.3
 */
public class BillingProcessor
        extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
{

    /**
     * The default encoded root URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_ROOT_URL = "https://billing-processor-dot-turn-online-eu.ew.r.appspot.com/api/";

    /**
     * The default encoded service path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_SERVICE_PATH = "bill/v1/";

    /**
     * The default encoded batch path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.23
     */
    public static final String DEFAULT_BATCH_PATH = "batch";

    /**
     * The default encoded base URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     */
    public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

    // Note: Leave this static initializer at the top of the file.
    static
    {
        com.google.api.client.util.Preconditions.checkState(
                com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
                "You are currently running with version %s of google-api-client. " +
                        "You need at least version 1.15 of google-api-client to run version " +
                        "1.25.0 of the TurnOnline.biz Billing Processor library.", com.google.api.client.googleapis.GoogleUtils.VERSION );
    }

    /**
     * Constructor.
     *
     * <p>
     * Use {@link Builder} if you need to specify any of the optional parameters.
     * </p>
     *
     * @param transport              HTTP transport, which should normally be:
     *                               <ul>
     *                               <li>Google App Engine:
     *                               {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *                               <li>Android: {@code newCompatibleTransport} from
     *                               {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *                               <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *                               </li>
     *                               </ul>
     * @param jsonFactory            JSON factory, which may be:
     *                               <ul>
     *                               <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *                               <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *                               <li>Android Honeycomb or higher:
     *                               {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *                               </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public BillingProcessor( com.google.api.client.http.HttpTransport transport,
                             com.google.api.client.json.JsonFactory jsonFactory,
                             com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
    {
        this( new Builder( transport, jsonFactory, httpRequestInitializer ) );
    }

    /**
     * @param builder builder
     */
    BillingProcessor( Builder builder )
    {
        super( builder );
    }

    @Override
    protected void initialize( com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest )
            throws java.io.IOException
    {
        super.initialize( httpClientRequest );
    }

    /**
     * An accessor for creating requests from the Bills collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code BillingProcessor bill = new BillingProcessor(...);}
     *   {@code BillingProcessor.Bills.List request = bill.bills().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Bills bills()
    {
        return new Bills();
    }

    /**
     * Builder for {@link BillingProcessor}.
     *
     * <p>
     * Implementation is not thread-safe.
     * </p>
     *
     * @since 1.3.0
     */
    public static final class Builder
            extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder
    {

        /**
         * Returns an instance of a new builder.
         *
         * @param transport              HTTP transport, which should normally be:
         *                               <ul>
         *                               <li>Google App Engine:
         *                               {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
         *                               <li>Android: {@code newCompatibleTransport} from
         *                               {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
         *                               <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
         *                               </li>
         *                               </ul>
         * @param jsonFactory            JSON factory, which may be:
         *                               <ul>
         *                               <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
         *                               <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
         *                               <li>Android Honeycomb or higher:
         *                               {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
         *                               </ul>
         * @param httpRequestInitializer HTTP request initializer or {@code null} for none
         * @since 1.7
         */
        public Builder( com.google.api.client.http.HttpTransport transport,
                        com.google.api.client.json.JsonFactory jsonFactory,
                        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
        {
            super(
                    transport,
                    jsonFactory,
                    DEFAULT_ROOT_URL,
                    DEFAULT_SERVICE_PATH,
                    httpRequestInitializer,
                    false );
            setBatchPath( DEFAULT_BATCH_PATH );
        }

        /**
         * Builds a new instance of {@link BillingProcessor}.
         */
        @Override
        public BillingProcessor build()
        {
            return new BillingProcessor( this );
        }

        @Override
        public Builder setRootUrl( String rootUrl )
        {
            return ( Builder ) super.setRootUrl( rootUrl );
        }

        @Override
        public Builder setServicePath( String servicePath )
        {
            return ( Builder ) super.setServicePath( servicePath );
        }

        @Override
        public Builder setBatchPath( String batchPath )
        {
            return ( Builder ) super.setBatchPath( batchPath );
        }

        @Override
        public Builder setHttpRequestInitializer( com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
        {
            return ( Builder ) super.setHttpRequestInitializer( httpRequestInitializer );
        }

        @Override
        public Builder setApplicationName( String applicationName )
        {
            return ( Builder ) super.setApplicationName( applicationName );
        }

        @Override
        public Builder setSuppressPatternChecks( boolean suppressPatternChecks )
        {
            return ( Builder ) super.setSuppressPatternChecks( suppressPatternChecks );
        }

        @Override
        public Builder setSuppressRequiredParameterChecks( boolean suppressRequiredParameterChecks )
        {
            return ( Builder ) super.setSuppressRequiredParameterChecks( suppressRequiredParameterChecks );
        }

        @Override
        public Builder setSuppressAllChecks( boolean suppressAllChecks )
        {
            return ( Builder ) super.setSuppressAllChecks( suppressAllChecks );
        }

        /**
         * Set the {@link BillingProcessorRequestInitializer}.
         *
         * @since 1.12
         */
        public Builder setBillingProcessorRequestInitializer(
                BillingProcessorRequestInitializer billingprocessorRequestInitializer )
        {
            return ( Builder ) super.setGoogleClientRequestInitializer( billingprocessorRequestInitializer );
        }

        @Override
        public Builder setGoogleClientRequestInitializer(
                com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer )
        {
            return ( Builder ) super.setGoogleClientRequestInitializer( googleClientRequestInitializer );
        }
    }

    /**
     * The "bills" collection of methods.
     */
    public class Bills
    {

        /**
         * Create a request for the method "bills.delete".
         * <p>
         * This request holds the parameters needed by the bill server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param billId
         * @return the request
         */
        public Delete delete( java.lang.Long billId ) throws java.io.IOException
        {
            Delete result = new Delete( billId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bills.get".
         * <p>
         * This request holds the parameters needed by the bill server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param billId
         * @return the request
         */
        public Get get( java.lang.Long billId ) throws java.io.IOException
        {
            Get result = new Get( billId );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bills.insert".
         * <p>
         * This request holds the parameters needed by the bill server.  After setting any optional
         * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
         *
         * @param content the {@link biz.turnonline.ecosystem.bill.model.Bill}
         * @return the request
         */
        public Insert insert( biz.turnonline.ecosystem.bill.model.Bill content ) throws java.io.IOException
        {
            Insert result = new Insert( content );
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bills.list".
         * <p>
         * This request holds the parameters needed by the bill server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException
        {
            List result = new List();
            initialize( result );
            return result;
        }

        /**
         * Create a request for the method "bills.update".
         * <p>
         * This request holds the parameters needed by the bill server.  After setting any optional
         * parameters, call the {@link Update#execute()} method to invoke the remote operation.
         *
         * @param billId
         * @param content the {@link biz.turnonline.ecosystem.bill.model.Bill}
         * @return the request
         */
        public Update update( java.lang.Long billId, biz.turnonline.ecosystem.bill.model.Bill content )
                throws java.io.IOException
        {
            Update result = new Update( billId, content );
            initialize( result );
            return result;
        }

        public class Delete
                extends BillingProcessorRequest<Void>
        {

            private static final String REST_PATH = "bills/{bill_id}";

            @com.google.api.client.util.Key( "bill_id" )
            private java.lang.Long billId;

            /**
             * Create a request for the method "bills.delete".
             * <p>
             * This request holds the parameters needed by the the bill server.  After setting any optional
             * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param billId
             * @since 1.13
             */
            protected Delete( java.lang.Long billId )
            {
                super( BillingProcessor.this, "DELETE", REST_PATH, null, Void.class );
                this.billId = com.google.api.client.util.Preconditions.checkNotNull( billId, "Required parameter billId must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getBillId()
            {
                return billId;
            }

            public Delete setBillId( java.lang.Long billId )
            {
                this.billId = billId;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

        public class Get
                extends BillingProcessorRequest<biz.turnonline.ecosystem.bill.model.Bill>
        {

            private static final String REST_PATH = "bills/{bill_id}";

            @com.google.api.client.util.Key( "bill_id" )
            private java.lang.Long billId;

            /**
             * Create a request for the method "bills.get".
             * <p>
             * This request holds the parameters needed by the the bill server.  After setting any optional
             * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
             * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param billId
             * @since 1.13
             */
            protected Get( java.lang.Long billId )
            {
                super( BillingProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.bill.model.Bill.class );
                this.billId = com.google.api.client.util.Preconditions.checkNotNull( billId, "Required parameter billId must be specified." );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt( java.lang.String alt )
            {
                return ( Get ) super.setAlt( alt );
            }

            @Override
            public Get setFields( java.lang.String fields )
            {
                return ( Get ) super.setFields( fields );
            }

            @Override
            public Get setKey( java.lang.String key )
            {
                return ( Get ) super.setKey( key );
            }

            @Override
            public Get setOauthToken( java.lang.String oauthToken )
            {
                return ( Get ) super.setOauthToken( oauthToken );
            }

            @Override
            public Get setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Get ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Get setQuotaUser( java.lang.String quotaUser )
            {
                return ( Get ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Get setUserIp( java.lang.String userIp )
            {
                return ( Get ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getBillId()
            {
                return billId;
            }

            public Get setBillId( java.lang.Long billId )
            {
                this.billId = billId;
                return this;
            }

            @Override
            public Get set( String parameterName, Object value )
            {
                return ( Get ) super.set( parameterName, value );
            }
        }

        public class Insert
                extends BillingProcessorRequest<biz.turnonline.ecosystem.bill.model.Bill>
        {

            private static final String REST_PATH = "bills";

            /**
             * Create a request for the method "bills.insert".
             * <p>
             * This request holds the parameters needed by the the bill server.  After setting any optional
             * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
             * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link biz.turnonline.ecosystem.bill.model.Bill}
             * @since 1.13
             */
            protected Insert( biz.turnonline.ecosystem.bill.model.Bill content )
            {
                super( BillingProcessor.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.bill.model.Bill.class );
            }

            @Override
            public Insert setAlt( java.lang.String alt )
            {
                return ( Insert ) super.setAlt( alt );
            }

            @Override
            public Insert setFields( java.lang.String fields )
            {
                return ( Insert ) super.setFields( fields );
            }

            @Override
            public Insert setKey( java.lang.String key )
            {
                return ( Insert ) super.setKey( key );
            }

            @Override
            public Insert setOauthToken( java.lang.String oauthToken )
            {
                return ( Insert ) super.setOauthToken( oauthToken );
            }

            @Override
            public Insert setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Insert ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Insert setQuotaUser( java.lang.String quotaUser )
            {
                return ( Insert ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Insert setUserIp( java.lang.String userIp )
            {
                return ( Insert ) super.setUserIp( userIp );
            }

            @Override
            public Insert set( String parameterName, Object value )
            {
                return ( Insert ) super.set( parameterName, value );
            }
        }

        public class List
                extends BillingProcessorRequest<biz.turnonline.ecosystem.bill.model.BillCollection>
        {

            private static final String REST_PATH = "bills";

            @com.google.api.client.util.Key
            private com.google.api.client.util.DateTime from;

            @com.google.api.client.util.Key
            private java.lang.Integer limit;

            @com.google.api.client.util.Key
            private com.google.api.client.util.DateTime to;

            @com.google.api.client.util.Key
            private java.lang.Boolean lightList;

            @com.google.api.client.util.Key
            private java.lang.Integer offset;

            /**
             * Create a request for the method "bills.list".
             * <p>
             * This request holds the parameters needed by the the bill server.  After setting any optional
             * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
             * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
             * called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List()
            {
                super( BillingProcessor.this, "GET", REST_PATH, null, biz.turnonline.ecosystem.bill.model.BillCollection.class );
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException
            {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException
            {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt( java.lang.String alt )
            {
                return ( List ) super.setAlt( alt );
            }

            @Override
            public List setFields( java.lang.String fields )
            {
                return ( List ) super.setFields( fields );
            }

            @Override
            public List setKey( java.lang.String key )
            {
                return ( List ) super.setKey( key );
            }

            @Override
            public List setOauthToken( java.lang.String oauthToken )
            {
                return ( List ) super.setOauthToken( oauthToken );
            }

            @Override
            public List setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( List ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public List setQuotaUser( java.lang.String quotaUser )
            {
                return ( List ) super.setQuotaUser( quotaUser );
            }

            @Override
            public List setUserIp( java.lang.String userIp )
            {
                return ( List ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public com.google.api.client.util.DateTime getFrom()
            {
                return from;
            }

            public List setFrom( com.google.api.client.util.DateTime from )
            {
                this.from = from;
                return this;
            }

            /**
             * [ default: 10]
             * [
             */
            public java.lang.Integer getLimit()
            {
                return limit;
            }

            public List setLimit( java.lang.Integer limit )
            {
                this.limit = limit;
                return this;
            }

            /**
             *
             */
            public com.google.api.client.util.DateTime getTo()
            {
                return to;
            }

            public List setTo( com.google.api.client.util.DateTime to )
            {
                this.to = to;
                return this;
            }

            /**
             * [ default: false]
             * [
             */
            public java.lang.Boolean getLightList()
            {
                return lightList;
            }

            /**
             * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
             *
             * <p>
             * Boolean properties can have four possible values:
             * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
             * or {@link Boolean#FALSE}.
             * </p>
             *
             * <p>
             * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
             * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
             * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
             * </p>
             *
             * <p>
             *
             * </p>
             */
            public boolean isLightList()
            {
                if ( lightList == null || lightList == com.google.api.client.util.Data.NULL_BOOLEAN )
                {
                    return false;
                }
                return lightList;
            }

            public List setLightList( java.lang.Boolean lightList )
            {
                this.lightList = lightList;
                return this;
            }

            /**
             * [ default: 0]
             * [
             */
            public java.lang.Integer getOffset()
            {
                return offset;
            }

            public List setOffset( java.lang.Integer offset )
            {
                this.offset = offset;
                return this;
            }

            @Override
            public List set( String parameterName, Object value )
            {
                return ( List ) super.set( parameterName, value );
            }
        }

        public class Update
                extends BillingProcessorRequest<biz.turnonline.ecosystem.bill.model.Bill>
        {

            private static final String REST_PATH = "bills/{bill_id}";

            @com.google.api.client.util.Key( "bill_id" )
            private java.lang.Long billId;

            /**
             * Create a request for the method "bills.update".
             * <p>
             * This request holds the parameters needed by the the bill server.  After setting any optional
             * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
             * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param billId
             * @param content the {@link biz.turnonline.ecosystem.bill.model.Bill}
             * @since 1.13
             */
            protected Update( java.lang.Long billId, biz.turnonline.ecosystem.bill.model.Bill content )
            {
                super( BillingProcessor.this, "PUT", REST_PATH, content, biz.turnonline.ecosystem.bill.model.Bill.class );
                this.billId = com.google.api.client.util.Preconditions.checkNotNull( billId, "Required parameter billId must be specified." );
            }

            @Override
            public Update setAlt( java.lang.String alt )
            {
                return ( Update ) super.setAlt( alt );
            }

            @Override
            public Update setFields( java.lang.String fields )
            {
                return ( Update ) super.setFields( fields );
            }

            @Override
            public Update setKey( java.lang.String key )
            {
                return ( Update ) super.setKey( key );
            }

            @Override
            public Update setOauthToken( java.lang.String oauthToken )
            {
                return ( Update ) super.setOauthToken( oauthToken );
            }

            @Override
            public Update setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Update ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Update setQuotaUser( java.lang.String quotaUser )
            {
                return ( Update ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Update setUserIp( java.lang.String userIp )
            {
                return ( Update ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getBillId()
            {
                return billId;
            }

            public Update setBillId( java.lang.Long billId )
            {
                this.billId = billId;
                return this;
            }

            @Override
            public Update set( String parameterName, Object value )
            {
                return ( Update ) super.set( parameterName, value );
            }
        }

    }
}
