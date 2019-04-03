package supersports.com.lib_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ssports.common.entity.main.UserInfoEntity;

import supersports.com.lib_news.debug.MainActivity;

@Route(path = "/news/news_activity")
public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        UserInfoEntity userInfoEntity= (UserInfoEntity) getIntent().getSerializableExtra("entity");
        Toast.makeText(NewsActivity.this,userInfoEntity.getUserName(),Toast.LENGTH_LONG).show();
    }
}
