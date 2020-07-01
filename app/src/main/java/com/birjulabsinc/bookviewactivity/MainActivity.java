package com.birjulabsinc.bookviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import github.hongbeomi.dividerseekbar.DividerSeekBar;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // binding required views from activity_main
        ImageView nav_bar = (ImageView) findViewById(R.id.nav_burger);
        ImageView setting = (ImageView) findViewById(R.id.tool_setting);

        nav_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoTabsActivity = new Intent(MainActivity.this,TabsActivity.class);
                startActivity(gotoTabsActivity);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // variable for bottom sheet dialog
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this,R.style.BottomSheetDialogTheme);
                View setting = LayoutInflater.from(getApplicationContext()).inflate(R.layout.settings,(RelativeLayout)findViewById(R.id.settings_container));
                // binding spinner from inflated layout
                Spinner spinner = (Spinner) setting.findViewById(R.id.spinner);
                DividerSeekBar dividerSeekBar = setting.findViewById(R.id.divider_seek_bar);
                //creating variables for ArrayAdapter
                ArrayAdapter<String> fontAdapter = new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.font));
                fontAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner.setAdapter(fontAdapter);
                bottomSheetDialog.setContentView(setting);
                bottomSheetDialog.show();

                //code for divider seek bar

//                dividerSeekBar.setTextInterval(40); // set text interval of divider'
//                dividerSeekBar.setTextLocationMode(DividerSeekBar.TEXT_LOCATION_BOTTOM);
//                dividerSeekBar.setTextInterval(5);
//                dividerSeekBar.setTextColor(R.color.colorPrimaryDark);
//                dividerSeekBar.setTextSize(R.dimen.sp_12);
//                dividerSeekBar.setSeaLineColor(R.color.light_blue_600);
//                dividerSeekBar.setSeaLineStrokeWidth(R.dimen.dp_1);
//                dividerSeekBar.setDividerInterval(10);
//                dividerSeekBar.setDividerColor(R.color.light_blue_600);
//                dividerSeekBar.setDividerStrokeWidth(R.dimen.dp_1);
//                dividerSeekBar.setThumbDefaultDrawable(R.drawable.bg_thumb_default);
//                dividerSeekBar.setThumbActivatedDrawable(R.drawable.bg_thumb_activated);
//                dividerSeekBar.setActiveMode(DividerSeekBar.ACTIVE_MODE_TARGET);
//                dividerSeekBar.setActivateTargetValue(3);


            }
        });

    }
}