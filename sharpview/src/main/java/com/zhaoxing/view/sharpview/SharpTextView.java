package com.zhaoxing.view.sharpview;

import ohos.agp.components.AttrSet;
import ohos.agp.components.Text;
import ohos.app.Context;

/**
 * SharpTextView.
 */
public class SharpTextView extends Text implements SharpView {

    public SharpTextView(Context context) {
        super(context);
        init(context, null, null);
    }

    public SharpTextView(Context context, AttrSet attrs) {
        super(context, attrs);
        init(context, attrs, null);
    }

    public SharpTextView(Context context, AttrSet attrs, String defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttrSet attrs, String defStyleAttr) {
        mSharpViewRenderProxy = new SharpViewRenderProxy(this, attrs);
    }

    private SharpViewRenderProxy mSharpViewRenderProxy;

    @Override
    public SharpViewRenderProxy getRenderProxy() {
        return mSharpViewRenderProxy;
    }

}
