package com.company.pivotest.web.screens.tips;

import com.haulmont.cuba.gui.screen.*;
import com.company.pivotest.entity.Tips;

@UiController("pivotest_Tips.browse")
@UiDescriptor("tips-browse.xml")
@LookupComponent("tipsesTable")
@LoadDataBeforeShow
public class TipsBrowse extends StandardLookup<Tips> {
}