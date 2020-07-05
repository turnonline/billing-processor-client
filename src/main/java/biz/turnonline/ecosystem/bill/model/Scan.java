/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
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
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-10-08 17:45:39 UTC)
 * on 2020-07-05 at 12:57:23 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.bill.model;

/**
 * Model definition for Scan.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Billing Processor. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class Scan
        extends com.google.api.client.json.GenericJson
{
    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer order;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String servingUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String storageName;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getOrder()
    {
        return order;
    }

    /**
     * @param order order or {@code null} for none
     */
    public Scan setOrder( java.lang.Integer order )
    {
        this.order = order;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getServingUrl()
    {
        return servingUrl;
    }

    /**
     * @param servingUrl servingUrl or {@code null} for none
     */
    public Scan setServingUrl( java.lang.String servingUrl )
    {
        this.servingUrl = servingUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStorageName()
    {
        return storageName;
    }

    /**
     * @param storageName storageName or {@code null} for none
     */
    public Scan setStorageName( java.lang.String storageName )
    {
        this.storageName = storageName;
        return this;
    }

    @Override
    public Scan set( String fieldName, Object value )
    {
        return ( Scan ) super.set( fieldName, value );
    }

    @Override
    public Scan clone()
    {
        return ( Scan ) super.clone();
    }

}
