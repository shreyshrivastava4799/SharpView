package com.zhaoxing.view.sharpview.slice;

import com.zhaoxing.view.sharpview.ResourceTable;
import com.zhaoxing.view.sharpview.SharpEditText;
import com.zhaoxing.view.sharpview.SharpTextView;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.colors.RgbPalette;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;

public class MainAbilitySlice extends AbilitySlice {


    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
