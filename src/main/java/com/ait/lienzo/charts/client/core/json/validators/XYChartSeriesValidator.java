/*
   Copyright (c) 2014,2015,2016 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
   Author: Roger Martinez - Red Hat
 */

package com.ait.lienzo.charts.client.core.json.validators;

import com.ait.lienzo.client.core.shape.json.validators.ColorValidator;
import com.ait.lienzo.client.core.shape.json.validators.ObjectValidator;
import com.ait.lienzo.client.core.shape.json.validators.StringValidator;

public final class XYChartSeriesValidator extends ObjectValidator
{
    public static final XYChartSeriesValidator INSTANCE = new XYChartSeriesValidator();

    public XYChartSeriesValidator()
    {
        super("xyChartData");

        addAttribute("name", StringValidator.INSTANCE, false);

        addAttribute("color", ColorValidator.INSTANCE, true);

        addAttribute("valuesAxisProperty", AxisValidator.INSTANCE, true);
    }
}