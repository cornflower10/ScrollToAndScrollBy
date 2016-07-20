package tms.cloudcashier.lakala.com.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @InjectView(R.id.tv1)
    Button tv1;
    @InjectView(R.id.tv2)
    Button tv2;
    @InjectView(R.id.bt)
    Button bt;
    @InjectView(R.id.rl)
    RelativeLayout rl;
    @InjectView(R.id.r2)
    RelativeLayout r2;
    private int x;
    private int y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.bt)
    public void onClick() {
        x = -10;
        /**
         * 控件内容移动
         */
        tv1.scrollTo(x, y);
        tv2.scrollBy(x, y);
        /**
         * viewGroup这种控件的移动
         */
//        rl.scrollTo(x, y);
//        r2.scrollBy(x, y);
    }
}
