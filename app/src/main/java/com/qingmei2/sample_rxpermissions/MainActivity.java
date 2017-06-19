package com.qingmei2.sample_rxpermissions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.qingmei2.sample_rxpermissions.rx01_permissions.RxPermissionsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_permissions)
    Button btnPermissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_permissions)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_permissions:
                startActivity(new Intent(this, RxPermissionsActivity.class));
                break;
        }
    }
}
