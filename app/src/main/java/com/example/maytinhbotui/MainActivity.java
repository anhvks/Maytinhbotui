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



    // h e l??m 1 c??i r a lamf cho m???y c??i kia, check 2 tr?????ng h???p th?? d??ng d???u || l?? 1 trong 2 ??i???u ki???n ???? ????ng th?? show Toast
    // d???d ????? m???t c??gn vi???t l???i 4 l???n th?? t???o 1 h??m ri??ng

    // loi do do no chay xuong ham ben duoi, ma k co gia tri, ma ta lai Parse no ve kieu so.
    // a ma k return la no chay xuong duoi, la crash app
//    // chox nayf chua hiethuawng
//    // ????y l?? m??nh vi???t 1 c??i h??m, ki???m tra 2 c??i text ???? c?? ph???i l?? r???ng hay k, n??n ta c???n check tr??? v??? l?? true hay false, ki???u boolean
//    // n???u r??gnx th?? return true, n??u k th?? false.
//    // c??u if d?????i hi???u k?hi???u c??u ?? r???i
//    // h??m n??y l?? h??m tr??? v???. ch???c th???y ch??a d???y. uhm, v???y vi???t ri??ng cho t??ng btn th?? vi???t th??? n??o
//    // h e vi???t ki???u d??? ?????c n??. cho t???ng
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