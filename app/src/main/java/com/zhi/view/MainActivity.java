package com.zhi.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 在代码中写布局，及将xml布局引入到代码中
 * 适用场景： 头部部分需要根据代码进行修改，底下的布局静态，基本不需要修改
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        /*  添加TextView 进 LinearLayout  */
        TextView textView = new TextView(this);
        textView.setText("我是中国人，我爱我的祖国！");
        LinearLayout.LayoutParams textParams =  new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        layout.addView(textView, textParams);
        /*  添加XML布局 进 LinearLayout  */
        layout.addView(getView());  // 添加XMl 布局

        LinearLayout.LayoutParams params =  new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        setContentView(layout, params);
    }

    public View getView(){
        return this.getLayoutInflater().inflate(R.layout.item, null);
    }
}