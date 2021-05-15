package com.example.maytinhbotui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mEdtSoThu1, mEdtSoThu2;
    Button mBtnCong, mBtnTru, mBtnNhan, mBtnChia;
    TextView mTbvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtSoThu1 = findViewById(R.id.editTextSoThu1);
        mEdtSoThu2 = findViewById(R.id.editTextSoThu2);
        mBtnCong = findViewById(R.id.buttonCong);
        mBtnTru = findViewById(R.id.buttonTru);
        mBtnNhan = findViewById(R.id.buttonNhan);
        mBtnChia = findViewById(R.id.buttonChia);
        mTbvKetQua = findViewById(R.id.textViewKetqua);

        //Su kien click
        // ctrl + P: goi y kieu du lieu
        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSothu1 = mEdtSoThu1.getText().toString();
                String textSothu2 = mEdtSoThu2.getText().toString();
                if (textSothu1.isEmpty() || textSothu2.isEmpty()){
                    Toast.makeText(MainActivity.this,"vui long nhap gia tri", Toast.LENGTH_SHORT).show();
                    return;
                }
                int valueSothu1 = Integer.parseInt(textSothu1);
                int valueSothu2 = Integer.parseInt(textSothu2);

                int ketQua = valueSothu1 + valueSothu2;
                mTbvKetQua.setText("ket qua = " + ketQua);


            }
        });
        mBtnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSothu1 = mEdtSoThu1.getText().toString();
                String textSothu2 = mEdtSoThu2.getText().toString();
                if (textSothu1.isEmpty() || textSothu2.isEmpty()){
                    Toast.makeText(MainActivity.this,"vui long nhap gia tri", Toast.LENGTH_SHORT).show();
                    return;
                }
                int valueSothu1 = Integer.parseInt(textSothu1);
                int valueSothu2 = Integer.parseInt(textSothu2);
                int ketQua = valueSothu1 - valueSothu2;
                mTbvKetQua.setText("ket qua = " + ketQua);
            }
        });
        mBtnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSothu1 = mEdtSoThu1.getText().toString();
                String textSothu2 = mEdtSoThu2.getText().toString();
                if (textSothu1.isEmpty() || textSothu2.isEmpty()){
                    Toast.makeText(MainActivity.this,"vui long nhap gia tri", Toast.LENGTH_SHORT).show();
                    return;
                }
                int valueSothu1 = Integer.parseInt(textSothu1);
                int valueSothu2 = Integer.parseInt(textSothu2);
                int ketQua = valueSothu1 * valueSothu2;
                mTbvKetQua.setText("ket qua = " + ketQua);
            }
        });
        mBtnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSothu1 = mEdtSoThu1.getText().toString();
                String textSothu2 = mEdtSoThu2.getText().toString();
                if (textSothu1.isEmpty() || textSothu2.isEmpty()){
                    Toast.makeText(MainActivity.this,"vui long nhap gia tri", Toast.LENGTH_SHORT).show();
                    return;
                }
                int valueSothu1 = Integer.parseInt(textSothu1);
                int valueSothu2 = Integer.parseInt(textSothu2);
                if (valueSothu2 == 0){

                    Toast.makeText(MainActivity.this, "Khong chia duoc ", Toast.LENGTH_SHORT).show();
                    return;
                }
                int ketQua = valueSothu1 / valueSothu2;
                mTbvKetQua.setText("ket qua = " + ketQua);
            }

        });





    }



    // h e làm 1 cái r a lamf cho mấy cái kia, check 2 trường hợp thì dùng dấu || là 1 trong 2 điều kiện đó đúng thì show Toast
    // dểd đỡ mất côgn viết lại 4 lần thì tạo 1 hàm riêng

    // loi do do no chay xuong ham ben duoi, ma k co gia tri, ma ta lai Parse no ve kieu so.
    // a ma k return la no chay xuong duoi, la crash app
//    // chox nayf chua hiethuawng
//    // đây là mình viết 1 cái hàm, kiểm tra 2 cái text đó có phải là rỗng hay k, nên ta cần check trả về là true hay false, kiểu boolean
//    // nếu rôgnx thì return true, nêu k thì false.
//    // câu if dưới hiểu k?hiểu câu ì rồi
//    // hàm này là hàm trả về. chắc thầy chưa dạy. uhm, vậy viết riêng cho tưng btn thì viết thế nào
//    // h e viết kiểu dễ đọc nè. cho từng
//    public boolean textCoRongKhong(){
//        if (mEdtSoThu1.getText().toString().isEmpty() || mEdtSoThu2.getText().toString().isEmpty()){
//            //
//            // cho nay return de no k chay tiep nua.moiw click xong la check luon, neu k nhaapj thi show len xong thoat khoi
//
//            // k lamf may cau lenh ben duoiw
//            // nen la phai tao 1 cai ham tra ve. kieu dung sai
//            // neu text rong thi return theo minh dinh nghia cai ten ham cho de nho.
//            // cho nay rong thi tra vef true, nguoc lai la false
//            return true;
//        } else return false;

//    }

}