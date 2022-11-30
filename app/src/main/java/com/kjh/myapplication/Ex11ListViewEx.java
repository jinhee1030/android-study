package com.kjh.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Ex11ListViewEx extends AppCompatActivity {
    private String TAG = "리스트뷰예제";
    private ListView listview = null;
    private ListViewAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex11_list_view_ex);

        listview = (ListView) findViewById(R.id.listview);
        adapter = new ListViewAdapter();

        //Adapter 안에 아이템의 정보 담기
        adapter.addItem(new Ex11BearItem("1", "곰돌이", R.drawable.b1));
        adapter.addItem(new Ex11BearItem("2", "흰돌이", R.drawable.b2));
        adapter.addItem(new Ex11BearItem("3", "이쁜이", R.drawable.b3));
        adapter.addItem(new Ex11BearItem("4", "하양이", R.drawable.b4));
        adapter.addItem(new Ex11BearItem("5", "갈색이", R.drawable.b5));
        adapter.addItem(new Ex11BearItem("6", "어깨깡", R.drawable.b6));
        adapter.addItem(new Ex11BearItem("7", "어깡이", R.drawable.b7));
        adapter.addItem(new Ex11BearItem("8", "귀요미", R.drawable.b8));

        //리스트뷰에 Adapter 설정
        listview.setAdapter(adapter);
    }


    /* 리스트뷰 어댑터 */
    public class ListViewAdapter extends BaseAdapter {
        ArrayList<Ex11BearItem> items = new ArrayList<Ex11BearItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(Ex11BearItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }
        // 아이템의 인덱스를 의미하는 것으로 리스트뷰에서 보일 아이템의 위치 정보이다.
        // 0부터 시작하여 아이템 개수만큼 파라미터로 전달된다.
        //출처: https://itmining.tistory.com/1 [IT 마이닝:티스토리]

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            final Context context = viewGroup.getContext();
            final Ex11BearItem bearItem = items.get(position);

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.activity_ex11_listview_list_item, viewGroup, false);

            } else {
                View view = new View(context);
                view = (View) convertView;
            }

            TextView tv_num = (TextView) convertView.findViewById(R.id.tv_num);
            TextView tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            ImageView iv_icon = (ImageView) convertView.findViewById(R.id.iv_icon);

            tv_num.setText(bearItem.getNum());
            tv_name.setText(bearItem.getName());
            iv_icon.setImageResource(bearItem.getResId());
            Log.d(TAG, "getView() - [ "+position+" ] "+bearItem.getName());

            //각 아이템 선택 event
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, bearItem.getNum()+" 번 - "+bearItem.getName()+" 입니당! ", Toast.LENGTH_SHORT).show();
                }
            });

            return convertView;  //뷰 객체 반환
        }
    }

}