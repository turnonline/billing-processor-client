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

package biz.turnonline.ecosystem.bill.facade;

import biz.turnonline.ecosystem.bill.facade.adaptee.BillAdaptee;
import biz.turnonline.ecosystem.bill.model.Bill;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.GetExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.ListExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;

/**
 * The billing processor guice default adaptee configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class BillingProcessorAdapteeModule
        extends AbstractModule
{
    @Override
    protected void configure()
    {
        // Bank account
        bind( new TypeLiteral<GetExecutorAdaptee<Bill>>()
        {
        } ).to( BillAdaptee.class );

        bind( new TypeLiteral<ListExecutorAdaptee<Bill>>()
        {
        } ).to( BillAdaptee.class );

        bind( new TypeLiteral<InsertExecutorAdaptee<Bill>>()
        {
        } ).to( BillAdaptee.class );

        bind( new TypeLiteral<UpdateExecutorAdaptee<Bill>>()
        {
        } ).to( BillAdaptee.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<Bill>>()
        {
        } ).to( BillAdaptee.class );
    }
}
