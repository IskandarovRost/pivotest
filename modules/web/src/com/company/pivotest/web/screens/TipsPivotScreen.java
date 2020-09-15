package com.company.pivotest.web.screens;

import com.company.pivotest.entity.Tips;
import com.haulmont.charts.gui.components.pivot.PivotTable;
import com.haulmont.charts.gui.model.JsFunction;
import com.haulmont.charts.gui.pivottable.model.DerivedProperties;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.List;

@LoadDataBeforeShow
@UiController("pivotest_TipsPivotScreen")
@UiDescriptor("tips-pivot-screen.xml")
public class TipsPivotScreen extends Screen {




    @Inject
    private PivotTable tipsCustomAggregatorPivotTable;

    @Subscribe
    protected void onInit(InitEvent event) {
        tipsCustomAggregatorPivotTable.setSortersFunction(
                new JsFunction("function(attr){if(attr == \"Day\"){return $.pivotUtilities.sortAs([\"Mon\",\"Tue\",\"Wed\",\"Thu\",\"Fri\",\"Sat\",\"Sun\"]);}}"));

        tipsCustomAggregatorPivotTable.getAggregation().setFunction(
                new JsFunction("$.pivotUtilities.aggregators[\"Sum\"]([\"Tip\"])"));

        DerivedProperties derivedProperties = new DerivedProperties();
        derivedProperties.addAttribute("Smokes",
                new JsFunction("function(record) {return record.Smoker == \"Yes\" ? \"True\" : \"False\";}"));
        tipsCustomAggregatorPivotTable.setDerivedProperties(derivedProperties);
    }
}





        


    
    
