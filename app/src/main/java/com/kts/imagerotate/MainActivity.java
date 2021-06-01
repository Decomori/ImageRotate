package com.kts.imagerotate;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editAngle;
    ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("관광지");

        // 위젯 대입
        editAngle = (EditText) findViewById(R.id.edtAngle);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    @Override   // 앱이 실행되면 메뉴의 내용을 xml 파일에서 읽어옴
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater(); // 메뉴 인플레이터 생성
        mInflater.inflate(R.menu.menu1, menu); // 메뉴 xml 파일 등록
        return true;
    }
    // 메뉴 선택 동작
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRotate:
                imageView.setRotation(Float.parseFloat(editAngle.getText().toString())); // 이미지 회전
                return true;
            case R.id.item1:
                imageView.setImageResource(R.drawable.hanrasan); // 한라산 사진으로 변경
                return true;
            case R.id.item2:
                imageView.setImageResource(R.drawable.choojado); // 추자도 사진으로 변경
                return true;
            case R.id.item3:
                imageView.setImageResource(R.drawable.bumseom); // 범섬 사진으로 변경
                return true;
        }
        return false;
    }
}
