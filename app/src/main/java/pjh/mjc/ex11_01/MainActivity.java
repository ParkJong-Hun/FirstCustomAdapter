package pjh.mjc.ex11_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("리스트뷰 테스트");

        final String[] mid = {"히어로즈", "24시", "로스트", "로스트룸", "스몰별", "탐정몽크",
                "빅뱅이론", "프렌즈", "덱스터", "글리", "가쉽걸", "테이큰", "슈퍼내추럴", "브이"};

        ListView listView = (ListView)findViewById(R.id.listView1);
        MyListAdapter adapter = new MyListAdapter(this, mid);
        listView.setAdapter(adapter);
    }
}