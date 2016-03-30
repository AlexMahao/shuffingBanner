package mahao.alex.shuffingbanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {


    private ShufBanner mShufBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> mImages = new ArrayList<>();
        mImages.add("http://pic.huodongjia.com/event/2015-11-18/event151612.jpg");
        mImages.add("http://pic.huodongjia.com/event/2016-03-17/event177131.jpg");
        mImages.add("http://pic.huodongjia.com/event/2015-12-03/event156106.jpg");


        mShufBanner = ((ShufBanner) findViewById(R.id.shuf));

        //启动轮播图
        mShufBanner.startShuf(mImages,true);


        //设置监听
        mShufBanner.setItemClcikListener(new ShufBannerClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
