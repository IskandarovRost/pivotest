package com.company.pivotest.web.screens.tips;

import com.haulmont.cuba.gui.screen.*;
import com.company.pivotest.entity.Tips;

@UiController("pivotest_Tips.edit")
@UiDescriptor("tips-edit.xml")
@EditedEntityContainer("tipsDc")
@LoadDataBeforeShow
public class TipsEdit extends StandardEditor<Tips> {
}