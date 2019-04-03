package supersports.com.lib_main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.ssports.common.base.BaseActivity;
import com.ssports.common.entity.main.UserInfoEntity;

import supersports.com.lib_entity.R;


public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.txt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserInfoEntity userInfoEntity = new UserInfoEntity();
                userInfoEntity.setUserName("张三");
                userInfoEntity.setMsg("请求成功");
                userInfoEntity.setResultCode(200);
                //发起路由跳转
                ARouter.getInstance().build("/news/news_activity")
                        .withSerializable("entity", userInfoEntity)
                        .navigation();
            }
        });


    }
}
