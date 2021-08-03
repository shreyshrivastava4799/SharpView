package com.zhaoxing.view.sharpview;

import ohos.aafwk.ability.delegation.AbilityDelegatorRegistry;
import ohos.agp.colors.RgbColor;
import ohos.agp.colors.RgbPalette;
import ohos.agp.components.Attr;
import ohos.agp.components.AttrSet;
import ohos.agp.components.Image;
import ohos.agp.components.element.ShapeElement;
import ohos.app.Context;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.manipulation.Ordering;

import java.util.Optional;

import static java.lang.Math.abs;
import static org.junit.Assert.*;

public class SharpDrawableTest {

    private Context context;
    private AttrSet attrSet;
    private Image image;
    private SharpDrawable sharpDrawable;

    @Before
    public void setUp() {
        context = AbilityDelegatorRegistry.getAbilityDelegator().getAppContext();
        attrSet = new AttrSet() {
            @Override
            public Optional<String> getStyle() {
                return Optional.empty();
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public Optional<Attr> getAttr(int i) {
                return Optional.empty();
            }

            @Override
            public Optional<Attr> getAttr(String s) {
                return Optional.empty();
            }
        };
        image = new Image(context, attrSet);
        sharpDrawable = new SharpDrawable(ShapeElement.Orientation.LEFT_TO_RIGHT, image);
    }

    @Test
    public void setBgColor() {
        RgbColor[] rgbColors = new RgbColor[]{RgbPalette.BLUE, RgbPalette.GREEN};
        sharpDrawable.setBgColor(rgbColors);
        assertArrayEquals(rgbColors, sharpDrawable.getmBgColor());
    }

    @Test
    public void setCornerRadius() {
        float radius = 10;
        sharpDrawable.setCornerRadius(radius);
        assertSame(radius, sharpDrawable.getmCornerRadius());
    }

    @Test
    public void setCornerRadii() {
        float[] radii = {1, 1, 1, 1, 1, 1, 1, 1};
        sharpDrawable.setCornerRadii(radii);
        assertArrayEquals(radii, sharpDrawable.getmCornerRadii(), 1);
    }

    @Test
    public void setArrowDirection() {
        sharpDrawable.setArrowDirection(SharpView.ArrowDirection.LEFT);
        assertSame(SharpView.ArrowDirection.LEFT, sharpDrawable.getmArrowDirection());
    }

    @Test
    public void setRelativePosition() {
        double relativePosition = 0.5;
        sharpDrawable.setRelativePosition((float) relativePosition);
        assertTrue(abs(relativePosition-sharpDrawable.getmRelativePosition()) < 0.5);
    }

    @Test
    public void setBorder() {
        float border = 10;
        sharpDrawable.setBorder(border);
        assertTrue(abs(border-sharpDrawable.getmBorder()) < 0.5);
    }

    @Test
    public void setBorderColor() {
        sharpDrawable.setBorderColor(RgbPalette.BLACK);
        assertSame(RgbPalette.BLACK, sharpDrawable.getmBorderColor());
    }

    @Test
    public void setSharpSize() {
        float sharpSize = 10;
        sharpDrawable.setSharpSize(sharpSize);
        assertTrue(abs(sharpSize-sharpDrawable.getmSharpSize()) < 0.5);
    }
}